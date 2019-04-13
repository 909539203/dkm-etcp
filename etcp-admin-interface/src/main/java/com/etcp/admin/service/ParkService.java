package com.etcp.admin.service;

import com.etcp.pojo.TbPark;
import entity.PageResult;

import java.util.List;

/**
 * 业务逻辑接口
 * @author Diankamu
 *
 */
public interface ParkService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbPark> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbPark park);


	/**
	 * 修改
	 */
	public void update(TbPark park);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbPark findOne(Long id);


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
	public PageResult findPage(TbPark park, int pageNum, int pageSize);

	/**
	 * 更改车位绑定的小区
	 * @param partId
	 * @param villageId
	 */
	public void updatePartArea(Long partId, Long villageId);

	/**
	 *
	 更改车位绑定的拥有者
	 * @param partId
	 * @param owerId
	 */
	public void updatePartOwer(Long partId, Long owerId);
	
}
