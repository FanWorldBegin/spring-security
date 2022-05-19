package com.learn.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	
	@GetMapping("/notices")
	public String getNotices(String input) {

		System.out.println("call notices");
		return "Here are the notices details from the DB";
	}

}
