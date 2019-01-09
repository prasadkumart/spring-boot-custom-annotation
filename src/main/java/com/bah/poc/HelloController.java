package com.bah.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/")
	public String home() {
		logger.info("inside hello() method...");
		return "Hello Docker World";
	}
}