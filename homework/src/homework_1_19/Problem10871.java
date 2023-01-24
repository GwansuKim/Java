package homework_1_19;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arrInfo = sc.nextLine();
		int spaceIndex = arrInfo.indexOf(" ");
		int length = Integer.parseInt(arrInfo.substring(0, spaceIndex));
		int x = Integer.parseInt(arrInfo.substring(spaceIndex+1, arrInfo.length()));
		String arrInt = sc.nextLine();
		String[] arr = new String[length];
		arr = arrInt.split(" ");
		for( int i = 0; i < arr.length; i++) {
			if( Integer.parseInt(arr[i]) < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
