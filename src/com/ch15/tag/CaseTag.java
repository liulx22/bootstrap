package com.ch15.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class CaseTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	private boolean cond;
    public void CaseTag(){
    	cond=false;
    }
    public void release() {
    	cond=false;
	}
	public void setCond(boolean cond) {
		this.cond = cond;
	}
	@Override
	public int doStartTag() throws JspException {
		Tag parent=getParent();
		if(!((SwitchTag)parent).getPermission()){
			return SKIP_BODY;
		}
		if(cond){
			((SwitchTag)parent).subTagSucceed();
			return EVAL_BODY_INCLUDE;
		}else{
			return SKIP_BODY;
		}
	}
    
}
