package com.yedam.game;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gameMenu")
public class GameServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String status = req.getParameter("status");
		LogIn login = new LogIn();

		if (status.equals("login")) {
			List<User> list = login.logIn(id);
			if (list != null) {
				for (User temp : list) {
					if (temp.getPassword().equals(password)) {
						resp.getWriter()
								.print("<script>alert('로그인 되었습니다');location.href='/info/menuApp.html'</script>");
					} else {
						resp.getWriter().print("<script>alert('비밀번호가 틀렸습니다');location.href='/info/App.html'</script>");
					}
				}
			} else {
				resp.getWriter().print("<script>alert('존재하지 않는 계정입니다');location.href='/info/App.html'</script>");
			}
		} else if (status.equals("signUp")){
			
		}
	}
}
