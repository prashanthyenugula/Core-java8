package com.java8.functinalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(29);
		list.add(96);
		list.add(89);
		list.add(16);
		list.add(117);
		
		System.out.println(list);// insertion order printed
		
		//Collections.sort(list);// for Ascending order
		
		Collections.sort(list, new MyComparatorForInt());// for customized sorting order
		System.out.println("Ascending order :"+list);
	}

}
