package com.abh.instanttrivia.model;

import org.json.JSONException;
import org.json.JSONObject;

public class CategoryStats {

    private int categoryId;
    private int totalQuestions;
    private double averageDifficulty;
    private int played;
    private int answered;

    private CategoryStats(Builder builder){

    }

    public static class Builder{

        private int categoryId;
        private int totalQuestions;
        private double averageDifficulty;
        private int played;
        private int answered;

        public Builder(){

        }

        public Builder categoryId(int categoryId){
            this.categoryId = categoryId;
            return this;
        }

        public Builder totalQuestions(int totalQuestions){
            this.totalQuestions = totalQuestions;
            return this;
        }

        public Builder averageDifficulty(double averageDifficulty){
            this.averageDifficulty = averageDifficulty;
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

        public CategoryStats build(){
            return new CategoryStats(this);
        }
    }

    //SETTERS & GETTERS
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public double getAverageDifficulty() {
        return this.averageDifficulty;
    }

    public void setAverageDifficulty(double averageDifficulty) {
        this.averageDifficulty = averageDifficulty;
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

    public String toJSON(){
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("CategoryId", this.getCategoryId());
            jsonObject.put("TotalQuestions", this.getTotalQuestions());
            jsonObject.put("AverageDifficulty", this.getAverageDifficulty());
            jsonObject.put("Played", this.getPlayed());
            jsonObject.put("Answered", this.getAnswered());
            return jsonObject.toString();
        }catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
