package com.luv2code.springdemo;

public class DepressedFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Nobody is lucky, were all just waiting to die.";
    }
}
