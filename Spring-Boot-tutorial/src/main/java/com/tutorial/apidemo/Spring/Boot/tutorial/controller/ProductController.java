package com.tutorial.apidemo.Spring.Boot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.apidemo.Spring.Boot.tutorial.models.Product;
import com.tutorial.apidemo.Spring.Boot.tutorial.repositories.ProductRepository;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
	@Autowired
	private ProductRepository repository;
	
	@GetMapping("")
	// this request is: http://localhost:8080/api/v1/Products
	public List<Product> getAllProducts() {
		return repository.findAll(); // where is database?
//		return List.of(
//				new Product(1L,"Macbook pro 16 inch", 2020, 2400.0, ""),
//				new Product(4L,"iphone", 2020, 2400.0, ""),
//				new Product(2L,"Ipad air green", 2021, 599.0, ""));
	}
}
