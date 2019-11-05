package com.cn.cmbc.batch.mapper;

import com.cn.cmbc.batch.po.UploadInfo;
import com.cn.cmbc.batch.po.UploadInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UploadInfoMapper {
    int countByExample(UploadInfoExample example);

    int deleteByExample(UploadInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadInfo record);

    int insertSelective(UploadInfo record);

    List<UploadInfo> selectByExample(UploadInfoExample example);

    UploadInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadInfo record, @Param("example") UploadInfoExample example);

    int updateByExample(@Param("record") UploadInfo record, @Param("example") UploadInfoExample example);

    int updateByPrimaryKeySelective(UploadInfo record);

    int updateByPrimaryKey(UploadInfo record);
}