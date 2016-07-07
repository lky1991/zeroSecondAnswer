package com.zSecondAnswer.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class productInformation  implements Serializable {
	private Integer pid;

	private String productDescriber;

	private String productDetail;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getProductDescriber() {
		return productDescriber;
	}

	public void setProductDescriber(String productDescriber) {
		this.productDescriber = productDescriber == null ? null : productDescriber.trim();
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail == null ? null : productDetail.trim();
	}

	@Override
	public String toString() {
		return "productInformation [pid=" + pid + ", productDescriber=" + productDescriber + ", productDetail=" + productDetail + "]";
	}

}