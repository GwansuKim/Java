package com.yedam.exam;

public class Person_exe {

	public static void main(String[] args) {
		Person per1 = new Person();
		String str = "";
		per1.setSsn("941006-1");
		str += per1.getSsn() + " ";
		per1.setName("김관수");
		str += per1.getName() + " ";
		per1.setAddress("대구광역시");
		str += per1.getAddress();
		System.out.println(str);
		
		Person per2 = new Person("010203-1", "김예담", "대구 중앙로");
		String str2 = "";
		str2 += per2.getSsn() + " ";
		str2 += per2.getName() + " ";
		str2 += per2.getAddress();
		System.out.println(str2);
	}

}
