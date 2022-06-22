package com.wipro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.springboot.model.Product;
import com.wipro.springboot.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@RequestMapping("/showAddPage")
	public String showAddProductPage() {
		return "add-product";
	}

	
	@RequestMapping("/add-product")
	public String addProduct(@ModelAttribute("product")Product product) {
		
		 productService.addProduct(product);
		 
		 return "redirect:/all-products";		 
		
	}
	
	
	@RequestMapping("/all-products")
	public ModelAndView getProducts(ModelAndView mav) {

		List<Product> productList = productService.getAllProducts();
		mav.setViewName("show-product");
		mav.addObject("products", productList);
		return mav;

	}

	
	@RequestMapping("/product/{id}")
	public ModelAndView getProductById(@PathVariable("id")int productId,ModelAndView mav) {

		System.out.println("product id searching for is:"+productId);
		Product product = productService.getProduct(productId);
		mav.setViewName("search-product");
		mav.addObject("product", product);
		return mav;

	}
}
