package com.thinkenterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FortuneService {

	Logger logger = LoggerFactory.getLogger(FortuneService.class);

	@Value("${fortune}")
	private String fortuneString = null;
	
	public Fortune randomFortune() {
		logger.info("FortuneService: calling http://fortunes/random.");
		Fortune fortune = new Fortune(1L, fortuneString);
		return fortune;
	}


}
