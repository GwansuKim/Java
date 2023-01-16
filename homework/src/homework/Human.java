package homework;

public class Human {
	// 필드
	protected String name;
	protected double height;
	protected double weight;

	// 생성자
	public Human(String name, double height, double weight) {
		this.name =name;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public void getInformation() {
		System.out.println( name + "님의 신장 " + height + " 뭄무게 " + weight);
	}
}
