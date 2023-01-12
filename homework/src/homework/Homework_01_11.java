package homework;

import java.util.Scanner;

public class Homework_01_11 {

	public static void main(String[] args) {

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc = new Scanner(System.in);

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println(i);
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 3) {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println();

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		int input;
		System.out.println("변경하고 싶은 인덱스를 입력해 주세요");
		input = Integer.parseInt(sc.nextLine());
		int change;
		for (int i = 0; i < arr1.length; i++) {
			if (input == i) {
				System.out.println("변경할 값을 입력해 주세요");
				change = Integer.parseInt(sc.nextLine());
				arr1[i] = change;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 최소값과 최소값의 위치값(인덱스)을 구해보자.
		int max = arr1[0];
		int min = arr1[0];
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
				maxIndex = i;
			}
			if (min > arr1[i]) {
				min = arr1[i];
				minIndex = i;
			}
		}
		System.out.println("최댓값과 인덱스 : " + max + ", " + maxIndex + " 최솟값과 인덱스 : " + min + ", " + minIndex);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr2 = new int[10];
		int input1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("0~999 입력>");
			input1 = Integer.parseInt(sc.nextLine());
			arr2[i] = input1;
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 3 == 0 && arr2[i] != 0) {
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println();

		// [추가 문제]

		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
		// 출력 예시) ***
		// **
		// **
		// ****
	}
}
