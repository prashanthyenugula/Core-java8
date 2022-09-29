package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class HighestNumCounting {
	
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
		
		int count=0;
		for (Integer num : list) {
			if(num>60)
				count++;
		}
		System.out.println(count);
	}
}
