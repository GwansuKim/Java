package com.yedam.object;

import java.util.Calendar;

public class Calculator_exe {

	public static void main(String[] args) {
		CalculatorSingle calcSingle = CalculatorSingle.getInstance();
		CalculatorSingle calcSingle1 = CalculatorSingle.getInstance();
		System.out.println(calcSingle == calcSingle1);
		
		//Calendar 클래스도 싱글톤 클래스
		Calendar today = Calendar.getInstance();
		today.set(2023,2,1);
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
	}

}
