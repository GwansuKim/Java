package homework_1_19;

import java.util.Scanner;

public class Problem10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String[] arr = new String[num];
		arr = sc.nextLine().split(" ");
		
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		for( int i = 0; i < arr.length; i++) {
			if( Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			}
			if( Integer.parseInt(arr[i]) < min) {
				min = Integer.parseInt(arr[i]);
			}
		}
		System.out.println(min + " " + max);
	}
}
