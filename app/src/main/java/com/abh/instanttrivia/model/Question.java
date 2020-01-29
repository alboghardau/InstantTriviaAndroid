package com.abh.instanttrivia.model;

public class Question {

    private int id;
    private String question;
    private String answer;
    private double difficulty;
    private Category category;

    private Question(Builder builder){

    }

    public static class Builder{

        private int id;
        private String question;
        private String answer;
        private double difficulty;
        private Category category;

        public Builder(){

        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder question(String question){
            this.question = question;
            return this;
        }

        public Builder answer(String answer){
            this.answer = answer;
            return this;
        }

        public Builder difficulty(double difficulty){
            this.difficulty = difficulty;
            return this;
        }

        public Builder category(Category category){
            this.category = category;
            return this;
        }

        public Question build(){
            return new Question(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", difficulty=" + difficulty +
                ", category=" + category +
                '}';
    }
}
