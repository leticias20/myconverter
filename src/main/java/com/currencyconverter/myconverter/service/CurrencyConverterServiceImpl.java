package com.currencyconverter.myconverter.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyconverter.myconverter.model.CurrencyCombination;
import com.currencyconverter.myconverter.repository.CurrencyCombinationRepository;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {
	
	@Autowired
	CurrencyCombinationRepository currencyCombinationRepository;

	@Override
	public double convertCurrency(double amountReceived, int currencyGiven, int currencyToReturn) {
		
		List<CurrencyCombination> currencyCombination = currencyCombinationRepository.findByCurrencyGivenAndCurrencyToReturn(currencyGiven, currencyToReturn);
		
		double amountToReturn = amountReceived * currencyCombination.get(0).getCurrency_quantity();
		
		return amountToReturn;
			
	}



}

