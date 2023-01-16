package homework;

public class StandardWeightInfo extends Human {
	// 필드
	protected double standardWeight = getStandardWeight();

	// 생성자
	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	// 메소드
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 표준체중 %4.1f 입니다.\n", name, height, weight, standardWeight);
	}

	public double getStandardWeight() {
		double standardWeight = ((height - 100) * 0.9);
		return standardWeight;
	}
}
