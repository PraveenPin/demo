package com.sample.demo.repository;

import com.sample.demo.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

public interface SignUpInterface {
    void saveData(User user);
}
