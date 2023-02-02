package com.example.reportinfolab.service;

import com.example.reportinfolab.model.ReportInformation;
import com.example.reportinfolab.repository.ReportInformationRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Service
public class ReportInformationService {

    @Autowired
    private ReportInformationRepository reportInformationRepository;

    public List<ReportInformation> getAllReportInfo() {
        return reportInformationRepository.findAll();
    }
//    @RequestParam MultipartFile img, HttpSession
//    session,
//    public void saveReportInfo(ReportInformation reportInformation) {
//        this.reportInformationRepository.save(reportInformation);

//
//        ReportInformation im = new ReportInformation();
//        im.setrHospitalLogo1(img.getOriginalFilename());
//        im.setrHospitalLogo2(img.getOriginalFilename());
//        im.setrHospitalLogo3(img.getOriginalFilename());
//        im.setrHospitalLogo4(img.getOriginalFilename());
//        im.setrHospitalLogo5(img.getOriginalFilename());
//        im.setrHospitalLogo6(img.getOriginalFilename());
//        im.setrHospitalLogo7(img.getOriginalFilename());
//        im.setrHospitalLogo8(img.getOriginalFilename());
//
//        ReportInformation uploadImg = reportInformationRepository.save(im);
//
//        if (uploadImg != null) {
//            try {
//
//                File saveFile = new ClassPathResource("static/img").getFile();
//
//                Path path = Paths.get(saveFile.getAbsolutePath() + File.separator +
//                        img.getOriginalFilename());
//                // System.out.println(path);
//                Files.copy(img.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        session.setAttribute("msg", "Image Upload Sucessfully");
//
//        return "redirect:/reportInfo";
//    }

    public Optional<ReportInformation> updateReportInfoById(long id) {
        return reportInformationRepository.findById(id);
    }

    public void deleteReportInfo(long id) {
        this.reportInformationRepository.deleteById(id);
    }
}
