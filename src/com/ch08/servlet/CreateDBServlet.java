package com.ch08.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String url;
    private String user;
    private String password;
    @Override
	public void init() throws ServletException {
		String driverClass=getInitParameter("driverClass");
		url=getInitParameter("url");
		user=getInitParameter("user");
		password=getInitParameter("password");
		try{
			Class.forName(driverClass);
		}catch(Exception e){
			
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Connection conn=null;
		Statement st=null;
		try {
			conn=DriverManager.getConnection(url,user,password);
			st=conn.createStatement();
			st.executeUpdate("create database bookstore");
			st.executeUpdate("use bookstore");
			
			PrintWriter out=resp.getWriter();
			out.println("do success!");
			out.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
