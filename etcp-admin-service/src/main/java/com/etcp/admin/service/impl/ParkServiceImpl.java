package com.etcp.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.etcp.admin.service.ParkService;
import com.etcp.mapper.TbParkMapper;
import com.etcp.pojo.TbPark;
import com.etcp.pojo.TbParkExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * 业务逻辑实现
 * @author Diankamu
 *
 */
@Service
public class ParkServiceImpl implements ParkService {

	@Autowired
	private TbParkMapper parkMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPark> findAll() {
		return parkMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbPark> result = new PageResult<TbPark>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbPark> list = parkMapper.selectByExample(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbPark> info = new PageInfo<TbPark>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPark park) {
		parkMapper.insertSelective(park);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPark park){
		parkMapper.updateByPrimaryKeySelective(park);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPark findOne(Long id){
		return parkMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
		TbParkExample example = new TbParkExample();
		TbParkExample.Criteria criteria = example.createCriteria();
        criteria.andParkgroupIdIn( longs);

        //跟据查询条件删除数据
        parkMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbPark park, int pageNum, int pageSize) {
		PageResult<TbPark> result = new PageResult<TbPark>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
		TbParkExample example = new TbParkExample();
		TbParkExample.Criteria criteria = example.createCriteria();
		
		if(park!=null){			
						//如果字段不为空
			if (park.getPicurl()!=null && park.getPicurl().length()>0) {
				criteria.andPicurlLike( "%" + park.getPicurl() + "%");
			}
			//如果字段不为空
			if (park.getKey1()!=null && park.getKey1().length()>0) {
				criteria.andKey1Like("%" + park.getKey1() + "%");
			}
			//如果字段不为空
			if (park.getKey2()!=null && park.getKey2().length()>0) {
				criteria.andKey2Like("%" + park.getKey2() + "%");
			}
			//如果字段不为空
			if (park.getKey3()!=null && park.getKey3().length()>0) {
				criteria.andKey3Like( "%" + park.getKey3() + "%");
			}
	
		}

        //查询数据
        List<TbPark> list = parkMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbPark> info = new PageInfo<TbPark>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}


	/**
	 * 更改车位绑定的小区
	 * @param partId
	 * @param villageId
	 */
	@Override
	public void updatePartArea(Long partId,Long villageId){
		TbPark park=new TbPark();
		park.setParkId(partId);
		park.setVillageId(villageId);
		parkMapper.updateByPrimaryKeySelective(park);
	}


	/**
	 * 更改车位绑定的拥有者
	 * @param partId
	 * @param owerId
	 */
	@Override
	public void updatePartOwer(Long partId,Long owerId){
		TbPark park=new TbPark();
		park.setParkId(partId);
		park.setOwerId(owerId);
		parkMapper.updateByPrimaryKeySelective(park);
	}
	
}
