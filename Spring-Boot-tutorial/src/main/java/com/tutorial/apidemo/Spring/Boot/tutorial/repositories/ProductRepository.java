package com.tutorial.apidemo.Spring.Boot.tutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.apidemo.Spring.Boot.tutorial.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
