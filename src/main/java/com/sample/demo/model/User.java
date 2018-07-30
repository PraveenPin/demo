package com.sample.demo.model;

public class User {
    //ID,name,doj,manager name,dept name,designation,email,password
    String emp_name;
    Integer emp_id;
//    String timeInterval = "18:01";
//Date date = simpleDateFormat.parse(timeInterval);
//Calendar calendar = Calendar.getInstance();
//
//calendar.set(Calendar.HOUR_OF_DAY, date.getHours());
//calendar.set(Calendar.MINUTE, date.getMinutes());
//date = calendar.getTime();
//
//System.out.println(date);
    String doj;
    String manager_name;
    String manager_id;
    String dept_name;
    String emp_mail;
    String password;
    String designation;



    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
