package com.zSecondAnswer.util;

/**
* @ClassName: RandomCode
* @Description: 生成特定条件下的随机字符串
* @author lky
* @date 2015年10月28日
* @vesion 1.0
 */
public class RandomCode {
	
	private static char[] code = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0' };
	
	private static char[] num = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
	
	public String getNoncestr(){
		String str = "";
		for(Integer i=0;i<16;i++){
			str += code[(int)(Math.random()*62)];
		}
		return str;
	}
	
	public String getToken(){
		String str = "";
		for(Integer i=0;i<50;i++){
			str += code[(int)(Math.random()*62)];
		}
		return str;
	}
	
	public String getNum(Integer size){
		String str = "";
		for(Integer i=0;i<size;i++){
			str += num[(int)(Math.random()*10)];
		}
		return str;
	}
}