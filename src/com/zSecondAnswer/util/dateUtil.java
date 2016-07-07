package com.zSecondAnswer.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
* @ClassName: dateUtil
* @Description:日期处理工具类
* @author lky
* @date 2015年10月28日
* @vesion 1.0
 */
public class dateUtil {
	
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static  String dateToString(Date date){
		return sdf.format(date);
	}
    
	public  static Date stringToDate(String str){
		Date date=null;
		try {
			 date=sdf.parse(str);
			 return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return date;
		}
	}
	
	public static long getStatic(){
		Date date=stringToDate(new String("3000-01-01 00:00:00"));
		if(date!=null){
			return date.getTime();
		}
		return 0;
	}
}
