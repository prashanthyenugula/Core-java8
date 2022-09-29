package com.java8.Function;

import java.util.function.Function;

public class TestFunctionNumSquare {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i->i*i;
		
		System.out.println(f.apply(12));
		System.out.println(f.apply(144));
	}
}
