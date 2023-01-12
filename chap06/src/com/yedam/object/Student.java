package com.yedam.object;

public class Student {
	// 필드, 객체의 속성(정보, 데이터)가 저장되는 부분
	// 이름
	String name;
	int age;
	String schoolName;
	int kor;
	int math;
	int eng;

	// 생성자, 객체 초기화(생성)할 때 이 구문을 실행하고 생성해라 하는 부분
	// 기본 생성자 -> 생성하지 않아도 컴파일(실행) 할 때 자바에서 자동 생성
	// 생성자 -> 매개변수, 객체 생성시 실행문 정의
//	Student() {
//		System.out.println("객체 생성중");
//	}

	// 메소드, 객체를 생성 후 기능을 사용할 때 정의 하는 부분
	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("재학중인 학교 : " + schoolName);
		System.out.println("국어 점수 : " + kor);
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + eng);
	}
}
