package com.zSecondAnswer.model;

public class taskInformation {
    private Integer tid;

    private String tname;

    private String tdescribe;

    private String taskUrl;

    private Byte taskSchedule;

    private Integer taskExperience;

    private Integer taskIntegral;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTdescribe() {
        return tdescribe;
    }

    public void setTdescribe(String tdescribe) {
        this.tdescribe = tdescribe == null ? null : tdescribe.trim();
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl == null ? null : taskUrl.trim();
    }

    public Byte getTaskSchedule() {
        return taskSchedule;
    }

    public void setTaskSchedule(Byte taskSchedule) {
        this.taskSchedule = taskSchedule;
    }

    public Integer getTaskExperience() {
        return taskExperience;
    }

    public void setTaskExperience(Integer taskExperience) {
        this.taskExperience = taskExperience;
    }

    public Integer getTaskIntegral() {
        return taskIntegral;
    }

    public void setTaskIntegral(Integer taskIntegral) {
        this.taskIntegral = taskIntegral;
    }
}