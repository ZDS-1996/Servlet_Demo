<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'error.jsp' starting page</title>
    
	

  </head>
  
  <body>
   	登录失败 4秒后跳转到登录界面
   	<%
   		response.setHeader("refresh", "4;URL=login.jsp");
   	 %>
  </body>
</html>
