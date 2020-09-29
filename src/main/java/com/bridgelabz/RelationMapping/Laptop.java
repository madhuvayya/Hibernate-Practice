package com.bridgelabz.RelationMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@Column(name="laptop_id")
	private int id;
	
	@Column(name="laptop_name")
	private String laptopName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + laptopName + "]";
	}
}
