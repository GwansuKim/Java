package com.yedam.java.ch03.string;

public class CaseException {

	public static final String DATA = "HELLO WORLD!";

	public static void main(String[] args) {
		String inputData = "Hello World!";
		if (inputData.equals(DATA) || inputData.toLowerCase().equals(DATA.toLowerCase()) || inputData.toUpperCase().equals(DATA.toUpperCase())) {
			//있는 그대로 비교			|| 소문자 비교											|| 대문자 비교
			System.out.println("있는 데이터입니다");
		} else {
			System.out.println("없는 데이터입니다");
		}
		
		//대소문자 구분없이 의미만 비교하는 메소드
		if(inputData.equalsIgnoreCase(DATA)) {
			System.out.println("있는 데이터입니다");
		} else {
			System.out.println("없는 데이터입니다");
		}
	}

}
