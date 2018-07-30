package com.sample.demo.impl;

import com.sample.demo.model.LearnDev;
import com.sample.demo.repository.learnDevInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LearnDevImplementation implements learnDevInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void saveLearnData(LearnDev learnDev) {
        String sql = "insert into learn_dev values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{learnDev.getEmp_id(),learnDev.getTotal_training_assigned(),learnDev.getTraining_completed(),
                learnDev.getFace2face(),learnDev.getElearning(),learnDev.getInprogress(),learnDev.getTraining_overdue()});
        System.out.println("DATA WENT INTO LEARN_DEV DATABASE");
    }

    @Override
    public List<LearnDev> getLearnData(Integer manager_id) {
        String sql = "select * from learn_dev where emp_id in (select emp_id from master where manager_id=?)";
        System.out.println("BEFORE GETTING ALL LD FORMS FOR MANAGER");
        return jdbcTemplate.query(sql,new Object[]{manager_id},new BeanPropertyRowMapper<>(LearnDev.class));
    }

    @Override
    public LearnDev getLearnDetails(Integer emp_id) {
        String sql = "select * from learn_dev where emp_id=?";
        System.out.println("BEFORE GETTING ALL LD FORMS FOR EMPLOYEE");
        return jdbcTemplate.queryForObject(sql,new Object[]{emp_id},new BeanPropertyRowMapper<>(LearnDev.class));

    }
}
