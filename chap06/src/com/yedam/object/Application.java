package com.yedam.object;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 클래스 생성해서객체 만든 다음 객체 바로 사용
		// 객체를 한 곳에 모아서 관리하는 형태
		// 배열
		// int[] ary = new int[4];
		Student[] stdAry = null;
		int stdNum = 0;

		// while문을 활용해 학생 관리 프로그램 작성
		while (true) {
			System.out.println("====================================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("====================================");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				System.out.println("학생 수를 입력해주세요>");
				stdNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				stdAry = new Student[stdNum];
				for (int i = 0; i < stdAry.length; i++) {
					stdAry[i] = new Student();
					System.out.println("이름>");
					String stdName = sc.nextLine();
					stdAry[i].name = stdName;
					System.out.println("나이>");
					int stdAge = Integer.parseInt(sc.nextLine());
					stdAry[i].age = stdAge;
					System.out.println("재학중 학교>");
					String stdSchool = sc.nextLine();
					stdAry[i].schoolName = stdSchool;

					// 성적 입력
					System.out.println("국어 점수>");
					int stdKor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = stdKor;
					System.out.println("수학 점수>");
					int stdMath = Integer.parseInt(sc.nextLine());
					stdAry[i].math = stdMath;
					System.out.println("영어 점수>");
					int stdEng = Integer.parseInt(sc.nextLine());
					stdAry[i].eng = stdEng;
				}
			} else if (selectNo == 3) {
				for (Student std : stdAry) {
					std.getInfo();
				}
			} else if (selectNo == 4) {
				// 총합, 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합/평균 조회");
				for (int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].math + stdAry[i].eng;
					avg = total / 3.0;
					System.out.println(stdAry[i].name + "학생>");
					System.out.println("총합 : " + total + " 평균 : " + avg);
				}
				// 최고 성적 과목, 최저 성적 과목 확인
				for (int j = 0; j < stdAry.length; j++) {
					int max = stdAry[j].kor;
					int min = stdAry[j].kor;
					if (stdAry[j].eng < stdAry[j].math) {
						if (max < stdAry[j].math) {
							max = stdAry[j].math;
						}
						if (min > stdAry[j].eng) {
							min = stdAry[j].eng;
						}
					} else {
						if (max < stdAry[j].eng) {
							max = stdAry[j].eng;
						}
						if (min > stdAry[j].math) {
							min = stdAry[j].math;
						}
					}
					System.out.println(stdAry[j].name + "학생 최고 성적 : " + max + " 최저 성적 : " + min);
				}
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

//		Student s1 = new Student();
//		// Student가 class, s1이 instance
//		Student s2 = new Student();
//		System.out.println(s1);
//		System.out.println(s2);
//
//		// dot 연산자( . )
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//		s1.getInfo();
//
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		s2.getInfo();
//
//		Student s3 = new Student();
//		s3.getInfo();
//		s3.age = 20;
//		s3.name = "대학생";
//		System.out.println("학생의 나이 : " + s3.age);
//		System.out.println("학생의 이름 : " + s3.name);
//		System.out.println("재학중 학교 : " + s3.schoolName);
//		
//		Korean k1 = new Korean("김또치", "123456-1234567");
//		System.out.println("k1이 가지고 있는 필드값>");
//		System.out.println(k1.nation);
//		System.out.println(k1.ssn);
//		System.out.println(k1.name);
	}

}
