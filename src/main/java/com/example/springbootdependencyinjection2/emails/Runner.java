package com.example.springbootdependencyinjection2.emails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static String constant;

    public static void main(String[] args) {
//Файл должен быть в каталоге "resources"
        ApplicationContext context=
                new ClassPathXmlApplicationContext("emails.xml");
        String email = (String)((List)context.getBean("emails")).get(0);
        System.out.println(email);

        HashMap<String, String> map = (HashMap)context.getBean("map");
        Map.Entry<String,String> entry = map.entrySet().iterator().next();
        String key = entry.getKey();
        String value = entry.getValue();
        System.out.println(key+' '+value);

        Set<String> set = (Set)context.getBean("set");
        String elem = set.iterator().next();
        System.out.println(elem);
    }
}
