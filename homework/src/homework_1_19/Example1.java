package homework_1_19;

import java.util.Calendar;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1번
		String[] a = sc.nextLine().split("");
		String newStr = "";
		for (int i = a.length - 1; i >= 0; i--) {
			newStr += a[i];
		}
		System.out.println(newStr);
		
		/*
		for (int i = a.length - 1; i >=0; i--) {
			System.out.println(a.charAt(i));
		}
		*/

		// 2번
		String b = sc.nextLine();
		String newStr1 = "";
		for (int i = 0; i < b.length(); i++) {
			if (i == 0) {
				newStr1 = b.split("")[0];
			} else if (b.indexOf(b.split("")[i]) == i) {
				newStr1 += b.split("")[i];
			}
		}
		int[] count = new int[newStr1.split("").length];
		for (int i = 0; i < newStr1.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (newStr1.split("")[i].equals(b.split("")[j])) {
					count[i]++;
				}
			}
		}
		for (int i = 0; i < newStr1.length(); i++) {
			System.out.print(newStr1.split("")[i] + ":" + count[i] + "개 ");
		}
		System.out.println();

		// 3번
		String c = sc.nextLine();
		int bir = Integer.parseInt(c.substring(0, 2));
		//int currentYear = 23;
		int currentYear = 23;
		if(currentYear - bir + 1 <= 0) {
			currentYear += 100;
		}
		System.out.println(currentYear - bir + 1 + "살");
	}
}
