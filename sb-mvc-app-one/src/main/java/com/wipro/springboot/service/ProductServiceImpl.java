package com.wipro.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wipro.springboot.model.Product;

@Service
public class ProductServiceImpl implements IProductService {

	private static List<Product> productList = new ArrayList<Product>();
	
	static {
		
		Product p1=new Product(1001,"fan",2500.25);
		Product p2=new Product(1002,"lappy",22500.25);
		Product p3=new Product(1003,"mobile",12500.25);
		Product p4=new Product(1004,"Tv",5500.25);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
	}

	@Override
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}

	@Override
	public Product getProduct(int id) {

		List<Product> list = productList.stream().filter(p -> p.getId() == id).collect(Collectors.toList());
		return list.get(0);

	}

	@Override
	public List<Product> getAllProducts() {
		return productList;
	}

}
