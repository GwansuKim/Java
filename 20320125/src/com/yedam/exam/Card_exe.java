package com.yedam.exam;

public class Card_exe {

	public static void main(String[] args) {
		Card card;
		System.out.println("2-1번");
		card = new Card("5432-4567-9534-3657", 20251203, 253);
		card.showCardInfo();
		System.out.println();
		
		System.out.println("2-2번");
		card = new TossCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		card.showCardInfo();
		System.out.println();
		
		System.out.println("2-3번");
		card = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		card.showCardInfo();
		System.out.println();
	}

}
