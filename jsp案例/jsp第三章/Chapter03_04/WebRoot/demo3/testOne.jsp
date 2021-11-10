<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  <body>
    <%
	String name = "request";
	request.setAttribute("name", name);
	 request.getRequestDispatcher("testTwo.jsp").forward(request, response);
	  
	 /* response.sendRedirect("testTwo.jsp"); */
    %>
  </body>
</html>
