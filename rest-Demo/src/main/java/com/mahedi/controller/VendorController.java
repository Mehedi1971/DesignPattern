package com.mahedi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahedi.model.Vendor;



@RestController 
@RequestMapping("/vendor")
public class VendorController {

	Vendor vendor;
	@GetMapping("{id}")
	public Vendor getdata(String id) {
//		return new Vendor("1","sfd","sdf","dfdf");
		return vendor;
	}
	
	@PostMapping
	public String postdata(@RequestBody Vendor vendor) {
		this.vendor=vendor;
		return "Successfull";
	}
}
