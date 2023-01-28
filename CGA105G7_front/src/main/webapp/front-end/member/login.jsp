<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>7Tour Login </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <link href="https://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
</head>

<body>

    <div class="container bootstrap snippets bootdey">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <h1 class="text-center login-title">想尋找更多嗎? <a href="<%=request.getContextPath()%>/front-end/index.jsp"
                        target="__blank">7Tour</a></h1>
                <div class="account-wall">
                    <img class="profile-img" src="<%=request.getContextPath()%>/front-end/member/images/Tour(circle).jpg" alt="">
                    <form class="form-signin"  METHOD="post" ACTION="<%=request.getContextPath()%>/usersServlet">
                    	<input type="text" class="form-control" placeholder="請輸入電子信箱" required autofocus name="userAccount">
                        <input type="password" class="form-control" placeholder="請輸入密碼" required name="password">
                        <input type="hidden" name="action" value="login">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            Sign in</button>
                        <label class="checkbox pull-left">
                            <input type="checkbox" value="remember-me">
                            Remember me
                        </label>
                        <a href="<%=request.getContextPath()%>/front-end/member/addMember.jsp" class="pull-right need-help">還不是會員嗎? 立即註冊 7Tour 帳號 </a><span class="clearfix"></span>
                    </form>
                </div>
                <a href="#" class="text-center new-account">忘記密碼? </a>
            </div>
        </div>
    </div>

    <style type="text/css">
        body {
            margin-top: 20px;
            background: #ddd;
            background-image: url(<%=request.getContextPath()%>/front-end/member/images/login.jpeg);
            background-size: 100%;
            background-repeat: no-repeat;
        }

        body .text-center>a {
            font-size: 48px;
            color: purple;
        }

        body .text-center>a:hover {
            color: rgba(236, 126, 9, 0.945);
            text-decoration: none;

        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;

        }

         .form-signin .form-signin-heading, 
         .form-signin .checkbox { 
             margin-bottom: 10px; 

        } 

         .form-signin .checkbox { 
            font-weight: normal; 

        } 

        .form-signin .form-control {
            position: relative;
            font-size: 16px;
            height: auto;
            padding: 10px;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;

        }

        .form-signin .form-control:focus {
            z-index: 2;
        }

        .form-signin input[type="text"] {
            margin-bottom: -1px;
            border-bottom-left-radius: 0;
            border-bottom-right-radius: 0;
        }

        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }

        .account-wall {
            /* 登入邊框 */
            margin-top: 20px;
            padding: 40px 0px 20px 0px;
            background-color: #f7f7f7;
            -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            border-radius: 10px;
        }

        .login-title {
            color: #555;
            font-size: 18px;
            font-weight: 400;
            display: block;

        }

        .profile-img {
            width: 96px;
            height: 96px;
            margin: 0 auto 10px;
            display: block;
            -moz-border-radius: 50%;
            -webkit-border-radius: 50%;
            border-radius: 50%;
        }

        .need-help {
            margin:15px 40px  0px 0px;
            
            color:#0CE9EB;
        }

        .new-account {
            display: block;
            margin-top: 10px;
            color:#25DB8C;
            
        }
    </style>

    <script type="text/javascript">

    </script>
</body>

</html>