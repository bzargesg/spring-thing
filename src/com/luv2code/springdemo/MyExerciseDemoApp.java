package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyExerciseDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyExerciseConfig.class);

        Coach sadman = context.getBean("depressedCoach", Coach.class);

        System.out.println(sadman.getDailyFortune());
        System.out.println(sadman.getDailyWorkout());



        context.close();
    }
}
