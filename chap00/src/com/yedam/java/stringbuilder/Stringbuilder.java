package com.yedam.java.stringbuilder;

public class Stringbuilder {

	public static void main(String[] args) {
		//메모리 5개 사용
		String a = "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		
		//메모리 1개 사용
		StringBuilder sb = new StringBuilder();
	}

}
