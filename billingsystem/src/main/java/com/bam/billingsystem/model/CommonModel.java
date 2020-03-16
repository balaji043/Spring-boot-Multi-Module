package com.bam.billingsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CommonModel {
	
	@Id
	private String id;
	private String name;
	private String status;
	
	public CommonModel(String name, String status) {
		this.name  = name;
		this.status = status;
	}
}
