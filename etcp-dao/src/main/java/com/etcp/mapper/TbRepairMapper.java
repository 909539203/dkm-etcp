package com.etcp.mapper;

import com.etcp.pojo.TbRepair;
import com.etcp.pojo.TbRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRepairMapper {
    int countByExample(TbRepairExample example);

    int deleteByExample(TbRepairExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRepair record);

    int insertSelective(TbRepair record);

    List<TbRepair> selectByExample(TbRepairExample example);

    TbRepair selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRepair record, @Param("example") TbRepairExample example);

    int updateByExample(@Param("record") TbRepair record, @Param("example") TbRepairExample example);

    int updateByPrimaryKeySelective(TbRepair record);

    int updateByPrimaryKey(TbRepair record);
}