package com.ch15.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SwitchTag extends TagSupport {
	private static final long serialVersionUID = 1L;
    private boolean subTagExecuted;
    public SwitchTag(){
    	subTagExecuted=false;
    }
    
	@Override
	public int doStartTag() throws JspException {
		subTagExecuted=false;
		return EVAL_BODY_INCLUDE;
	}
	public synchronized boolean getPermission(){
		return (!subTagExecuted);
	}
	public synchronized void subTagSucceed(){
		subTagExecuted=true;
	}
    
	@Override
	public void release() {
		subTagExecuted=false;
	}
    
}
