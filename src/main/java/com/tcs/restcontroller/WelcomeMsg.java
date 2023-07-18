package com.tcs.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {

	private Logger logger = LoggerFactory.getLogger(WelcomeMsg.class);

	@GetMapping("/msg")
	public String getMsg() {
		logger.info("Execution is started...");
		try {
			int i=10/0;
		}catch(ArithmeticException e) {
			logger.error("Exception Occured" + e.getStackTrace());
		}
		logger.info("Execution is ended...");

		return "Welcome to Earth...!";
	}

	@GetMapping("/moon")
	public String getMsgTo() {
		logger.debug("Sb by log level is INFO And higher level "
				+ "will be printed debug is low level will nont print");
		logger.info("getMsgTo () is executed....");
		logger.warn("Warn is higher level of Info so it will printed");
		return "Welcome to Moon...!";
	}

}
