<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  <body>
  <%
   //request.getAttribute("键")获取值
  	String welcomeName=(String)request.getAttribute("loginName");
   %>
         欢迎<%=welcomeName %>登录成功！
  </body>
</html>
