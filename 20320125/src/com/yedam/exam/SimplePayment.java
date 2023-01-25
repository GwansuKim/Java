package com.yedam.exam;

public class SimplePayment implements Payment {
	private double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		int result = (int) (price - (price * (ONLINE_PAYMENT_RATIO + simplePaymentRatio)));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = (int) (price - (price * (OFFLINE_PAYMENT_RATIO + simplePaymentRatio)));
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		double ratio = ONLINE_PAYMENT_RATIO + simplePaymentRatio;
		System.out.println("온라인 결제시 총 할인율 : " + ratio);
		ratio = OFFLINE_PAYMENT_RATIO + simplePaymentRatio;
		System.out.println("오프라인 결제시 총 할인율 : " + ratio);

	}

}
