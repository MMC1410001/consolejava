package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.dao.UserDao;
import com.cdac.daoimpl.UserDaoImpl;
import com.cdac.pojo.User;

@WebServlet("/adduser")
public class RegisterUserServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("txtUname");
		String pass = request.getParameter("txtPass");
		String email = request.getParameter("txtEmail");
		String mobile = request.getParameter("txtMobile");
		String gender = request.getParameter("txtGender");
		String country = request.getParameter("txtCountry");
		
		User user = new User(name, pass,email,mobile,gender,country);
		
		UserDao daoImpl = new UserDaoImpl();
		
		if(daoImpl.addNewUser(user)) {
			
			response.sendRedirect("registersuccess");
		}
		else {
			response.sendRedirect("registererror");
		}
	}
}











