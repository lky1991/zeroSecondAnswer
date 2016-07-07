package com.zSecondAnswer.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Ignore;
import org.junit.Test;
import com.zSecondAnswer.util.HttpRequest;
import com.zSecondAnswer.util.RandomCode;

public class testHttpUser {
	
	/**
	* @Title: testGetUserByUid
	* @Description: 测试通过用户id获取用户信息
	 */
	@Test
	@Ignore
	public void testGetUserByUid(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("uid", "2");
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/getuser/uid.do",param));
	}
	
	/**
	* @Title: testGetUserByOpenId
	* @Description: 测试通过openid获取用户信息
	 */
	@Test
	@Ignore
	public void testGetUserByOpenId(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("openid", "o6_bmjrPTlm6_2sgVt7hMZOPfL2M");
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/getuser/openid.do",param));
	}
	
	/**
	* @Title: testAddUser1
	* @Description: 测试添加用户（该用户在数据库中不存在）
	 */
	@Test
	@Ignore
	public void testAddUser1(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("nickname", "lky");
		param.put("headimgurl", "http://localhost:8080/zeroSecondAnswer/user/getuser/uid.do?uid=1");
		param.put("openid", new RandomCode().getNoncestr());
		param.put("sex", "1");
		param.put("country","中国");
		param.put("province", "河南");
		param.put("city", "郑州");
		param.put("subscribetime",Long.toString(new Date().getTime()));
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/adduser.do",param));
	}
	
	/**
	* @Title: testAddUser2
	* @Description: 测试添加用户（该用户在数据库中存在）
	 */
	@Test
	@Ignore
	public void testAddUser2(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("nickname", "mcy");
		param.put("headimgurl", "http://localhost:8080/zeroSecondAnswer/user/getuser/uid.do?uid=2");
		param.put("openid","o6_bmjrPTlm6_2sgVt7hMZOPfL2M");
		param.put("sex", "2");
		param.put("country","中国");
		param.put("province", "河南");
		param.put("city", "开封");
		param.put("subscribetime",Long.toString(new Date().getTime()));
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/adduser.do",param));
	}
	
	/**
	* @Title: testUpdateSignature
	* @Description: 测试更新用户签名
	 */
	@Test
	@Ignore
	public void testUpdateSignature(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("signature", "匈奴未灭，何以还家！！");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/signature.do",param));
	}
	
	/**
	* @Title: testUpdateExperience
	* @Description: 测试更新经验值 
	 */
	@Test
	@Ignore
	public void testUpdateExperience(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("experience", "1000");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/experience.do",param));
	}
	
	/**
	* @Title: testUpdateInferenceCurrency
	* @Description: 测试更新推理币 
	 */
	@Test
	@Ignore
	public void testUpdateInferenceCurrency(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("currency", "100");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/currency.do",param));
	}
	
	/**
	* @Title: testUpdateIntegral
	* @Description: 测试更新用户积分
	 */
	@Test
	@Ignore
	public void testUpdateIntegral(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("integral", "845");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/integral.do",param));
	}
	
	/**
	* @Title: testUpdateFashionList
	* @Description: 测试更新用户时装列表
	 */
	@Test
	@Ignore
	public void testUpdateFashionList(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("fashionlist", "fashionlist");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/fashionlist.do",param));
	}
	
	/**
	* @Title: testUpdateAchievementList
	* @Description:测试更新用户成就列表
	 */
	@Test
	@Ignore
	public void testUpdateAchievementList(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("achievementlist", "achievementlist");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/achievementlist.do",param));
	}
	
	/**
	* @Title: testUpdateTaskList
	* @Description:测试更新用户的任务列表
	 */
	@Test
	@Ignore
	public void testUpdateTaskList(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("tasklist", "tasklist");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/tasklist.do",param));
	}
	
	/**
	* @Title: testUpdateGameList
	* @Description: 测试更新用户的游戏列表
	 */
	@Test
	public void testUpdateGameList(){
		Map<String, String> param=new HashMap<String,String>();
		param.put("gamelist", "gamelist");
		param.put("openid","d56iBJTpn9z6tDNt");
		
		System.out.println(HttpRequest.sendGet("http://localhost:8080/zeroSecondAnswer/user/update/gamelist.do",param));
	}
	
}
 