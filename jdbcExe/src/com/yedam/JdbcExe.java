package com.yedam;

import java.sql.*;

public class JdbcExe {

	public static void main(String[] args) {
		// jdbc 오라클 데이터 CRUD작업
		// 1. ojdbc.jar라이브러리
		// 2. Connection 객체 -> db연결 쿼리실행하고 결과를 받아오는 통로
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		
		// jdbc driver 정상 체크
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)"
				+ "values(300, 'IT_PROG', '홍', 'hong', sysdate)";
		//sql = "delete from employees where employee_id = 300"; // 삭제
		sql = "update employees set first_name = '길동' where employee_id = 300";
		try {
			conn = DriverManager.getConnection(url, user, pass); // 요청 url 유저명 패스워드
			System.out.println("연결 성공");
			
			stmt = conn.createStatement(); // 쿼리실행, 처리결과 객체
			
			int r = stmt.executeUpdate(sql); // insert, update, delete
			
			rs = stmt.executeQuery("select * from employees order by employee_id"); // 조회
			
			while(rs.next()) {
				System.out.println("사원번호: " + rs.getInt("employee_id") + 
						", 이름: " + rs.getString("first_name") + 
						", 이메일: " + rs.getString("email") +
						", 급여: " + rs.getInt("salary"));
			}
			System.out.println("end of records");
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
	}
}
