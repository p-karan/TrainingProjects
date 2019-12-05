package com.training.myapp.service;

import com.training.myapp.exception.UserNotFoundException;
import com.training.myapp.model.User;

public interface UserService {

    public boolean registerNewUser(User user);
    public User authenticateUser(String username,String password) throws UserNotFoundException;
}
