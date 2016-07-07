package com.zSecondAnswer.service;

public interface IUserService {
	// 添加新用户
	public String addUser(String nickname, String headimgurl, String openid, int sex, String country, String province, String city, String subscribetime);

	// 通过用户id查找用户信息
	public String getUserInfoByUid(Integer uid);

	// 通过openid查找用户信息
	public String getUserInfoByOpenId(String openid);

	// 更新用户签名
	public String updateSignature(String signature, String openid);

	// 更新用户经验值
	public String updateExperience(Integer experience, String openid);

	// 更新用户推理币
	public String updateInferenceCurrency(Integer currency, String openid);

	// 更新用户积分
	public String updateIntegral(Integer integral, String openid);

	// 更新用户的时装列表
	public String updateFashionList(String fashionlist, String openid);

	// 更新用户的成就列表
	public String updateAchievementList(String achievementlist, String openid);

	// 更新用户的任务列表
	public String updateTaskList(String tasklist, String openid);

	// 更新用户的游戏列表
	public String updateGameList(String gamelist, String openid);

}
