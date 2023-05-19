//com.controller
//맵핑 작업을 위판 패키지
//servlet에서는 파일과 servlet이 1:1 매칭
//spring에서는 기능별 servlet이 1개(게시물-1개, 회원관리-1개) 
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
/**
 * 목록에서 삭제버튼을 클릭했을 때 처리하는 컨트롤
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * 삭제폼 없이 삭제 작업후 list 로 이동
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

   /**
    * 삭제에서는 post는 필요가 없다.
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}