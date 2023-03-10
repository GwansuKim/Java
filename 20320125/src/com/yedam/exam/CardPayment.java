package com.yedam.exam;

public class CardPayment implements Payment{
	private double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		int result = (int) (price - (price * (ONLINE_PAYMENT_RATIO + cardRatio)));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = (int) (price - (price * (OFFLINE_PAYMENT_RATIO + cardRatio)));
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		double ratio = ONLINE_PAYMENT_RATIO + cardRatio;
		System.out.println("온라인 결제시 총 할인율 : " + ratio);
		ratio = OFFLINE_PAYMENT_RATIO + cardRatio;
		System.out.println("오프라인 결제시 총 할인율 : " + ratio);
	}
	
	
}
