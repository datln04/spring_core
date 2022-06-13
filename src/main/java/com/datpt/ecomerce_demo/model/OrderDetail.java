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
@Table(name = "orderdetails")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DetailID;
	
	@ManyToOne
	@JoinColumn(name = "detailorderid")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "detailproductid")
	private Product product;
	
	@Column(name = "detailname")
	private String DetailName;
	
	@Column(name = "detailprice")
	private float DetailPrice;
	
	@Column(name = "detailsku")
	private String DetailSKU;
	
	@Column(name = "detailquantity")
	private int DetailQuantity;
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}
	
	

	public OrderDetail(int detailID, Order order, Product product, String detailName, float detailPrice,
			String detailSKU, int detailQuantity) {
		super();
		DetailID = detailID;
		this.order = order;
		this.product = product;
		DetailName = detailName;
		DetailPrice = detailPrice;
		DetailSKU = detailSKU;
		DetailQuantity = detailQuantity;
	}



	public int getDetailID() {
		return DetailID;
	}

	public void setDetailID(int detailID) {
		DetailID = detailID;
	}


	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getDetailQuantity() {
		return DetailQuantity;
	}

	public void setDetailQuantity(int detailQuantity) {
		DetailQuantity = detailQuantity;
	}

	public String getDetailName() {
		return DetailName;
	}

	public void setDetailName(String detailName) {
		DetailName = detailName;
	}

	public float getDetailPrice() {
		return DetailPrice;
	}

	public void setDetailPrice(float detailPrice) {
		DetailPrice = detailPrice;
	}

	public String getDetailSKU() {
		return DetailSKU;
	}

	public void setDetailSKU(String detailSKU) {
		DetailSKU = detailSKU;
	}

	public int getDetaiQuantity() {
		return DetailQuantity;
	}

	public void setDetaiQuantity(int detailQuantity) {
		DetailQuantity = detailQuantity;
	}
	
	
}
