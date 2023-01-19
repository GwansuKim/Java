package com.yedam.java.ch06_util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(date);
		System.out.println(strNow);
	}

}
