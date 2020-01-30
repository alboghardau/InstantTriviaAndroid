package com.abh.instanttrivia.interfaces;

import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.model.UserStats;

public interface UserStatsInterface {

    UserStats getStats(User user);

}
