package com.training.myapp.service.impl;

import com.training.myapp.dao.UserDao;
import com.training.myapp.dao.impl.UserDaoImpl;
import com.training.myapp.exception.UserNotFoundException;
import com.training.myapp.model.User;
import com.training.myapp.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public boolean registerNewUser(User user) {
        return userDao.registerNewUser(user);
    }

    @Override
    public User authenticateUser(String username, String password) throws UserNotFoundException {
        User user=userDao.authenticateUser(username,password);
        if(user==null)
            throw new UserNotFoundException("Invalid username or password");
        return user;
    }
}
