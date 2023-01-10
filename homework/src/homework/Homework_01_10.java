package homework;

import java.util.Scanner;

public class Homework_01_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		System.out.println("x를 입력해 주세요");
		int x = Integer.parseInt(scanner.nextLine());
		System.out.println("y를 입력해 주세요");
		int y = Integer.parseInt(scanner.nextLine());
		if(x>0 && y>0) {
			System.out.println("1사분면");
		} else if(x<0 && y>0) {
			System.out.println("2사분면");
		} else if(x<0 && y<0) {
			System.out.println("3사분면");
		} else if(x>0 && y<0) {
			System.out.println("4사분면");
		}

		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		System.out.println("년도를 입력해 주세요>");
		int year = Integer.parseInt(scanner.nextLine());
		if(year%4 == 0) {
			if(year%100 != 0 || year%400 == 0) {
				System.out.println("윤년입니다");
			} else {
				System.out.println("평년입니다");
			}
		} else {
			System.out.println("평년입니다");
		}
		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		System.out.println("가위, 바위, 보 중 하나를 선택해주세요>");
		String str = scanner.nextLine();
		switch(str) {
		case "가위":
			System.out.println("이기기 위해선 바위를 내야합니다.");
			break;
		
		case "바위":
			System.out.println("이기기 위해선 보를 내야합니다.");
			break;
		
		case "보":
			System.out.println("이기기 위해선 가위를 내야합니다.");
			break;
		}

		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// hint) 중첩 for문과 if문(띄어쓰기용도) 활용
		//     *
		//    **
		//   ***
		//  ****
		// *****
		System.out.println("입력>");
		int input = Integer.parseInt(scanner.nextLine());
		for(int i = input; i > 0; i--) {
			for(int j = 1; j <= input; j++) {
				if(j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.println("m을 입력해주세요");
		int m = Integer.parseInt(scanner.nextLine());
		System.out.println("n을 입력해주세요");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 1; i <= n; i++) {
			System.out.println(m+" X "+i+" = "+(m*i));
		}
		
//		구구단 출력
//	 	첨부파일 확인 후 해당 그림과 같이 구현해 볼 것.
//		파일명 : gugu.png
//		※ 일정한 규칙을 찾은 뒤 반복문의 조건을 규칙에 맞추어서 풀어 본다.
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <=9; j++) {
				System.out.print(j+" x "+i+" = "+(i*j) + "  ");
			}
			System.out.println();
		}

	}

}
