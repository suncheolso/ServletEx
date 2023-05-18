package com.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugu")
public class gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String getUrl = "inputgugu.jsp";
	String postUrl = "outputgugu.jsp";
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
								
		//JSP연결
		RequestDispatcher rd = request.getRequestDispatcher(getUrl);
		rd.include(request, response); //지정페이지 연결
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
								
		//JSP연결
		RequestDispatcher rd = request.getRequestDispatcher(postUrl);
		rd.include(request, response); //지정페이지 연결
	}

}
