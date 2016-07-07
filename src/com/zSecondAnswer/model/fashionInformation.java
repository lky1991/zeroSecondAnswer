package com.zSecondAnswer.model;

public class fashionInformation {
    private Integer fid;

    private String fname;

    private String fdescribe;

    private String fashionUrl;

    private Byte wearingParts;

    private Integer fashionPrice;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFdescribe() {
        return fdescribe;
    }

    public void setFdescribe(String fdescribe) {
        this.fdescribe = fdescribe == null ? null : fdescribe.trim();
    }

    public String getFashionUrl() {
        return fashionUrl;
    }

    public void setFashionUrl(String fashionUrl) {
        this.fashionUrl = fashionUrl == null ? null : fashionUrl.trim();
    }

    public Byte getWearingParts() {
        return wearingParts;
    }

    public void setWearingParts(Byte wearingParts) {
        this.wearingParts = wearingParts;
    }

    public Integer getFashionPrice() {
        return fashionPrice;
    }

    public void setFashionPrice(Integer fashionPrice) {
        this.fashionPrice = fashionPrice;
    }
}