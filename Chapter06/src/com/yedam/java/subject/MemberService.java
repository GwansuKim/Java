package com.yedam.java.subject;

public class MemberService {
	// 문제출처, 책 268페이지 3번

	// login 메소드
	// 매개값으로 id(String), password(String)
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	// logout 메소드
	// 매개값으로 id(String)
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

	// 1)login() 메소드는 매개값 id가 "hong", 매개값 password "12345" 일 경우에만 true를 리턴하고 그 의외의
	// 경우엔 false를 리턴하도록 하세요.
	// 2)logout() 메소드의 내용은 "로그아웃 되었습니다." 출력하도록 하세요.

}
