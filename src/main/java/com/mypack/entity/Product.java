package com.mypack.entity;

import lombok.Data;

@Data
public class Product {
	
	private int pid;
	private String pname;
	private double price;
	
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pid
	 * @param pname
	 * @param price
	 */
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	

}
