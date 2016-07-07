package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.fashionInformation;

public interface fashionInformationMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(fashionInformation record);

    int insertSelective(fashionInformation record);

    fashionInformation selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(fashionInformation record);

    int updateByPrimaryKey(fashionInformation record);
}