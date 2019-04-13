package com.etcp.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.etcp.pojo.TbParkgroup;
import com.etcp.user.service.ParkgroupService;
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
@RequestMapping("/parkgroup")
public class ParkgroupController {

	@Reference
	private ParkgroupService parkgroupService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbParkgroup> findAll(){
		return parkgroupService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return parkgroupService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param parkgroup
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbParkgroup parkgroup){
		try {
			parkgroupService.add(parkgroup);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param parkgroup
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbParkgroup parkgroup){
		try {
			parkgroupService.update(parkgroup);
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
	public TbParkgroup findOne(Long id){
		return parkgroupService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			parkgroupService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param parkgroup
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbParkgroup parkgroup, int page, int rows  ){
		return parkgroupService.findPage(parkgroup, page, rows);		
	}
	
}
