package com.ch06.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext servletContext=getServletContext();
		Integer counter=(Integer) servletContext.getAttribute("counter");
		if(null==counter){
			counter=new Integer(1);
		}else{
			counter=new Integer(counter.intValue()+1);
		}
		servletContext.getRequestDispatcher("/");
		req.getRequestDispatcher("/");
		
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter out=resp.getWriter();
		out.println("<html><head><title>页面访问次数</title></head><body>");
		out.println("页面访问了<b>");
		out.println(counter);
		out.println("</b>次");
		out.println("</body></html>");
		servletContext.setAttribute("counter", counter);
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
