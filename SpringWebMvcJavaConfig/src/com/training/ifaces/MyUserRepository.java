package com.training.ifaces;

import com.training.entities.Users;

public interface MyUserRepository {

    public int add(Users user);
    public boolean validate(Users user);

}
