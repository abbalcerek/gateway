package com.example.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {


    @RequestMapping("/")
    public String hello() {
        return "helllo";
    }

}
