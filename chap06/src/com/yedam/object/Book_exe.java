package com.yedam.object;

public class Book_exe {

	public static void main(String[] args) {
		// 책의 종류, 가격, 출판사, 도서번호의 정보
		// 정보는 원하는 방식 아무거나 활용해서 정보 입력
		// getInfo 메소드 객체가 가진 정보 출력
//		getInfo의 출력예시
//		혼자 공부하는 자바
//		#내용
//		1) 종류 : 학습서
//		2) 가격 : 24000원
//		3) 출판사 : 한빛미디어
//		4) 도서번호 : yedam-001
		Book book1 = new Book("혼자 공부하는 자바","학습서", 25000, "한빛미디어", "yedam-001");
		book1.getInfo();
//		다른 예시
//		이것이 리눅스다
//		#내용
//		1) 종류 : 학습서
//		2) 가격 : 32000원
//		3) 출판사 : 한빛미디어
//		4) 도서번호 : yedam-002
		Book book2 = new Book("이것이 리눅스다", "학습서", 32000, "한빛미디어", "yedam-002");
		book2.getInfo();
		Book book3 = new Book(20000);
		book3.getInfo();
	}

}
