package homework_1_19;

import java.util.Scanner;

public class Problem2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int[] ten = new int[10];
		
		int num = a * b * c;
		String[] number = String.valueOf(num).split("");
		for(int i = 0; i < number.length; i++) {
			ten[Integer.parseInt(number[i])]++;
		}
		for(int temp : ten) {
			System.out.println(temp);
		}
	}

}
