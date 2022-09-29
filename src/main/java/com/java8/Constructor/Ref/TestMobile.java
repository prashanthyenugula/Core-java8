package com.java8.Constructor.Ref;

public class TestMobile {
	
	public static void main(String[] args) {
		IMobile i = new MobileImpl();
		
		Mobile m1 = i.getMobile("Oppo");
		Mobile m2 = i.getMobile("Vivo");
		Mobile m3 = i.getMobile("RedMi");
		Mobile m4 = i.getMobile("honor");
		
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		System.out.println(m3.getName());
		System.out.println(m4.getName());
	}

}
