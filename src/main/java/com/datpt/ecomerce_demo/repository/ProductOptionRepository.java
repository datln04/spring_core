package com.datpt.ecomerce_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datpt.ecomerce_demo.model.ProductOption;

@Repository
public interface ProductOptionRepository extends JpaRepository<ProductOption, Integer>{
	List<ProductOption> findByProductProductID(int productID);
}
