package homework_1_19;

import java.util.Scanner;

public class Problem11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		String[] number = sc.nextLine().split("");
		int sum = 0;
		for( int i = 0; i < count; i++ ) {
			sum += Integer.parseInt(number[i]);
		}
		System.out.println(sum);
	}

}
