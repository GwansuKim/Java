package com.yedam.object;

public class CircleSingle {
	private static CircleSingle singleton = new CircleSingle();
	private CircleSingle(){}
	static CircleSingle getInstance(){
		return singleton;
	}

	// 필드
	// final 선언은 수정불가
	static final double pi = 3.14159;

	// 생성자

	// 메소드
	static double area(int r) {
		double result = pi * r * r;
		return result;
	}
}
