package com.etcp.customer.service;

import com.etcp.pojo.TbCustomer;
import entity.Password;
import entity.PageResult;

import java.util.List;
/**
 * 业务逻辑接口
 * @author Steven
 *
 */
public interface CustomerService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCustomer> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCustomer customer);
	
	
	/**
	 * 修改
	 */
	public void update(TbCustomer customer);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCustomer findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCustomer customer, int pageNum, int pageSize);
	/**
	 * 更新状态
	 * @param customerId
	 * @param status   状态(0:未审核，1：审核通过,2:审核不通过，3关闭店铺)
	 */
	public void updateStatus(Long customerId, Integer status);

	/**
	 * 修改密码
	 * @param password
	 * @return
	 */
	public boolean updatePassword(Password password);
	
}
