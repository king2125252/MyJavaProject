package com.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("usersId");
		String password = req.getParameter("password");
//		String name4 = req.getParameter("name4");
//         System.out.println(name3.trim().length()==0);
//         if(name3.trim().isEmpty()) {
//         	out.println("�ФĿ�A�e�X");
//         }
		out.println("<p>username:" + name+"</p>");
		out.println("<p>username:" + password+"</p>");
//		System.out.println(name == null); // x
//		System.out.println("-------------------------------------------");
//		if (name != null) {
//			System.out.println(name.trim().length() == 0); // v
//			System.out.println(name.trim().isEmpty()); // v
//			System.out.println(name.trim().equals("")); // v
//
//		}
//		if (!name3.trim().isEmpty()) {
//			out.println("<p>�A�Ŀ諸�O:" + name3+"</p>");
//		}
//		String langtype[]=req.getParameterValues("name4");
//		if(langtype == null) {
//			out.println("<p>���I��A�e�X</p>");
//		}
//		out.println("<HTML>");
//		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.println("Hello, �A�n: " + name);
//		out.println("</BODY></HTML>");
	}

	public String getServletInfo() {
		return "A servlet that knows the name of the person to whom it's" + "saying hello";
	
}}
