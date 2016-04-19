package com.ch06.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PortalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter out=resp.getWriter();
		out.println("<html><head>µÇÂ½Ò³Ãæ</head><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if("liulx".equals(name) && "liulx".equals(pass)){
			ServletContext servletContext=getServletContext();
			RequestDispatcher rdisp=servletContext.getRequestDispatcher("/welcome");
			rdisp.forward(req, resp);
		}else{
			RequestDispatcher rdisp=req.getRequestDispatcher("/login2");
			rdisp.include(req, resp);
		}
		out.println("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
