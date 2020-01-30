package com.abh.instanttrivia;

import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.model.UserStats;
import com.abh.instanttrivia.services.UserStatsService;

import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testGetUserStats(){

        User user = new User.Builder().id(7).build();

        UserStatsService userStatsService = new UserStatsService();
        UserStats userStats = userStatsService.getStats(user);

        System.out.println(userStats.toJSON());
    }
}
