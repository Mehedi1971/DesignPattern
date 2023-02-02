package com.mahedi.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuriryController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

}
