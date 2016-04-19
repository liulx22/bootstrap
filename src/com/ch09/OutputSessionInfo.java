package com.ch09;

import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.http.HttpSession;

public class OutputSessionInfo {
    public static void printSessionInfo(PrintWriter out,HttpSession session){
    	out.println("<table>");
    	out.println("<tr>");
    	out.println("<td>会话状态：</td><td>");
    	if(session.isNew()){
    		out.println("新用户</td>");
    	}else{
    		out.println("旧用户</td>");
    	}
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>会话ID：</td><td>");
    	out.println(session.getId()+"</td>");
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>创建时间：</td><td>");
    	out.println(new Date(session.getCreationTime())+"</td>");
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>上次访问时间:</td><td>");
    	out.println(new Date(session.getLastAccessedTime())+"</td>");
    	out.println("</tr>");
    	out.println("</table>");
    }
}
