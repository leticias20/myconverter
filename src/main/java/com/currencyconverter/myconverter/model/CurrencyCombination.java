package com.currencyconverter.myconverter.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name= "CURRENCY_COMBINATION")
public class CurrencyCombination implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
public long id;
@Column
public int currency_given_id; 
@Column
public int currency_to_convert_id;

@Column
public double currency_quantity;

public int getCurrency_to_convert_id() {
	return currency_to_convert_id;
}

public void setCurrency_to_convert_id(int currency_to_convert_id) {
	this.currency_to_convert_id = currency_to_convert_id;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public int getCurrency_given_id() {
	return currency_given_id;
}

public void setCurrency_given_id(int currency_given_id) {
	this.currency_given_id = currency_given_id;
}


public double getCurrency_quantity() {
	return currency_quantity;
}

public void setCurrency_quantity(double currency_quantity) {
	this.currency_quantity = currency_quantity;
}


 
}
