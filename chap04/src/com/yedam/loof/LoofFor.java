package com.yedam.loof;

import java.util.Scanner;

public class LoofFor {

	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		//1부터 100까지의 합 구하기
		int result = 0;
		for(int i = 0; i <= 100; i++) {
			result += i;
		}
		System.out.println("1~100까지의 합" + result);
		
		//1~100사이의 짝수 구하기
		//짝수 성질 => x%2 == 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i+"는 짝수");
			} else if(i%2 == 1) {
				System.out.println(i+"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너 활용해서 값을 하나 입력
		//입력 받은 값에 대한 구구단 출력
		//2를 입력 -> 2*1 = 2... 2*9=18
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		int num = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최댓값, 최솟값
		//스캐너 => 데이터 입력
		//데이터 받을 갯수
		//총합 : 값을 입력 받을 때마다 변수에 저장
		//평균 : 총합 / 갯수
		//최댓(최솟)값 : 입력 받을 때마다 최댓(최솟)값인지 확인
		System.out.println("갯수 입력>");
		int length = Integer.parseInt(sc.nextLine());
		int total = 0;
		double aver = 0;
		int max = 0;
		int min = 0;
		for(int i = 1; i<=length; i++) {
			System.out.println("데이터 입력>");
			int num1 = Integer.parseInt(sc.nextLine());
			total += num1;
			aver = (double)total/(double)i;
			if(i == 1) {
				max = num1;
			} else if(num1 > max) {
				max = num1;
			}
			if(i == 1) {
				min = num1;
			} else if(num1 < min) {
				min = num1;
			}
		}
		System.out.println("총합: "+total+" 평균: "+aver+" 최댓값: "+max+" 최솟값: "+min);
		
		//up and down
		//임의의 랜덤값(1~100) 추출해 5번의 기회안에 해당 값 맞추기
		int cor = (int)(Math.random()*100)+1;
		for(int i = 0; i < 5; i++) {
			System.out.println("입력>");
			int input = Integer.parseInt(sc.nextLine());
			if(input == cor) {
				System.out.println("정답입니다!");
				break;
			} else if(input > cor) {
				System.out.println("down");
			} else if(input < cor) {
				System.out.println("up");
			}
			if(input != cor) {
				if(i == 4) {
					System.out.println("실패하였습니다~");
				}
			}
		}
	}
	
}
