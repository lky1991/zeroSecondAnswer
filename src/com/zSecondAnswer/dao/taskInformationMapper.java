package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.taskInformation;

public interface taskInformationMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(taskInformation record);

    int insertSelective(taskInformation record);

    taskInformation selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(taskInformation record);

    int updateByPrimaryKey(taskInformation record);
}