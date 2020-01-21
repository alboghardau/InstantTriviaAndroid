package com.abh.instanttrivia.model;

public class CategoryStats {

    private int categoryId;
    private int totalQuestions;
    private double AverageDifficulty;
    private int played;
    private int answered;

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
        return AverageDifficulty;
    }

    public void setAverageDifficulty(double averageDifficulty) {
        AverageDifficulty = averageDifficulty;
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
}
