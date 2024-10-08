package com.log.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	Logger log = LoggerFactory.getLogger(DemoRestController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		log.info("getWelcomeMsg() execution started");
		
		String msg = "Welcome";
		
		int i = 10 / 0;
		
		log.info("getWelcomeMsg() execution ended");
		return msg;
	}
}
