package com.yedam.loof;

import java.util.Scanner;

public class LoopFor2 {

	public static void main(String[] args) {
		//중첩 for문
		//for(){
		//	for(){
		//	}
		//}
		
		//2단~9단 출력
		for(int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for(int j = 1; j <10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
		//*****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		//*****
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		//****
		//***
		//**
		//*
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		int input = Integer.parseInt(sc.nextLine());
		for(int i = input; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//    *
		//   **
		//  ***
		// ****
		//*****
		System.out.println("입력>");
		int input2 = Integer.parseInt(sc.nextLine());
		for(int i = input2; i > 0; i--) {
			for(int j = 1; j <= input2; j++) {
				if(j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
