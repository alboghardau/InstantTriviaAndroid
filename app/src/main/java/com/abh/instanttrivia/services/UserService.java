package com.abh.instanttrivia.services;

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

    public UserService(User user, SharedPreferences sharedPreferences) {
        this.user = user;
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public void registerUser() {
        try{
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/register/", this.user.toJSON()).get();
        }catch (Exception e){

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
                Log.e("TOKEN", token);
            }
            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("login crash",e.getMessage());
            return "Login failed!";
        }
    }

    @Override
    public String checkToken() {

        try{
            String token = "";
            SharedPrefService sharedPreferences = new SharedPrefService(this.sharedPreferences);
            if(sharedPreferences.hasKey("Token")){
                token = sharedPreferences.getPrefString("Token");
            }

            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/checkToken/", token).get();
            JSONObject jsonObject = new JSONObject(data);
            return jsonObject.getString("Message");
        }catch (Exception e){
            Log.e("Token crash", e.getMessage());
            return "Login failed!";
        }
    }
}
