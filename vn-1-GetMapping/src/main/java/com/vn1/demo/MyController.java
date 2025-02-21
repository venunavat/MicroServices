package com.vn1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/vn-1-GetMapping")
	public String showMsg1() {
		return "Demo for vn-1-GetMapping";
	}
	
	@GetMapping("/vn-11-GetMapping")
	public String showMsg11() {
		return "Demo for vn-11-GetMapping";
	}
	
	@GetMapping("/vn-111-GetMapping")
	public String showMsg111() {
		return "Demo for vn-111-GetMapping";
	}
	
}
