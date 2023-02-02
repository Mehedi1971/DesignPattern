package com.mahedi.controller;

import com.mahedi.model.Lab;
import com.mahedi.repository.LabRepository;
import com.mahedi.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class LabController {

    @Autowired
    private LabService labService;
    @Autowired
    private LabRepository labRepository;

    @GetMapping("/")
    public String all(Model model) {
        model.addAttribute("listoftest", labService.getAllTest());
//        Lab lab=labService.updatetest(id);
//        model.addAttribute("updatelist",lab);
        return "index";
    }

    @GetMapping("/newsave")
    public String newtest(Model model) {
        Lab lab = new Lab();
        model.addAttribute("newlabtest", lab);
        return "newsave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Lab lab) {
        labService.save(lab);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model) {
        Lab lab = labService.updatetest(id);
        model.addAttribute("updatelist", lab);
        return "update";
    }

    //    @GetMapping( "/findallbyid")
//    @ResponseBody
//    public List<Lab> getAllStudents(@RequestBody List<Lab> idContainer) {
//        List<Long> ids = new ArrayList();
//        for (Lab id : idContainer) {
//            ids.add(id.getId());
//        }
//        List<Lab> labResponse = (List<Lab>) labService.getAllStudents(ids);
//        return labResponse;
//    }
//    @GetMapping
//    List<Lab> findAllById() {
//        List<Long> idList = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, null);
//        List<Lab> findAll = labRepository.findAllById(idList);
//        findAll.forEach(System.out::println);
//        return findAll;
//    }
    @GetMapping("/allById")
    public Iterable<Lab> allCustomerById() {
        List<Long> ids = Arrays.asList(1L, 2L);
        return labRepository.findAllById(ids);
    }
}