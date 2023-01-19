package com.yedam.java.ch04_wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		//박싱
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		//Integer obj3 = new Integer(1000);
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		//자동 박싱
		Integer newObj1 = value1;
		Integer newObj2 = value2;
		
		//자동 언박싱
		int newValue1 = newObj1;
		int newValue2 = newObj1 + newObj2;
		
		System.out.println(newValue1);
		System.out.println(newValue2);
		
		//Wrapper 클래스 값 비교
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println(data1 == data2);
		System.out.println(data1.intValue() == data2.intValue());
		System.out.println(data1.equals(data2));
		
		//예외사항
		System.out.println();
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println(data3 == data4);
		System.out.println(data3.intValue() == data4.intValue());
		System.out.println(data3.equals(data4));
	}

}
