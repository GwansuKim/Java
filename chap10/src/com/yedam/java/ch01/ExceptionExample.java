package com.yedam.java.ch01;

public class ExceptionExample {

	public static void main(String[] args) {
//		// NullPointException
//		String data = null;
//		System.out.println(data.charAt(0));

		// ArrayIndexOutOfBoundsException
		if (args.length >= 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}

//		// NumberFormatException
//		String data3 = "100";
//		String data4 = "a200";
//		int value3 = Integer.parseInt(data3);
//		int value4 = Integer.parseInt(data4);
//		System.out.println(value3 + value4);

		// ClassCastException
		changeDog(new Dog());
		changeDog(new Cat());
	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
