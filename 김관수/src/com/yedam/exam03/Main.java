package com.yedam.exam03;

public class Main {

	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			// 0 = 500원, 1 = 100원, 2 = 50원, 3 = 10원
			switch (i) {
			case 0:
				coinUnit[i] = money / 500;
				System.out.print("500원 : " + coinUnit[i] + "개");
				break;
			case 1:
				coinUnit[i] = money % 500 / 100;
				System.out.print(", 100원 : " + coinUnit[i] + "개");
				break;
			case 2:
				coinUnit[i] = money % 100 / 50;
				System.out.print(", 50원 : " + coinUnit[i] + "개");
				break;
			case 3:
				coinUnit[i] = money % 50 / 10;
				System.out.print(", 10원 : " + coinUnit[i] + "개");
				break;
			}
		}
	}

}
