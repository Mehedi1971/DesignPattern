package com.example.newdemo.controller;

import com.example.newdemo.model.Student;
import com.example.newdemo.repository.StudentRepository;
import com.example.newdemo.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.lang.model.element.Name;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
    public String all(Model model){
        model.addAttribute("listofall", studentService.getAllStudent());
        return "index";
    }
    @PostMapping("/imageUpload")
    public String imageUpload(@ModelAttribute MultipartFile img,@ModelAttribute MultipartFile img1, Student student) {

//        Student im = new Student();
        student.setLogo1(img.getOriginalFilename());
        student.setLogo2(img1.getOriginalFilename());
        student.setName(student.getName());

        Student uploadImg = studentRepository.save(student);
        System.out.println(uploadImg);
        if (uploadImg != null) {
            try {

                File saveFile = new ClassPathResource("static/img").getFile();

                Path path = Paths.get(saveFile.getAbsolutePath() + File.separator + img.getOriginalFilename());
                //System.out.println(path);
                Files.copy(img.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

//                ================
                File saveFile1 = new ClassPathResource("static/img").getFile();
                Path path1 = Paths.get(saveFile1.getAbsolutePath() + File.separator + img1.getOriginalFilename());
                System.out.println(path1);
                Files.copy(img1.getInputStream(), path1, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        session.setAttribute("msg", "Image Upload Sucessfully");

        return "redirect:/";
    }

}
