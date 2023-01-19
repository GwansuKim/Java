package com.yedam.java.ch02;

@FunctionalInterface
public interface Workable {
	//람다식 인터페이스는 추상 메소드가 반드시 "1개"
	public void work();
}
