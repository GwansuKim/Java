package com.yedam.exam;

public class Singleton {
	//필드
	private static Singleton singleton = null;
	
	//생성자 private => 외부에서 Singleton 객체 생성 불가
	private Singleton() {
	}
	
	//메소드 -> 외부에서 Singleton 연결하는 메소드
	public Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
