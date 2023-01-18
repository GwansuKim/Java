package com.yedam.java.ch03.string;

public class SubStirngExample {

	public static void main(String[] args) {
		String ssn = "941006-1234567";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		String[] birthDay = new String[firstNum.length()/2];
		int j = 0;
		for (int i = 0; i < firstNum.length(); i += 2) {
			birthDay[j] = firstNum.substring(i, i+2);
			j++;
		}
		for (String temp : birthDay) {
			System.out.println(temp);
		}
	}

}
