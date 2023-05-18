package com.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String type = "text/html;charset=UTF-8";
	String url = "hello.jsp";
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//설정작업
		request.setCharacterEncoding("UTF-8");
		//String type = "text/html;charset=UTF-8";
		response.setContentType(type);
		
		//JSP연습
		//String url = "hello.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.include(request, response); //지정페이지에 연결
	}

	
}
