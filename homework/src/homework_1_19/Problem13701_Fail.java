package homework_1_19;

import java.util.Scanner;

public class Problem13701_Fail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		String[] arr = num.split(" ");
		String result = "";
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j <= i; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count == 1) {
				result += arr[i] + " ";
			}
		}
		System.out.println(result);
	}
}
