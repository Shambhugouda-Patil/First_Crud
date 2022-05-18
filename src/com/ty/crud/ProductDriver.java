package com.ty.crud;

public class ProductDriver {

	public static void main(String[] args) {
		ProductData pd=new ProductData();
		Product p=new Product();
		p.setId(1);
		p.setName("toyota");
		p.setType("electric");
		p.setCost(10000);

		pd.saveProduct(p);
	}

}
