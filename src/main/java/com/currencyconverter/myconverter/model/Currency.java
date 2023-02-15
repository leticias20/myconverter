package com.currencyconverter.myconverter.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name= "CURRENCY")
public class Currency implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
public long id;
@Column
public String currency_name;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCurrency_name() {
	return currency_name;
}

public void setCurrency_name(String currency_name) {
	this.currency_name = currency_name;
}



 
}
