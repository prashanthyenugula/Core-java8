package com.java8.Predicate;

import java.util.function.Predicate;

public class PredicateAnnonymous {
	
	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
			
		};
		System.out.println(p.test(53));
		System.out.println(p.test(58));
		System.out.println(p.test(102));
		System.out.println(p.test(775));
	}

}
