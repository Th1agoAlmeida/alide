package com.upe.alide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	@RequestMapping(value = "/dashboard.html", method = RequestMethod.GET)
	public String dashboard() {
		
		return "../static/dashboard.html";
	}
	
}
