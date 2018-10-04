<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 2018/10/4
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/admin/register.do" method="post">
        <p>
            username:<input type="text" name="name" placeholder="请输入用户名">
        </p>
        <p>
            password:<input type="password" name="password" placeholder="请输入密码">
        </p>
        <p>
            <input type="submit" value="注册">
            <input type="reset" value="重置">
        </p>
    </form>
</body>
</html>
