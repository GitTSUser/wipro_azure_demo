package com.wipro.springboot.service;

import java.util.List;

import com.wipro.springboot.model.Product;

public interface IProductService {

	public Product addProduct(Product product);
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	
}
