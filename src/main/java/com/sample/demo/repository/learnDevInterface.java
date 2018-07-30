package com.sample.demo.repository;

import com.sample.demo.model.LearnDev;
import org.springframework.jdbc.core.JdbcTemplate;

public interface learnDevInterface {
    void saveLearnData(LearnDev learnDev);
}
