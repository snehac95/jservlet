package org.dev.devapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/flipcart")
public class FlipcartServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String product =req.getParameter("pr");
		String quantity =req.getParameter("qt");
		
		
		RequestDispatcher rd =req.getRequestDispatcher("secondFlipcart");
		rd.forward(req,resp);
		
	}
	

}
