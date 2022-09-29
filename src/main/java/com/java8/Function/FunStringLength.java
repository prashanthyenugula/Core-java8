package com.java8.Function;

import java.util.function.Function;

public class FunStringLength {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = text->text.length();
		
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("Hibernate"));
		System.out.println(f.apply("Spring"));
		System.out.println(f.apply("Restful"));
	}

}
