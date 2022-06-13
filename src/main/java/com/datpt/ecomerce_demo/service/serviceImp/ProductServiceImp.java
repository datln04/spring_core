package com.datpt.ecomerce_demo.service.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datpt.ecomerce_demo.model.Option;
import com.datpt.ecomerce_demo.model.OptionGroup;
import com.datpt.ecomerce_demo.model.Product;
import com.datpt.ecomerce_demo.model.ProductOption;
import com.datpt.ecomerce_demo.repository.ProductRepository;
import com.datpt.ecomerce_demo.response.OptionGroupReponse;
import com.datpt.ecomerce_demo.response.OptionResponse;
import com.datpt.ecomerce_demo.response.productResponse;
import com.datpt.ecomerce_demo.service.OptionGroupService;
import com.datpt.ecomerce_demo.service.OptionService;
import com.datpt.ecomerce_demo.service.ProductOptionService;
import com.datpt.ecomerce_demo.service.ProductService;
import com.datpt.ecomerce_demo.utilities.Contant;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductOptionService productOptionService;
	
	
	@Autowired
	private OptionService optionService;
	
	@Autowired
	private OptionGroupService groupService;
	
	
	@Override
	public List<productResponse> findAll() {
		List<Product> dtos = productRepository.findAll();
		ArrayList<productResponse> response = new ArrayList<>();
		for (Product dto : dtos) {
			if(dto.getProductUnlimited() != Contant.UNLIMITED_PRODUCT) {
				productResponse product = new productResponse(dto.getProductID(), dto.getProductSKU(), dto.getProductName(), dto.getProductPrice(), dto.getProductWeight(), dto.getProductCartDesc(),
						dto.getProductShortDesc(), dto.getProductLongDesc(), dto.getProductThumb(), dto.getProductImage(), dto.getProductUpdateDate(), dto.getProductStock(), dto.getProductLive(), dto.getProductUnlimited());
				response.add(product);
			}		
		}
		return response;
	}

	@Override
	public productResponse findById(int id) {
		//get product option list
		List<ProductOption> listProductOption = productOptionService.getProductDetail(id);
		
		List<OptionResponse> listOption = new ArrayList<OptionResponse>();
		
		//get all group
		List<OptionGroupReponse> listOptionGroups = groupService.findAll();
		
		
		// get option by product
		for (ProductOption productOption : listProductOption) {
			
			Option option = optionService.FindByID(productOption.getOption().getOptionID());			
			OptionResponse opRes = new OptionResponse(option.getOptionID(), option.getOptionName(), option.getOptionGroup().getOptionGroupID());
			listOption.add(opRes);		
			
		}
				
		Optional<Product> product = Optional.ofNullable(productRepository.findById(id).orElse(null));
		//
		if(product != null) {
			Product dto = product.orElseGet(null);
			if(dto != null) {
				
				productResponse res = new productResponse(dto.getProductID(), dto.getProductSKU(), dto.getProductName(), dto.getProductPrice(), dto.getProductWeight(), dto.getProductCartDesc(),
						dto.getProductShortDesc(), dto.getProductLongDesc(), dto.getProductThumb(), dto.getProductImage(), dto.getProductUpdateDate(), dto.getProductStock(), dto.getProductLive(),
						dto.getProductUnlimited(), listOption, listOptionGroups);
				return res;
			}	
		}
		return null;
	}

	
}
