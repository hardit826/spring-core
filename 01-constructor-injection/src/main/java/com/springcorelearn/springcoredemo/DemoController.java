package com.springcorelearn.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define private field for the dependency
    private Coach myCoach;

    //Define constructor for  dependency injection
    @Autowired //Tells spring to inject the dependency. If 1 constructor, @Autowired is optional
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
