package com.abh.instanttrivia.model;

public class Category {

    private int id;
    private string name;

    public Category(int id, string name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
