package com.yedam.loof;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// 1~100사이의 2의 배수
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		// 계산기 프로그램
		// 무한 루프 조건으로 프로그램 실행
		// event(trigger) 프로그램 종료 -> break;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int num1 = 0;
		int num2 = 0;
		while (run) {
			if (j == 0) {
				System.out.println("숫자 입력>");
				num1 = Integer.parseInt(sc.nextLine());
			}
			System.out.println("1. 덧셈 | 2. 뺼셈 | 3. 곱셈 | 4. 초기화 | 5. 종료");
			System.out.println("입력>");
			int input = Integer.parseInt(sc.nextLine());
			if (input != 5 && input != 4) {
				System.out.println("숫자 입력>");
				num2 = Integer.parseInt(sc.nextLine());
			}
			switch (input) {
			case 1:
				System.out.println(num1 + num2);
				num1 += num2;
				break;
			case 2:
				System.out.println(num1 - num2);
				num1 -= num2;
				break;
			case 3:
				System.out.println(num1 * num2);
				num1 *= num2;
				break;
			case 4:
				j = 0;
				continue;
			case 5:
				run = false;
				break;
			default:
				System.out.println("1~5 사이 수를 입력해주세요.");
				break;
			}
			j++;
		}
		System.out.println("end of program");

		// 게임 만들기
		// 컴퓨터와 가위, 바위, 보
		// 앞, 뒤 맞추기
		// 한 판에 500원
		int money;
		System.out.println("====insert coin====");
		money = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		while (money >= 500 && flag) {
			System.out.println((money/500)+" coins");
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추기 | 3. 종료");
			System.out.println("입력");
			int gameNo = Integer.parseInt(sc.nextLine());
			switch (gameNo) {
			case 1:
				int no1 = (int) (Math.random() * 3);
				// 0 = 가위, 1 = 바위, 2 = 보
				System.out.println("가위 바위 보>");
				String str = sc.nextLine();
				switch (str) {
				case "가위":
					// ㄴswitch(str) case"가위" == if(str.equals("가위")){}
					if (no1 == 0) {
						System.out.println("무승부");
					} else if (no1 == 1) {
						System.out.println("졌다!");
					} else {
						System.out.println("이겼다!");
					}
					break;
				case "바위":
					if (no1 == 1) {
						System.out.println("무승부");
					} else if (no1 == 2) {
						System.out.println("졌다!");
					} else {
						System.out.println("이겼다!");
					}
					break;
				case "보":
					if (no1 == 2) {
						System.out.println("무승부");
					} else if (no1 == 0) {
						System.out.println("졌다!");
					} else {
						System.out.println("이겼다!");
					}
					break;
				default:
					System.out.println("가위, 바위, 보 중 하나를 골라!");
					money += 500;
					break;
				}
				break;
			case 2:
				int no2 = (int) (Math.random() * 2);
				System.out.println("앞 뒤>");
				// 0 = 앞, 1 = 뒤
				String str2 = sc.nextLine();
				switch (str2) {
				case "앞":
					if (no2 == 0) {
						System.out.println("정답!");
					} else {
						System.out.println("땡!");
					}
					break;
				case "뒤":
					if (no2 == 1) {
						System.out.println("정답!");
					} else {
						System.out.println("땡!");
					}
					break;
				default:
					System.out.println("앞 뒤중 하나를 골라!");
					money += 500;
					break;
				}
				break;
			case 3:
				System.out.println("남은 금액: "+money);
				money += 500;
				flag = false;
				break;
			default:
				System.out.println("1~3번을 입력해 주세요.");
				break;
			}
			money -= 500;
		}
		System.out.println("Game over");
	}

}
