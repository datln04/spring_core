package com.datpt.ecomerce_demo.service;

import java.util.List;
import java.util.Optional;

import com.datpt.ecomerce_demo.response.productResponse;


public interface ProductService{
	
	List<productResponse> findAll();
	
	//void save(ProductRequest request);
	
	productResponse findById(int id);
}
