package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신윤권");
		Member m3 = new Member("신윤권");
		
		if(m1 == m2) {
			System.out.println("m1과 m2는 동등합니다.");
		} else {
			System.out.println("m1과 m2는 상이합니다.");
		}
		
		if(m3 == m2) {
			System.out.println("m2와 m3는 동등합니다.");
		} else {
			System.out.println("m2와 m3는 상이합니다.");
		}
		
		if(m2.equals(m3)) {
			System.out.println("m2과 m3는 동등합니다.");
		} else {
			System.out.println("m2과 m3는 상이합니다.");
		}
		
		Map<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
		
		System.out.println();
		
		String message = "오늘은 수요일입니다.";
		System.out.println(message);
		System.out.println(m1);
	}
}
