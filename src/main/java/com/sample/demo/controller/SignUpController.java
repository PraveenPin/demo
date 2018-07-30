package com.sample.demo.controller;

import com.sample.demo.impl.GoalPerformanceImplementation;
import com.sample.demo.impl.SignUpImplemenation;
import com.sample.demo.impl.LeaveFromImplementation;
import com.sample.demo.impl.LearnDevImplementation;
import com.sample.demo.model.Goal;
import com.sample.demo.model.LearnDev;
import com.sample.demo.model.Leave;
import com.sample.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value="/signUp",method = RequestMethod.POST)
    public String signUp(@RequestBody User user) {
        signUpImplementation.saveData(user);
        return "ADDED IN THE DATABASE!";
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
