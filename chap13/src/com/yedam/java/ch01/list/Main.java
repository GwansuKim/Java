package com.yedam.java.ch01.list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요\n입력>");
		int input = Integer.parseInt(sc.nextLine());
		int newNum = -1;
		int count = 0;
		while (!(input == newNum)) {
			if (newNum == -1) {
				newNum = input;
			}
			int ten = newNum % 10;
			int one = (newNum / 10 + (newNum % 10)) % 10;
			newNum = (10 * ten) + one;
			count++;
		}
		System.out.println(count);
	}

}
