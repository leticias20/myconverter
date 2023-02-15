package com.currencyconverter.myconverter.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.currencyconverter.myconverter.model.CurrencyCombination;

@Repository
public interface CurrencyCombinationRepository extends JpaRepository<CurrencyCombination,Integer> {
	
	
	@Query(value ="SELECT * FROM currency_combination cc where cc.currency_given_id=:currency_given_id"
			+ " and cc.currency_to_convert_id=:currency_to_convert_id", nativeQuery = true)
	List<CurrencyCombination> findByCurrencyGivenAndCurrencyToReturn(@Param("currency_given_id") 
	int currency_given_id, @Param("currency_to_convert_id") int currency_to_convert_id);
	
	
	

}
