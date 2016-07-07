package com.zSecondAnswer.util;

import java.io.File;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


/**
 * @ClassName: FileUpload
 * @Description:处理上传图片的工具类
 * @author lky
 * @date 2015年9月28日
 * @version 1.0
 */
public class FileUpload {
	
	private static String logic_url = "http://localhost:8080/pic_coupon/";

	@SuppressWarnings("null")
	public static String userCouponUpload(HttpServletRequest request) {
		String coupon_url ="";
		
		try {
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				while (iter.hasNext()) {
					// 记录上传过程起始时的时间，用来计算上传时间
					int pre = (int) System.currentTimeMillis();
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null || !file.isEmpty()) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						// 如果名称不为"",说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							System.out.println(myFileName);
							// 定义上传路径(图片存储的物理地址)
							String localfileName = "D:\\picture\\" +myFileName;
							System.out.println("图片存储的物理地址------>"+localfileName);
							
							File localFile = new File(localfileName);
							//判断该文件是否存在
							if(!localFile.exists()){
								localFile.mkdirs();
							}
							//上传图片
							file.transferTo(localFile);
							coupon_url=logic_url+myFileName;
						}
					}
					// 记录上传该文件后的时间
					int finaltime = (int) System.currentTimeMillis();
					System.out.println("图片上传时间--->"+ (finaltime - pre));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return coupon_url;
	}
}
