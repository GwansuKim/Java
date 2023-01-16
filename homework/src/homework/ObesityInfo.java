package homework;

public class ObesityInfo extends StandardWeightInfo {
	// 필드
	private double obesity = getObesity();

	// 생성자
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	// 메소드
	@Override
	public void getInformation() {
		if (obesity > 40) {
			System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 비만입니다.\n", name, height, weight);
		} else if(obesity>20) {
			System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 과체중입니다.\n", name, height, weight);
		} else if(obesity>0) {
			System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 표준체중입니다.\n", name, height, weight);
		} else {
			System.out.printf("%s님의 신장 %3.0f, 몸무게 %2.0f, 저체중입니다.\n", name, height, weight);
		}
	}

	public double getObesity() {
		double obesity = (weight - standardWeight) / standardWeight * 100;
		return obesity;
	}
}
