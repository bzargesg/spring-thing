package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach lazyCoach = context.getBean("lazyCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());



        System.out.println(lazyCoach.getDailyWorkout());
        System.out.println(lazyCoach.getDailyFortune());
        context.close();
    }
}
