package com.sample.demo.repository;

import com.sample.demo.model.LearnDev;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface learnDevInterface {
    void saveLearnData(LearnDev learnDev);
    List<LearnDev> getLearnData(Integer manager_id);
    LearnDev getLearnDetails(Integer emp_id);
}
