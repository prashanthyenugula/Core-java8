package com.java8.Predicate;

import java.util.function.Predicate;

public class TestPredicateInt {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = new PredicateImpl();
		System.out.println(p.test(56));
		System.out.println(p.test(23));
		System.out.println(p.test(89));
		System.out.println(p.test(64));
	}

}
