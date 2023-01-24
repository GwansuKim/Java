package homework_1_19;

import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] time = sc.nextLine().split(" ");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		
		if( minute - 45 < 0 ) {
			hour -= 1;
			minute += 15;
		} else {
			minute -= 45;
		}
		
		if( hour < 0 ) {
			hour = 23;
		}
		System.out.println(hour + " " + minute);
	}

}
