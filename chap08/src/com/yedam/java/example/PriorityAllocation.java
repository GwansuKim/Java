package com.yedam.java.example;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("전화를 등급순으로 대기열에서 가져옵니다");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("우수 상담원에게 연결합니다");
	}

}
