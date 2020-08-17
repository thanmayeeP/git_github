package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping(path = "/get")
	public String getHello() 
	{
		



		
		System.out.println("Logs");
		return "Hello World";
		
	}
	
	

}
