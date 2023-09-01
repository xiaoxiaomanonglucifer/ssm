<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../../static/css/usersLogin.css">
    <link rel="icon" href="../../../static/images/favicon.ico" sizes="32x32"/>
    <script src="../../../static/js/jquery-1.3.2.min.js"></script>
    <script src="../../../static/js/login.js"></script>

    <title>前台首页</title>
</head>
<body>
<script type="text/javascript">
    $(function () {
        $("#login").click(function () {
            var username = $("#a_username").val();
            var password = $("#a_password").val();
            var isRem = $("#remember").attr("checked");
            $.ajax({
                url: '/system/login',
                type: 'POST',
                dataType: 'JSON',
                data: {
                    aUsername: username,
                    aPassword: password,
                    isRem: isRem
                },
                success: function (resp) {
                    var data = JSON.parse(resp);
                    if (data.code == "1") {
                        window.location.href = "/system/toMain"
                    } else {
                        alert(data.message);
                    }
                }
            });
        });
    });
</script>
<div class="header">

</div>

<div class="body">
    <div class="panel">
        <div class="top">
            <p>账户登陆</p>
        </div>

        <div class="middle">
            <form>

<%--                <span class="erro">${msg}</span>--%>
                <span class="s1"></span>
                <span class="s2"></span>
                <input type="text" id="a_username" value="${cookie.username.value}" class="iputs"/>
                <input type="password" id="a_password" value="${cookie.password.value}" class="iputs"/>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" id="remember"> 记住我
                    </label>
                </div>
                <input type="button" value="登陆" id="login"/>
            </form>
        </div>
    </div>
</div>

<div class="footer">
    <span>@Copyright © 2023-2024 版权所有 </span>
</div>
</body>
</html>
