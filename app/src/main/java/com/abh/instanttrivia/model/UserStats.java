package com.abh.instanttrivia.model;

public class UserStats {

    private int userId;
    private int experience;
    private int level;
    private int coins;
    private int played;
    private int answered;
    private int correctKeys;
    private int totalKeys;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getAnswered() {
        return answered;
    }

    public void setAnswered(int answered) {
        this.answered = answered;
    }

    public int getCorrectKeys() {
        return correctKeys;
    }

    public void setCorrectKeys(int correctKeys) {
        this.correctKeys = correctKeys;
    }

    public int getTotalKeys() {
        return totalKeys;
    }

    public void setTotalKeys(int totalKeys) {
        this.totalKeys = totalKeys;
    }
}
