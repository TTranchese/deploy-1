package com.example.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DevController {
	@Value("${devName}")
	String name;
	@GetMapping
	public String devName(){
		return name;
	}
}
