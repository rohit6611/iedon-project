package com.iedon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.pool.OracleDataSource;

@WebServlet("/back")
public class back extends HttpServlet {
    public back() {
        super();
    }
    Connection con=null;
  	PreparedStatement stmt=null;
  	ResultSet rset=null;
      public Connection getdbcon() {
    	try {
  			OracleDataSource ods =new OracleDataSource();
  			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
  			con=ods.getConnection("Rohit12","icsd");
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
    	
    	
    	return con;
    }
      public void init(ServletConfig config) {
        	con=getdbcon();
        	try {
      			stmt=con.prepareStatement("insert into iedon1 values(?,?,?,?)");
      		} catch (SQLException e) {
      			e.printStackTrace();
      		}
        	
        	
        }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
	String text=request.getParameter("text");
	try {
		stmt.setString(1, name);
		stmt.setString(2, phone);
		stmt.setString(3, email);
		stmt.setString(4, text);
		stmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.println("thank you for submitting your concern");
	}

	public void destroy() {
	  	  
		 try {
			 if(con!=null) {
			con.close();
			 }
			 if(stmt!=null) {
				 stmt.close();
			 }
			 if(rset!=null) {
				 rset.close();
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
