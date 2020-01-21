package com.abh.instanttrivia.services;

import com.abh.instanttrivia.interfaces.UserInterface;
import com.abh.instanttrivia.model.User;

public class UserService implements UserInterface {

    private User user;

    public UserService(User user) {
        this.user = user;
    }

    @Override
    public void registerUser() {

    }

    @Override
    public void loginUser() {

    }

    @Override
    public void checkToken() {

    }
}
