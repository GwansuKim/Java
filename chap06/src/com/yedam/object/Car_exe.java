package com.yedam.object;

public class Car_exe {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);

		Calculator ca = new Calculator();
		double result = ca.sub(1, 1);
		System.out.println(result);

		ca.powerOn();
		ca.powerOff();

		int sumResult = ca.sum2(1, 2, 3, 4, 5, 6, 7, 98);
		System.out.println("총 합 : " + sumResult);
		sumResult = ca.sum2(1, 2, 3, 4, 5);
		System.out.println("총 합 : " + sumResult);

		Score sc = new Score(50, 30, 70);
		sc.getInfo();
	}

}
