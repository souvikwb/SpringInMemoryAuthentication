package com.souvik.org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class HealthController {
	
	@RequestMapping(value="/health", method=RequestMethod.GET)
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String admin() {
		return "Welcome Admin";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String user() {
		return "Welcome User";
	}
}
