package com.yedam.java.example;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("가장 대기열이 적은 상담원에게 연결합니다");
	}
	
}
