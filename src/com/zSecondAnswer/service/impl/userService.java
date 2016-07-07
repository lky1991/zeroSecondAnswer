package com.zSecondAnswer.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zSecondAnswer.dao.userInformationMapper;
import com.zSecondAnswer.model.userInformation;
import com.zSecondAnswer.service.IUserService;
import com.zSecondAnswer.util.ResultCode;
import com.zSecondAnswer.util.ResultJson;

@SuppressWarnings("unchecked")
@Service
public class userService implements IUserService {
	private static Log log = LogFactory.getLog(userService.class);

	@Autowired
	private userInformationMapper userMapper;
	private ResultJson resultJson = new ResultJson();// 用于创建返回客服端的结果
	
	/**
	* @Title: addUser
	* @Description: 添加新用户
	* @param nickname 用户昵称
	* @param headimgurl  用户头像
	* @param openid     用户的唯一标识
	* @param sex        用户性别
	* @param country    用户国家
	* @param province   省份
	* @param city       城市
	* @param subscribetime  最近一次关注时间
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String addUser(String nickname, String headimgurl, String openid, int sex, String country, String province, String city, String subscribetime) {
		JSONObject result = new JSONObject();
		try {
			if (openid == null) {// 先判断用户openid是否为空
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();

			} else {
				boolean flag = true;
				if (null == userMapper.selectByOpenId(openid)) {// 判断该用户是否已经存在
					userInformation userInfo = new userInformation();
					// 用户微信信息
					userInfo.setNickName(nickname);
					userInfo.setHeadImgUrl(headimgurl);
					userInfo.setOpenId(openid);
					userInfo.setSex(Integer.valueOf(sex).byteValue());
					userInfo.setCity(city);
					userInfo.setCountry(country);
					userInfo.setProvince(province);
					userInfo.setSubscribeTime(subscribetime);

					// 用户基本信息
					userInfo.setPersonalSignature(null);
					userInfo.setTotalExperience(0);
					userInfo.setTotalInferenceCurrency(0);
					userInfo.setTotalIntegral(0);
					userInfo.setFashionList(null);
					userInfo.setAchievementList(null);
					userInfo.setTaskList(null);
					userInfo.setGameList(null);
					userMapper.addUser(userInfo);
				} else {
					userInformation oldInfo = userMapper.selectByOpenId(openid);
					oldInfo.setNickName(nickname);
					oldInfo.setHeadImgUrl(headimgurl);
					oldInfo.setSex(Integer.valueOf(sex).byteValue());
					oldInfo.setCountry(country);
					oldInfo.setProvince(province);
					oldInfo.setCity(city);
					oldInfo.setSubscribeTime(subscribetime);

					flag = updateUserInfomation(oldInfo);// 更新用户的基本信息
				}

				result = new JSONObject();
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {// 更新失败
					result = resultJson.createResultJSON(ResultCode.UPDATE_USERINFO_ERROR);
				}
				return result.toString();
			}

		} catch (Exception e) {
			log.info("增加用户异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}
	
	/**
	* @Title: getUserInfoByUid
	* @Description: 通过用户id获取用户信息
	* @param uid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String getUserInfoByUid(Integer uid) {
		JSONObject result = new JSONObject();

		try {
			if (null == userMapper.selectByPrimaryKey(uid)) {
				result = resultJson.createResultJSON(ResultCode.USERID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByPrimaryKey(uid);
				result = resultJson.createResultJSON(ResultCode.SUCCESS);

				result.put("nickname", userInfo.getNickName());
				result.put("headimgurl", userInfo.getHeadImgUrl());
				result.put("openid", userInfo.getOpenId());
				result.put("sex", userInfo.getSex());
				result.put("country", userInfo.getCountry());
				result.put("province", userInfo.getProvince());
				result.put("city", userInfo.getCity());
				result.put("subscribetime", userInfo.getSubscribeTime());
				result.put("personalsignature", userInfo.getPersonalSignature());
				result.put("totalexperience", userInfo.getTotalExperience());
				result.put("totalintegral", userInfo.getTotalIntegral());
				result.put("totalinferencecurrency", userInfo.getTotalInferenceCurrency());
				result.put("fashionlist", userInfo.getFashionList());
				result.put("achievementlist", userInfo.getAchievementList());
				result.put("tasklist", userInfo.getTaskList());
				result.put("gamelist", userInfo.getGameList());
				return result.toString();
			}
		} catch (Exception e) {
			log.info("通过用户uid获取用户信息时异常！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}
	
	/**
	* @Title: getUserInfoByOpenId
	* @Description: 通过openid获取用户信息
	* @param openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String getUserInfoByOpenId(String openid) {
		JSONObject result = new JSONObject();
		try {
			if (null == userMapper.selectByOpenId(openid)) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				result = resultJson.createResultJSON(ResultCode.SUCCESS);

				result.put("uid", userInfo.getUid());
				result.put("nickname", userInfo.getNickName());
				result.put("headimgurl", userInfo.getHeadImgUrl());
				result.put("sex", userInfo.getSex());
				result.put("country", userInfo.getCountry());
				result.put("province", userInfo.getProvince());
				result.put("city", userInfo.getCity());
				result.put("subscribetime", userInfo.getSubscribeTime());
				result.put("personalsignature", userInfo.getPersonalSignature());
				result.put("totalexperience", userInfo.getTotalExperience());
				result.put("totalintegral", userInfo.getTotalIntegral());
				result.put("totalinferencecurrency", userInfo.getTotalInferenceCurrency());
				result.put("fashionlist", userInfo.getFashionList());
				result.put("achievementlist", userInfo.getAchievementList());
				result.put("tasklist", userInfo.getTaskList());
				result.put("gamelist", userInfo.getGameList());

				return result.toString();
			}
		} catch (Exception e) {
			log.info("通过openid获取用户信息时异常！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}
	
	/**
	* @Title: updateSignature
	* @Description: 更新用户签名
	* @param signature  用户签名
	* @param openid    用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateSignature(String signature, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setPersonalSignature(signature);// 重置个人签名
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_SIGNATURE_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的签名异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}
	
	/**
	* @Title: updateExperience
	* @Description: 更新用户的经验值
	* @param experience  用户经验值
	* @param openid   用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateExperience(Integer experience, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setTotalExperience(experience);// 重置个人经验值
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_EXPERIENCE_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的经验值异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateInferenceCurrency
	* @Description: 更新用户的推理币
	* @param currency  用户推理币
	* @param openid    用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateInferenceCurrency(Integer currency, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setTotalInferenceCurrency(currency);// 重置个人推理币
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_CURRENCY_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的推理币异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateIntegral
	* @Description: 更新用户积分
	* @param integral  用户积分
	* @param openid   用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateIntegral(Integer integral, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setTotalIntegral(integral);// 重置个人积分
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_INTEGRAL_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的积分异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateFashionList
	* @Description: 更新用户的时装列表
	* @param fashionlist  用户时装列表
	* @param openid  用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateFashionList(String fashionlist, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setFashionList(fashionlist);// 重置个人时装表
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_FASHIONLIST_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户时装表异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateAchievementList
	* @Description: 更新用户的成就列表
	* @param achievementlist  用户成就列表
	* @param openid  用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateAchievementList(String achievementlist, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setAchievementList(achievementlist);// 重置个人成就列表
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_ACHIEVEMENTLIST_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户成就列表异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateTaskList
	* @Description:更新用户的任务列表
	* @param tasklist 用户的任务列表
	* @param openid  用户openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateTaskList(String tasklist, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setTaskList(tasklist);// 重置个人任务列表
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_TASKLIST_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的成就列表异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateGameList
	* @Description: 更新用户的游戏列表
	* @param gamelist 用户的游戏列表
	* @param openid   用户的openid
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public String updateGameList(String gamelist, String openid) {
		JSONObject result = new JSONObject();
		try {
			if ((null == openid) || (null == userMapper.selectByOpenId(openid))) {
				result = resultJson.createResultJSON(ResultCode.OPENID_ERROR);
				return result.toString();
			} else {
				userInformation userInfo = userMapper.selectByOpenId(openid);
				userInfo.setGameList(gamelist);// 重置个人游戏列表
				boolean flag = updateUserInfomation(userInfo);
				if (flag) {
					result = resultJson.createResultJSON(ResultCode.SUCCESS);
				} else {
					result = resultJson.createResultJSON(ResultCode.UPATE_USER_GAMELIST_ERROR);
				}
				return result.toString();
			}
		} catch (Exception e) {
			log.info("更新用户的游戏列表异常！！！！");
			result = resultJson.createResultJSON(ResultCode.UNKNOWERROR);
			return result.toString();
		}
	}

	/**
	* @Title: updateUserInfomation
	* @Description: 更新用户信息
	* @param userInfo  用户信息
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	private boolean updateUserInfomation(userInformation userInfo) {
		try {
			userMapper.updateUser(userInfo);
			return true;
		} catch (Exception e) {
			log.info("更新用户信息异常！！！！");
			return false;
		}
	}
}
