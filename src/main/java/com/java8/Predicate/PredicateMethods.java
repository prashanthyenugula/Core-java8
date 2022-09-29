package com.java8.Predicate;

import java.util.function.Predicate;

public class PredicateMethods {
	
	public static void main(String[] args) {
		int[] values = {11,25,98,64,118,67,674,112};
		
		Predicate<Integer> p1 = i-> i%2==0;
		
		Predicate<Integer> p2 =i-> i>100;
		
		for (int i : values) {
			if(p1.negate().test(i))  // here negative condition printed
				System.out.println(i);
			}
		
		/*for (int i : values) {
		if(p1.or(p2).test(i))
			System.out.println(i);
		}*/
		
		/*for (int i : values) {
		if(p1.and(p2).test(i))     // here p1 & p2 both conditions printed..
			System.out.println(i);
		}*/
		
		/*for (int i : values) {
			if(p2.test(i))
				System.out.println(i);
		}*/
		
	}

}
