package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/swagger")
public class BaseController {
	
	@GetMapping(value = "/home")
	public String home() {
		return "Welcome Swagger";
	}

}
