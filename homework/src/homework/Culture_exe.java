package homework;

public class Culture_exe {

	public static void main(String[] args) {
		Culture cul;
		cul = new Movie("추격자", 7, 5, "");
		cul.setTotalScore(4);
		cul.setTotalScore(3);
		cul.setTotalScore(5);
		cul.getInformation();
		
		System.out.println("=================================");
		cul = new Performance("지킬앤하이드", 9, 10, "");
		cul.setTotalScore(5);
		cul.setTotalScore(4);
		cul.setTotalScore(6);
		cul.setTotalScore(4);
		cul.setTotalScore(7);
		cul.setTotalScore(4);
		cul.setTotalScore(6);
		cul.setTotalScore(4);
		cul.setTotalScore(6);
		cul.getInformation();
	}

}
