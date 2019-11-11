package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyExerciseConfig {
    @Bean
    public FortuneService depressedFortuneService(){
        return new DepressedFortuneService();
    }

    @Bean
    public Coach depressedCoach(){
        return new DepressedCoach(depressedFortuneService());
    }
}
