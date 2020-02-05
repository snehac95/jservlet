package com.dev.devapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bp")
public class BookServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		
		Product pro=new Product ();
		pro.id=56;
		pro.name="digital electronics";
		pro.price=165;
		pro.brand="prescribed";
		
		ServletOutputStream servletOutputStream =resp.getOutputStream();
		servletOutputStream.print("<html><body bgcolor='pink'>"
				
				+"<h1>Thank for selecting book''"+pro.name +" ' '</h1>"
						+ "<a href='context.html'>back</a>"
						+ "</body><html>");
	}



	}
	
	


