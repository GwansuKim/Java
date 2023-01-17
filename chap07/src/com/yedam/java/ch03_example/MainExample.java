package com.yedam.java.ch03_example;

public class MainExample {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		player.upgradeLevel(new Advanced());
		player.play(2);
		
		player.upgradeLevel(new Super());
		player.play(3);
	}
}
