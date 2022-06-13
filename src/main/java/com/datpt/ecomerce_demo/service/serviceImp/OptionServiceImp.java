package com.datpt.ecomerce_demo.service.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datpt.ecomerce_demo.model.Option;
import com.datpt.ecomerce_demo.repository.OptionRepository;
import com.datpt.ecomerce_demo.service.OptionService;

@Service
public class OptionServiceImp implements OptionService{

	@Autowired
	private OptionRepository optionRepository;
	
	@Override
	public Option FindByID(int id) {
		Optional<Option> option = Optional.ofNullable(optionRepository.findById(id).orElse(null));
		if(option != null) {
			Option dto = option.orElseGet(null);
			if(dto != null) {
				return dto;
			}
		}
		
		return null;
	}
	
}
