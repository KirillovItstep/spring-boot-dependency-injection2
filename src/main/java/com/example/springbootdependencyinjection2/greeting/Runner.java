package com.example.springbootdependencyinjection2.greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Bean настраивается в классе конфигурации
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                GreetingConfiguration.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.sayGreeting());
    }
}
