package org.springframework.boot.tests.hibernate52.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
