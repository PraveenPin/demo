package com.sample.demo.impl;

import com.sample.demo.model.Goal;
import com.sample.demo.repository.GoalPerformance;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @Override
//    public List<Goal> getGoalForms(Integer emp_id) {
//        return null;
//    }
}
