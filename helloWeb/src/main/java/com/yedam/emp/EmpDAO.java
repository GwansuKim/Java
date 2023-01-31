package com.yedam.emp;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	Connection conn;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "hr";
	String sql;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass); // 요청 url 유저명 패스워드
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}
// CURDr

	// 목록조회
	public List<Map<String, Object>> empList() {
		sql = "select * from emp_temp";
		connect();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getInt("salary"));

				list.add(map);
			}
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
		return list;
	}

	public List<EmpVO> empVoList() {
		connect();
		sql = "select * from emp_temp";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));

				list.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
		return list;
	}

	// 단건조회
	public List<Map<String, Object>> empSelect(int id) {
		sql = "select * from emp_temp where employee_id = " + id;
		connect();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getInt("salary"));

				list.add(map);
			} else {
				list = null;
			}
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
		return list;
	}

	// 추가
	public int addEmp(EmpVO emp) {
		connect();
		sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id) values(?, ?, ?, ?, ?)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			
			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 수정
	public int updateEmp(int id, int sal) {
		connect();
		sql = "update emp_temp set salary = ? where employee_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sal);
			psmt.setInt(2, id);
			
			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 삭제
	public int deleteEmp(int id) {
		connect();
		sql = "delete emp_temp where employee_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			
			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
}
