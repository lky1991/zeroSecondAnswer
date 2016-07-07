package com.zSecondAnswer.model;

public class gameInformation {
    private Integer gameId;

    private String gameName;

    private String gameDescriber;

    private String gameUrl;

    private Integer gameExprience;

    private Integer gameIntegral;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getGameDescriber() {
        return gameDescriber;
    }

    public void setGameDescriber(String gameDescriber) {
        this.gameDescriber = gameDescriber == null ? null : gameDescriber.trim();
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl == null ? null : gameUrl.trim();
    }

    public Integer getGameExprience() {
        return gameExprience;
    }

    public void setGameExprience(Integer gameExprience) {
        this.gameExprience = gameExprience;
    }

    public Integer getGameIntegral() {
        return gameIntegral;
    }

    public void setGameIntegral(Integer gameIntegral) {
        this.gameIntegral = gameIntegral;
    }
}