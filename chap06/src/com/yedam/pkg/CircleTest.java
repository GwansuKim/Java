package com.yedam.pkg;

import com.yedam.object.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setR(10);
		System.out.println(circle.area());
		System.out.println(circle.getR());
	}

}
