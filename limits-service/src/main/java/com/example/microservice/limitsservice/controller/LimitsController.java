package com.example.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.limitsservice.beans.Limits;
import com.example.microservice.limitsservice.config.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	Limits retriveLimits()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}