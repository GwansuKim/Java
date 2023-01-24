package homework_1_19;

import java.util.Scanner;

public class Problem2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = Integer.parseInt(sc.nextLine());
		for( int j = 1; j < 10; j++ ) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
	}

}