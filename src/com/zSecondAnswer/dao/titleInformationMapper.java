package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.titleInformation;

public interface titleInformationMapper {
    int deleteByPrimaryKey(Integer titleId);

    int insert(titleInformation record);

    int insertSelective(titleInformation record);

    titleInformation selectByPrimaryKey(Integer titleId);

    int updateByPrimaryKeySelective(titleInformation record);

    int updateByPrimaryKey(titleInformation record);
}