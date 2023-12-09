package com.sharad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	// handler method to handle hello world
	
	@GetMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("message","Hello World");
		return "hello";
		
	}
	

}
