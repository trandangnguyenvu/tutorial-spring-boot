package com.tutorial.apidemo.Spring.Boot.tutorial.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	// this is primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto-increment
	private Long id;
	private String productName;
	private int year;
	private Double price;
	private String url;
		
	public Product(String productName, int year, Double price, String url) {
		super();// youtube: there is no this		
		this.productName = productName;
		this.year = year;
		this.price = price;
		this.url = url;
	}
	
	// default constructor
	public Product() {}
	
	@Override
	public String toString() {
		return "Product{id=" + id +
				", productName='" + productName + "\'" +
				", year=" + year +
				", price=" + price +
				", URL='" + url + "\'" +
				"}";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
		
}
