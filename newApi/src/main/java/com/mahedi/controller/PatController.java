package com.mahedi.controller;

import com.mahedi.service.PatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PatController {

    @Autowired
    private PatService patService;

    @GetMapping("/api")
    public String all(Model model){
        model.addAttribute("listofAll",patService.findAlle());
        return "index";
    }

}
