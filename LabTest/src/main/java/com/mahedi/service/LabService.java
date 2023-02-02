package com.mahedi.service;

import com.mahedi.model.Lab;
import com.mahedi.repository.LabRepository;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LabService {

    @Autowired
    private LabRepository labRepository;

    public List<Lab> getAllTest(){
        return labRepository.findAll();
    }

    public void save(Lab lab){
        this.labRepository.save(lab);
    }

    public Lab updatetest(long id){
        Optional<Lab> optional=labRepository.findById(id);
        Lab lab=optional.get();
        return lab;
    }
    public void getallbyid(){
        List<Long> ids=new ArrayList<Long>();
        System.out.println(ids);
        Iterable<Lab>labs= labRepository.findAllById(ids);
    }

    public List<Lab> getAllStudents(List<Long> ids) {
        List<Lab> studentResponse = (List<Lab>) labRepository.findAllById(ids);
        return studentResponse;
    }
}
