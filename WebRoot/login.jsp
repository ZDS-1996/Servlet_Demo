<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  
  <body>
    <form action="userServlet" method="post">
    	<table>
    		<tr>
		   		<td>用户名：</td>
		   		<td>
		   			<input type="text" name="userName"/>
		   		</td>
    		</tr>
    		<tr>
		   		<td>密码：</td>
		   		<td>
		   			<input type="password" name="pass"/>
		   		</td>
    		</tr>
    		<tr>
		   		<td colspan="2">
		   			<input type="submit" value="登录"/>
		   			<input type="reset" value="重置"/>
		   		</td>
    		</tr>
    	<!-- 	<tr>
		   		<td colspan="2">
		   			单选框
		   			<input type="radio" name="sex" value="男"/>：男
		   			<input type="radio" name="sex" value="女"/>：女
		   		</td>
    		</tr>
    		<tr>
		   		<td colspan="2">
		   		多选框
		   		<input type="checkbox" value="篮球" name="aihao"/>篮球	
		   		<input type="checkbox" value="足球" name="aihao"/>足球
		   		</td>
    		</tr>
    		<tr>
		   		<td colspan="2">
		   		下来框
		   		<select name="dd">
		   			
		   			<option value="1" label="1"/>
		   			<option value="2" label="2"/>
		   			<option value="3" label="3"/> 
		   			
		   		</select>
		   		</td>
    		</tr>
    		<tr>
		   		<td colspan="2">
		   			文本域
		   			<textarea rows="30" cols="60" name="ss"></textarea>
		   		</td>
    		</tr> -->
    	</table>
    
    </form>
  </body>
</html>
