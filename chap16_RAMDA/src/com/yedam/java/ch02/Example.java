package com.yedam.java.ch02;

public class Example {
	
	public static void main(String[] args) {
		// 매개 변수가 없는 경우
		Workable work = () -> {
			System.out.println("출근을 합니다");
			System.out.println("코딩을 합니다");
		};
		
		work.work();
		
		work = () -> System.out.println("퇴근을 합니다");
		work.work();
		
		// 매개 변수가 있는 경우
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다.");
			System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		};
		speak.speak("뉴진스 - HypeBoy");
		
		speak = x -> System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		speak.speak("갓더비트 - Strum Up");
		
		// 리턴값이 있는 경우
		Calculator cal = (x, y) -> {
			int result = (int)(x + y);
					return result;
		};
		System.out.println("1st : " + cal.plus(5.8, 6.9));
		
		cal = (x, y) -> (int)(x + y);
		System.out.println("2st : " + cal.plus(5.8, 6.9));
	}
}

