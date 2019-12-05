package com.training.myapp.model;

import javax.persistence.*;

@Entity
@Table(name="users")
@NamedQuery(name="findUser", query="from User where username=? and password=?")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String password;
    private String userEmailId;
    private long userContact;

    public User() {
    }

    public User(String userName, String password, String userEmailId, long userContact) {
        this.userName = userName;
        this.password = password;
        this.userEmailId = userEmailId;
        this.userContact = userContact;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public long getUserContact() {
        return userContact;
    }

    public void setUserContact(long userContact) {
        this.userContact = userContact;
    }

}
