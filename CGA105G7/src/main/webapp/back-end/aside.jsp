<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="./css/back.css">


</head>





<body>


  <!-- ---------------------aside body區 start--------------------->
  <aside class="aside">

    <img src="images/logo.png" width="80%">

    <ul class="aside_list">
      <li><a href="#">員工管理</a></li>
      <li><a href="#">會員管理</a></li>
      <li><a href="#">客服管理</a></li>
      <li><a href="#">優惠管理</a></li>
      <li><a href="#">論壇管理</a></li>
      <li><a href="#">揪團管理</a></li>
      <li><a href="#">訂房管理</a></li>
      <li><a href="#">景點管理</a></li>

    </ul>
    <h1 style="margin: 0;">使用者 &#58 empName</h1>
    <button><a href="#">登出</a></button>
    <button><a href="#">修改密碼</a></button>

  </aside>
  <!-- ---------------------aside body區 end--------------------->


  <!-- ---------------------function body區 start--------------------->
  <div class="function">

  </div>
  <!-- ---------------------function body區 end--------------------->



  <script>

    $(".aside_list li").click(function () {
      $(this).css("background", "#041427").siblings().css("background", "");
    })
  </script>
</body>
</html>