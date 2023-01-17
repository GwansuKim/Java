package com.yedam.java.ch01_01;

public interface RemoteControl {
	//상수
	//public static final int MAX_VALUE = 10;
	public int MAX_VLAUE = 10;		//그냥 입력해도 상수로 인식
	public int MIN_VALUE = 0;
	
	//추상 메소드
//	public default void method() {
//		System.out.println("일반 메소드입니다.");
//	}
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
