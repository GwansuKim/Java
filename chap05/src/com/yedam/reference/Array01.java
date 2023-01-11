package com.yedam.reference;

public class Array01 {

	public static void main(String[] args) {
		// 값 목록을 활용해서 매열 만들기
		// 총 6개의 데이터를 담을 수 있는 배열 생성,
		// 6개의 데이터를 입력
		int[] intAry = { 1, 2, 3, 4, 5, 6 };
		// 6개의 데이터를 담을 수 있는 공간을 확보
		int[] intAry2 = new int[6];
		intAry2[0] = 1;

		// String 데이터를 10개 넣을 수 있는 배열 생성
		String[] strAry = new String[10];
		System.out.println("intAry의 첫번째 값 : " + intAry[0]);
		System.out.println("intAry의 마지막 값 : " + intAry[5]);

		// for(int i = 0; i<=10; i++)
		// i = 0~10 => 배열의 인덱스
		// 배열의 데이터 총 합
		int sum = 0;
		int[] score = { 83, 90, 87 };
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println("총 합계 : " + sum);

		// new 연산자 활용한 배열 생성
		// int 초기값 0
		// double 초기값 0.0
		int[] point;
		point = new int[] { 83, 90, 87 };
		sum = 0;
		for (int i = 0; i < point.length; i++) {
			System.out.println(point[i]);
			sum += point[i];
		}
		System.out.println("총 합계 : " + sum);

		// new 연산자를 활용해서 배열, 비어있는 배열 만들기
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		
		//String 배열
		String[] arr3 = new String[3];
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		arr3[0] = "3월";
		arr3[1] = "11월";
		arr3[2] = "12월";
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
	}
}
