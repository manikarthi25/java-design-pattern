package com.java.design.pattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/design/pattern")
public class JavaDesignPatternController {
	
	@GetMapping("/test")
	public String getAppStatus() {
		return "success";
	}

}
