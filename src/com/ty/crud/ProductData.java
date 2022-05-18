package com.ty.crud;

public class ProductData {
	public void saveProduct(Product p) {
		System.out.println("product id :"+p.getId());
		System.out.println("product name :"+p.getName());
		System.out.println("product type :"+p.getType());
		System.out.println("product cost :"+p.getCost());
	}

}
