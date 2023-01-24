package com.yedam.java.ch01.list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요\n입력>");
		int input = Integer.parseInt(sc.nextLine());
		int newNum = input;
		int count = 0;
		while (true) {
			int ten = newNum / 10;
			int one = newNum % 10;
			newNum = one * 10 + (ten + one) % 10;
			count++;
			if(newNum == input) {
				break;
			}
		}
		System.out.println(count);
	}

}
