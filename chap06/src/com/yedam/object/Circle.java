package com.yedam.object;

public class Circle {
	// 필드
	// final 선언은 수정불가
	public static final double pi = 3.14159;
	private double r;

	// 생성자
	public Circle() {
	}

	public Circle(double r) {
		this.r = r;
	}

	// 메소드
	public double area() {
		double result = pi * r * r;
		return result;
	}

	public static double area(int r) {
		double result = pi * r * r;
		return result;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
}
