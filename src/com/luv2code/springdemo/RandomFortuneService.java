package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {
            "Today is a day of the week",
            "The journey is the reward",
            "Luck doesn't exist"
    };
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        return data[myRandom.nextInt(data.length)];
    }
}
