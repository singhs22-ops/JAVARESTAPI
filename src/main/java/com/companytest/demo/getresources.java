package com.companytest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("myresource")
public class getresources {

	public getresources() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/homeie")
	public String homeie() {
		return "HHHHH";
	}
	
	
}
