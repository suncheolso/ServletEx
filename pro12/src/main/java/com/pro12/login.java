package com.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 로그인 입력폼
     */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//설정작업
		request.setCharacterEncoding("UTF-8");	
		response.setContentType("text/html;charset=UTF-8");
						
		//JSP연습
		String url = "login.jsp";//나가는 입구
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.include(request, response); //지정페이지에 연결
	}
	/**
	 * 결과폼
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//설정작업
		request.setCharacterEncoding("UTF-8");	
		response.setContentType("text/html;charset=UTF-8");
								
		//JSP연습
		String url = "result.jsp";//나가는 입구
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.include(request, response); //지정페이지에 연결
	}
}
