package com.java8.Predicate;

public class PredicateForIsEmpty {
	
	public static void main(String[] args) {
		String name = "shravan";
		String city = "";
		String mobile = null;
		
		PredicateForIsEmpty p = new PredicateForIsEmpty();
		System.out.println(p.isNullOrEmpty(name));
		System.out.println(p.isNullOrEmpty(city));
		System.out.println(p.isNullOrEmpty(mobile));
		System.out.println(p.isNullOrEmpty("Hello"));
		
	}

	public boolean isNullOrEmpty(String text) {
		return text==null || text.isEmpty();
		
		
		/*if(text == null || text.isEmpty()) {
			return true;
		} else {
			return false;
		}*/
		
	}
}
