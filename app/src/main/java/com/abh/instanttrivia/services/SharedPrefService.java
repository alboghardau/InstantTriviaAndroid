package com.abh.instanttrivia.services;

import android.content.SharedPreferences;

public class SharedPrefService {

    private SharedPreferences sharedPreferences;

    public SharedPrefService(SharedPreferences sharedPreferences){
        this.sharedPreferences = sharedPreferences;

    }

    public void setPrefString(String name, String value){
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(name, value);
        editor.apply();
    }

    public String getPrefString(String name){
        return this.sharedPreferences.getString(name, null);
    }

    public boolean hasKey(String key){
        if(this.sharedPreferences.contains(key)){
            return true;
        }else {
            return false;
        }
    }
}

