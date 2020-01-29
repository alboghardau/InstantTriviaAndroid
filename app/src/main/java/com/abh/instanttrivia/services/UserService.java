package com.abh.instanttrivia.services;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.JsonReader;
import android.util.Log;

import com.abh.instanttrivia.interfaces.UserInterface;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.network.WebPostAsync;

import org.json.JSONObject;

public class UserService implements UserInterface {

    private User user;
    private SharedPreferences sharedPreferences;

    //overloaded constructors - checkToken does not require an user object
    public UserService(SharedPreferences sharedPreferences){
        this.sharedPreferences = sharedPreferences;
    }

    public UserService(User user, SharedPreferences sharedPreferences) {
        this.user = user;
        this.sharedPreferences = sharedPreferences;
    }

    //TODO
    @Override
    public String registerUser() {
        try{
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/register/", this.user.toJSON()).get();
            JSONObject jsonObject = new JSONObject(data);


            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("registerUser", e.toString());
            return "Register failed!";
        }
    }

    @Override
    public String loginUser() {
        try{
            Log.e("UserJson", this.user.toJSON());
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/login/", this.user.toJSON()).get();
            JSONObject jsonObject = new JSONObject(data);
            if(jsonObject.has("Token")) {
                String token = jsonObject.getString("Token");
                SharedPrefService sharedPrefService = new SharedPrefService(this.sharedPreferences);
                sharedPrefService.setPrefString("Token", token);
            }
            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("loginUser",e.toString());
            return "Login failed!";
        }
    }

    @Override
    public String checkToken() {
        try{
            JSONObject jsonSend = new JSONObject();
            SharedPrefService sharedPreferences = new SharedPrefService(this.sharedPreferences);
            if(sharedPreferences.hasKey("Token")){
                jsonSend.put("Token", sharedPreferences.getPrefString("Token"));
            }
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/tokenLogin/", jsonSend.toString()).get();
            JSONObject jsonObject = new JSONObject(data);
            if(jsonObject.has("UserId")){
                sharedPreferences.setPrefInt("UserId", jsonObject.getInt("UserId"));
            }
            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("checkToken", e.toString());
            return "Login failed!";
        }
    }
}
