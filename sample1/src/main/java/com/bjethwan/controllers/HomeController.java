package com.bjethwan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "Spring Boot reporting to duty";
	}
	
	@RequestMapping("/rama")
	public String rama(){
		return "Rama reporting to duty";
	}
	
	@RequestMapping("/bipin")
	public String bipin(){
		return "Bipin reporting to duty";
	}
}
