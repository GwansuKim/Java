package com.yedam.problem;

import java.util.*;

public class Lotto_exe {

	public static void main(String[] args) {
		// 중복되지 않는 번호 6개
		// 입력한 금액에 따라 한 장 당 1~5줄 생성
		// 한 줄당 천원, 입력한 금액 만큼 생성
		// 구매 금액, 생성된 번호 출력 기능
		// 5장씩 끊어서 출력 할 것
		Scanner sc = new Scanner(System.in);

		List<Lotto> lot = new ArrayList<Lotto>();
		int price = 0;
		boolean selectName = true;
		String inputName = "";
		Outter: while (true) {
			if (selectName) {
				System.out.print("이름을 입력해 주세요\n입력>");
				inputName = sc.nextLine();
				selectName = false;
			}
			System.out.println("메뉴 선택\n1.로또 구매||2.로또 조회||3.사용자 변경||4.종료");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				// 로또 생성
				Lotto lotto = new Lotto();
				lotto.setName(inputName);
				int[] lottoNo = new int[6];
				int k = 0;
				while (lottoNo[5] == 0) {
					int count = 0;
					int random = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < lottoNo.length; j++) {
						if (random == lottoNo[j]) {
							count++;
						}
					}
					if(count == 0) {
						lottoNo[k] = random;
						k++;
					}
				}
				lotto.setLottoNo(lottoNo);
				lot.add(lotto);
				break;
			case 2:
				// 로또 조회(내가 투입한 금액과 출력 번호)
				int count = 0;

				System.out.println(inputName + "님");
				for (int i = 0; i < lot.size(); i++) {
					if (lot.get(i).getName().equals(inputName)) {
						for (int temp : lot.get(i).getLottoNo()) {
							System.out.print(temp + " ");
						}
						count++;
						System.out.println();
						if (count > 0 && count % 5 == 0) {
							System.out.println();
						}
					}
				}
				price = 1000 * (count);
				System.out.println("사용 금액 " + price);
				break;
			case 3:
				selectName = true;
				continue;
			case 4:
				System.out.println("프로그램 종료");
				break Outter;
			}
		}

	}
}
