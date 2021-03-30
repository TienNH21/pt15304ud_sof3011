package com.sof3011.buoi1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/buoi-1/hello")
public class HelloServlet extends HttpServlet
{
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws IOException, ServletException {
		String paramsName = request.getParameter("name");

		String name = paramsName == null ? "Bug Maker" : paramsName;
		
		System.out.println("--------" + request.getParameter("name"));
		
		request.setAttribute("myName", name);
		
		request.getRequestDispatcher("/views/buoi2/hello.jsp")
			.forward(request, response);
	}
}
