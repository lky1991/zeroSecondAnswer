package com.zSecondAnswer.test;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zSecondAnswer.dao.userInformationMapper;
import com.zSecondAnswer.model.userInformation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/daoConfig.xml")
public class testUser {
	@Autowired
	private userInformationMapper UserMapper;
	
	@Test
	@Ignore
	public void testAddUser(){
		userInformation userInfo=new userInformation();
		userInfo.setNickName("Band");
		userInfo.setHeadImgUrl("http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0");
		userInfo.setCountry("中国");
		userInfo.setProvince("广东");
	    userInfo.setCity("广州");
	    userInfo.setOpenId("o6_bmjrPTlm6_2sgVt7hMZOPfL2M");
	    userInfo.setSubscribeTime(Long.toString(new Date().getTime()));
	    userInfo.setSex(Integer.valueOf(1).byteValue());
	    
	    userInfo.setPersonalSignature("踏踏实实做事,诚诚恳恳做人!!!");
		userInfo.setTotalExperience(0);
		userInfo.setTotalInferenceCurrency(0);
		userInfo.setTotalIntegral(0);
		userInfo.setFashionList(null);
		userInfo.setTaskList(null);
		userInfo.setAchievementList(null);
		userInfo.setGameList(null);
		
		UserMapper.addUser(userInfo);
		
	}
	
	@Test
	@Ignore
	public void testSelectByUid(){
		System.out.println(UserMapper.selectByPrimaryKey(1));
	}
	
	@Test
	@Ignore
	public void testSelectByOpenId(){
		System.out.println(UserMapper.selectByOpenId("o6_bmjrPTlm6_2sgVt7hMZOPfL2M"));
	}
	
	
	@Test
	public void testUpdateUser(){
		userInformation userInfo=UserMapper.selectByPrimaryKey(1);
		userInfo.setPersonalSignature("苦练七十二变，笑对八十一难！！");
		
		UserMapper.updateUser(userInfo);
		System.out.println(UserMapper.selectByPrimaryKey(1));
	}

}
