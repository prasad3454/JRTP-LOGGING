package com.log.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	Logger log = LoggerFactory.getLogger(GreetRestController.class);
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		log.info("getGreetMsg() execution started...");
		
		String msg = "Good Evening";
		
		log.info("getGreetMsg() execution ended...");
		
		return msg;
	}
}
