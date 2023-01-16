package homework;

public class Employee {
	//필드
	private String name;
	private int salary;
	
	//생성자
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void getInformation() {
		System.out.println("이름 : "+name+" 연봉 : "+salary);
	}
	
	public void print() {
		System.out.println("슈퍼클래스");
	}
}
