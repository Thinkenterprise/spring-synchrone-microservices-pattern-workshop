package com.thinkenterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {
	
	Logger logger = LoggerFactory.getLogger(FortuneController.class);
	
	@Value("${fortune}")
	private String fortuneString = null;
	
	
	@RequestMapping("/random")
	public Fortune fortune() {
		logger.info("FortuneController: fortune is called ...");
		Fortune fortune = new Fortune(1L, fortuneString);
		return fortune;
	}

}
