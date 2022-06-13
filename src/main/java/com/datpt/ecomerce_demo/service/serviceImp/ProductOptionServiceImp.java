package com.datpt.ecomerce_demo.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datpt.ecomerce_demo.model.ProductOption;
import com.datpt.ecomerce_demo.repository.ProductOptionRepository;
import com.datpt.ecomerce_demo.service.ProductOptionService;


@Service
public class ProductOptionServiceImp implements ProductOptionService{

	@Autowired
	private ProductOptionRepository proOptionRepository;
	
	@Override
	public List<ProductOption> getProductDetail(int productID) {
		List<ProductOption> list =  proOptionRepository.findByProductProductID(productID);
		return list;		
	}

}
