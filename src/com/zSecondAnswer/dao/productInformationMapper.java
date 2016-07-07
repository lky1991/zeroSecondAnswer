package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.productInformation;

public interface productInformationMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(productInformation record);

    int insertSelective(productInformation record);

    productInformation selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(productInformation record);

    int updateByPrimaryKey(productInformation record);
}