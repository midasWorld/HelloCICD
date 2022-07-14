package com.midas.cicd.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping
	public String hello() {
		return "젭알.. 되어라!";
	}
}
