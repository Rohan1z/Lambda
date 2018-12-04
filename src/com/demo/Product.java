package com.demo;

public class Product {
	private double price=0.0;
	public void setPrice(double price){
		this.price=price;
	}
	public void printPrice(){
		System.out.println("Product Price :"+price);
	}

}
