package com.ch06.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter out=resp.getWriter();
		out.println("<html><head>��½ҳ��</head><body>");
		out.println("<form action='portal' method='post'><table><tr><td>�û�����</td>"
                +"<td><input type='text' name='name'></td></tr><tr><td>���룺</td>"
                +"<td><input type='text' name='pass'></td></tr> <tr><td colspan='2'>"
                +"<input type='reset' value='����'> <input type='submit' value='�ύ'>"
                +"</td></tr></table></form>");
		out.println("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
