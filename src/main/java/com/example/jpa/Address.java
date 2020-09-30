package com.example.jpa;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "T_ADDRESS")
public class Address {
	
	@OneToOne(mappedBy="address")
	private Customer customer;
	
	//Getter, Setter
}
