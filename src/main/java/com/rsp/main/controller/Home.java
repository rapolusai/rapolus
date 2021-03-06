package com.rsp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class Home {
 
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homePage() {
		return "Home";
	}
	
	@RequestMapping(value= "/registration", method=RequestMethod.GET)
	public String registrationPage() {
		return "Registration";
	}
	
	@RequestMapping(value="/home", method= RequestMethod.POST)
	public String homePageForPost() {
		return "Home";
	}
}
