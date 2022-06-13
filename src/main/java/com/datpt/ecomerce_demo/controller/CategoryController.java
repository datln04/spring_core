package com.datpt.ecomerce_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datpt.ecomerce_demo.model.ProductCategory;
import com.datpt.ecomerce_demo.response.CategoryResponse;
import com.datpt.ecomerce_demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public ResponseEntity<List<CategoryResponse>> getCategories(){
		List<ProductCategory> list = categoryService.findAll();
		ArrayList<CategoryResponse> dtos = new ArrayList<CategoryResponse>();
		for (ProductCategory category : list) {
			CategoryResponse cate = new CategoryResponse(category.getCategoryID(), category.getCategoryName());
			dtos.add(cate);
		}
		return new ResponseEntity<List<CategoryResponse>>(dtos, HttpStatus.OK);
	}
}
