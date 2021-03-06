package com.etcp.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.etcp.customer.service.CustomerService;
import com.etcp.pojo.TbCustomer;
import entity.Password;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * 请求处理器
 * @author Steven
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Reference
	private CustomerService customerService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCustomer> findAll(){
		return customerService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return customerService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param customer
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCustomer customer){
		try {
			customerService.add(customer);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param customer
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCustomer customer){
		try {
			customerService.update(customer);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbCustomer findOne(Long id){
		return customerService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			customerService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param customer
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbCustomer customer, int page, int rows  ){
		return customerService.findPage(customer, page, rows);		
	}

	/**
	 * 修改密码
	 * @param password
	 * @return
	 */
	@RequestMapping("/updatePassword")
	public Result updatePassword(@RequestBody Password password)
	{
		try {
			if(customerService.updatePassword(password))
			{
				return new Result(true, "修改成功");
			}else{
				return new Result(false, "旧密码错误");
			}
		}catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
}
