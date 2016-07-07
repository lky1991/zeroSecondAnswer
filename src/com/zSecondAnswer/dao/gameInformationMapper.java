package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.gameInformation;

public interface gameInformationMapper {
    int deleteByPrimaryKey(Integer gameId);

    int insert(gameInformation record);

    int insertSelective(gameInformation record);

    gameInformation selectByPrimaryKey(Integer gameId);

    int updateByPrimaryKeySelective(gameInformation record);

    int updateByPrimaryKey(gameInformation record);
}