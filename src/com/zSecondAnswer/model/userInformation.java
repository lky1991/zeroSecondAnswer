package com.zSecondAnswer.model;

public class userInformation {
	private Integer uid;

	private String nickName;

	private String headImgUrl;

	private Byte sex;

	private String country;

	private String province;

	private String city;

	private String subscribeTime;

	private String openId;

	private String personalSignature;

	private Integer totalExperience;

	private Integer totalIntegral;

	private Integer totalInferenceCurrency;

	private String fashionList;

	private String achievementList;

	private String taskList;

	private String gameList;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(String subscribeTime) {
		this.subscribeTime = subscribeTime == null ? null : subscribeTime.trim();
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	public String getPersonalSignature() {
		return personalSignature;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature == null ? null : personalSignature.trim();
	}

	public Integer getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}

	public Integer getTotalIntegral() {
		return totalIntegral;
	}

	public void setTotalIntegral(Integer totalIntegral) {
		this.totalIntegral = totalIntegral;
	}

	public Integer getTotalInferenceCurrency() {
		return totalInferenceCurrency;
	}

	public void setTotalInferenceCurrency(Integer totalInferenceCurrency) {
		this.totalInferenceCurrency = totalInferenceCurrency;
	}

	public String getFashionList() {
		return fashionList;
	}

	public void setFashionList(String fashionList) {
		this.fashionList = fashionList == null ? null : fashionList.trim();
	}

	public String getAchievementList() {
		return achievementList;
	}

	public void setAchievementList(String achievementList) {
		this.achievementList = achievementList == null ? null : achievementList.trim();
	}

	public String getTaskList() {
		return taskList;
	}

	public void setTaskList(String taskList) {
		this.taskList = taskList == null ? null : taskList.trim();
	}

	public String getGameList() {
		return gameList;
	}

	public void setGameList(String gameList) {
		this.gameList = gameList == null ? null : gameList.trim();
	}

	@Override
	public String toString() {
		return "userInformation [uid=" + uid + ", nickName=" + nickName + ", headImgUrl=" + headImgUrl + ", sex=" + sex + ", country=" + country + ", province=" + province + ", city=" + city + ", subscribeTime=" + subscribeTime + ", openId=" + openId + ", personalSignature=" + personalSignature + ", totalExperience=" + totalExperience + ", totalIntegral=" + totalIntegral + ", totalInferenceCurrency=" + totalInferenceCurrency + ", fashionList=" + fashionList + ", achievementList=" + achievementList + ", taskList=" + taskList + ", gameList=" + gameList + "]";
	}

}