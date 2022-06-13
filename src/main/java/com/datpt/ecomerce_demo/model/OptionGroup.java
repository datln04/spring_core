package com.datpt.ecomerce_demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "optiongroups")
public class OptionGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="optiongroupid")
	private int OptionGroupID;
	
	@Column(name = "optiongroupname")
	private String OptionsGroupName;
	
	@OneToMany(mappedBy = "optionGroup")
	private List<Option> options;
	
	@OneToMany(mappedBy = "optionGroup")
	private List<ProductOption> productOptions;
	
	public OptionGroup() {
		// TODO Auto-generated constructor stub
	}


	public OptionGroup(int optionGroupID, String optionsGroupName) {
		super();
		OptionGroupID = optionGroupID;
		OptionsGroupName = optionsGroupName;
	}

	

	public int getOptionGroupID() {
		return OptionGroupID;
	}


	



	public List<Option> getOptions() {
		return options;
	}


	public void setOptions(List<Option> options) {
		this.options = options;
	}


	public List<ProductOption> getProductOptions() {
		return productOptions;
	}


	public void setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}


	public void setOptionGroupID(int optionGroupID) {
		OptionGroupID = optionGroupID;
	}


	public String getOptionsGroupName() {
		return OptionsGroupName;
	}

	public void setOptionsGroupName(String optionsGroupName) {
		OptionsGroupName = optionsGroupName;
	}
	
	
}
