package com.mypack.service;

import org.springframework.stereotype.Service;

import com.mypack.entity.Product;
import com.mypack.exception.NoProductFoundException;

@Service
public class productServiceImpl implements ProductService {

	@Override
	public Product getProductById(Integer pid) {
	if(pid==101) {
		return new Product(101,"Keybord",500.00);

	}else {
		//Throws   Product not found exception...
		throw new NoProductFoundException("No Product Found");
	}
	
	}

}
