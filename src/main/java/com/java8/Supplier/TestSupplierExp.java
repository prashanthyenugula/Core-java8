package com.java8.Supplier;

import java.util.function.Supplier;

public class TestSupplierExp {
	
	public static void main(String[] args) {
		
		Supplier<String> s =()->"Hello java";
		
		System.out.println(s.get());
	}

}
