package com.datpt.ecomerce_demo.service.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datpt.ecomerce_demo.model.Option;
import com.datpt.ecomerce_demo.model.OptionGroup;
import com.datpt.ecomerce_demo.repository.OptionGroupRepository;
import com.datpt.ecomerce_demo.response.OptionGroupReponse;
import com.datpt.ecomerce_demo.service.OptionGroupService;

@Service
public class OptionGroupServiceImp implements OptionGroupService{

	@Autowired
	private OptionGroupRepository groupService;
	
	@Override
	public OptionGroup findByOptionGroupID(int id) {
		Optional<OptionGroup> option = Optional.ofNullable(groupService.findById(id).orElse(null));
		if(option != null) {
			OptionGroup opGroup = option.orElseGet(null);
			return opGroup;
		}
		return null;
	}

	@Override
	public List<OptionGroupReponse> findAll() {
		List<OptionGroup> optionGroups = groupService.findAll();
		List<OptionGroupReponse> response = new ArrayList<OptionGroupReponse>();
		for (OptionGroup group : optionGroups) {
			response.add(new OptionGroupReponse(group.getOptionGroupID(), group.getOptionsGroupName()));
		}
		return response;
	}

}
