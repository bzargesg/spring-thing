package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LazyCoach implements Coach {
    @Autowired
            @Qualifier("unhappyFortuneService")
    FortuneService myFortune;
    @Override
    public String getDailyWorkout() {
        return "Eat a candybar!";
    }

    @Override
    public String getDailyFortune() {
        return myFortune.getFortune();
    }
}
