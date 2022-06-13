package com.datpt.ecomerce_demo.service;

import java.util.List;

import com.datpt.ecomerce_demo.model.ProductOption;

public interface ProductOptionService {
	List<ProductOption> getProductDetail(int productID);
}
