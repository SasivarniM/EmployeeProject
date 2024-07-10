package com.example.Electronics.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Tvdetails")
@Entity
public class Tv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id;
	String brand;
	String model;
	String inches;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getInches() {
		return inches;
	}
	public void setInches(String inches) {
		this.inches = inches;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
