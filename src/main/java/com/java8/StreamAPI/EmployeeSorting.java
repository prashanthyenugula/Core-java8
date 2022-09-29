package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(11, "prashanth", 29, 50000));
		emp.add(new Employee(12, "bhanu", 31, 60000));
		emp.add(new Employee(11, "ajay", 25, 70000));
		emp.add(new Employee(11, "vinay", 22, 80000));
	}
	
	//List<Employee> sortedList = emp.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).collect(Collectors.toList());

}
