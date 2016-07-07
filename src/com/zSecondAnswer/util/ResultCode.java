package com.zSecondAnswer.util;

/**
* @ClassName: resultCode
* @Description: 工具类用于结果码到返回信息的映射
* @author lky
* @date 2015年9月23日
* @version 1.0
 */
public class ResultCode {

	public static Integer SUCCESS = 0;
	public static Integer UNKNOWERROR = -1;
	
	
	//用户错误码10XXX
	public static Integer USERID_ERROR = 10001;// 用户id不存在
	public static Integer OPENID_ERROR=10002;//openID为空
	public static Integer UPDATE_USERINFO_ERROR=10003;//更新用户信息失败
	public static Integer UPATE_USER_SIGNATURE_ERROR=10004;//更新用户签名失败
	public static Integer UPATE_USER_EXPERIENCE_ERROR=10005;//跟新用户经验值失败
	public static Integer UPATE_USER_CURRENCY_ERROR=10006;//更新用户推理币失败
	public static Integer UPATE_USER_INTEGRAL_ERROR=10007;//更新用户积分失败
	public static Integer UPATE_USER_FASHIONLIST_ERROR=10008;//更新用户时装列表失败
	public static Integer UPATE_USER_ACHIEVEMENTLIST_ERROR=10009;//更新用户成就列表失败
	public static Integer UPATE_USER_TASKLIST_ERROR=10010;//更新用户任务列表失败
	public static Integer UPATE_USER_GAMELIST_ERROR=10011;//更新用户游戏列表失败
			
	
	
	//时装错误码20XXX
	public static Integer NO_FASHION=20001; //该时装不存在
	
	
	
	//任务错误码30xxx
	public static Integer NO_TASK=30001;   //该任务不存在
	
	

	//成就错误码40xxx
	public static Integer NO_TITLE=40001; //该成就不存在
	
	//游戏错误码50xxx
	public static Integer NO_GAME=50001;//该游戏不存在

	// 根据resultCode返回相应的信息
	public static String getErrmsg(Integer sign) {
		String errmsg = "";
		switch (sign) {
			case 0:errmsg = "success";break;
			case -1:errmsg = "unknown error";break;
			
			//用户类
			case 10001:errmsg="userid error";break;
			case 10002:errmsg="openid is null";break;
			case 10003:errmsg="update userinfomation error";break;
			case 10004:errmsg="update user signature error";break;
			case 10005:errmsg="update user experience error";break;
			case 10006:errmsg="update user currency error";break;
			case 10007:errmsg="update user integral error";break;
			case 10008:errmsg="update user fashionlist error";break;
			case 10009:errmsg="update user achievementlist error";break;
			case 10010:errmsg="update user tasklist error";break;
			case 10011:errmsg="update user gamelist error";break;
			
			//时装类
			case 20001: errmsg="no fashion";break;
			
			//任务类
			case 30001: errmsg="no task";break;
			
			//成就类
			case 40001: errmsg="no title";break;
			
			
			//游戏类
			case 50001: errmsg="no game";break;
			
			
			
		
		}

		return errmsg;
	}

}
