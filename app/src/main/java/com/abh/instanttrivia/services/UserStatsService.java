package com.abh.instanttrivia.services;

import com.abh.instanttrivia.interfaces.UserStatsInterface;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.model.UserStats;
import com.abh.instanttrivia.network.WebPostAsync;

import org.json.JSONObject;

public class UserStatsService implements UserStatsInterface {

    private SharedPrefService sharedPrefService;

    //empty constructor for testing
    public UserStatsService(){

    }

    public UserStatsService(SharedPrefService sharedPrefService){
        this.sharedPrefService = sharedPrefService;
    }

    @Override
    public UserStats getStats(User user) {
        try{
            String data = new WebPostAsync().execute("http://itrivia.eu/api/user/getStats/", user.toJSON()).get();
            JSONObject jsonObject = new JSONObject(data);
            UserStats userStats = new UserStats.Builder()
                    .experience(jsonObject.getInt("Experience"))
                    .level(jsonObject.getInt("Level"))
                    .coins(jsonObject.getInt("Coins"))
                    .played(jsonObject.getInt("Played"))
                    .answered(jsonObject.getInt("Answered"))
                    .build();
            return userStats;
        }catch (Exception e){
            return null;
        }
    }
}
