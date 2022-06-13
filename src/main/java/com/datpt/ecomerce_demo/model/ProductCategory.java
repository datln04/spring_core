package com.datpt.ecomerce_demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productcategories")
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CategoryID;
	
	@Column(name="categoryname")
	private String CategoryName;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "category")
	private List<Product> product;
	
	public ProductCategory() {
		// TODO Auto-generated constructor stub
	}

	
	



	public ProductCategory(int categoryID, String categoryName, List<Product> product) {
		super();
		CategoryID = categoryID;
		CategoryName = categoryName;
		this.product = product;
	}






	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	
}
