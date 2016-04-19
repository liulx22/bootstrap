package com.ch15;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WelcomeSimpleTag extends SimpleTagSupport {
	private JspFragment body;
    private String name; 
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setJspBody(JspFragment jspBody){
        this.body=jspBody;
    }
    
    public void doTag() throws JspException, java.io.IOException{
        JspContext jspCtx=getJspContext();
        JspWriter out=jspCtx.getOut();
        out.print(name);
        out.print("，");
        //将标记体的内容输出当前输出流中。
        body.invoke(null);   
    }
}
