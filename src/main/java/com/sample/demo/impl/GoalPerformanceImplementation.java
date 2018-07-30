package com.sample.demo.impl;

import com.sample.demo.model.EmpIdStatus;
import com.sample.demo.model.Goal;
import com.sample.demo.model.GoalApproval;
import com.sample.demo.model.ManIdStatus;
import com.sample.demo.repository.GoalPerformance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoalPerformanceImplementation implements GoalPerformance {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void saveGoalPerformance(Goal goal) {
        String sql = "insert into goal_performance values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{goal.getEmp_id(),goal.getkra1(),goal.getkra1_weightage(),goal.getkra2(),
        goal.getkra2_weightage(),goal.getkra3(),goal.getkra3_weightage(),goal.getkra4(),goal.getkra4_weightage(),goal.getkra5(),
        goal.getkra5_weightage(),goal.getkra6(),goal.getkra6_weightage(),goal.getFinal_rating(),goal.getVerified_by(),
        goal.getApproved_by(),goal.getStatus(),goal.getReview_start(),goal.getReview_end()});
        System.out.println("PERFORMANCE ADDED IN THE DATABASE");
    }

    @Override
    public List<Goal> getGoalForms(ManIdStatus manIdStatus) {
        String sql="select * from goal_performance where status=? and emp_id in (select emp_id from master where manager_id=?)";
        System.out.println("BEFORE GETTING ALL EMP GOAL FORMS FROM DATABASE FOR MANAGER");
        return jdbcTemplate.query(sql,new Object[]{manIdStatus.getStatus(),manIdStatus.getManager_id()},new BeanPropertyRowMapper<>(Goal.class));
    }

    @Override
    public Goal getGoalEmpForm(EmpIdStatus empIdStatus) {
        String sql = "select * from goal_performance where emp_id=? and status=?";
        System.out.println("BEFORE GETTING  EMP GOAL FORM FROM DATABASE FOR EMPLOYEE");
        return jdbcTemplate.queryForObject(sql,new Object[]{empIdStatus.getEmp_id(),empIdStatus.getStatus()},new BeanPropertyRowMapper<>(Goal.class));
    }

    @Override
    public String updateByManager(GoalApproval goalApproval) {
        String sql = "update goal_performance set verified_by=?,approved_by=?,status=? where goal_id=?";
        jdbcTemplate.update(sql,new Object[]{goalApproval.getVerified_by(),goalApproval.getApproved_by(),goalApproval.getStatus(),
        goalApproval.getGoal_id()});
        return "Successfully updated";
    }

}
