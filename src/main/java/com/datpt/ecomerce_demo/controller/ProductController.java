package com.datpt.ecomerce_demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.datpt.ecomerce_demo.response.productResponse;
import com.datpt.ecomerce_demo.service.serviceImp.ProductServiceImp;



@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	private ProductServiceImp productServiceImp;
	
	
	@GetMapping("/productUnlimited")
	public ResponseEntity<List<productResponse>> getProductUnlimited(){
		List<productResponse> response = productServiceImp.findAll();
		return new ResponseEntity<List<productResponse>>(response, HttpStatus.OK);	
	}
	
	@GetMapping("/detail/{productID}")
	public ResponseEntity<productResponse> getProductDetail(@PathVariable String productID){	
		productResponse res = productServiceImp.findById(Integer.parseInt(productID));
		return new ResponseEntity<productResponse>(res, HttpStatus.OK);	
	}
	
	
}
