package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	Scanner sc = new Scanner(System.in);

	// 필드
	private Product[] pro = null;
	private int proNum = 0;

	// 생성자
	public ProductProgram() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int selectNo = menuSelect();
			if (selectNo == 1) {
				// 상품 수 입력
				inputProductNum();
			} else if (selectNo == 2) {
				// 상품 및 가격 입력
				inputProductInfo();
			} else if (selectNo == 3) {
				// 제품별 가격
				productInfoPrint();
			} else if (selectNo == 4) {
				// 분석
				productAnalysis();
			} else if (selectNo == 5) {
				// 프로그램 종료
				exit();
				break;
			} else {
				// 잘못된 메뉴를 선택한 경우 안내메세지 출력
				printErrorMessage();
			}
		}
	}

	// 메소드
	private void menuPrint() {
		System.out.println("==============================================");
		System.out.println("1.상품 수|2.상품 및 가격입력|3.제품별 가격|4.분석|5.종료");
		System.out.println("==============================================");
	}

	private int menuSelect() {
		return Integer.parseInt(sc.nextLine());
	}

	private void inputProductNum() {
		System.out.print("상품 수> ");
		proNum = Integer.parseInt(sc.nextLine());
	}

	private void inputProductInfo() {
		pro = new Product[proNum];
		for (int i = 0; i < pro.length; i++) {
			System.out.print("상품 입력> ");
			String proName = sc.nextLine();
			System.out.print("가격 입력> ");
			int proPrice = Integer.parseInt(sc.nextLine());
			pro[i] = new Product(proName, proPrice);
		}
	}

	private void productInfoPrint() {
		for (Product temp : pro) {
			System.out.printf("%s : %d\n", temp.getProName(), temp.getProPrice());
		}
	}

	private void productAnalysis() {
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < pro.length; i++) {
			if (max < pro[i].getProPrice()) {
				max = pro[i].getProPrice();
				maxIndex = i;
			}
		}
		System.out.println("최고가 상품 : " + pro[maxIndex].getProName() + ", 상품가 : " + pro[maxIndex].getProPrice());
		int other = 0;
		for (Product temp : pro) {
			if (temp.getProPrice() != max) {
				other += temp.getProPrice();
			}
			/*
			 * if(temp.getProPrice() == max) continue;
			 * other += temp.getProPrice();
			 */
		}
		System.out.println("이외 상품 총합 : " + other);
	}

	private void exit() {
		System.out.println("프로그램을 종료합니다");
	}

	private void printErrorMessage() {
		System.out.println("메뉴를 잘못 선택하셨습니다");
	}

}
