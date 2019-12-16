//USER MODEL WITH BUILDER PATTERN
package com.abh.instanttrivia.model;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;

    private User(){

    }

    public static class Builder{
        private int id;
        private String username;
        private String password;
        private String email;

        public Builder(){

        }

        public int id(int id){

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
}
