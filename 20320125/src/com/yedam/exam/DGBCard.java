package com.yedam.exam;

public class DGBCard extends Card{
	private String company = "대구은행";
	private String cardStaff;
	
	public DGBCard(String CardNo, int validDate, int cvc, String cardStaff) {
		super(CardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.printf("카드정보 (Card No : %s, 유효기간 : %d, CVC : %d )\n", getCardNo(), getValidDate(), getCvc());
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
	
	
}
