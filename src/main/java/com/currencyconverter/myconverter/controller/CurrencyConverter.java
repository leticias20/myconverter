package com.currencyconverter.myconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconverter.myconverter.service.CurrencyConverterService;

@RestController
	@RequestMapping(path = "/api")
	public class CurrencyConverter{

		@Autowired 
		CurrencyConverterService currencyConverterService;
		
		@GetMapping("/getAmount")
		public Double getAmountConverted(
			@RequestParam(name = "amount") Double amountReceived,
			@RequestParam(name = "currencyGiven") int currencyGivenId,
			@RequestParam(name = "currencyToReturn") int currencyToReturnId){
			
			return currencyConverterService.convertCurrency(amountReceived,currencyGivenId, currencyToReturnId);
		}	
	}

