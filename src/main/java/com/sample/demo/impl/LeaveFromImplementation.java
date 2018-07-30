package com.sample.demo.impl;

import com.sample.demo.model.Leave;
import com.sample.demo.repository.LeaveFromInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeaveFromImplementation implements LeaveFromInterface {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void saveLeaveForm(Leave leave) {
        String sql = "insert into emp_performance.`leave` values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{leave.getEmp_id(),leave.getLeave_id(),leave.getLeave_type(),leave.getLeave_from(),leave.getLeave_to(),
                leave.getContact_no(),leave.getDate_applied(),leave.getTotal_leaves(),leave.getLeaves_accumulated(),leave.getLeaves_consumed()
        ,leave.getLeave_reason(),leave.getSubstitute_person(),leave.getVerified_by(),leave.getApproved_by(),leave.getStatus()});
        System.out.println("Leave From into Database");
    }
}

