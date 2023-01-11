package com.yedam.reference;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ary;
		int no;

		System.out.println("배열의 크기>");
		no = Integer.parseInt(sc.nextLine());
		ary = new int[no];
		System.out.println(ary.length);
		for (int i = 0; i < no; i++) {
			System.out.println("입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		for (int i = 0; i < no; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();

		// 최댓값 최솟값 구하기
		int max = ary[0];
		for (int i = 0; i < no; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		int min = ary[0];
		for (int i = 0; i < no; i++) {
			if (min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
	}

}
