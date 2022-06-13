package com.datpt.ecomerce_demo.model;

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
@Table(name="options")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OptionID;
	
	@Column(name = "optionname")
	private String OptionName;
	
	@ManyToOne
	@JoinColumn(name="optiongroupid")
	private OptionGroup optionGroup;
	
	@OneToMany(mappedBy = "option")
	private List<ProductOption> productOption;
	
	public Option() {
		// TODO Auto-generated constructor stub
	}
	

	public Option(int optionID, String optionName, OptionGroup optionGroup, List<ProductOption> productOption) {
		super();
		OptionID = optionID;
		OptionName = optionName;
		this.optionGroup = optionGroup;
		this.productOption = productOption;
	}


	public int getOptionID() {
		return OptionID;
	}

	public void setOptionID(int optionID) {
		OptionID = optionID;
	}


	public String getOptionName() {
		return OptionName;
	}

	public void setOptionName(String optionName) {
		OptionName = optionName;
	}


	public OptionGroup getOptionGroup() {
		return optionGroup;
	}


	public void setOptionGroup(OptionGroup optionGroup) {
		this.optionGroup = optionGroup;
	}


	public List<ProductOption> getProductOption() {
		return productOption;
	}


	public void setProductOption(List<ProductOption> productOption) {
		this.productOption = productOption;
	}
	
	
	
	
	
}
