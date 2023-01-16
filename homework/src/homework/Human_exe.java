package homework;

public class Human_exe {

	public static void main(String[] args) {
		Human human;
		human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInformation();
		human = new ObesityInfo("박둘이", 168, 90);
		human.getInformation();
	}

}
