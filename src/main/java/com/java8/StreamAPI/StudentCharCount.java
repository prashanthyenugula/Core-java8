package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

import com.java8.functinalComparator.Student;

public class StudentCharCount {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
		//Here name starts with 'v' letter count!!
		long count = list.stream().filter(std->std.getName().charAt(0)=='v').count();
		System.out.println(count);
		
		long count1 = list.stream().filter(std->std.getName().charAt(std.getName().length()-1) == '4').count();
		System.out.println(count1);
	}

}
