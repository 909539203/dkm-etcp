package com.etcp.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.etcp.mapper.TbUserMapper;
import com.etcp.pojo.TbUser;
import com.etcp.pojo.TbUserExample;
import com.etcp.user.service.UserService;
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
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbUser> findAll() {
		return userMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbUser> result = new PageResult<TbUser>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbUser> list = userMapper.selectByExample(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbUser> info = new PageInfo<TbUser>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUser user) {
		userMapper.insertSelective(user);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbUser user){
		userMapper.updateByPrimaryKeySelective(user);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUser findOne(Long id){
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        //criteria.andIn("id", longs);

        //跟据查询条件删除数据
        userMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbUser user, int pageNum, int pageSize) {
		PageResult<TbUser> result = new PageResult<TbUser>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
		
		/*
		
		 if(user!=null){			
						//如果字段不为空
			if (user.getUsername()!=null && user.getUsername().length()>0) {
				criteria.andLike("username", "%" + user.getUsername() + "%");
			}
			//如果字段不为空
			if (user.getPassword()!=null && user.getPassword().length()>0) {
				criteria.andLike("password", "%" + user.getPassword() + "%");
			}
			//如果字段不为空
			if (user.getRelatedNo()!=null && user.getRelatedNo().length()>0) {
				criteria.andLike("relatedNo", "%" + user.getRelatedNo() + "%");
			}
			//如果字段不为空
			if (user.getHeadPic()!=null && user.getHeadPic().length()>0) {
				criteria.andLike("headPic", "%" + user.getHeadPic() + "%");
			}
			//如果字段不为空
			if (user.getWeixin()!=null && user.getWeixin().length()>0) {
				criteria.andLike("weixin", "%" + user.getWeixin() + "%");
			}
			//如果字段不为空
			if (user.getEmail()!=null && user.getEmail().length()>0) {
				criteria.andLike("email", "%" + user.getEmail() + "%");
			}
			//如果字段不为空
			if (user.getKey1()!=null && user.getKey1().length()>0) {
				criteria.andLike("key1", "%" + user.getKey1() + "%");
			}
			//如果字段不为空
			if (user.getKey2()!=null && user.getKey2().length()>0) {
				criteria.andLike("key2", "%" + user.getKey2() + "%");
			}
			//如果字段不为空
			if (user.getKey3()!=null && user.getKey3().length()>0) {
				criteria.andLike("key3", "%" + user.getKey3() + "%");
			}
	
		}
		
		 */
		

        //查询数据
        List<TbUser> list = userMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbUser> info = new PageInfo<TbUser>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
