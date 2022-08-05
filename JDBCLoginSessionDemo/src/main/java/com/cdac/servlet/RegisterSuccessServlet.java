package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registersuccess")
public class RegisterSuccessServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<div align=\"center\" style=\"color:green\">");
		pw.println("user registration successful");
		pw.println("</div>");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("input.html");
		dispatcher.include(request, response);
	}
}




