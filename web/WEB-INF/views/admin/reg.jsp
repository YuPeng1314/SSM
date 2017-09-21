<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/8
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="admin_reg">
    电话：<input type="text" name="phone" />
    密码：<input type="password" name="password" />
  <!--  性别：<input type="text" name="gender" />
    地址：<input type="text" name="addrss" /><br/>-->
    <input type="button" value="注册" onclick="reg();"/>
</form>
</body>
<script src="<%=path %>/js/jquery.min.js"></script>
<script>
    function reg() {
        $.post("<%=path %>/admin/reg1",
            $("#admin_reg").serialize(),
            function (data) {
                if (data.result === "success") {
                    window.location.href = "";
                } else {
                    alert("fail!");
                }
            },
            "json"
        );
    }
</script>
</html>
