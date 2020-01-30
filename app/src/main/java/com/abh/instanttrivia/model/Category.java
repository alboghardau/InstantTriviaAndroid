package com.abh.instanttrivia.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Category {

    private int id;
    private String name;

    public Category(){

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toJSON(){
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("Id", this.getId());
            jsonObject.put("Name", this.getName());
            return jsonObject.toString();
        }catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
