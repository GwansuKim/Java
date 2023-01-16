package com.yedam.common;

import java.util.Scanner;

import com.yedam.java.Product;

public class ProductProgram {
	
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		
		Product[] pro = null;
		int proNum = 0;
		Outter: while (true) {
			System.out.println("==============================================");
			System.out.println("1.상품 수|2.상품 및 가격입력|3.제품별 가격|4.분석|5.종료");
			System.out.println("==============================================");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo) {
			case 1:
				System.out.print("상품 수> ");
				proNum = Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
				pro = new Product[proNum];
				for (int i = 0; i < pro.length; i++) {
					System.out.print("상품 입력> ");
					String proName = sc.nextLine();
					System.out.print("가격 입력> ");
					int proPrice = Integer.parseInt(sc.nextLine());
					pro[i] = new Product(proName, proPrice);
				}
				break;
				
			case 3:
				for (Product temp : pro) {
					System.out.printf("%s : %d\n", temp.getProName(), temp.getProPrice());
				}
				break;
				
			case 4:
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
					 * if(temp.getProPrice() == max) continue; other += temp.getProPrice();
					 */
				}
				System.out.println("이외 상품 총합 : " + other);
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다");
				break Outter;
				
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다");
				break;
			}
		}
	}
}
