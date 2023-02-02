package com.mahedi.teacher.contoller;

import com.mahedi.teacher.entity.Teacher;
import com.mahedi.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listofTeacher",teacherService.getAllTeacher());
        return "index";
    }

    @GetMapping("/addnew")
    public String add(Model model){
        Teacher teacher=new Teacher();
        System.out.println( teacher);
        model.addAttribute("Teacher",teacher);
        System.out.println( model.addAttribute("Teacher",teacher));
        return "/addteacher";
    }

    @PostMapping("/saveTeacher")
    public String addnew(@ModelAttribute Teacher teacher){
        teacherService.saveTeacher(teacher);
        System.out.println( teacher);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateTeacher(@PathVariable long id,Model model){

        Teacher teacher=teacherService.getTeacherById(id);
        model.addAttribute("teacherupdate",teacher);
        System.out.println(teacher);
        return  "update";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        this.teacherService.deletebyId(id);
        return "redirect:/";
    }

}
