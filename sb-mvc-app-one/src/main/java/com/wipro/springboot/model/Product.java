package com.wipro.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@AllArgsConstructor
public class Product {

	private int id;
	private String name;
	private double price;

}
