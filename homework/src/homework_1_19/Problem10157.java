package homework_1_19;

import java.util.Scanner;

public class Problem10157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		int K = Integer.parseInt(sc.nextLine());
		int C = Integer.parseInt(str[0]);
		int R = Integer.parseInt(str[1]);
		int a = 1;
		int b = 0;
		int minus = 0;
		int[] result = new int[C + R - 1];
		String res = "";

		Outter: for (int i = 0; i <= C + R - 2; i++) {
			if (i == 0) {
				result[i] = R;
			}
			if (i % 2 == 0 && i > 0) {
				result[i] = result[i - 1] + R - minus;
			} else if (i % 2 == 1) {
				minus++;
				result[i] = result[i - 1] + C - minus;
			}
			if (i > 0) {
				for (int j = result[i - 1]+1; j <= result[i]; j++) {
					switch (i % 4) {
					case 0:
						b++;
						break;
					case 1:
						a++;
						break;
					case 2:
						b--;
						break;
					case 3:
						a--;
						break;
					}
					if (j == K) {
						res = a + " " + b;
						break Outter;
					}
				}
			} else {
				for (int j = 1; j <= result[0]; j++) {
					b++;
					if (j == K) {
						res = "1 " + b;
						break Outter;
					}
				}
			}
		}
		if (K >= 0 && K <= C * R) {
			System.out.println(res);
		} else {
			System.out.println("0");
		}
	}
}
