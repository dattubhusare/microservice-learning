package com.example.microservice.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired 
	private Environment environment;
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(
		@PathVariable String from,
		@PathVariable String to
			) {
	
CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
currencyExchange.setEnvironment(environment.getProperty("server.port"));
return currencyExchange;
}
}
