package homework_1_19;

import java.util.Scanner;

public class Problem1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int day;
		String[] date = sc.nextLine().split(" ");
		int sum = 0;
		for( int i = 0; i < Integer.parseInt(date[0]); i++ ) {
			sum += month[i];
		}
		switch((sum+Integer.parseInt(date[1]))%7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
		
	}

}
