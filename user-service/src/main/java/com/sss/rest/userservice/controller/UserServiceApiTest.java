package com.sss.rest.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceApiTest {

	@GetMapping("/sayHelloTest")
	public String sayHelloTest() {
		return "Hello from UserServiceApiTest : ";
	}
}
