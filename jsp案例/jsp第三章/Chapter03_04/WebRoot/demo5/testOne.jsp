<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  <body>
    <%
	String ses = "session";
	String app = "application";
    session.setAttribute("session",ses);
    application.setAttribute("application",app);
    //如果浏览器关闭，session销毁，在testTwo.jsp只能读取到application
	response.sendRedirect("testTwo.jsp");
    %>
  </body>
</html>
