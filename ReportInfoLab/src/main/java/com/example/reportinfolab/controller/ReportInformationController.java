package com.example.reportinfolab.controller;

import com.example.reportinfolab.model.ReportInformation;
import com.example.reportinfolab.repository.ReportInformationRepository;
import com.example.reportinfolab.service.ReportInformationService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

@Controller
public class ReportInformationController {

    @Autowired
    private ReportInformationService reportInformationService;
    @Autowired
    private ReportInformationRepository reportInformationRepository;

    @GetMapping("/reportInfo")
    public String allReportInformation(Model model) {
        model.addAttribute("listOfReportInfo", reportInformationService.getAllReportInfo());
        return "reportInfo.html";
    }
     @PostMapping("/saveReportInfo")
     public String imageUpload(@RequestParam MultipartFile img,@ModelAttribute ReportInformation reportInformation) {
//     reportInformationService.saveReportInfo(reportInformation);
//     ReportInformation im = new ReportInformation();
//         reportInformation.setrHospitalLogo1(img.getOriginalFilename());

         reportInformation.setrHospitalName(reportInformation.getrHospitalName());
         reportInformation.setrHospitalDivision(reportInformation.getrHospitalDivision());
         reportInformation.setrHospitalUpozila(reportInformation.getrHospitalUpozila());
         reportInformation.setrHospitalDistrict(reportInformation.getrHospitalDistrict());
         reportInformation.setrHospitalReportName(reportInformation.getrHospitalReportName());
         reportInformation.setrHospitalSpeech(reportInformation.getrHospitalSpeech());
         reportInformation.setrHospitalLogo1(img.getOriginalFilename());
         reportInformation.setrHospitalPhone1(reportInformation.getrHospitalPhone1());
         reportInformation.setrHospitalPhone2(reportInformation.getrHospitalPhone2());
         reportInformation.setrHospitalEmail(reportInformation.getrHospitalEmail());
//     im.setrHospitalLogo2(img.getOriginalFilename());
//     im.setrHospitalLogo3(img.getOriginalFilename());
//     im.setrHospitalLogo4(img.getOriginalFilename());
//     im.setrHospitalLogo5(img.getOriginalFilename());
//     im.setrHospitalLogo6(img.getOriginalFilename());
//     im.setrHospitalLogo7(img.getOriginalFilename());
//     im.setrHospitalLogo8(img.getOriginalFilename());

      ReportInformation uploadImg = reportInformationRepository.save(reportInformation);

     if (uploadImg != null) {
     try {

     File saveFile = new ClassPathResource("static/img").getFile();

     Path path = Paths.get(saveFile.getAbsolutePath() + File.separator +
     img.getOriginalFilename());
     // System.out.println(path);
     Files.copy(img.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

     } catch (Exception e) {
     e.printStackTrace();
     }
     }

//     session.setAttribute("msg", "Image Upload Sucessfully");

     return "redirect:/reportInfo";
     }

    @GetMapping("/addnew")
    public String add(Model model){
        ReportInformation reportInformation=new ReportInformation();
model.addAttribute("listofinfo",reportInformation);
return "saveReportInfo";
    }

//    @PostMapping("/saveReportInfo")
//    public String saveReportInfo(@ModelAttribute ReportInformation reportInformation){
//        reportInformationService.saveReportInfo(reportInformation);
//        return "redirect:/reportInfo";
//    }
    @GetMapping("/updateReportInfo/{id}")
    public String updateReportInfo(@PathVariable long id, Model model) {
        Optional<ReportInformation> reportInformation = reportInformationService.updateReportInfoById(id);
        model.addAttribute("listofAllData", reportInformation);
        return "updateReportInfo";
    }

    // @PostMapping("/updateReportInfo/{id}")
    // public String updateReportInfo(@ModelAttribute ReportInformation
    // reportInformation) {
    // reportInformationService.saveReportInfo(reportInformation);
    // return "redirect:/reportInfo";
    // }

    @GetMapping("/deleteReportInfo/{id}")
    public String deleteReportInfo(@PathVariable long id) {
        reportInformationService.deleteReportInfo(id);
        return "redirect:/reportInfo";
    }
}