package com.datpt.ecomerce_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datpt.ecomerce_demo.model.ProductCategory;

public interface CategoryService extends JpaRepository<ProductCategory, Integer>{

}
