package com.eco.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class OrderTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pkGen")
	private Long id;
	
	private enum Types{
		WEB,STORE,AMAZON
	}
	
	private Types type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setType(Types type) {
		this.type = type;
	}

	public Types getType() {
		return this.type;
	}
}
