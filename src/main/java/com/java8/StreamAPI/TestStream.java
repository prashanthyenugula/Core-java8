package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStream {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(35);
		list.add(16);
		list.add(77);
		list.add(96);
		list.add(24);
		list.add(63);
		list.add(32);
		
		//This logic 1.8 StreamAPI 
		List<Integer> even = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		// This logic for 1.8 Lambda Exp to compress logic through stream
		/*List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		Predicate<Integer> p = n->n%2==0;
		for (Integer num : list) {
			if(p.test(num))
				even.add(num);
			else
				odd.add(num);
		}*/
		
		System.out.println(even);
		System.out.println(odd);
	}
	
}