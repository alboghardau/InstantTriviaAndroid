package com.abh.instanttrivia.services;

import android.util.JsonReader;
import android.util.Log;

import com.abh.instanttrivia.interfaces.UserInterface;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.network.WebPostAsync;

import org.json.JSONObject;

public class UserService implements UserInterface {

    private User user;

    public UserService(User user) {
        this.user = user;
    }

    @Override
    public void registerUser() {

    }

    @Override
    public String loginUser() {
        try{
            Log.e("UserJson", this.user.toJSON());
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/login/", this.user.toJSON()).get();
            JSONObject jsonObject = new JSONObject(data);
            if(jsonObject.has("Token")) {
                String token = jsonObject.getString("Token");
                Log.e("TOKEN", token);
            }
            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("crash",e.getMessage());
            return "Login failed!";
        }
    }

    @Override
    public void checkToken() {

    }
}
