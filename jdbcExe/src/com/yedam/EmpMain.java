package com.yedam;

import java.util.*;

public class EmpMain {
	static Scanner sc = new Scanner(System.in);
	static EmpDAO dao = new EmpDAO();

	public static void main(String[] args) {

		Outter: while (true) {
			System.out.print("1.전체조회||2.단건조회||3.사원추가||4.급여변경||5.사원제명||6.종료\n입력>");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				list();
				break;
			case 2:
				oneSelect();
				break;
			case 3:
				add();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				break Outter;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public static void list() {
		// Map을 이용한 전체 조회
//		List<Map<String, Object>> result = dao.empList(); // 반환유형
//		for(Map<String, Object> map : result) {
//			System.out.println("사원번호: " + map.get("emp_id") // 
//			+ ", 이름: " + map.get("first_name") + "-" + map.get("last_name"));
//		}
//		System.out.println("end of program");
		// 클래스 활용 전체 조회
		List<EmpVO> result = dao.empVoList();
		for (EmpVO emp : result) {
			System.out.println(
					"사원번호: " + emp.getEmployeeId() + ", 이름: " + emp.getFirstName() + "-" + emp.getLastName());
		}
	}
	
	public static void oneSelect() {
		// 단건조회
		System.out.print("사원번호 입력\n입력>");
		int id = Integer.parseInt(sc.nextLine());
		Map<String, Object> map = null;
		if (dao.empSelect(id) == null) {
			System.out.println("조회된 정보 없음");
			return;
		} else {
			map = dao.empSelect(id).get(0);
		}
		System.out.println("사원번호: " + map.get("emp_id") // `
				+ ", 이름: " + map.get("first_name") + "-" + map.get("last_name"));
	}
	
	public static void add() {
		System.out.println("사원번호 입력>");
		int eid = Integer.parseInt(sc.nextLine());
		System.out.println("이름 입력>");
		String name = sc.nextLine();
		System.out.println("이메일 입력>");
		String email = sc.nextLine();
		System.out.println("입사일자 입력>");
		String hDate = sc.nextLine();
		System.out.println("직무 입력>");
		String job = sc.nextLine();
		EmpVO emp = new EmpVO(eid, name, email, hDate, job);
		
		dao.addEmp(emp);
	}
	
	public static void update() {
		System.out.println("사원번호 입력>");
		int eid1 = Integer.parseInt(sc.nextLine());
		System.out.println("변경할 금여 입력>");
		int esal = Integer.parseInt(sc.nextLine());
		
		if(dao.updateEmp(eid1, esal) > 0) {
			System.out.println("처리 완료");
		} else {
			System.out.println("처리중 오류 발생");
		}
		dao.updateEmp(eid1, esal);
	}
	
	public static void delete() {
		System.out.println("삭제할 사원 번호 입력>");
		int eid2 = Integer.parseInt(sc.nextLine());
		
		if(dao.deleteEmp(eid2) > 0) {
			System.out.println("처리 완료");
		} else {
			System.out.println("처리중 오류 발생");
		}
		dao.deleteEmp(eid2);
	}
}
