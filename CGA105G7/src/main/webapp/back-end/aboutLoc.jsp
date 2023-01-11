<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.location.model.LocationVO"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
	LocationVO locVO = (LocationVO)request.getAttribute("locVO");
%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>地點列表</title>
<link rel="stylesheet" href="./css/back.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/listAllLoc.css">
</head>
<body>

	<%@ include file="/back-end/aside.jsp"%>

	<!-- ---------------------main body區 start--------------------->
	<div class="workplace">
		<div class="nav nav-pills">
			<!-- 分頁1 -->
			<button class="nav-link active" data-bs-toggle="tab"
				data-bs-target="#tab-1" aria-selected="true">地點列表</button>
			<!-- 分頁2 -->
			<button class="nav-link" data-bs-toggle="tab" data-bs-target="#tab-2"
				aria-selected="false">新增地點</button>
			<!-- 分頁3 -->
			<button class="nav-link" data-bs-toggle="tab" data-bs-target="#tab-3"
				aria-selected="false">tab3</button>

		</div>
		<!--  分頁內容，若不要分頁可以整塊刪掉 -->
		<div class="tab-content">
			<!-- 分頁1 內容 -->
			<div class="tab-pane  show active" id="tab-1">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">地點名稱</th>
							<th scope="col">經度</th>
							<th scope="col">緯度</th>
							<th scope="col">地址</th>
							<th scope="col">聯絡電話</th>
							<th scope="col">狀態</th>
							<th scope="col">修改</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">tibame</th>
							<td>123</td>
							<td>456</td>
							<td>桃園市xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</td>
							<td>0987873849423428</td>
							<td>上架</td>
							<td><button class="btn btn-primary">修改</button></td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- 分頁2 內容 -->
			<div class="tab-pane" id="tab-2">
				<c:if test="${not empty errorMsgs}">
						<c:forEach var="message" items="${errorMsgs}">

						</c:forEach>
				</c:if>



				<form method="post" action="loc.do" class="container mt-4" enctype="multipart/form-data">
					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="loc_name">地點名稱 : </label> <input
							class="col-5" type="text" name="loc_name" id="loc_name" maxlength="15">
						<div class="col-3 error-msg text-start">${message}</div>
					</div>


					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="">經度 : </label> <input
							class="col-5" type="text" name="longitude" maxlength="30">
						<div class="col-3 error-msg text-start">${message}</div>
					</div>

					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="">緯度 : </label> <input
							class="col-5" type="text" name="latitude" maxlength="30">
						<div class="col-3 error-msg text-start">${message}</div>
					</div>

					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="">地址 : </label> <input
							class="col-5" type="text" name="address" maxlength="30">
						<div class="col-3 error-msg text-start">${message}</div>
					</div>

					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="">聯絡電話 : </label> <input
							class="col-5" type="text" name="phone" maxlength="15">
					</div>

					<div class="row justify-content-start m-3">
						<label class="col-3 text-end" for="">地點圖片 : </label> <input
							class="col-5" type="file" name="loc_pic" accept="image/*">
					</div>

					<input type="hidden" name="action" value="insert">
					<div class="row justify-content-start m-3">
						<div class="col-3 text-end"></div>
						<button class="col-5 btn btn-primary" type="submit">送出新增</button>
					</div>
				</form>





			</div>
			<!-- 分頁3 內容 -->
			<div class="tab-pane" id="tab-3"></div>

		</div>


	</div>
	<!-- ---------------------main body區 end--------------------->


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
		crossorigin="anonymous"></script>
	<script>

    $(".aside_list li").click(function () {
      $(this).css("background", "#041427").siblings().css("background", "");
    })
  </script>
</body>

</html>