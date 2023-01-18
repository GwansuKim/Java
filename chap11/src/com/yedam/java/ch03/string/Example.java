package com.yedam.java.ch03.string;

import java.io.UnsupportedEncodingException;

public class Example {

	public static void main(String[] args) {
		// byte[] -> String
		byte[] bytes1 = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes1);
		System.out.println(str1);

		String str2 = new String(bytes1, 6, 4);
		System.out.println(str2);

		// 별도의 문자셋(기준)을 지정하는 경우
		String str = "안녕하세요";
		byte[] bytesX = str.getBytes();
		System.out.println(bytesX.length);
		String strX = new String(bytesX);
		System.out.println(strX);

		try {
			byte[] bytesY = str.getBytes("UTF-8");
			System.out.println(bytesY.length);
			String strY = new String(bytesY, "EUC-KR");
			System.out.println(strY);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
