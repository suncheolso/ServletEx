package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.vo.member;
/**
 * 브라우저 /list에서 등록을 클릭했을 때 요청을 했을 때 처리하는 부분
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 사용준비
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=utf-8");
      
      //작업
      
      //페이지 이동
      RequestDispatcher rd  = request.getRequestDispatcher("insert.jsp");
      rd.forward(request, response); //rd.include()
   }

   /**
    * 회원등록 폼에서 회원등록버튼을 눌렀을 때 요청을 처리하는 부분
    * 회원정보를 데이터베이스에 저장을 하고, 목록으로 다시 이동
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 사용준비
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=utf-8");
      
      //작업
      //1.데이터베이스 준비
            Connection conn= null;
            Statement stmt = null;
            ResultSet rs = null; //삽입,수정,삭제 제외
            String sql = null;
            
            
            try {//2.데이터베이스 연결
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               conn = DriverManager.getConnection(
                  "http://localhost:3306/servlet",
                  "sample",
                  "1234"
                  );         
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {rs.close();} catch(Exception e) {}
               try {stmt.close();} catch(Exception e) {}
               try {conn.close();} catch(Exception e) {}
            }
      
      //페이지 이동
      RequestDispatcher rd  = request.getRequestDispatcher("list.jsp");
      rd.forward(request, response); //rd.include()
   }

}