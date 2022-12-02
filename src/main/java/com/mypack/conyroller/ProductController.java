package com.mypack.conyroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.entity.Product;
import com.mypack.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/getProduct",produces = {"application/json"})
	public Product getProductDataById(@RequestParam("pid") Integer pid) {
		Product productById = productService.getProductById(pid);
		return productById;
		
	}
}
