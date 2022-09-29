package com.java8;

import java.util.function.Function;

public class SqareTest {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(12));
		System.out.println(f.apply(56));
		System.out.println(f.apply(256));
		System.out.println(f.apply(89));
		
		Function<Integer, Boolean> f1 = n->n%2 == 0;
		System.out.println(f1.apply(12));
	}

}
