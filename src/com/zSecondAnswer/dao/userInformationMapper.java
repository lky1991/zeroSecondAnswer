package com.zSecondAnswer.dao;

import com.zSecondAnswer.model.userInformation;

public interface userInformationMapper {
	
	//添加用户
	int addUser(userInformation record);
	
	//删除用户
	int deleteByPrimaryKey(Integer uid);
	
	//根据用户id查找用户信息
	userInformation selectByPrimaryKey(Integer uid);
	
	//根据用户openid查找用户信息
	userInformation selectByOpenId(String openid);
	
	//更新用户
	int updateUser(userInformation record);
}