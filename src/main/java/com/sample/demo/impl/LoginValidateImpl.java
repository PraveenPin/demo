package com.sample.demo.impl;


import com.sample.demo.model.Login;
import com.sample.demo.model.MasterModel;
import com.sample.demo.model.Response;
import com.sample.demo.repository.LoginValidateInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginValidateImpl implements LoginValidateInterface {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Response isValidUser(Login login) {
        String sql="Select emp_name, emp_id, doj, manager_name, manager_id, dept_name, emp_mail, designation from master where emp_id=? and password=?";
        List<MasterModel> list = jdbcTemplate.query(sql,new Object[]{login.getEmp_id(),login.getPassword()},new BeanPropertyRowMapper<>(MasterModel.class));
        String isValid="valid";
        if(list.isEmpty())
            isValid="invalid";

        Response response = new Response(isValid,list);

        return response;
    }
}