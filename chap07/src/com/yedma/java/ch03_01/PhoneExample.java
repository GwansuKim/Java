package com.yedma.java.ch03_01;

public class PhoneExample {
	
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		Phone phone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
	}
	
}
