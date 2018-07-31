package com.sample.demo.repository;

import com.sample.demo.model.EmpIdStatus;
import com.sample.demo.model.Leave;
import com.sample.demo.model.LeaveApproval;
import com.sample.demo.model.LeavesCount;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface LeaveFromInterface {
     void saveLeaveForm(Leave leave);
     List<Leave> getLeaveDetails(Integer manager_id,String status);
     Leave getLeaveEmpData(Integer emp_id,String status);
     List<LeavesCount> getLeavesCount(Integer emp_id);
     String updateByManager(LeaveApproval leaveApproval);
}
