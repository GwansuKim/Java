package com.yedam.reference;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 이차원 배열 => 데이터 입력 => 하나씩 로딩
		int[][] intAry = { {1, 2}, {1, 2, 3} };
		
		int[][] mathScore = new int[2][3];
		for (int i = 0; i < mathScore.length; i++) {
			System.out.println(mathScore.length);
			for(int j = 0; j < mathScore[i].length; j++) {
				System.out.println("mathScore["+i+"]["+j+"] : "+mathScore[i][j]);
			}
		}
		
		//이차원 배열에 구구단 결과값 저장
		//[[2단],[3단]...]
		//8개 -> 9 개의 데이터를 담을 수 있는 배열
		int[][] gugu = new int[8][9];
		for(int i = 0; i < gugu.length; i++) {
			for(int j =0; j < gugu[i].length; j++) {
				gugu[i][j] = (i+2)*(j+1);
			}
		}
		for(int i = 0; i < gugu.length; i++) {
			System.out.print(i+2+"단");
			//toString()선택된 배열의 정보를 출력하는 메소드
			System.out.println(Arrays.toString(gugu[i]));
		}
		
		//참조 타입 배열
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		//주소값 비교
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		//데이터 비교
		System.out.println(strArray[0].equals(strArray[2]));
		
		//배열복사
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i]=oldArray[i];
		}
		for(int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		int[] oldArray2 = {1, 2, 3, 4, 5, 6, 7};
		int[] newArray2 = new int[10];
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		System.out.println(Arrays.toString(newArray2));
		for( int temp : newArray2) {
			System.out.print(temp +"\t");
		}
	}

}
