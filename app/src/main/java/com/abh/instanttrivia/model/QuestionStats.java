package com.abh.instanttrivia.model;

import org.json.JSONException;
import org.json.JSONObject;

public class QuestionStats {

    private int questionId;
    private int questionLength;
    private int answerLength;
    private int played;
    private int answered;
    private int correctKeys;
    private int totalKeys;

    private QuestionStats(Builder builder){

    }

    public static class Builder{

        private int questionId;
        private int questionLength;
        private int answerLength;
        private int played;
        private int answered;
        private int correctKeys;
        private int totalKeys;

        public Builder(){

        }

        public Builder questionId(int questionId){
            this.questionId = questionId;
            return this;
        }

        public Builder questionLength(int questionLength){
            this.questionLength = questionLength;
            return this;
        }

        public Builder answerLength(int answerLength){
            this.answerLength = answerLength;
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

        public QuestionStats build(){
            return new QuestionStats(this);
        }
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionLength() {
        return questionLength;
    }

    public void setQuestionLength(int questionLength) {
        this.questionLength = questionLength;
    }

    public int getAnswerLength() {
        return answerLength;
    }

    public void setAnswerLength(int answerLength) {
        this.answerLength = answerLength;
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

    public String toJSON(){
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("QuestionId", this.getQuestionId());
            jsonObject.put("QuestionLength", this.getQuestionLength());
            jsonObject.put("AnswerLength", this.getAnswerLength());
            jsonObject.put("Played", this.getPlayed());
            jsonObject.put("Answered", this.getAnswered());
            jsonObject.put("CorrectKeys", this.getCorrectKeys());
            jsonObject.put("TotalKeys", this.getTotalKeys());
            return jsonObject.toString();
        }catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
