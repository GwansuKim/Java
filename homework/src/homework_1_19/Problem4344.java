package homework_1_19;

import java.util.Scanner;

public class Problem4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = Integer.parseInt(sc.nextLine());
		double[] result = new double[testCase];
		String results = "";
		for (int i = 0; i < testCase; i++) {
			int sum = 0;
			double avr = 0;
			int count = 0;
			String[] stu = sc.nextLine().split(" ");
			for (int j = 1; j < stu.length; j++) {
				sum += Integer.parseInt(stu[j]);
			}
			avr = sum / (stu.length - 1);
			for (int j = 1; j < stu.length; j++) {
				if (Integer.parseInt(stu[j]) > avr) {
					count++;
				}
			}
			result[i] = (double) count / (stu.length - 1);
			results += String.format("%.3f", result[i]*100) + "%\n";
		}
		System.out.println(results);
	}

}
