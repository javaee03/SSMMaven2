<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册登陆</title>
</head>
<script src="jquery-3.2.1.js"></script>
<body>
    <form action="/user/register" method="post" onsubmit="return checkUser1()">
        账号:<input type="text" name="username" id="username"/><br/>
        密码:<input type="text" name="password" id="password"/><br/>
        <input type="submit" name="注册"/>
        <input id="login" type="button" name="登陆" onclick="return checkUser2()"/>
    </form>
</body>
</html>
<script>
    //使用表单提交事件进行验证提交
    function checkUser1() {
        var username=$("#username").val();
        var password=$("#password").val();
        if (username==""){
            alert("姓名不能为空");
            return false;
        }
        if (password==""){
            alert("密码不能为空");
            return false;
        }
        return true;
    }
    //使用单击事件进行验证提交
    function checkUser2() {
        var username=$("#username").val();
        var password=$("#password").val();
        if (username==""){
            alert("姓名不能为空");
            return false;
        }
        if (password==""){
            alert("密码不能为空");
            return false;
        }
        $('#form').get(0).action='user/login';
        $('#form').get(0).submit();
    }
</script>
