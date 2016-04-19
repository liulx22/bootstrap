<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.ainx.com.cn" prefix="ainx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><ainx:hello/></title>
</head>
<body>
   <ainx:hello/>
   <hr>
   <ainx:max num1="10" num2="20"/>
   <hr>
   <ainx:greet>
       <font>欢迎访问个人网站！</font>
   </ainx:greet>
   <hr>
   <% String name="liulx"; %>
   <ainx:switch>
       <ainx:case cond="<%=name.equals(\"liulx\") %>">
           <%out.println("经理"); %>
       </ainx:case>
       <ainx:case cond="<%=name.equals(\"liulx22\") %>">
           <%out.println("账号"); %>
       </ainx:case>
       <ainx:default>
           <%out.println("默认"); %>
       </ainx:default>
   </ainx:switch>
   <hr>
   <ainx:welcome name="liulx">
        欢迎你访问我的网站。
   </ainx:welcome>
</body>
</html>