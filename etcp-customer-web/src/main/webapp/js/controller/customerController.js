 //控制层 
app.controller('customerController' ,function($scope,$controller,customerService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		customerService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		customerService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){
		customerService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.customerId!=null){//如果有ID
			serviceObject=customerService.update( $scope.entity ); //修改
		}else{
			serviceObject=customerService.add( $scope.entity  );//增加
		}				
		serviceObject.success(
			function(response){
                alert(response.message);
				if(response.success){
					//跳转登录页
					location.href="../../login.html";
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		customerService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		customerService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	$scope.passwordEntity={};//定义修改密码对象
	//修改密码
	$scope.updatePassword=function (id) {
        $scope.passwordEntity.id=id;

		customerService.updatePassword($scope.passwordEntity).success(
            function(response){
                if(response.success){
                    //跳转登录页
                    location.href="../../login.html";
                }else{
                    alert(response.message);
				}
            }
        );
    }
    
});	
