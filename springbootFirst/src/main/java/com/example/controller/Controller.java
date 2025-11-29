package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @RequestMapping("/hi")
     public String hi() {
    	 return "Hi";
     }
}
