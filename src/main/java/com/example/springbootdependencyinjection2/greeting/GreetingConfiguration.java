package com.example.springbootdependencyinjection2.greeting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfiguration {
    @Bean
    GreetingService greetingService() {
        return new Greeting();
    }
}
