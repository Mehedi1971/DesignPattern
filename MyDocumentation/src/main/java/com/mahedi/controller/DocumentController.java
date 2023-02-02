package com.mahedi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mahedi.model.Document;
import com.mahedi.service.DocumentService;

@Controller
public class DocumentController {

	@Autowired
	DocumentService documentService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("listDocuments", documentService.getAllDocuments());
		return "Index";
	}
	
	@GetMapping("/NewMyDocument")
	public String newMyDocument(Model model) {
		Document document=new Document();
		model.addAttribute("document", document);
		System.out.println("DFss");
		return "NewMyDocument";
	}
	
	@PostMapping("/savemyDocuments")
	public String savemyDocuments(@ModelAttribute Document document) {
		documentService.savemyDocuments(document);
		System.out.println("DF");
		return "redirect:/";
	}
}
