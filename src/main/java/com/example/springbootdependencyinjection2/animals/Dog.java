package com.example.springbootdependencyinjection2.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void sound(){
        System.out.println("Woof");
    }
}
