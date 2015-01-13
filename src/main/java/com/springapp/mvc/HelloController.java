package com.springapp.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	private   static Log log = LogFactory.getLog(HelloController.class);

	@RequestMapping(params = "testspring", method = RequestMethod.GET)
	public String testSpring(ModelMap model){
		log.info("test spring");
		model.addAttribute("testspring", "this is a test for spring");
		return "springTest";
	}


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		log.info("print Welcome");
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}