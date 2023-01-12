package homework;

import java.util.Scanner;

public class Homework_01_12 {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
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
				System.out.println("상품 수>");
				proNum = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				pro = new Product[proNum];
				for (int i = 0; i < pro.length; i++) {
					System.out.println("상품 입력>");
					String proName = sc.nextLine();
					System.out.println("가격 입력>");
					int proPrice = Integer.parseInt(sc.nextLine());
					pro[i] = new Product(proName, proPrice);
				}
				break;
			case 3:
				for (int i = 0; i < pro.length; i++) {
					pro[i].getPrice();
				}
				break;
			case 4:
				int max = 0;
				int maxIndex = 0;
				int other = 0;
				for (int i = 0; i < pro.length; i++) {
					if (max < pro[i].price) {
						max = pro[i].price;
						maxIndex = i;
					}
				}
				System.out.println("최고가 상품 : " + pro[maxIndex].product + ", 상품가 : " + pro[maxIndex].price);
				for (int i = 0; i < pro.length; i++) {
					if (i != maxIndex) {
						other += pro[i].price;
					}
				}
				System.out.println("이외 상품 총합 : " + other);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				break Outter;
			}
		}
	}
}
