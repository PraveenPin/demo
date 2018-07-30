package com.sample.demo.impl;

import com.sample.demo.model.User;
import com.sample.demo.repository.SignUpInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpImplemenation implements SignUpInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void saveData(User user) {
        String sql = "insert into master values(?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{user.getEmp_name(),user.getEmp_id(),user.getDoj(),user.getManager_name(),user.getManager_id()
                ,user.getDept_name(),user.getEmp_mail(),user.getPassword(),user.getDesignation()});
//        System.out.println("Database");
    }

}
