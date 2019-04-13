package com.etcp.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.etcp.customer.service.CustomerService;
import com.etcp.mapper.TbCustomerMapper;
import com.etcp.pojo.TbCustomer;
import com.etcp.pojo.TbCustomerExample;
import entity.Password;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 业务逻辑实现
 * @author Steven
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private TbCustomerMapper customerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCustomer> findAll() {

		return customerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbCustomer> result = new PageResult<TbCustomer>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbCustomer> list = customerMapper.selectByExample(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbCustomer> info = new PageInfo<TbCustomer>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCustomer customer) {
		customer.setStatus(0);
		customer.setCreated(new Date());
		customerMapper.insertSelective(customer);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCustomer customer){

		customerMapper.updateByPrimaryKeySelective(customer);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCustomer findOne(Long id){

		return customerMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List<Long> longs = Arrays.asList(ids);
        //构建查询条件
        TbCustomerExample example = new TbCustomerExample();
		TbCustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdIn(longs);

        //跟据查询条件删除数据
        customerMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbCustomer customer, int pageNum, int pageSize) {
		PageResult<TbCustomer> result = new PageResult<TbCustomer>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
		TbCustomerExample example = new TbCustomerExample();
		TbCustomerExample.Criteria criteria = example.createCriteria();
		
		if(customer!=null){			
						//如果字段不为空
			if (customer.getLoginName()!=null && customer.getLoginName().length()>0) {
				criteria.andLoginNameLike("%" + customer.getLoginName() + "%");
			}
			//如果字段不为空
			if (customer.getPassword()!=null && customer.getPassword().length()>0) {
				criteria.andPasswordLike("%" + customer.getPassword() + "%");
			}
			//如果字段不为空
			if (customer.getOrgName()!=null && customer.getOrgName().length()>0) {
				criteria.andOrgNameLike("%" + customer.getOrgName() + "%");
			}
			//如果字段不为空
			if (customer.getStatus()!=null && customer.getStatus().toString().length()>0) {
				criteria.andStatusEqualTo(customer.getStatus());
			}

			//如果字段不为空
			if (customer.getAddressDetail()!=null && customer.getAddressDetail().length()>0) {
				criteria.andAddressDetailLike( "%" + customer.getAddressDetail() + "%");
			}
			//如果字段不为空
			if (customer.getTelephone()!=null && customer.getTelephone().length()>0) {
				criteria.andTelephoneLike("%" + customer.getTelephone() + "%");
			}
			//如果字段不为空
			if (customer.getLinkmanName()!=null && customer.getLinkmanName().length()>0) {
				criteria.andLinkmanNameLike( "%" + customer.getLinkmanName() + "%");
			}
			//如果字段不为空
			if (customer.getLinkmanEmail()!=null && customer.getLinkmanEmail().length()>0) {
				criteria.andLinkmanEmailLike( "%" + customer.getLinkmanEmail() + "%");
			}
			//如果字段不为空
			if (customer.getLicenseNumber()!=null && customer.getLicenseNumber().length()>0) {
				criteria.andLicenseNumberLike("%" + customer.getLicenseNumber() + "%");
			}
			//如果字段不为空
			if (customer.getTaxNumber()!=null && customer.getTaxNumber().length()>0) {
				criteria.andTaxNumberLike("%" + customer.getTaxNumber() + "%");
			}
			//如果字段不为空
			if (customer.getOrgNumber()!=null && customer.getOrgNumber().length()>0) {
				criteria.andOrgNumberLike("%" + customer.getOrgNumber() + "%");
			}
			//如果字段不为空
			if (customer.getLogoPic()!=null && customer.getLogoPic().length()>0) {
				criteria.andLogoPicLike( "%" + customer.getLogoPic() + "%");
			}
			//如果字段不为空
			if (customer.getLegalPerson()!=null && customer.getLegalPerson().length()>0) {
				criteria.andLegalPersonLike("%" + customer.getLegalPerson() + "%");
			}
			//如果字段不为空
			if (customer.getLegalPersonCardId()!=null && customer.getLegalPersonCardId().length()>0) {
				criteria.andLegalPersonCardIdLike("%" + customer.getLegalPersonCardId() + "%");
			}
			//如果字段不为空
			if (customer.getBankUser()!=null && customer.getBankUser().length()>0) {
				criteria.andBankUserLike("%" + customer.getBankUser() + "%");
			}
			//如果字段不为空
			if (customer.getBankName()!=null && customer.getBankName().length()>0) {
				criteria.andBankNameLike("%" + customer.getBankName() + "%");
			}
			//如果字段不为空
			if (customer.getKey1()!=null && customer.getKey1().length()>0) {
				criteria.andKey1Like("%" + customer.getKey1() + "%");
			}
			//如果字段不为空
			if (customer.getKey2()!=null && customer.getKey2().length()>0) {
				criteria.andKey2Like("%" + customer.getKey2() + "%");
			}
			//如果字段不为空
			if (customer.getKey3()!=null && customer.getKey3().length()>0) {
				criteria.andKey3Like("%" + customer.getKey3() + "%");
			}
	
		}

        //查询数据
        List<TbCustomer> list = customerMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbCustomer> info = new PageInfo<TbCustomer>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}

	/**
	 * 更新状态
	 * @param customerId
	 * @param status   状态(0:未审核，1：审核通过,2:审核不通过，3关闭店铺)
	 */
	@Override
	public void updateStatus(Long customerId, Integer status) {

		TbCustomer customer = customerMapper.selectByPrimaryKey(customerId);
		customer.setStatus(status);
		customerMapper.updateByPrimaryKey(customer);
	}

	/**
	 * 修改密码
	 * @param password
	 */
	@Override
	public boolean updatePassword(Password password) {
		TbCustomer customer = customerMapper.selectByPrimaryKey(Long.parseLong(password.getId()));
		if(customer.getPassword().equals(password.getUsedPassword())){
			customerMapper.updatePassword(password);

			return true;
		}
		return false;
	}

}
