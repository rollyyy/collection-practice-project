package com.greedy.music.model.dto;

public class ShoppingBasketDTO {

	private String product;
	private int price;
	
	
	public ShoppingBasketDTO() {}
	
	
	public ShoppingBasketDTO(String product, int price) {
		
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingBasketDTO [product=" + product + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
