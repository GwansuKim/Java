package com.yedam.java.ch03_example;

public class Advanced extends PlayerLevel {
	//필드
	//생성자
	//메소드
	@Override
	public void run() {
		System.out.println("빠르게 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("점프");
	}

	@Override
	public void turn() {
		System.out.println("할 수 없습니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Advanced 입니다");
	}

}
