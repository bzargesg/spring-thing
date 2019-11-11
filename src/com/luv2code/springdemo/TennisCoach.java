package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    @Autowired
            @Qualifier("randomFortuneService")
    FortuneService myFortune;

    @PostConstruct
    public void doNewStuff(){
        System.out.println("Im starting");
    }

    @PreDestroy
    public void doDestroyStuff(){
        System.out.println("Im being destroyed");
    }
//    @Autowired
//    public void crazyMethodName(FortuneService myFortune) {
//        System.out.println("crazymethodname");
//        this.myFortune = myFortune;
//    }

//    @Autowired
//    public TennisCoach(FortuneService myFortune) {
//        this.myFortune = myFortune;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    @Override
    public String getDailyFortune() {
        return myFortune.getFortune();
    }

}
