package com.yedam.java.ch03;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(message);
	}
	
	// Worker 이상만 가능
	public static void registerCourse2(Applicant<? super Worker> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함";
		System.out.println(message);
	}
	
	// Student 이하만 가능
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함";
		System.out.println(message);
	}
}
