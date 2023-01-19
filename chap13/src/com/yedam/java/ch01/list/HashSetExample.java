package com.yedam.java.ch01.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다.");
		}
	}

}
