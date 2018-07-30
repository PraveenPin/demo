package com.sample.demo.impl;

import com.sample.demo.model.Leave;
import com.sample.demo.repository.LeaveFromInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Leave> getLeaveDetails(Integer manager_id,String status) {
        String sql  = "select * from emp_performance.`leave` where status=? and emp_id in (select emp_id from master where manager_id=?)";
        System.out.println("BEFORE GETTING FROM DATABASE , LEAVE FORMS FOR MANAGER");
        return jdbcTemplate.query(sql,new Object[]{status,manager_id},new BeanPropertyRowMapper<>(Leave.class));
    }

    @Override
    public Leave getLeaveEmpData(Integer emp_id, String status) {
        String sql = "select * from emp_performance.`leave` where emp_id=? and status=?";
        System.out.println("BEFORE GETTING FROM DATABASE , LEAVE FORM FOR EMPLOYEE");
        return jdbcTemplate.queryForObject(sql,new Object[]{emp_id,status},new BeanPropertyRowMapper<>(Leave.class));
    }
}

