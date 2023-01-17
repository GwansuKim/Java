package homework_1_17;

import java.util.Scanner;

public class RandomGame_exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 2);
		// 0 = RPG / 1 = Arcade

		Keypad game = null;

		if (random == 0) {
			game = new RPGgame();
		} else {
			game = new ArcadeGame();
		}

		while (true) {
			System.out.println("==============================================================================");
			System.out.println("<<1.LeftUP|2.Leftdown|3.Rightup|4.RightDown|5.ModeChange|0.GameChange|9.EXIT>>");
			System.out.println("==============================================================================");
			System.out.print("choice>>");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				game.leftUpButton();
			} else if (selectNo == 2) {
				game.leftDownButton();
			} else if (selectNo == 3) {
				game.rightUpButton();
			} else if (selectNo == 4) {
				game.rightDownButton();
			} else if (selectNo == 5) {
				game.changeMode();
			} else if (selectNo == 0) {
				if (random == 0) {
					game = new ArcadeGame();
					random = 1;
				} else {
					game = new RPGgame();
					random = 0;
				}
			} else if (selectNo == 9) {
				System.out.println("Game Over");
				break;
			} else {
				System.out.println("올바른 번호를 입력해 주세요");
			}
		}
	}

}
