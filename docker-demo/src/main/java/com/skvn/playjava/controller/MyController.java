package com.skvn.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test-docker")
	public String getData() {
		return "In skvn, docker demo";
	}
	
	
	@PostMapping("/doTransfer")    
	public String doTransfer(String ip) {
		
		
		
		
	return "";
	}
	
	
}
