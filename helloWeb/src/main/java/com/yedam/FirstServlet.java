package com.yedam;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.emp.*;

@WebServlet("/myinfo")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청방식 : post 요청일 경우에 tomcat 서버가 실행해줌
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("emp_id"); // form태그의 name속성을 읽어들임
		String name = req.getParameter("last_name");
		String email = req.getParameter("email");
		String job = req.getParameter("job_id");
		String hdate = req.getParameter("hire_date");
		
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(Integer.parseInt(id));
		emp.setLastName(name);
		emp.setEmail(email);
		emp.setJobId(job);
		emp.setHireDate(hdate);
		
		System.out.println(emp);
		
		EmpDAO dao = new EmpDAO();
		dao.addEmp(emp);
		
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("<h3>servlet page</h3>"); // client 
		resp.getWriter().print("<a href='info/resume.html'>이력서</a>");
		resp.getWriter().print("<a href='index.html'>처음으로</a>");

		EmpDAO dao = new EmpDAO();
		dao.empVoList();
		List<EmpVO> list = dao.empVoList();

		resp.getWriter().print("<ul>");
		for (EmpVO temp : list) {
			resp.getWriter().print(
					"<li>" + temp.getEmployeeId() + "/ " + temp.getLastName() + "/ " + temp.getEmail() + "</li>");
		}
		resp.getWriter().print("</ul>");
	}
}
