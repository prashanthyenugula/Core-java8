package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

import com.java8.functinalComparator.Student;

public class StudentForEach {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
//in this ForEach case total list printed(1.8v ForEach)
		list.stream().forEach(System.out::println);
		list.stream().forEach(std->System.out.println(std.getName()));// names printed
		
// this is method ref concept		
		list.stream().forEach(StudentForEach::printName);
	}
	
	public static void  printName(Student std) {
		System.out.println(std.getName());
	}
}
