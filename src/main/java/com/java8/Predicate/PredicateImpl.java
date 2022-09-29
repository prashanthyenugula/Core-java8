package com.java8.Predicate;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t%2==0;
		
		/*if(t%2 == 0) {
			return true;
		}else {
			return false;
		}*/
		
	}
	
}
