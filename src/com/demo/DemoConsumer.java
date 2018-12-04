package com.demo;

import java.util.function.Consumer;

public class DemoConsumer {
	public static void main(String args[]){
		Consumer<Product> up = p1->p1.setPrice(5.6);
		Product p = new Product();
		up.accept(p);
		p.printPrice();
	}

}
