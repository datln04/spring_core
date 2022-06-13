package com.datpt.ecomerce_demo.response;

public class OptionGroupReponse {
	private int groupID;
	private String groupName;
	
	public OptionGroupReponse() {
		// TODO Auto-generated constructor stub
	}

	public OptionGroupReponse(int groupID, String groupName) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
