package com.tejasvi;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class WelcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		
		PrintWriter out = response.getWriter();

		
		HttpSession session = request.getSession();
		String name=(String) session.getAttribute("name");
		
		if (name.contentEquals("admin"))
		{
			response.setContentType("text/html");
			
			String n=request.getParameter("username");
			out.print("Welcome "+n);
			
			out.close();
		}
		else
		{
			out.print("Not welcome");
		}
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		PrintWriter out = response.getWriter();
		out.println("hello");
	}

}
