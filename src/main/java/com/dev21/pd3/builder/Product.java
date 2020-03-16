package com.dev21.pd3.builder;

import java.util.LinkedList;

public class Product {

	private LinkedList<String> parts;

	public Product() {
		parts = new LinkedList<>();
	}

	public void add(String part) {
		parts.addLast(part);
	}

	public void showProduct() {
		System.out.println("\nProduct completed as below :");
		parts.stream().forEach(System.out::println);
	}

}
