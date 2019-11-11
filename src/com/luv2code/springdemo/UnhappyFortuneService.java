package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UnhappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Everything will be terrible";
    }
}
