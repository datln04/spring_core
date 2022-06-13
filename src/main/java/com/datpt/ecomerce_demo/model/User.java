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

/**
 * @author ptd
 *
 */
@Entity
@Table(name="users")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
	
	@Column(name = "useremail")
    private String UserEmail;
	
	@Column(name = "userpassword")
    private String UserPassword;
	
	@Column(name = "userfirstname")
    private String UserFirstName;
	
	@Column(name = "userlastname")
    private String UserLastName;
	
	@Column(name = "usercity")
    private String UserCity;
	
	@Column(name = "userstate")
    private String UserState;
	
	@Column(name = "userzip")
    private String UserZip;
	
	@Column(name = "useremailverified")
    private int UserEmailVerified;
	
	@Column(name = "userregistrationdate")
    private Date UserRegistrationDate;
	
	@Column(name = "userverificationcode")
    private String UserVerificationCode;
	
	@Column(name = "userip")
    private String UserIP;
	
	@Column(name = "userphone")
    private String UserPhone;
	
	@Column(name = "userfax")
    private String UserFax;
	
	@Column(name = "usercountry")
    private String UserCountry;
	
	@Column(name = "useraddress")
    private String UserAddress;
	
	@Column(name = "useraddress2")
    private String UserAddress2;
    
    
    @OneToMany(mappedBy = "user")
    private List<Order> order;
    
    @ManyToOne
    @JoinColumn(name = "roleid")
    private Role role;
    
    public User() {}

	public User(int userID, String userEmail, String userPassword, String userFirstName, String userLastName,
			String userCity, String userState, String userZip, int userEmailVerified, Date userRegistrationDate,
			String userVerificationCode, String userIP, String userPhone, String userFax, String userCountry,
			String userAddress, String userAddress2, List<Order> order) {
		super();
		UserID = userID;
		UserEmail = userEmail;
		UserPassword = userPassword;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		UserCity = userCity;
		UserState = userState;
		UserZip = userZip;
		UserEmailVerified = userEmailVerified;
		UserRegistrationDate = userRegistrationDate;
		UserVerificationCode = userVerificationCode;
		UserIP = userIP;
		UserPhone = userPhone;
		UserFax = userFax;
		UserCountry = userCountry;
		UserAddress = userAddress;
		UserAddress2 = userAddress2;
		this.order = order;
	}











	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUserFirstName() {
		return UserFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}

	public String getUserLastName() {
		return UserLastName;
	}

	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}

	public String getUserCity() {
		return UserCity;
	}

	public void setUserCity(String userCity) {
		UserCity = userCity;
	}

	

	public String getUserState() {
		return UserState;
	}



	public void setUserState(String userState) {
		UserState = userState;
	}



	public String getUserZip() {
		return UserZip;
	}

	public void setUserZip(String userZip) {
		UserZip = userZip;
	}

	public int getUserEmailVerified() {
		return UserEmailVerified;
	}

	public void setUserEmailVerified(int userEmailVerified) {
		UserEmailVerified = userEmailVerified;
	}

	public Date getUserRegistrationDate() {
		return UserRegistrationDate;
	}

	public void setUserRegistrationDate(Date userRegistrationDate) {
		UserRegistrationDate = userRegistrationDate;
	}

	public String getUserVerificationCode() {
		return UserVerificationCode;
	}

	public void setUserVerificationCode(String userVerificationCode) {
		UserVerificationCode = userVerificationCode;
	}

	public String getUserIP() {
		return UserIP;
	}

	public void setUserIP(String userIP) {
		UserIP = userIP;
	}

	public String getUserPhone() {
		return UserPhone;
	}

	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}

	public String getUserFax() {
		return UserFax;
	}

	public void setUserFax(String userFax) {
		UserFax = userFax;
	}

	public String getUserCountry() {
		return UserCountry;
	}

	public void setUserCountry(String userCountry) {
		UserCountry = userCountry;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

	public String getUserAddress2() {
		return UserAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		UserAddress2 = userAddress2;
	}

    
    

}

