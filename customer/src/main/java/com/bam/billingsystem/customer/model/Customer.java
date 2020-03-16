package com.bam.billingsystem.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Customer {

	@Id
	private String id;
	private String name;
	private String age;
	
}