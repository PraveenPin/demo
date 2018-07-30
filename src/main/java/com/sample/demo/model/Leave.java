package com.sample.demo.model;

public class Leave {
    Integer emp_id;
    Integer leave_id;
    String leave_type;
    String leave_from;
    String leave_to;
    String contact_no;
    String date_applied;
    Integer total_leaves;
    Integer leaves_accumulated;
    Integer leaves_consumed;
    String leave_reason;
    String substitute_person;
    String verified_by;
    String approved_by;
    String status;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(Integer leave_id) {
        this.leave_id = leave_id;
    }

    public String getLeave_type() {
        return leave_type;
    }

    public void setLeave_type(String leave_type) {
        this.leave_type = leave_type;
    }

    public String getLeave_from() {
        return leave_from;
    }

    public void setLeave_from(String leave_from) {
        this.leave_from = leave_from;
    }

    public String getLeave_to() {
        return leave_to;
    }

    public void setLeave_to(String leave_to) {
        this.leave_to = leave_to;
    }

    public String getContact_no() {
        return (contact_no);
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getDate_applied() {
        return date_applied;
    }

    public void setDate_applied(String date_applied) {
        this.date_applied = date_applied;
    }

    public Integer getTotal_leaves() {
        return total_leaves;
    }

    public void setTotal_leaves(Integer total_leaves) {
        this.total_leaves = total_leaves;
    }

    public Integer getLeaves_accumulated() {
        return leaves_accumulated;
    }

    public void setLeaves_accumulated(Integer leaves_accumulated) {
        this.leaves_accumulated = leaves_accumulated;
    }

    public Integer getLeaves_consumed() {
        return leaves_consumed;
    }

    public void setLeaves_consumed(Integer leaves_consumed) {
        this.leaves_consumed = leaves_consumed;
    }

    public String getLeave_reason() {
        return leave_reason;
    }

    public void setLeave_reason(String leave_reason) {
        this.leave_reason = leave_reason;
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
