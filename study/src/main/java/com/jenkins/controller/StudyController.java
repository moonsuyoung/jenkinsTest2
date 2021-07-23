package com.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyController {
	
	@RequestMapping(value = { "study.do" })
	public String study(ModelMap model) throws Exception {
		System.out.println("study::::");
		
		return "study";
	}
	
}

