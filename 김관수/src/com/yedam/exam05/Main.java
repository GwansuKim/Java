package com.yedam.exam05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectNo;
		int diceSize = 0;
		int[] diceNo = null;
		// diceNo[0] = 주사위1, [1] = 주사위2...
		Outter: while (true) {
			System.out.println("===1.주사위 크기|2.주사위 굴리기|3.결과 보기|4.가장 많이 나온 수|5.종료===");
			System.out.println("메뉴 >");
			selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("주사위 크기 >");
				diceSize = Integer.parseInt(sc.nextLine());
				if (diceSize < 5 || diceSize > 10) {
					System.out.println("5~10 사이의 수를 입력해 주세요");
					diceSize = 0;
				}
				System.out.println(diceSize);
				break;
			case 2:
				int count = 0;
				boolean option = true;
				diceNo = new int[diceSize];
				while (option) {
					int dice = (int) (Math.random() * diceSize) + 1;
					diceNo[dice - 1]++;
					count++;
					if (dice == 5) {
						option = false;
					}
				}
				System.out.println("5가 나올 때까지주사위를 " + count + "번 굴렸습니다.");
				break;
			case 3:
				for (int i = 0; i < diceNo.length; i++) {
					System.out.println(i + 1 + "은(는)" + diceNo[i] + "번 나왔습니다.");
				}
				break;
			case 4:
				int max = diceNo[0];
				int maxIndex = 0;
				for (int i = 0; i < diceNo.length; i++) {
					if (max < diceNo[i]) {
						max = diceNo[i];
						maxIndex = i;
					}
				}
				System.out.println("가장 많이 나온 수는 " + (maxIndex + 1) + "입니다.");
				break;
			case 5:
				System.out.println("프로그램 종료");
				break Outter;
			default:
				System.out.println("1~5 사이의 수를 입력해 주세요");
				break;
			}
		}
	}

}
