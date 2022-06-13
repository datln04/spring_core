package com.datpt.ecomerce_demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productoptions")
public class ProductOption {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "productoptionid")
	private int ProductOptionID;

	@Column(name = "optionpriceincrement")
	private double OptionPriceIncrement;
	
	
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "optionid")
	private Option option;
	
	@ManyToOne
	@JoinColumn(name = "optiongroupid")
	private OptionGroup optionGroup;
	
	
	
	public ProductOption() {
		// TODO Auto-generated constructor stub
	}
	






	public ProductOption(int productOptionID, double optionPriceIncrement, Product product, Option option,
			OptionGroup optionGroup) {
		super();
		ProductOptionID = productOptionID;
		OptionPriceIncrement = optionPriceIncrement;
		this.product = product;
		this.option = option;
		this.optionGroup = optionGroup;
	}







	public Product getProduct() {
		return product;
	}







	public void setProduct(Product product) {
		this.product = product;
	}







	public Option getOption() {
		return option;
	}







	public void setOption(Option option) {
		this.option = option;
	}







	public OptionGroup getOptionGroup() {
		return optionGroup;
	}







	public void setOptionGroup(OptionGroup optionGroup) {
		this.optionGroup = optionGroup;
	}







	public int getProductOptionID() {
		return ProductOptionID;
	}

	public void setProductOptionID(int productOptionID) {
		ProductOptionID = productOptionID;
	}
	
	public double getOptionPriceIncrement() {
		return OptionPriceIncrement;
	}

	public void setOptionPriceIncrement(double optionPriceIncrement) {
		OptionPriceIncrement = optionPriceIncrement;
	}

	
	
	
}
