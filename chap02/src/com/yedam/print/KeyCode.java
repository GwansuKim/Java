package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws IOException {
		//keyCode(하나의 문자를 받아올 때)
		int keyCode = 0;
		System.out.println("입력>");
		keyCode = System.in.read();
		System.out.println("keyCode : "+keyCode);
		//13과 10은 Enter키의 keyCode
		keyCode = System.in.read();
		System.out.println("keyCode : "+keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode : "+keyCode);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력>");
		//scanner.nextLine() : 엔터키 이전까지 데이터를 받아 오세요
		String inputData = scanner.nextLine();
		//scanner.nextInt();
		System.out.println(inputData);
		
		//기본 타입, ==
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		
	}

}
