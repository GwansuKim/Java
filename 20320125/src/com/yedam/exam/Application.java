package com.yedam.exam;

public class Application {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		
		int male = 0;
		int female = 0;
		for(String temp : arr) {
			if(temp.split("-")[1].equals("1") || temp.split("-")[1].equals("3")) {
				male++;
			} else {
				female++;
			}
		}
		System.out.printf("남 %d 여 %d\n", male, female);
	}

}
