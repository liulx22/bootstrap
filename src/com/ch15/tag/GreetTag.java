package com.ch15.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class GreetTag extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
    public int doEndTag() throws JspException{   
        JspWriter out=bodyContent.getEnclosingWriter();
        try{
            out.println(bodyContent.getString());
            
        }catch(IOException e){
            System.err.println(e);
        }
        return EVAL_PAGE;
    }

}
