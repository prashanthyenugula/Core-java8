package com.java8.functinalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAnnomymous {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(29);
		list.add(96);
		list.add(89);
		list.add(16);
		list.add(117);
		
		System.out.println(list);
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		};
		
		Collections.sort(list, comp);
		System.out.println("Order is :"+list);
	}

}
