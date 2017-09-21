<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/7
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="<%=path %>/user/login2" method="post">
    <input type="text" name="name" />
    <input type="password" name="password" />
    <input type="submit" value="登录"/>
</form>

    <a href="<%=path %>/user/del?id=5">删除用户</a>
    <a href="<%=path %>/user/remove/5">删除用户</a>
</body>
</html>
