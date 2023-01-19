package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		// Java JDBC	Servlet/JSP iBATIS
		//			  ㄴ>Database
		
		list.add("Java");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println();
		
		list.remove(2);	// Database
		list.remove(2);	// Servlet/JSP
		list.remove("Java");
		for( String str : list) {
			System.out.println(str);
		}
	}
}
