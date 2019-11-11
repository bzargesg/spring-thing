package com.luv2code.springdemo;

public class DepressedCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Nothing matters just lay around until your body dies.";
    }

    public DepressedCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
