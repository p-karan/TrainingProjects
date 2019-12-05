package com.training.myapp.dao;

import com.training.myapp.model.User;

public interface UserDao {

    public boolean registerNewUser(User user);
    public User authenticateUser(String username,String password);
}
