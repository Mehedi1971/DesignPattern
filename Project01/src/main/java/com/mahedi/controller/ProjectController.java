package com.mahedi.controller;

import com.mahedi.entity.Project;
import com.mahedi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestParam("/v1/api")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    public String hello(){

    return "Hello world";
    }

    @GetMapping("/all")
    public List<Project> all(){
        return projectRepository.findAll();
    }

    @GetMapping("/post/{id}")
    public Optional<Project> one(@PathVariable long id){
        return projectRepository.findById(id);
    }


}
