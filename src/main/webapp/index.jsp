<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/7/14
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="/js/jquery-3.6.0.min.js"></script>

    <script>
        $(function(){
           $('#ajaxTest').click(function(){
                $.ajax({
                    url: "media/hello",
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data["info"]);
                        alert(data["userName"]);
                    }
                })
           });
        })
    </script>
</head>
<body>
hello world
<a href="javascript:void(0);" id="ajaxTest">点我</a>
<form action="/media/login" method="post">
    用户：<input type="text" name="userName" /><br>
    密码：<input type="password" name="pwd" /><br>
    <!--
    年龄:<input type="text" name="age" /><br>
    生日:<input type="text" name="birthday" /><br>
    -->
    <input type="submit" value="登录" />
</form>
</body>
</html>
