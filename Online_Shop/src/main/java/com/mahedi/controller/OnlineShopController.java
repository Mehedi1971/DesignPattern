package com.mahedi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mahedi.model.OnlineShop;
import com.mahedi.service.OnlineShopService;

@Controller
public class OnlineShopController {
	
	@Autowired
	OnlineShopService onlineShopService;
	
	
	@GetMapping("/")
	public String onlineShop(Model model) {
		model.addAttribute("listProducts",onlineShopService.getAllProducts() );
		return "index";
	}
//	@GetMapping("/showDetails")
//	public String showDetails(Model model) {
//		model.addAttribute("listProducts",onlineShopService.getAllProducts() );
//		return "showDetails";
//	}
	@GetMapping("/showFromForUpdate/{id}")
	public String showFromForUpdate(@PathVariable(value = "id") long id, Model model) {
		OnlineShop onlineShop = onlineShopService.getProductById(id);

		model.addAttribute("onlineShop", onlineShop);

		return "showDetails";

	}
}
