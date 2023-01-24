package homework_1_19;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		for( char i = 97; i < 123; i++ ) {
			int result = str.indexOf(String.valueOf(i));
			System.out.print(result + " ");
		}
	}

}
