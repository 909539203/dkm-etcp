//创建品牌控制器
app.controller("brandController",function ($scope,$http,$controller,brandService) {

    //实现继承，实际上是共享$socpe变量达到假继承
    $controller('baseController',{$scope:$scope});
    //查询所有品牌
    $scope.findList=function () {
        //localhost:8081/brand/findList.do
        //发起http请求获取品牌列表
        brandService.findList().success(function (response) {
            $scope.list=response;
        })
    }

    $scope.findPage=function (pageNum,pageSize) {
        brandService.findPage(pageNum,pageSize).success(function (response) {
            $scope.list = response.rows;
            $scope.paginationConf.totalItems = response.total;
        })
    }

    //保存品牌
    $scope.add=function () {
        //alert(JSON.stringify($scope.entity));
        var url = "../brand/add.do";
        if($scope.entity.id != null){
            url = "../brand/update.do";
        }
        brandService.add(url,$scope.entity).success(function (response) {
            //保存成功，刷新页面
            if(response.success){
                $scope.reloadList();
            }else{
                alert(response.message);
            }
        })
    }

    //跟据id查询品牌
    $scope.queryById=function (id) {
        brandService.queryById(id).success(function (response) {
            $scope.entity=response;
        })
    }

    $scope.delete=function () {
        brandService.delete($scope.selectIds).success(function (response) {
            //保存成功，刷新页面
            if(response.success){
                $scope.reloadList();
                //清空id列表
                $scope.selectIds = [];
            }else{
                alert(response.message);
            }
        });
    }
    //声明查询对象
    $scope.searchEntity={};
    $scope.search=function (pageNum,pageSize,brand) {
        brandService.search(pageNum,pageSize,brand).success(function (response) {
            $scope.list = response.rows;
            $scope.paginationConf.totalItems = response.total;
        })
    }

});