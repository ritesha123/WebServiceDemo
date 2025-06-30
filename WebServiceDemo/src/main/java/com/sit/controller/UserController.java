package com.sit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/log")
	public String preLogin()
	{
		return "login";
	}
}
