//服务层
app.service('customerService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../customer/findAll.do');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../customer/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../customer/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../customer/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../customer/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../customer/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../customer/search.do?page='+page+"&rows="+rows, searchEntity);
	}

	//修改密码
	this.updatePassword=function (entity) {
		return $http.post('../customer/updatePassword.do',entity);
    }
});
