package com.yedam.java.ch02_01;

public class ChildExample {

	public static void main(String[] args) {
		Child chd = new Child();
		Parent prt = new Parent();
		chd.method1();
		prt.method2();
		chd.method2();
		chd.method3();
		
		Parent chd2 = chd;
		chd2.method1();
		chd2.method2();
		//chd2.method3();
		
	}

}
