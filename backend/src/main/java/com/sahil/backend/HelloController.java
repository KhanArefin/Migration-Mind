package com.sahil.backend;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController 
{
    
    @GetMapping("/hello")
    public String sayHello() 
    {
        return "Hello, World!";
    }
    
    @GetMapping("/user")
    public Map<String, String> getUser() 
    {
        Map<String, String> user = new HashMap<>();
        user.put("name", "Sahil");
        user.put("age", "22");
        return user;
    }

    @GetMapping("/course")
    public Map<String, String> getCourse() 
    {
        Map<String, String> user = new HashMap<>();
        user.put("name", "AOOP");
        user.put("section", "A");
        return user;
    }
}

