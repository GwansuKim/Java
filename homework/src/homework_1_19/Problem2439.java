package homework_1_19;

import java.util.Scanner;

public class Problem2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		for (int i = num; i > 0; i--) {
			for (int j = 1; j <= num; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
