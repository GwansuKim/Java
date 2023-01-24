package homework_1_19;

import java.util.Scanner;

public class Problem2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		int minute;
		String time = sc.nextLine();
		int spaceIndex = time.indexOf(" ");
		int timeLength = time.length();
		hour = Integer.parseInt(time.substring(0, spaceIndex));
		minute = Integer.parseInt(time.substring(spaceIndex + 1, timeLength));
		int bake = Integer.parseInt(sc.nextLine());

		if (minute + bake >= 60) {
			hour += (minute + bake) / 60;
			minute = (minute + bake) % 60;
		} else {
			minute += bake;
		}
		if (hour >= 24) {
			hour -= 24;
		}
		System.out.println(hour + " " + minute);

	}

}
