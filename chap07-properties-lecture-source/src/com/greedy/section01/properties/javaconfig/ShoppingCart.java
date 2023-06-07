package com.greedy.section01.properties.javaconfig;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private final List<Product> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public ShoppingCart(List<Product> items) {
		this.items = items;
	}
	
	public List<Product> getItems() {
		return items;
	}
	
	public void addItem(Product item) {
		items.add(item);
	}
	
	
}
