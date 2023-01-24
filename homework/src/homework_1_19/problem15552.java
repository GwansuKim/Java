package homework_1_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem15552 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int test = Integer.parseInt(bf.readLine());
			for (int i = 0; i < test; i++) {
				int sum = 0;
				String[] num = bf.readLine().split(" ");
				for (int j = 0; j < num.length; j++) {
					sum += Integer.parseInt(num[j]);
				}
				bw.write(sum + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
