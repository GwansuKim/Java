package com.yedam.reference;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 한 명의 성적을 입력.
		// 과목 수
		int subjectNum = 0;
		int[] scores = null;

		while (true) {
			System.out.println("========================================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("========================================================================");
			System.out.println("메뉴 입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				System.out.println("과목 수를 입력해 주세요");
				subjectNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				scores = new int[subjectNum];
				int score;
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수를 입력해 주세요");
					score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print(scores[i] + " ");
				}
				System.out.println();
			} else if (selectNo == 4) {
				// 총합, 평균
				int sum = 0;
				double avg;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = (double) sum / subjectNum;
				System.out.println("총합 : " + sum + " 평균 : " + avg);
			} else if (selectNo == 5) {
				System.out.println("end of program");
				break;
			} else {
				System.out.println("오류 : 1~5를 입력해 주세요");
			}
		}
	}

}
