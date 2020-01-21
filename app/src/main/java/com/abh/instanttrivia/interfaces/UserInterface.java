package com.abh.instanttrivia.interfaces;

import com.abh.instanttrivia.model.User;

public interface UserInterface {

    void registerUser(User user);
    void loginUser(User user);
    void checkToken(String token);

}
