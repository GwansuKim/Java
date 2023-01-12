package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		String strVal3 = new String("yedam");
		
		if(strVal1 == strVal2) {
			System.out.println("1과 2의 메모리 주소는 같다");
		} else {
			System.out.println("1과 2는 메모리 주소가 다르다");
		}
		if(strVal1 == strVal3) {
			System.out.println("1과 3의 메모리 주소는 같다");
		} else {
			System.out.println("1과 3는 메모리 주소가 다르다");
		}
		
		if(strVal1.equals(strVal3)) {
			System.out.println("1과 3의 데이터 값은 같다");
		} else {
			System.out.println("1과 3는 데이터 값은 다르다");
		}
		System.out.println(strVal1);
	}

}
