package com.datpt.ecomerce_demo.service;

import java.util.List;

import com.datpt.ecomerce_demo.model.OptionGroup;
import com.datpt.ecomerce_demo.response.OptionGroupReponse;

public interface OptionGroupService {
	OptionGroup findByOptionGroupID(int id);
	
	List<OptionGroupReponse> findAll();
}
