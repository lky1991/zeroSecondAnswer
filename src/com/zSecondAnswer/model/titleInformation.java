package com.zSecondAnswer.model;

public class titleInformation {
    private Integer titleId;

    private String titleName;

    private String titleDescribe;

    private String titleUrl;

    private Byte titleSchedule;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public String getTitleDescribe() {
        return titleDescribe;
    }

    public void setTitleDescribe(String titleDescribe) {
        this.titleDescribe = titleDescribe == null ? null : titleDescribe.trim();
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl == null ? null : titleUrl.trim();
    }

    public Byte getTitleSchedule() {
        return titleSchedule;
    }

    public void setTitleSchedule(Byte titleSchedule) {
        this.titleSchedule = titleSchedule;
    }
}