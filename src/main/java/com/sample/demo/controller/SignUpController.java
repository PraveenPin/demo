package com.sample.demo.controller;

import com.sample.demo.impl.*;
import com.sample.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SignUpController {

    @Autowired
    SignUpImplemenation signUpImplementation;
    @Autowired
    LeaveFromImplementation leaveFromImpelementaion;
    @Autowired
    LearnDevImplementation learnDevImplementation;
    @Autowired
    GoalPerformanceImplementation goalPerformanceImplementation;
    @Autowired
    LoginValidateImpl loginValidate;

    @RequestMapping(value="/signUp",method = RequestMethod.POST)
    public String signUp(@RequestBody User user) {
        signUpImplementation.saveData(user);
        return "ADDED IN THE DATABASE!";
    }

    @RequestMapping(value="/login")
    public Response isValidUser(@RequestBody Login login){
        Response response = loginValidate.isValidUser(login);
        return response;
    }

    @RequestMapping(value="/leaveForm",method = RequestMethod.POST)
    public String fillLeaveForm(@RequestBody Leave leave){
        leaveFromImpelementaion.saveLeaveForm(leave);
        return "LEAVE FORM ADDED IN THE DATABASE";
    }

    @RequestMapping(value="/learnDevForm",method = RequestMethod.POST)
    public String fillLDForm(@RequestBody LearnDev learnDev){
        learnDevImplementation.saveLearnData(learnDev);
        return "LD FORM ADDED IN THE DATABASE";
    }
    @RequestMapping(value="/fillGoalForm",method = RequestMethod.POST)
    public String fillGoalform(@RequestBody Goal goal){
        goalPerformanceImplementation.saveGoalPerformance(goal);
        return "GOAL PERF FORM ADDED IN THE DATABASE";
    }

    @RequestMapping(value="/getLeaveForms",method = RequestMethod.POST)
    public List<Leave> getLeaveForms(@RequestBody ManIdStatus manIdStatus){
        System.out.println("BEFORE RESPONSE OF MANAGER LEAVE FORMS OF ALL EMPS ");
        return leaveFromImpelementaion.getLeaveDetails(manIdStatus.getManager_id(),manIdStatus.getStatus());
    }
    @RequestMapping(value="/getLeaveEmpForm",method=RequestMethod.POST)
    public Leave getLeaveEmpForm(@RequestBody EmpIdStatus empIdStatus){
        System.out.println("BEFORE RESPONSE OF EMPLOYEE LEAVE FORM ");
        return leaveFromImpelementaion.getLeaveEmpData(empIdStatus.getEmp_id(),empIdStatus.getStatus());
    }
    @RequestMapping(value="/getLearnDevForms/{manager_id}",method = RequestMethod.GET)
    public List<LearnDev> getLDForms(@PathVariable Integer manager_id){
        System.out.println("BEFORE RESPONSE OF MANAGER LD FORMS OF ALL EMPS ");
        return learnDevImplementation.getLearnData(manager_id);
    }
    @RequestMapping(value = "/getLearnDevEmpForm/{emp_id}",method=RequestMethod.GET)
    public LearnDev getLDEmpForm(@PathVariable Integer emp_id){
        System.out.println("BEFORE RESPONSE OF EMP LD FORM ");
        return learnDevImplementation.getLearnDetails(emp_id);
    }
//    @RequestMapping(value="/signUpSample")
//    public ModelAndView signUpSample() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("homePage");
//        mv.addObject("message","welcome !");
//        FirstTab firstTab=new FirstTab() ;
//        firstTab.setId(5);
//        firstTab.setName("hell");
//        return mv;
//    }
//
}
