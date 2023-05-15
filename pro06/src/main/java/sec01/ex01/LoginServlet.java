/*
 * 이용자를 위한 프로그램 webapp 작성(html,jsp)
 * action="login"---연결---@WebServlet("/login")
 * 이용자의 요구사항을 처리 java Resource 작성(java)
 */

package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 클래스명, 메소드명은 중요하지 않다.
 * 어노테이션으로 
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login") //action이름과 동일하게 작성
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * method에서 선언된 접근방식 get일때
	 * request는 form에서 전달받은 값을 받는 부분(들어오는 값)
	 * response는 서버에서 웹페이지에 전달하는 값(나가는 값)
	 * 
	 * request로 들어오는 값을 종류를 parameter라고 한다.(인수값)
	 * getParameter(변수명) : 지정한 변수의 값을 읽어온다.
	 * getparameterValues(변수명) : 지정한 변수의 값들을 읽어온다.(체크상자등...)
	 * getParameterNames() : 변수명을 모를 때 순서대로 값을 읽어온다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login.html에서 form으로 요청했을 때
		//user_id, user_pw 값을 보냈을 경우
		request.setCharacterEncoding("UTF-8"); //받아온 정보를 UTF-8로 변환
		
		String user_id = request.getParameter("user_id"); //user_id에 전달된 값을 읽어온다.
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("아이디"+user_id); //서버에 전달받은 값을
		System.out.println("비밀번호"+user_pw);
	}

	/**
	 * 접근방식 post일때
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
