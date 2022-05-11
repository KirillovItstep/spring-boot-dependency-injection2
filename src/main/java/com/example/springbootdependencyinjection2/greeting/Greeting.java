package com.example.springbootdependencyinjection2.greeting;

public class Greeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
