package com.sample.demo.model;

public class LeaveApproval {
    Integer leave_id;
    String substitute_person;
    String verified_by;
    String approved_by;
    String status;

    public Integer getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(Integer leave_id) {
        this.leave_id = leave_id;
    }

    public String getSubstitute_person() {
        return substitute_person;
    }

    public void setSubstitute_person(String substitute_person) {
        this.substitute_person = substitute_person;
    }

    public String getVerified_by() {
        return verified_by;
    }

    public void setVerified_by(String verified_by) {
        this.verified_by = verified_by;
    }

    public String getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(String approved_by) {
        this.approved_by = approved_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}