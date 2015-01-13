package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(params = "testspring", method = RequestMethod.GET)
	public String testSpring(ModelMap model){
		System.out.println("test spring");
		model.addAttribute("testspring", "this is a test for spring");
		return "springTest";
	}


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("print Welcome");
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}