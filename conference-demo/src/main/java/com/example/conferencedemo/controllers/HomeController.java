package com.example.conferencedemo.controllers;
//This class is used to create app version.

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${app.version}")  //It tells Spring Boot to look in application properties and inject the app.version in the private string appVersion
    private String appVersion;

    @GetMapping
    @RequestMapping("/")   //To service the root or home section of our application
    public Map getStatus(){  // It will return a Map and Jackson will print the key-value pair as response to JSON
        Map map=new HashMap<String,String>();
        map.put("app-version",appVersion);
        return map;
    }
}
