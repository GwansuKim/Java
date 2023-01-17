package com.yedam.java.ch02_01;

public class AExample {

	public static void main(String[] args) {
		C c = new C();
		c.method1();
		c.method2();
		c.method3();
		
		B b = new B();
		b.method1();
		b.method2();
		
		A a = b;
		a.method1();
		
		A aa = c;
		aa.method1();
	}

}
