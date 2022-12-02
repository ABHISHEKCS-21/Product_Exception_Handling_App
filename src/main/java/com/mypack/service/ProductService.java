package com.mypack.service;

import org.springframework.stereotype.Service;

import com.mypack.entity.Product;

@Service
public interface ProductService {
	
	public Product getProductById(Integer pid) ;
}
