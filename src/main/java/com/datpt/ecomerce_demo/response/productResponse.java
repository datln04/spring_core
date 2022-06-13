package com.datpt.ecomerce_demo.response;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.datpt.ecomerce_demo.model.Option;
import com.datpt.ecomerce_demo.model.OptionGroup;
import com.datpt.ecomerce_demo.model.ProductOption;

public class productResponse {

	private int ProductID;
	private String ProductSKU;
	private String ProductName;
	private float ProductPrice;
	private float ProductWeight;
	private String ProductCartDesc;
	private String ProductShortDesc;
	private String ProductLongDesc;
	private String ProductThumb;
	private String ProductImage;
	private Date ProductUpdateDate;
	private float ProductStock;
	private int ProductLive;
	private int ProductUnlimited;
	
	private List<OptionResponse> options;
	
	private List<OptionGroupReponse> optionGroups;
	
	public productResponse() {
		// TODO Auto-generated constructor stub
	}

	public productResponse(int productID, String productSKU, String productName, float productPrice,
			float productWeight, String productCartDesc, String productShortDesc, String productLongDesc,
			String productThumb, String productImage, Date productUpdateDate, float productStock, int productLive,
			int productUnlimited) {
		super();
		ProductID = productID;
		ProductSKU = productSKU;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductWeight = productWeight;
		ProductCartDesc = productCartDesc;
		ProductShortDesc = productShortDesc;
		ProductLongDesc = productLongDesc;
		ProductThumb = productThumb;
		ProductImage = productImage;
		ProductUpdateDate = productUpdateDate;
		ProductStock = productStock;
		ProductLive = productLive;
		ProductUnlimited = productUnlimited;
	}
	
	

	public productResponse(int productID, String productSKU, String productName, float productPrice,
			float productWeight, String productCartDesc, String productShortDesc, String productLongDesc,
			String productThumb, String productImage, Date productUpdateDate, float productStock, int productLive,
			int productUnlimited, List<OptionResponse> options, List<OptionGroupReponse> optionGroups) {
		super();
		ProductID = productID;
		ProductSKU = productSKU;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductWeight = productWeight;
		ProductCartDesc = productCartDesc;
		ProductShortDesc = productShortDesc;
		ProductLongDesc = productLongDesc;
		ProductThumb = productThumb;
		ProductImage = productImage;
		ProductUpdateDate = productUpdateDate;
		ProductStock = productStock;
		ProductLive = productLive;
		ProductUnlimited = productUnlimited;
		this.options = options;
		this.optionGroups = optionGroups;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductSKU() {
		return ProductSKU;
	}

	public void setProductSKU(String productSKU) {
		ProductSKU = productSKU;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(float productPrice) {
		ProductPrice = productPrice;
	}

	public float getProductWeight() {
		return ProductWeight;
	}

	public void setProductWeight(float productWeight) {
		ProductWeight = productWeight;
	}

	public String getProductCartDesc() {
		return ProductCartDesc;
	}

	public void setProductCartDesc(String productCartDesc) {
		ProductCartDesc = productCartDesc;
	}

	public String getProductShortDesc() {
		return ProductShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		ProductShortDesc = productShortDesc;
	}

	public String getProductLongDesc() {
		return ProductLongDesc;
	}

	public void setProductLongDesc(String productLongDesc) {
		ProductLongDesc = productLongDesc;
	}

	public String getProductThumb() {
		return ProductThumb;
	}

	public void setProductThumb(String productThumb) {
		ProductThumb = productThumb;
	}

	public String getProductImage() {
		return ProductImage;
	}

	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}

	public Date getProductUpdateDate() {
		return ProductUpdateDate;
	}

	public void setProductUpdateDate(Date productUpdateDate) {
		ProductUpdateDate = productUpdateDate;
	}

	public float getProductStock() {
		return ProductStock;
	}

	public void setProductStock(float productStock) {
		ProductStock = productStock;
	}

	public int getProductLive() {
		return ProductLive;
	}

	public void setProductLive(int productLive) {
		ProductLive = productLive;
	}

	public int getProductUnlimited() {
		return ProductUnlimited;
	}

	public void setProductUnlimited(int productUnlimited) {
		ProductUnlimited = productUnlimited;
	}

	public List<OptionResponse> getOptions() {
		return options;
	}

	public void setOptions(List<OptionResponse> options) {
		this.options = options;
	}

	public List<OptionGroupReponse> getOptionGroups() {
		return optionGroups;
	}

	public void setOptionGroups(List<OptionGroupReponse> optionGroups) {
		this.optionGroups = optionGroups;
	}


	
	
}
