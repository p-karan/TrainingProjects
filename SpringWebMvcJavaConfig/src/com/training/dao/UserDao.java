package com.training.dao;

import com.training.ifaces.MyUserRepository;
import com.training.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao implements MyUserRepository {

    @Autowired
    private JdbcTemplate template;

    private static String tableName="Users";

    @Override
    public int add(Users user) {
        String sql="insert into "+tableName+" values(?,?,?,?,?,?,?)";
        int rowAdded=this.template.update(sql,user.getUserName(),user.getPassword(),user.getFirstName(),user.getLastName(),user.getEmail(),user.getAddress(),user.getPhone());

        return rowAdded;
    }

    @Override
    public boolean validate(Users user) {
        Boolean flg=false;
        String sql="select * from "+tableName+" where username=? and password=?";
        Users foundUser=this.template.queryForObject(sql, new BeanPropertyRowMapper<Users>(Users.class),user.getUserName(),user.getPassword());
        if(foundUser!=null)
            {flg=true;}
        return flg;
    }
}
