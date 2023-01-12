package com.yedam.list;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		// Week 타입의 today 변수 생성
		// today는 Week가 가지고 있는 데이터만 가질 수 있다
		// today 데이터 범위는 MONDAY~SUNDAY 7개
		Week today = null;

		// 오늘의 요일이 어떠한 요일인지
		Calendar cal = Calendar.getInstance();
		// 일요일 = 1, 월요일 = 2 ... 토요일 = 7
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일 : " + today);
	}

}
