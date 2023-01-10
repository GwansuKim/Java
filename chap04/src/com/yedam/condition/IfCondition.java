package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90 이상이고, 등급 A");
		}
		
		//실행문이 1줄일 때만 사용=>가급적 사용하지 않는 것을 권장
		if(score >=90) 
			System.out.println("점수가 90이상이고, 등급 A");
		
		//if-else
		if(score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90미만입니다.");
			System.out.println("등급은 B입니다.");
		}
		
		//else if
		//if(조건식을 여러개 사용 할 때
//		score = 70;
//		if(score >= 90) {
//			System.out.println("등급 A");			
//		} else if(score >=80) {
//			System.out.println("등급 B");
//		} else if(score >=70) {
//			System.out.println("등급 C");
//		} else {
//			System.out.println("등급 D");
//		}
		
		//random 값 추출
		//Random() / Math.random()
		// 0 <= Math.random() < 1 => 0~0.99999...
		// 0 * 10 <= Math.random() * 10 < 1 * 10 => 0~9.99999....
		//int number = (int)5.12; => number == 5
		//(int) 0 <= (int) Math.random() * 10 < (int) 10 => 0~9
		//(int) 0 + 1 <= (int) (Math.random() * 10) + 1 < (int) 10 + 1 => 1~10
		//주사위 번호 뽑기
		int num = (int)(Math.random() * 6) + 1;
		if(num == 1) {
			System.out.println("1번 나옴");
		} else if( num == 2) {
			System.out.println("2번 나옴");
		} else if( num == 3) {
			System.out.println("3번 나옴");
		} else if( num == 4) {
			System.out.println("4번 나옴");
		} else if( num == 5) {
			System.out.println("5번 나옴");
		} else if( num == 6) {
			System.out.println("6번 나옴");
		}
		
		//중첩 if문
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력>");
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		if(score >= 90) {
			if(score >=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		System.out.println("획득한 학점 : " + grade);
	}

}
