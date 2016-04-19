package com.ch09;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class GreetServlet extends HttpServlet
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        HttpSession session=req.getSession();
        String user=(String)session.getAttribute("user");
        
        if(null==user)
        {
            resp.sendRedirect("login");
        }
        else
        {
            resp.setContentType("text/html;charset=gb2312");
            PrintWriter out=resp.getWriter();
            out.println("<html><head><title>»¶Ó­Ò³Ãæ</title></head>");
            out.println("<body>");
            
            OutputSessionInfo.printSessionInfo(out,session);
            
            out.println("<p>");
            out.println("»¶Ó­Äã£¬"+user+"<p>");
            out.println("<a href="+resp.encodeURL("login")+">ÖØÐÂµÇÂ¼</a>");
            out.println("<a href="+resp.encodeURL("logout")+">×¢Ïú</a>");
            out.println("</body></html>");
            out.close();
        }
    }
}