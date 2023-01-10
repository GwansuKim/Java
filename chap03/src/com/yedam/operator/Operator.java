package com.yedam.operator;

public class Operator {

	public static void main(String[] args) {
		//++num, num++
		int num = 0;
		System.out.println(num++);
		//num==1
		System.out.println(++num);
		System.out.println(num--);
		//num==1
		System.out.println(--num);
		
		//논리 부정 연산자 ! = not
		boolean play = true;
		System.out.println(play);
		play = !play;
		System.out.println(play);
		
		//비교 연산자 : true, false
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2;
		System.out.println(result1);
		boolean result2 = num1 !=num2;
		System.out.println(result2);
		boolean result3 = num1 <= num2;
		System.out.println(result3);
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1<char2;
		System.out.println(result4);
		
		for(int i = 1; i<100; i++) {
			//10의 자리가 3 6 9 라면 "짝 "
			if(i/10==3 || i/10==6 || i/10==9) {
				//1자리가 369가 아니라면 "짝 "
				if(i%10!=3 && i%10!=6 && i%10!=9) {
					System.out.print("짝 ");
				//1자리가 369라면 "짝짝 "
				} else {
					System.out.print("짝짝 ");
				}
			//10자리가 369가 아니고 1의 자리가 369가 아니라면 i+" "
			} else if(i%10!=3 && i%10!=6 && i%10!=9) {
				System.out.print(i + " ");
			//10의자리가 369라면 "짝 "
			} else {
				System.out.print("짝 ");
			}
		}
		
		//논리 연산자
		//&&, ||, !
		System.out.println();
		char charCode = 'A'; //65
		if(charCode>=65 && charCode <=90) {
			System.out.println("대문자입니다");
		} else if(charCode>=97 && charCode <= 122) {
			System.out.println("소문자입니다");
		}
		//'0'=48, '9'=57
		if(!(charCode<48) && !(charCode>57)) {
			//charCode>=48 && charCode<=57
			System.out.println("숫자입니다");
		}
		
		//복합 대입 연산자
		int result = 0;
		result += 10;		//result = result + 10;
		System.out.println(result);
		result -= 5;		//result = result - 5;
		System.out.println(result);
		
		//삼항 연산자
		int score = 80;
		char grade = score >= 80 ? 'B' : 'C';
		System.out.println(grade);
	}

}
