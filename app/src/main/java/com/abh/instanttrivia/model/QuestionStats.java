package com.abh.instanttrivia.model;

public class QuestionStats {

    private int questionId;
    private int questionLength;
    private int answerLength;
    private int played;
    private int answered;
    private int correctKeys;
    private int totalKeys;

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
}
