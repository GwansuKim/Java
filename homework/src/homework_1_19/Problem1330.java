package homework_1_19;

import java.util.Scanner;

public class Problem1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] num = new String[2];
		num = sc.nextLine().split(" ");
		if( Integer.parseInt(num[0]) < Integer.parseInt(num[1]) ) {
			System.out.println("<");
		} else if ( Integer.parseInt(num[0]) > Integer.parseInt(num[1]) ) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
	}

}
