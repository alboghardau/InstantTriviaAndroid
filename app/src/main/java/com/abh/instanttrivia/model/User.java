//USER MODEL WITH BUILDER PATTERN
package com.abh.instanttrivia.model;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;

    private User(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static class Builder{
        private int id;
        private String username;
        private String password;
        private String email;

        public Builder(){

        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toJSON(){
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("Username", this.getUsername());
            jsonObject.put("Email", this.getEmail());
            jsonObject.put("Password", this.getPassword());
            return jsonObject.toString();
        }catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
