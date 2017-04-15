package com.thinkenterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

	Logger logger = LoggerFactory.getLogger(FortuneController.class);
	
	@Value("${fortune}")
	private String fortune;

	
	@RequestMapping("/random")
	public String randomFortune() {
		return fortune;
	}

}
