app.controller("indexController",function ($scope,loginService) {
   $scope.showLoginName=function () {
       //发起请求，获取登录名
       loginService.loginName().success(function (response) {
           $scope.loginName=response.loginName;
       })
   }
});