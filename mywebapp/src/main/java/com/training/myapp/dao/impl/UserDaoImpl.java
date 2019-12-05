package com.training.myapp.dao.impl;

import com.training.myapp.dao.UserDao;
import com.training.myapp.model.User;

import javax.persistence.*;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private EntityManagerFactory factory;

    public UserDaoImpl() {
        factory= Persistence.createEntityManagerFactory("myapp");
    }

    @Override
    public boolean registerNewUser(User user){
        EntityManager entityManager=factory.createEntityManager();
        EntityTransaction tx=entityManager.getTransaction();
        tx.begin();

        entityManager.persist(user);
        tx.commit();
        entityManager.close();
        return true;
    }
    @Override
    public User authenticateUser(String username, String password){
        EntityManager entityManager=factory.createEntityManager();
        Query query=entityManager.createNamedQuery("findUser");
        query.setParameter(1, username);
        query.setParameter(2,password);

        List<User> users=query.getResultList();
        User user=null;

        if(users.size()!=0)
            user=users.get(0);
        return user;
    }
}
