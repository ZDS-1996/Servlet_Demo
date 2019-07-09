package com.imut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imut.bean.Users;
import com.imut.dao.UserDao;
import com.imut.daofactory.DaoFactory;

public class UserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String name=request.getParameter("userName");
		String pass=request.getParameter("pass");
		String dd=request.getParameter("dd");
		Users users=new Users(name, pass);
	/*	UserDao dao=DaoFactory.getUserDao();
		Users user=new Users(name, pass);
		Users users=dao.findUser(user);
		System.out.println("dd="+dd);*/
		if(users!=null){
			session.setAttribute("name", users.getUserName());
			response.sendRedirect("success.jsp");
			
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}
