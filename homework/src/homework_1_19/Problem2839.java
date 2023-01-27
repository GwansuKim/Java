package homework_1_19;

import java.util.Scanner;

public class Problem2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int weight = Integer.parseInt(sc.nextLine());

		int five = weight / 5;
		int temp = weight % 5;
		while (!(temp % 3 == 0)) {
			five--;
			temp += 5;
		}
		int three = temp / 3;

		if (five >= 0) {
			System.out.println(five + three);
		} else {
			System.out.println(-1);
		}
	}

}
