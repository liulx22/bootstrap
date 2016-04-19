package com.ch15.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag {
    private PageContext pageContext;
    private Tag parent;
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try{
			out.println("»¶Ó­Äãliulx£¡");
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		return parent;
	}

	@Override
	public void release() {}

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext=pageContext;
	}

	@Override
	public void setParent(Tag t) {
		this.parent=t;
	}

}
