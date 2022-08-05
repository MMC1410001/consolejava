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

@WebServlet("/checkuser")
public class CheckUserServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("txtUname");
		String pass = request.getParameter("txtPass");
		
		User user = new User(uname, pass);
		
		UserDao daoImpl = new UserDaoImpl();
		
		if(daoImpl.checkUserCredentials(user)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("USERNAME", uname);
			response.sendRedirect("home");
		}
		else {
			response.sendRedirect("loginerror");
		}
	}
}











