package com.yedam.object;

public class StringUtil {
	//필드
	//생성자
	//메소드
	//hello 메소드
	static void greet() {
		System.out.println("hello");
	}
	static void greet(String str) {
		System.out.println(str);
	}
	static int greetLength(String str) {
		int result;
		result = str.length();
		return result;
	}
}
