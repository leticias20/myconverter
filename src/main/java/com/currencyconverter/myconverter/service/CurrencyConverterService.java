package com.currencyconverter.myconverter.service;

public interface CurrencyConverterService {
	
	public abstract double convertCurrency(double amountReceived, int currencyGiven, int currencyToReturn); 

}
