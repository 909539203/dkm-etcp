//控制层
app.controller('goodsController', function ($scope, $controller, $location, goodsService,
                                            uploadService, itemCatService, typeTemplateService) {

    $controller('baseController', {$scope: $scope});//继承

    //读取列表数据绑定到表单中  
    $scope.findAll = function () {
        goodsService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        );
    }

    //分页
    $scope.findPage = function (page, rows) {
        goodsService.findPage(page, rows).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne = function (id) {
        var id = $location.search()["id"];
        //alert(id);
        if (id != null) {
            goodsService.findOne(id).success(
                function (response) {
                    $scope.entity = response;
                    //设置商品描述信息
                    editor.html(response.goodsDesc.introduction);

                    //加载商品图片信息
                    $scope.entity.goodsDesc.itemImages = JSON.parse($scope.entity.goodsDesc.itemImages);

                    //加载商品的扩展属性
                    //console.log($scope.entity.goodsDesc.customAttributeItems);
                    $scope.entity.goodsDesc.customAttributeItems = JSON.parse($scope.entity.goodsDesc.customAttributeItems);
                    //console.log($scope.entity.goodsDesc.customAttributeItems);

                    //加载选中的规格信息
                    $scope.entity.goodsDesc.specificationItems = JSON.parse($scope.entity.goodsDesc.specificationItems);

                    //加载sku信息
                    for(var i = 0; i < $scope.entity.itemList.length; i++){
                        $scope.entity.itemList[i].spec = JSON.parse($scope.entity.itemList[i].spec);
                    }
                }
            );
        }
    }

    /**
     * 检查checkbox是否要勾选
     * @param name 查询的key-规格的名称
     * @param value  查询的value-规格选项的名称
     */
    $scope.checkAttributeValue = function (name, value) {
        var obj = $scope.searchObjectByKey($scope.entity.goodsDesc.specificationItems,"attributeName",name);
        if(obj == null){
            return false;
        }else{
            var indexOf = obj.attributeValue.indexOf(value);
            if(indexOf >= 0){
                return true;
            }
            return false;
        }
    }

    //保存
    $scope.save = function () {
        var serviceObject;//服务层对象

        //在保存之前，获取富文本编辑器的内容
        $scope.entity.goodsDesc.introduction = editor.html();
        if ($scope.entity.goods.id != null) {//如果有ID
            serviceObject = goodsService.update($scope.entity); //修改
        } else {
            serviceObject = goodsService.add($scope.entity);//增加
        }
        serviceObject.success(
            function (response) {
                alert(response.message);
                if (response.success) {
                    //清空保存对象
                    //$scope.entity = {};
                    //清空富文本
                    //editor.html("");

                    //跳转商品列表
                    location.href="goods.html";
                }
            }
        );
    }


    //批量删除
    $scope.dele = function () {
        //获取选中的复选框
        goodsService.dele($scope.selectIds).success(
            function (response) {
                if (response.success) {
                    $scope.reloadList();//刷新列表
                }
            }
        );
    }

    $scope.searchEntity = {};//定义搜索对象

    //搜索
    $scope.search = function (page, rows) {
        goodsService.search(page, rows, $scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    $scope.image_entity = {url: ""};
    //上传图片
    $scope.uploadFile = function () {
        //alert(123);
        uploadService.uploadFile().success(function (response) {
            if (response.success) {
                $scope.image_entity.url = response.message;
            } else {
                alert(response.message);
            }
        })
    }


    //itemImages：商品的图片列表
    //specificationItems:已勾选的规格列表
    $scope.entity = {goods: {}, goodsDesc: {itemImages: [], specificationItems: []}};//定义页面实体结构
    //追加图片
    $scope.add_image_entity = function () {
        $scope.entity.goodsDesc.itemImages.push($scope.image_entity);
    }


    $scope.delete_image_entity = function (index) {
        $scope.entity.goodsDesc.itemImages.splice(index, 1);
    }

    //查询一级类目
    $scope.selectItemCat1List = function () {
        itemCatService.findByParentId(0).success(function (response) {
            $scope.itemCat1List = response;
        })
    }

    //查询二级类目
    //$watch监听变量，如果变量发生变化，会触发括号里指定的函数
    $scope.$watch("entity.goods.category1_id", function (newValue, oldValue) {
        itemCatService.findByParentId(newValue).success(function (response) {
            $scope.itemCat2List = response;
        })
    });

    //查询二级类目
    //$watch监听变量，如果变量发生变化，会触发括号里指定的函数
    $scope.$watch("entity.goods.category2_id", function (newValue, oldValue) {
        itemCatService.findByParentId(newValue).success(function (response) {
            $scope.itemCat3List = response;
        })
    });


    //加载模板id
    //$watch监听变量，如果变量发生变化，会触发括号里指定的函数
    $scope.$watch("entity.goods.category3_id", function (newValue, oldValue) {
        itemCatService.findOne(newValue).success(function (response) {
            $scope.entity.goods.typeTemplateId = response.typeId;
        })
    });


    //加载品牌列表、扩展属性列表
    //$watch监听变量，如果变量发生变化，会触发括号里指定的函数
    $scope.$watch("entity.goods.typeTemplateId", function (newValue, oldValue) {
        typeTemplateService.findOne(newValue).success(function (response) {
            $scope.typeTemplate = response;
            //品牌列表
            $scope.typeTemplate.brandIds = JSON.parse(response.brandIds);
            //扩展属性列表，新增时加载扩展属性基本信息
            var id = $location.search()["id"];
            if (id == null) {
                $scope.entity.goodsDesc.customAttributeItems = JSON.parse(response.customAttributeItems);
            }

            //加载规格信息列表
            typeTemplateService.findSpecList(newValue).success(function (response) {
                $scope.specList = response;
            })
        })
    });


    /**
     * 规格checkbox的点击事件
     * @param $event  当前的checkbox
     * @param name 规格的名称
     * @param value 规格选项的名称
     */
    $scope.updateSpecAttribute = function ($event, name, value) {
        var obj = $scope.searchObjectByKey($scope.entity.goodsDesc.specificationItems, "attributeName", name);
        //没有任何勾选情况下
        if (obj == null) {
            $scope.entity.goodsDesc.specificationItems.push(
                {
                    "attributeName": name,
                    "attributeValue": [value]
                }
            );
        } else {
            //如果是选中,追加选项内容
            if ($event.target.checked) {
                obj.attributeValue.push(value);
            } else {
                //取消勾选内容
                var valueIndex = obj.attributeValue.indexOf(value);
                obj.attributeValue.splice(valueIndex, 1);
                //如果取消勾选后，当前规格没有一个项，删除整个节点
                if (obj.attributeValue.length < 1) {
                    var nameIndex = $scope.entity.goodsDesc.specificationItems.indexOf(obj);
                    $scope.entity.goodsDesc.specificationItems.splice(nameIndex, 1);
                }
            }
        }
    }

    //构建商品sku列表
    $scope.createItemList = function () {
        // 1. 	创建$scope.createItemList方法，同时创建一条有基本数据，不带规格的初始数据
        // 参考: $scope.entity.itemList=[{spec:{},price:0,num:99999,status:'0',isDefault:'0' }]
        //当前表格的内容
        $scope.entity.itemList = [{spec: {}, price: 0, num: 99999, status: '0', isDefault: '0'}];
        // 2. 	查找遍历所有已选择的规格列表，后续会重复使用它，所以我们可以抽取出个变量items
        var items = $scope.entity.goodsDesc.specificationItems;
        // 9. 	回到createItemList方法中，在循环中调用addColumn方法，并让itemList重新指向返回结果;
        for (var i = 0; i < items.length; i++) {
            $scope.entity.itemList = addColumn($scope.entity.itemList, items[i].attributeName, items[i].attributeValue);
        }
    }

    // 3. 	抽取addColumn(当前的表格，列名称，列的值列表)方法，用于每次循环时追加列
    addColumn = function (list, name, value) {
        // 4. 	编写addColumn逻辑，当前方法要返回添加所有列后的表格，定义新表格变量newList
        var newList = [];
        // 5. 	在addColumn添加两重嵌套循环，一重遍历之前表格的列表，二重遍历新列值列表
        for (var i = 0; i < list.length; i++) {
            for (var j = 0; j < value.length; j++) {
                // 6. 	在第二重循环中，使用深克隆技巧，把之前表格的一行记录copy所有属性，用到var newRow = JSON.parse(JSON.stringify(之前表格的一行记录));
                var newRow = JSON.parse(JSON.stringify(list[i]));
                // 7. 	接着第6步，向newRow里追加一列
                //网络:3G
                newRow.spec[name] = value[j];
                // 8. 	把新生成的行记录，push到newList中
                newList.push(newRow);
            }
        }
        return newList;
    }


    $scope.itemCatList = [];//商品分类列表,下标是分类的id,值是分类的名称
    $scope.status = ['未审核', '已审核', '审核未通过', '关闭'];//商品状态

    $scope.findItemCatList = function () {
        //查询所有分类，组装分类数组
        itemCatService.findAll().success(function (response) {
            for (var i = 0; i < response.length; i++) {
                $scope.itemCatList[response[i].id] = response[i].name;
            }
        })
    }

});
