package com.java8.functinalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompStudentLambda {
	
	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(100, "ajay", 927));
		stdList.add(new Student(101, "vinay", 882));
		stdList.add(new Student(102, "vamshi", 776));
		stdList.add(new Student(103, "sanjay", 922));
		stdList.add(new Student(104, "prashanth", 789));
		
		System.out.println(stdList);
		
		// name based compare
		//Collections.sort(stdList, (s1,s2)->s1.getName().compareTo(s2.getName()));
		// marks based compare
		Collections.sort(stdList, (s1,s2)->s1.getMarks());

		System.out.println(stdList);
	}

}
