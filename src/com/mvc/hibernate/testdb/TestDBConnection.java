package com.mvc.hibernate.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBConnection
 */
@WebServlet("/TestDBConnection")
public class TestDBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user="Company";
		String pass="Company";
		String jdbcurl="jdbc:mysql://localhost:3306/customer?useSSl=false";
		String driver="com.mysql.jdbc.Driver";
		
		PrintWriter out=response.getWriter();
		out.println("Connectiong "+jdbcurl);
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(jdbcurl,user,pass);
			
			if(con!=null)
				out.println("Done!!");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
