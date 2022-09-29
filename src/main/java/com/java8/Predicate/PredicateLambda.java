package com.java8.Predicate;

import java.util.function.Predicate;

public class PredicateLambda {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = t->t%2==0;
		
		System.out.println(p.test(23));
		System.out.println(p.test(86));
	}

}
