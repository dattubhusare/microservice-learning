package com.example.microservice.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.limitsservice.beans.Limits;

@RestController
public class LimitsController {
	
	@GetMapping("/limits")
	Limits retriveLimits()
	{
		return new Limits(1, 100);
	}

}