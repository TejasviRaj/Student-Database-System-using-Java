package com.tejasvi.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final String NULL = null;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("username");
		String pass=request.getParameter("userpass");
		
//		if(LoginDao.validate(n, p)){
//			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
//			rd.forward(request,response);
//		}
		
		if(name.equals("admin")&& pass.equals("admin")){
			
	        HttpSession session = request.getSession();
	        session.setAttribute("name", name);
	        
//			RequestDispatcher rd=request.getRequestDispatcher("servlet1");
//			rd.forward(request,response);
	        
	        doGet(request,response);
		
		}
		
		else{
			out.print("Sorry username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		
		out.close();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		HttpSession session = request.getSession();
//        String name= (String) session.getAttribute("name");
//        
//        if (name.contentEquals("admin"))
//    	{
//    		RequestDispatcher rd=request.getRequestDispatcher("index.html");
//    		rd.forward(request,response);
//    	}
//    	else
//    	{
//    		RequestDispatcher rd=request.getRequestDispatcher("index.html");
//    		rd.forward(request,response);	
//    		}
		
		
		PrintWriter out = response.getWriter();

		String name;
		HttpSession session = request.getSession();
		
		try
		{
			name=(String) session.getAttribute("name");

		}
		
		catch(Exception e)
		{
			name=NULL;

		}
		
		
		if (name != NULL)
		{
			if (name.contentEquals("admin"))
			{
				RequestDispatcher rd= request.getRequestDispatcher("mainScreen.jsp");
				response.setContentType("text/html");
				rd.forward(request,response);
				
//				String n=request.getParameter("username");
//				out.print("aaija ");
//				
//				out.close();
			}
			
		}
		else
		{
			out.print("You must login first");
			response.sendRedirect("index.html");  
		}
        
	}
	

}