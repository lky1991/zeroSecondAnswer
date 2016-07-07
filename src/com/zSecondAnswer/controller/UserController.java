package com.zSecondAnswer.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zSecondAnswer.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Inject
	private IUserService uService;
	
	//添加用户
	@RequestMapping(value = "adduser.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String addUser(String nickname, String headimgurl, String openid, int sex, String country, String province, String city, String subscribetime) {
		return uService.addUser(nickname, headimgurl, openid, sex, country, province, city, subscribetime);
	}

	//根据uid获取用户信息
	@RequestMapping(value = "getuser/uid.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String getUserByUid(Integer uid) {
		return uService.getUserInfoByUid(uid);
	}
	
	//根据openid获取用户信息
	@RequestMapping(value = "getuser/openid.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String getUserByOpenId(String openid) {
		return uService.getUserInfoByOpenId(openid);
	}

	//更新用户签名
	@RequestMapping(value = "update/signature.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateSignature(String signature, String openid) {
		return uService.updateSignature(signature, openid);

	}

	//更新用户经验值
	@RequestMapping(value = "update/experience.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateExperience(Integer experience, String openid) {
		return uService.updateExperience(experience, openid);
	}

	//更新用户推理币
	@RequestMapping(value = "update/currency.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateInferenceCurrency(Integer currency, String openid) {
		return uService.updateInferenceCurrency(currency, openid);
	}

	//更新用户积分
	@RequestMapping(value = "update/integral.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateIntegral(Integer integral, String openid) {
		return uService.updateIntegral(integral, openid);
	}
	
	//更新用户时装列表
	@RequestMapping(value = "update/fashionlist.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateFashionList(String fashionlist, String openid) {
		return uService.updateFashionList(fashionlist, openid);
	}

	//更新用户成就列表
	@RequestMapping(value = "update/achievementlist.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateAchievementList(String achievementlist, String openid) {
		return uService.updateAchievementList(achievementlist, openid);
	}

	//更新用户任务列表
	@RequestMapping(value = "update/tasklist.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateTaskList(String tasklist, String openid) {
		return uService.updateTaskList(tasklist, openid);
	}

	//更新用户的游戏列表
	@RequestMapping(value = "update/gamelist.do", produces = "text/json;charset=UTF-8", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String updateGameList(String gamelist, String openid) {
		return uService.updateGameList(gamelist, openid);
	}
}
