package com.yedam.java.ch03;

public class MainExample {

	public static void main(String[] args) {
		// Course1
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// Course2
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		//Course.registerCourse2(new Applicant<Student>(new Student()));
		
		// Course3
		//Course.registerCourse3(new Applicant<Person>(new Person()));
		//Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
