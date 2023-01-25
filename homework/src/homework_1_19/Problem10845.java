package homework_1_19;

import java.util.Scanner;

public class Problem10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] str = new String[N];
		String number = "";
		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
			switch (str[i].split(" ")[0]) {
			case "push":
				if (str[i].split(" ").length > 1) {
					number += str[i].split(" ")[1] + " ";
				}
				break;
			case "pop":
				if (number.length() >= 1) {
					System.out.println(number.split(" ")[0]);
					number = number.replace(number.split(" ")[0] + " ", "");
				} else {
					System.out.println(-1);
				}
				break;
			case "size":
				if (number.length() == 0) {
					System.out.println(0);
				} else {
					System.out.println(number.split(" ").length);
				}
				break;
			case "empty":
				if (number.length() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (number.length() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(number.split(" ")[0]);
				}
				break;
			case "back":
				if (number.length() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(number.split(" ")[number.split(" ").length - 1]);
				}
				break;
			}
		}
	}

}
