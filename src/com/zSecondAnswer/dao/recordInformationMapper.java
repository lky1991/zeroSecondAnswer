package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.recordInformation;

public interface recordInformationMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(recordInformation record);

    int insertSelective(recordInformation record);

    recordInformation selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(recordInformation record);

    int updateByPrimaryKey(recordInformation record);
}