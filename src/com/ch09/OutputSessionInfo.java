package com.ch09;

import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.http.HttpSession;

public class OutputSessionInfo {
    public static void printSessionInfo(PrintWriter out,HttpSession session){
    	out.println("<table>");
    	out.println("<tr>");
    	out.println("<td>�Ự״̬��</td><td>");
    	if(session.isNew()){
    		out.println("���û�</td>");
    	}else{
    		out.println("���û�</td>");
    	}
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>�ỰID��</td><td>");
    	out.println(session.getId()+"</td>");
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>����ʱ�䣺</td><td>");
    	out.println(new Date(session.getCreationTime())+"</td>");
    	out.println("</tr>");
    	
    	out.println("<tr>");
    	out.println("<td>�ϴη���ʱ��:</td><td>");
    	out.println(new Date(session.getLastAccessedTime())+"</td>");
    	out.println("</tr>");
    	out.println("</table>");
    }
}
