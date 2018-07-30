package com.sample.demo.repository;

import com.sample.demo.model.Leave;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.jdbc.core.JdbcTemplate;

public interface LeaveFromInterface {
     void saveLeaveForm(Leave leave);
     Leave getLeaveDetails(Integer manager_id);
}
