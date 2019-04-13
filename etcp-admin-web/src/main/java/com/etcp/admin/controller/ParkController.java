package com.etcp.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.etcp.admin.service.ParkService;
import com.etcp.pojo.TbPark;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 请求处理器
 * @author Diankamu
 *
 */
@RestController
@RequestMapping("/park")
public class ParkController {

	@Reference
	private ParkService parkService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbPark> findAll(){			
		return parkService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return parkService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param park
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbPark park){
		try {
			parkService.add(park);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param park
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbPark park){
		try {
			parkService.update(park);
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
	public TbPark findOne(Long id){
		return parkService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			parkService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param park
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbPark park, int page, int rows  ){
		return parkService.findPage(park, page, rows);		
	}



	/**
	 * 更改车位绑定的小区
	 * @param villageId
	 * @param partId
	 * @return
	 */
	@RequestMapping("/updatePartArea")
	public Result updatePartArea(long partId,long villageId ){
		try {
			parkService.updatePartArea(partId,villageId);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	/**
     * 更改车位绑定的拥有者
	 * @param partId
     * @param owerId
     * @return
     */
	@RequestMapping("/updatePartOwer")
	public Result updatePartOwer(long partId,long owerId ){
		try {
			parkService.updatePartOwer(partId,owerId);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

}
