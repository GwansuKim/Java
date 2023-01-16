package com.yedam.java.ch01_01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 인스턴스
		DmbCellPhone dmb = new DmbCellPhone("오렌지폰", "오렌지레드", 10);

		// CellPhone의 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);

		// DmbCellPhone의 필드
		System.out.println("채널 : " + dmb.channel);
		
		//CellPhone의 메소드
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요 나야 거기 잘 지내니");
		dmb.receveVoice("아 누구세요;;");
		
		//DmbCellPhone의 메소드
		dmb.turnOnDmb();
	}

}
