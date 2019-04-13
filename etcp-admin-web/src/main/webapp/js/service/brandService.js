//创建自定义服务
app.service("brandService",function ($http) {
    //查询所有数据
    this.findList=function () {
        return $http.get("../brand/findAll.do");
    }

    //分页查询
    this.findPage=function (pageNum,pageSize) {
        return  $http.get("../brand/findPage.do?pageNum=" + pageNum + "&pageSize=" + pageSize);
    }

    this.add=function (url,entity) {
        return $http.post(url,entity);
    }

    this.queryById=function (id) {
        return $http.get("../brand/findOne.do?id=" + id);
    }

    this.delete=function (selectIds) {
        return $http.get("../brand/delete.do?ids=" + selectIds);
    }

    this.search=function (pageNum,pageSize,brand){
        return $http.post("../brand/search.do?page=" + pageNum + "&rows=" + pageSize,brand);
    }
});