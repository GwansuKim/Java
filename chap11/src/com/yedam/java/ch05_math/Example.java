package com.yedam.java.ch05_math;

public class Example {

	public static void main(String[] args) {
		// abs() : 절대값
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14));
		System.out.println("2.14의 절대값 : " + Math.abs(2.14));

		// max() : 최댓값 , min() : 최솟값
		System.out.println("1.8, 9 중의 최댓값, 최솟값 : " + Math.max(1.8, 9) + " " + Math.min(1.8, 9));

		// ceil() : 올림값
		System.out.println("5.3의 올림값 : " + Math.ceil(5.3));
		System.out.println("-5.3의 올림값 : " + Math.ceil(-5.3));

		// floor() : 내림값
		System.out.println("5.3의 내림값 : " + Math.floor(5.3));
		System.out.println("-5.3의 내림값 : " + Math.floor(-5.3));

		// rint() : 가까운 정수의 실수값 = 결과를 double로 return
		System.out.println("7.5의 가까운 정수의 실수값 : " + Math.rint(7.5));
		System.out.println("5.5의 가까운 정수의 실수값 : " + Math.rint(5.5));
		System.out.println("7.49의 가까운 정수의 실수값 : " + Math.rint(7.49));
		System.out.println("5.49의 가까운 정수의 실수값 : " + Math.rint(5.49));
		System.out.println("6.5의 가까운 정수의 실수값 : " + Math.rint(6.5));
		System.out.println("6.5000000001의 가까운 정수의 실수값 : " + Math.rint(6.5000000001));
		System.out.println("4.5의 가까운 정수의 실수값 : " + Math.rint(4.5));
		System.out.println("4.5000000001의 가까운 정수의 실수값 : " + Math.rint(4.5000000001));
		System.out.println("-4.5의 가까운 정수의 실수값 : " + Math.rint(-4.5));
		System.out.println("-4.5000000001의 가까운 정수의 실수값 : " + Math.rint(-4.5000000001));
		System.out.println("-5.5의 가까운 정수의 실수값 : " + Math.rint(-5.5));
		System.out.println("-5.4999999999의 가까운 정수의 실수값 : " + Math.rint(-5.4999999999));
		
		// round() : 반올림값
		System.out.println("5.3의 반올림값 : " + Math.round(5.3));
		System.out.println("5.5의 반올림값 : " + Math.round(5.5));
		System.out.println("-5.4의 반올림값 : " + Math.round(-5.4));
		System.out.println("-5.5의 반올림값 : " + Math.round(-5.5));
		System.out.println("-5.50000000001의 반올림값 : " + Math.round(-5.50000000001));
		System.out.println("-5.6의 반올림값 : " + Math.round(-5.6));
	}

}
