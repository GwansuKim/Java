package com.yedam.game;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LogIn user = new LogIn();
		Outter:while(true) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.로그인||2.회원가입||3.종료");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch(selectNo){
				case 1:
					System.out.print("ID>");
					String id = sc.nextLine();
					System.out.print("비밀번호>");
					String password = sc.nextLine();
					user.logIn(id);
					break;
				case 2:
					User sign = new User();
					System.out.print("ID>");
					String newId = sc.nextLine();
					System.out.print("패스워드>");
					String newPw = sc.nextLine();
					sign.setUserId(newId);
					sign.setPassword(newPw);
					user.signUp(sign);
					break;
				case 3:
					break Outter;
				default:
					System.out.println("올바른 메뉴를 입력해주세요");
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
