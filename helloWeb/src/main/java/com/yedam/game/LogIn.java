package com.yedam.game;

import java.sql.*;
import java.util.*;

public class LogIn {
	Scanner sc = new Scanner(System.in);
	Connection conn;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;

	String url = "jdbc:oracle:thin:@192.168.0.74:1521:xe";
	String user = "hr";
	String pass = "hr";
	String sql;

	User logIn;
	User temp = new User();

	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass); // 요청 url 유저명 패스워드
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}

	public List<User> logIn(String userId) {
		sql = "select * from member where user_id = '" + userId + "'";
		connect();
		logIn = new User();
		List<User> list = new ArrayList<User>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				// 회원 객체 생성
				logIn.setUserId(rs.getString("user_id"));
				logIn.setPassword(rs.getString("password"));
				logIn.setNewRecord(rs.getInt("new_record"));
				logIn.setLongestLength(rs.getInt("longest_length"));
				logIn.setPlayCount(rs.getInt("play_count"));
				// 입력한 ID의 객체를 생성하고 패스워드가 일치하면 로그인 처리
			}
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
		return list;
	}

	public int signUp(User user) {
		connect();
		int r = 0;
		try {
			// 중복검사
			sql = "select * from member";
			List<User> list = new ArrayList<User>();
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					User member = new User();
					member.setUserId(rs.getString("user_id"));
					member.setPassword(rs.getString("password"));

					list.add(member);
				}
			} catch (SQLException e) {
				System.out.println("처리 실패");
				e.printStackTrace();
			}
			for (User temp : list) {
				if (temp.getUserId().equals(user.getUserId())) {
					System.out.println("이미 존재하는 ID입니다");
					return -1;
				}
			}
			// 실제 회원가입 과정
			sql = "insert into member(user_id, password) values(?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserId());
			psmt.setString(2, user.getPassword());

			r = psmt.executeUpdate(); // 처리된 건수
			if (r > 0) {
				System.out.println("회원가입 완료!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	public void gameStart() {
		temp.setLongestLength(logIn.getLongestLength());
		temp.setNewRecord(logIn.getNewRecord());
		System.out.println("길이를 입력해 주세요(2~10)");
		int length = Integer.parseInt(sc.nextLine());
		String str = "";
		Outter: for (int i = 0; i < length; i++) {
			int num = (int) (Math.random() * 10);
			for (int j = 0; j < str.split("").length; j++) {
				if (i == 0) {
					break;
				}
				if (num == Integer.parseInt(str.split("")[j])) {
					i--;
					continue Outter;
				}
			}
			str += num;
		}
		String[] correct = str.split("");
		int count = 0;
		Outter: while (true) {
			int s = 0;
			int b = 0;
			System.out.print("숫자입력>");
			String[] inputNum = sc.nextLine().split("");
			for (int i = 0; i < inputNum.length; i++) {
				for (int j = 0; j < i; j++) {
					if (inputNum[i].equals(inputNum[j]) && i != j) {
						System.out.println("중복된 숫자가 있습니다");
						continue Outter;
					}
				}
			}
			for (int i = 0; i < inputNum.length; i++) {
				for (int j = 0; j < correct.length; j++) {
					if (inputNum[i].equals(correct[j])) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("%dS %dB\n", s, b);
			count++;
			if (s == correct.length) {
				System.out.println("정답입니다!");
				break;
			}
		}
		temp.setLongestLength(length);
		temp.setNewRecord(count);
		logIn.setPlayCount(logIn.getPlayCount() + 1);
		updateInfo(temp, logIn);
	}

	public int updateInfo(User temp, User user) {
		connect();
		sql = "update member set new_record = ?, longest_length = ?, play_count = ? where user_id = ?";
		int r = 0;
		try {
			int round = 0;
			int longest = 0;
			if (temp.getLongestLength() > user.getLongestLength()) {
				round = temp.getNewRecord();
				user.setNewRecord(round);
				longest = temp.getLongestLength();
				user.setLongestLength(longest);
			} else if (temp.getLongestLength() == user.getLongestLength()) {
				if (temp.getNewRecord() > user.getNewRecord()) {
					round = user.getNewRecord();
					longest = user.getLongestLength();
				} else {
					round = temp.getNewRecord();
					user.setNewRecord(round);
					longest = temp.getLongestLength();
					user.setLongestLength(longest);
				}
			} else {
				round = user.getNewRecord();
				longest = user.getLongestLength();
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, round);
			psmt.setInt(2, longest);
			psmt.setInt(3, user.getPlayCount());
			psmt.setString(4, user.getUserId());

			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	public void getInfo(User user) {
		System.out.println("최고라운드 : " + user.getLongestLength());
		System.out.println("최단 기록 : " + user.getNewRecord());
		System.out.println("플레이 횟수 : " + user.getPlayCount());
	}
	
	public int remove(User user) {
		connect();
		sql = "delete member where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserId());
			
			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

}
