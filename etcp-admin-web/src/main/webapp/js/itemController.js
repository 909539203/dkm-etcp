app.controller("itemController",function ($scope) {
    $scope.num=1;  //购买数量
    /**
     * 购物车数量加减
     * @param x
     */
    $scope.addNum=function (x) {
        $scope.num+=x;
        if($scope.num < 1){
            $scope.num = 1;
        }
    }

    $scope.specificationItems={};//记录用户选择的规格
    /**
     * 记录用户选择的规格
     * @param name
     * @param vlaue
     */
    $scope.selectSpecification=function (name,value) {
        $scope.specificationItems[name]=value;
        searchSku();
    }

    /**
     * 判断当前规格有没有选中
     * @param name
     * @param value
     * @return {boolean}
     */
    $scope.isSelected=function (name,value) {
        return $scope.specificationItems[name] == value;
    }

    //加载默认SKU
    $scope.loadSku=function(){
        $scope.sku=skuList[0];
        $scope.specificationItems= JSON.parse(JSON.stringify($scope.sku.spec)) ;
    }

    //匹配两个对象
    matchObject=function(map1,map2){
        for(var k in map1){
            if(map1[k]!=map2[k]){
                return false;
            }
        }
        for(var k in map2){
            if(map2[k]!=map1[k]){
                return false;
            }
        }
        return true;
    }

    //查询SKU
    searchSku=function(){
        for(var i=0;i<skuList.length;i++ ){
            //如果用户勾选的规格找到了sku信息，记录下来
            if( matchObject(skuList[i].spec ,$scope.specificationItems ) ){
                $scope.sku=skuList[i];
                return ;
            }
        }
        //$scope.sku={id:0,title:'--------',price:0};//如果没有匹配的
    }

    //添加商品到购物车
    $scope.addToCart=function(){
        alert('skuid:'+$scope.sku.id);
    }


});