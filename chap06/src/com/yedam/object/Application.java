package com.yedam.object;

public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		// Student가 class, s1이 instance
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s2);

		// dot 연산자( . )
		s1.age = 20;
		s1.name = "예담";
		s1.schoolName = "예담대학교";
		s1.getInfo();

		s2.age = 30;
		s2.name = "대예담";
		s2.schoolName = "예담대학원";
		s2.getInfo();

		Student s3 = new Student();
		s3.getInfo();
		s3.age = 20;
		s3.name = "대학생";
		System.out.println("학생의 나이 : " + s3.age);
		System.out.println("학생의 이름 : " + s3.name);
		System.out.println("재학중 학교 : " + s3.schoolName);
		
		Korean k1 = new Korean("김또치", "123456-1234567");
		System.out.println("k1이 가지고 있는 필드값>");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
	}

}
