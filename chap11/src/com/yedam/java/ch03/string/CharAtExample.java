package com.yedam.java.ch03.string;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "010423-4696111";
		if(ssn.charAt(7) == '1'|| ssn.charAt(7) == '3') {
			System.out.println("남자");
		} else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4') {
			System.out.println("여자");
		}
		
		int birthYear = Integer.parseInt(ssn.substring(0, 2));
		int currentYear = 23;
		int age = currentYear - birthYear + 1;
		System.out.println(age);
	}

}
