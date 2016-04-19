package com.ch15.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class DefaultTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		Tag parent=getParent();
		if(!((SwitchTag)parent).getPermission()){
			return SKIP_BODY;
		}
		((SwitchTag)parent).subTagSucceed();
		return EVAL_BODY_INCLUDE;
	}

}
