package com.datpt.ecomerce_demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderID;
	
	@ManyToOne
	@JoinColumn(name = "orderuserid")
	private User user;
	
	@Column(name = "orderamount")
	private float OrderAmount;
	
	@Column(name = "ordershipname")
	private String OrderShipName;
	
	@Column(name = "ordershipaddress")
	private String OrderShipAddress;
	
	@Column(name = "ordershipaddress2")
	private String OrderShipAddress2;
	
	@Column(name = "ordercity")
	private String OrderCity;
	
	@Column(name = "orderstate")
	private String OrderState;
	
	@Column(name = "orderzip")
	private String OrderZip;
	
	@Column(name = "ordercountry")
	private String OrderCountry;
	
	@Column(name = "orderphone")
	private String OrderPhone;
	
	@Column(name = "orderfax")
	private String OrderFax;
	
	@Column(name = "ordershipping")
	private float OrderShipping;
	
	@Column(name = "ordertax")
	private float OrderTax;
	
	@Column(name = "orderemail")
	private String OrderEmail;
	
	@Column(name = "orderdate")
	private Date OrderDate;
	
	@Column(name = "ordershipped")
	private int OrderShipped;
	
	@Column(name = "ordertrackingnumber")
	private String OrderTrackingNumber;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	




	public Order(int orderID, User user, float orderAmount, String orderShipName, String orderShipAddress,
			String orderShipAddress2, String orderCity, String orderState, String orderZip, String orderCountry,
			String orderPhone, String orderFax, float orderShipping, float orderTax, String orderEmail, Date orderDate,
			int orderShipped, String orderTrackingNumber) {
		super();
		OrderID = orderID;
		this.user = user;
		OrderAmount = orderAmount;
		OrderShipName = orderShipName;
		OrderShipAddress = orderShipAddress;
		OrderShipAddress2 = orderShipAddress2;
		OrderCity = orderCity;
		OrderState = orderState;
		OrderZip = orderZip;
		OrderCountry = orderCountry;
		OrderPhone = orderPhone;
		OrderFax = orderFax;
		OrderShipping = orderShipping;
		OrderTax = orderTax;
		OrderEmail = orderEmail;
		OrderDate = orderDate;
		OrderShipped = orderShipped;
		OrderTrackingNumber = orderTrackingNumber;
	}






	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public float getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		OrderAmount = orderAmount;
	}

	public String getOrderShipName() {
		return OrderShipName;
	}

	public void setOrderShipName(String orderShipName) {
		OrderShipName = orderShipName;
	}

	public String getOrderShipAddress() {
		return OrderShipAddress;
	}

	public void setOrderShipAddress(String orderShipAddress) {
		OrderShipAddress = orderShipAddress;
	}

	public String getOrderShipAddress2() {
		return OrderShipAddress2;
	}

	public void setOrderShipAddress2(String orderShipAddress2) {
		OrderShipAddress2 = orderShipAddress2;
	}

	public String getOrderCity() {
		return OrderCity;
	}

	public void setOrderCity(String orderCity) {
		OrderCity = orderCity;
	}

	public String getOrderState() {
		return OrderState;
	}

	public void setOrderState(String orderState) {
		OrderState = orderState;
	}

	public String getOrderZip() {
		return OrderZip;
	}

	public void setOrderZip(String orderZip) {
		OrderZip = orderZip;
	}

	public String getOrderCountry() {
		return OrderCountry;
	}

	public void setOrderCountry(String orderCountry) {
		OrderCountry = orderCountry;
	}

	public String getOrderPhone() {
		return OrderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		OrderPhone = orderPhone;
	}

	public String getOrderFax() {
		return OrderFax;
	}

	public void setOrderFax(String orderFax) {
		OrderFax = orderFax;
	}

	public float getOrderShipping() {
		return OrderShipping;
	}

	public void setOrderShipping(float orderShipping) {
		OrderShipping = orderShipping;
	}

	public float getOrderTax() {
		return OrderTax;
	}

	public void setOrderTax(float orderTax) {
		OrderTax = orderTax;
	}

	public String getOrderEmail() {
		return OrderEmail;
	}

	public void setOrderEmail(String orderEmail) {
		OrderEmail = orderEmail;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	

	public int getOrderShipped() {
		return OrderShipped;
	}


	public void setOrderShipped(int orderShipped) {
		OrderShipped = orderShipped;
	}


	public String getOrderTrackingNumber() {
		return OrderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		OrderTrackingNumber = orderTrackingNumber;
	}
	
	
	
}
