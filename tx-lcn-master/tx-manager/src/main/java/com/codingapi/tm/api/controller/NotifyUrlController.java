package com.codingapi.tm.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotifyUrlController {

	private static Logger log = LoggerFactory.getLogger(NotifyUrlController.class);

	@PostMapping("/notify")
	public void notify(String param) {
		log.info(param);
	}

}
