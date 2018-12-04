package com.demo;

import java.util.function.UnaryOperator;

public class UnaryDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = v->v*10;
		UnaryOperator u=s->s+" "+"User";
		System.out.println("Result :"+unary.apply(10));
		System.out.println("Result :"+u.apply("Hello"));
		

	}

}
