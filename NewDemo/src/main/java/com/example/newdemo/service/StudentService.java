package com.example.newdemo.service;


import com.example.newdemo.model.Student;
import com.example.newdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student>getAllStudent(){
        return studentRepository.findAll();
    }
}
