package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		long phone = Long.parseLong(request.getParameter("mobile"));
		
		//out.println(username);out.println(email);out.println(password);out.println(phone);

		RequestDispatcher dispatcher = null;
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/authentication?useSSL=false","root","abc456");
			PreparedStatement stmt = con.
					prepareStatement("insert into users(username,uemail,upassword,umobile) values(?,?,?,?)");
			
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setString(3, password);
			stmt.setLong(4, phone);
			
			int rowCount = stmt.executeUpdate();
			dispatcher = request.getRequestDispatcher("index.jsp");
			
			if(rowCount > 0) {
				request.setAttribute("status", "success");
			} else {
				request.setAttribute("status", "failed");
			}
			
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
