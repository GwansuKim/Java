package snakeTail;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.로그인||2.회원가입||3.종료");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch(selectNo){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
			}
		}
//		야구게임
//
//		메뉴
//		회원가입 로그인 종료
//		게임시작 정보조회(최단클리어, 최장길이, 플레이횟수) 로그아웃(=회원가입or로그인 페이지로 이동) 회원탈퇴
//
//		회원정보 테이블
//		ID : PK
//		password
//		최단클리어
//		최장길이
//		플레이횟수
	}

}
