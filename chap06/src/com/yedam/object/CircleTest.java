package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		//객체 선언
		Circle cir = new Circle();
		//=Circle cir = new Circle(5); => 반지름 초기화 생성자를 포함
		//반지름 초기화
		cir.setR(5);
		//area 메소드 및 출력
		System.out.println(cir.area());
		
		//정적 필드도 객체 선언 필요x = 클래스파일 로딩시 메모리에 할당
		System.out.println(Circle.pi);
		//정적 메소드 => 객체 선언 필요x
		System.out.println(Circle.area(5));
	}

}
