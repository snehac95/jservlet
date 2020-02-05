package org.dev.devapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/movie")
public class MovieServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String Name= req.getParameter("name");
		String Hours= req.getParameter("hours");
		String Language= req.getParameter("language");
		
		String Budget= req.getParameter("budget");
		
	

		
		
		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print("welcome" +Name);
		
	}

}
