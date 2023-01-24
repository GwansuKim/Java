package homework_1_19;

import java.util.Scanner;

public class Problem1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		String[] str = null;
		int count = 0;
		String newStr = "";
		Outter:for (int i = 0; i < num; i++) {
			str = sc.nextLine().split("");
			newStr = str[0];
			for(int j = 1; j < str.length; j++) {
				if(!(str[j].equals(str[j-1]))) {
					newStr += str[j];
				}
			}
			String[] arr = newStr.split("");
			for(int j = 0; j < arr.length; j++) {
				if(newStr.indexOf(arr[j]) != j) {
					continue Outter;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
