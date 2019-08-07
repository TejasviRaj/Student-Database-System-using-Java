package com.tejasvi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetStudent
 */
public class GetStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("tejas");
		EntityManager em=emf.createEntityManager();
		Student s=em.find(Student.class,1);
		Student t=em.find(Student.class,2);
		
		ArrayList<Student> student_list =new ArrayList<Student>();
		
		student_list.add(s);
		student_list.add(t);


		PrintWriter out=response.getWriter();
		Gson gson= new Gson();
	    out.println(gson.toJson(student_list));	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
