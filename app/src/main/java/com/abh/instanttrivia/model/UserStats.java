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

    private UserStats(Builder builder){

    }

    private static class Builder{

        private int userId;
        private int experience;
        private int level;
        private int coins;
        private int played;
        private int answered;
        private int correctKeys;
        private int totalKeys;

        public Builder(){

        }

        public Builder userId(int userId){
            this.userId = userId;
            return this;
        }

        public Builder experience(int experience){
            this.experience = experience;
            return this;
        }

        public Builder level(int level){
            this.level = level;
            return this;
        }

        public Builder coins(int coins){
            this.coins = coins;
            return this;
        }

        public Builder played(int played){
            this.played = played;
            return this;
        }

        public Builder answered(int answered){
            this.answered = answered;
            return this;
        }

        public Builder correctKeys(int correctKeys){
            this.correctKeys = correctKeys;
            return this;
        }

        public Builder totalKeys(int totalKeys){
            this.totalKeys = totalKeys;
            return this;
        }

        public UserStats build(){
            return new UserStats(this);
        }
    }

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
