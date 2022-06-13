package com.datpt.ecomerce_demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column(name="productsku")
	private String productSKU;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="productprice")
	private float productPrice;
	
	@Column(name="productweight")
	private float productWeight;
	
	@Column(name="productcartdesc")
	private String productCartDesc;
	
	@Column(name="productshortdesc")
	private String productShortDesc;
	
	@Column(name="productlongdesc")
	private String productLongDesc;
	
	@Column(name="productthumb")
	private String productThumb;
	
	@Column(name="productimage")
	private String productImage;
	
	@Column(name="productupdatedate")
	private Date productUpdateDate;
	
	@Column(name="productstock")
	private float productStock;
	
	@Column(name="productlive")
	private int productLive;
	
	@Column(name="productunlimited")
	private int productUnlimited;
	
	@Column(name="productlocation")
	private String productLocation;
	
	@ManyToOne
	@JoinColumn(name = "productcategoryid")
	private ProductCategory category;
	
	@OneToMany(mappedBy = "product")
	private List<OrderDetail> orderDetails;
	
	
	@OneToMany(mappedBy = "product")
	private List<ProductOption> productOptions;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	


	public Product(int productID, String productSKU, String productName, float productPrice, float productWeight,
			String productCartDesc, String productShortDesc, String productLongDesc, String productThumb,
			String productImage, Date productUpdateDate, float productStock, int productLive, int productUnlimited,
			String productLocation, ProductCategory category, List<OrderDetail> orderDetails,
			List<ProductOption> productOptions) {
		super();
		this.productID = productID;
		this.productSKU = productSKU;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productWeight = productWeight;
		this.productCartDesc = productCartDesc;
		this.productShortDesc = productShortDesc;
		this.productLongDesc = productLongDesc;
		this.productThumb = productThumb;
		this.productImage = productImage;
		this.productUpdateDate = productUpdateDate;
		this.productStock = productStock;
		this.productLive = productLive;
		this.productUnlimited = productUnlimited;
		this.productLocation = productLocation;
		this.category = category;
		this.orderDetails = orderDetails;
		this.productOptions = productOptions;
	}




	public int getProductID() {
		return productID;
	}




	public void setProductID(int productID) {
		this.productID = productID;
	}




	public String getProductSKU() {
		return productSKU;
	}




	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public float getProductPrice() {
		return productPrice;
	}




	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}




	public float getProductWeight() {
		return productWeight;
	}




	public void setProductWeight(float productWeight) {
		this.productWeight = productWeight;
	}




	public String getProductCartDesc() {
		return productCartDesc;
	}




	public void setProductCartDesc(String productCartDesc) {
		this.productCartDesc = productCartDesc;
	}




	public String getProductShortDesc() {
		return productShortDesc;
	}




	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}




	public String getProductLongDesc() {
		return productLongDesc;
	}




	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}




	public String getProductThumb() {
		return productThumb;
	}




	public void setProductThumb(String productThumb) {
		this.productThumb = productThumb;
	}




	public String getProductImage() {
		return productImage;
	}




	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}




	public Date getProductUpdateDate() {
		return productUpdateDate;
	}




	public void setProductUpdateDate(Date productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}




	public float getProductStock() {
		return productStock;
	}




	public void setProductStock(float productStock) {
		this.productStock = productStock;
	}




	public int getProductLive() {
		return productLive;
	}




	public void setProductLive(int productLive) {
		this.productLive = productLive;
	}




	public int getProductUnlimited() {
		return productUnlimited;
	}




	public void setProductUnlimited(int productUnlimited) {
		this.productUnlimited = productUnlimited;
	}




	public String getProductLocation() {
		return productLocation;
	}




	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}




	public ProductCategory getCategory() {
		return category;
	}




	public void setCategory(ProductCategory category) {
		this.category = category;
	}




	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}




	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}




	public List<ProductOption> getProductOptions() {
		return productOptions;
	}




	public void setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}
	
	
	
}
