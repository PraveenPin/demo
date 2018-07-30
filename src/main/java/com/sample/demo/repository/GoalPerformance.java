package com.sample.demo.repository;

import com.sample.demo.model.EmpIdStatus;
import com.sample.demo.model.Goal;
import com.sample.demo.model.ManIdStatus;

import java.util.List;

public interface GoalPerformance {
    void saveGoalPerformance(Goal goal);
    List<Goal> getGoalForms(ManIdStatus manIdStatus);
    Goal getGoalEmpForm(EmpIdStatus empIdStatus);
}
