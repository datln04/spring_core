package com.datpt.ecomerce_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datpt.ecomerce_demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
