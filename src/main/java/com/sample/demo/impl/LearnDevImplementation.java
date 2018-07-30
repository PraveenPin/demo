package com.sample.demo.impl;

import com.sample.demo.model.LearnDev;
import com.sample.demo.repository.learnDevInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
