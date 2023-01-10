package com.yedam.variable;

public class Variable04 {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//이스케이프문자(console 출력 할 때)
		// \t : tab만큼 벌려라
		// \n : enter
		// \r : 맨 앞줄로 이동
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수
		//float, double
		float var1 = 3.14f;
		double var2 = 3.14;
		float var3 = 0.123456789f;
		double var4 = 0.123456789023;
		System.out.println(var3);
		System.out.println(var4);
		
		double var5 = 3e6;
		float var6 = 3e6f;
		System.out.println(var5);
		System.out.println(var6);
		
		//논리 타입(boolean)
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다");		
		} else {
			System.out.println("시작합니다");
		}
	}
}
