package com.yedam.java.ch01_01;

public class SportsCar extends Car {
	// 필드
	// 생성자
	// 메소드
	@Override
	public void speedUp() {
		speed += 10;
	}

	public void carStop() {
		super.stop();
	}

}
