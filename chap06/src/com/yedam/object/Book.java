package com.yedam.object;

public class Book {
	// 필드
	String title;
	String kinds;
	int price;
	String publisher;
	String isbn;

	// 생성자
	Book(String title, String kinds, int price, String publisher, String isbn) {
		this.title = title;
		this.kinds = kinds;
		this.price = price;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	// 메소드
	void getInfo() {
		System.out.println(title);
		System.out.println("#내용");
		System.out.println("1) 종류 : " + kinds);
		System.out.println("2) 가격 : " + price + "원");
		System.out.println("3) 출판사 : " + publisher);
		System.out.println("4) 도서번호 : " + isbn);
	}

}
