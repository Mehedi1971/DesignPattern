package com.mahedi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahedi.service.PatientService;

@RestController
@RequestMapping("/")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	
	@GetMapping("/api")
	public Object[] api() {
		return patientService.findAlle();
	}
//	@GetMapping("/")
//	public String api( Model model) {
//		model.addAttribute("listPatient",patientService.findAlle() );
//		return "index";
//	}

}
