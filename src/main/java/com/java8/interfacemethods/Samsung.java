package com.java8.interfacemethods;

public class Samsung implements ISmartPhone {

	@Override
	public void enableWifi() {
		System.out.println("Samsung wifi");
	}

	@Override
	public void enableMobieData() {
		System.out.println("Samsung MobileData");
	}

	@Override
	public void enableGps() {
		System.out.println("Samsung Gps");
	}
	
	public static void main(String[] args) {
		ISmartPhone ism = new Samsung();
		ism.enableGps();
		ism.enableMobieData();
	}

}
