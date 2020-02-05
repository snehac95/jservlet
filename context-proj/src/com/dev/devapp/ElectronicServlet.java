package com.dev.devapp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		Product pro=new Product ();
		pro.id=5366436;
		pro.name="Ear Phone";
		pro.price=1656;
		pro.brand="mejestic";
		
		ServletContext context=getServletContext();
		String val1=context.getInitParameter("key1");
		String val2=context.getInitParameter("key2");
		
		ServletOutputStream servletOutputStream =resp.getOutputStream();
		servletOutputStream.print("<head><body bgcolor='pink'>"
				
				+"<h1>'"+ val1 +"'   '"+ val2 +"'</h1>"+
						
			"<h2>Thank for' '"+pro.name +" ' '</h2>"
						+ "<a href='context.html'>back</a>"
						+ "</body><html>");
	}

}
