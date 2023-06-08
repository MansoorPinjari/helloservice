package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svc/v1/hello")
public class HelloWorld {
	@GetMapping("/get/{abc}")
	public String HelloWorld(@PathVariable String abc) {
		return "helloworld" + abc;
		
	}
	

}
