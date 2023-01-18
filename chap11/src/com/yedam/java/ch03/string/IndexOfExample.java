package com.yedam.java.ch03.string;

public class IndexOfExample {

	public static void main(String[] args) {
		String subject = "혼자 공부하는 자바, 신윤권";
		int location = subject.indexOf("공부");
		System.out.println(location);
		
		if(subject.indexOf("자바") == -1) {
			System.out.println("자바와 관련이 없는 책입니다.");
		} else {
			System.out.println(subject.indexOf("자바"));
		}
		
		if(subject.indexOf("자바") > -1) {
			System.out.println("자바와 관련이 있는 책입니다");
		} else {
			System.out.println("자바와 관련이 없는 책입니다");
		}
		
		System.out.println(subject.indexOf("자"));
	}

}
