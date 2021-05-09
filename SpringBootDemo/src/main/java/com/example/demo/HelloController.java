package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";

	}
	@RequestMapping("/resource")
	public String resource() {
		return "Greetings from Spring Boot! This is my resource";

	}
	
}
