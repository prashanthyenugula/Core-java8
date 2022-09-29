package com.java8.Predicate;

import java.util.function.Predicate;

public class PredicateForEmptyLambda {
	
	public static void main(String[] args) {
		String name = "anil";
		String city = "";
		String mobile = null;
		
		Predicate<String> p = text->text==null||text.isEmpty();
		
		System.out.println(p.test(name));
		System.out.println(p.test(city));
		System.out.println(p.test(mobile));
		System.out.println(p.test("vihaan"));
	}

}
