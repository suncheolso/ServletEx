package com.pro12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 자바 - servlet를 이용해서 웹개발
 * 	   - JSP를 이용해서 웹개발
 */
@WebServlet("/Hello2") //들어오는 입구
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//설정작업
		request.setCharacterEncoding("UTF-8");	
		response.setContentType("text/html;charset=UTF-8");
				
		//JSP연습
		String url = "hello2.jsp";//나가는 입구
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.include(request, response); //지정페이지에 연결
			}
}
