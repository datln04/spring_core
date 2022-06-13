package com.datpt.ecomerce_demo.response;

public class OptionResponse {
	private int optionID;
	private String optionName;
	
	private int optionGroupID;
	
	public OptionResponse() {
		// TODO Auto-generated constructor stub
	}

	

	public OptionResponse(int optionID, String optionName, int optionGroupID) {
		super();
		this.optionID = optionID;
		this.optionName = optionName;
		this.optionGroupID = optionGroupID;
	}

	
	


	public int getOptionGroupID() {
		return optionGroupID;
	}



	public void setOptionGroupID(int optionGroupID) {
		this.optionGroupID = optionGroupID;
	}



	public int getOptionID() {
		return optionID;
	}

	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	
	
}
