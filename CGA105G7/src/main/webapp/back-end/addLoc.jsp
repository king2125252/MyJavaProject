<%@page import="com.location.model.LocationVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% 
	LocationVO locVO = (LocationVO)request.getAttribute("locVO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增景點 addLoc</title>
</head>
<body>
<c:if test="${not empty errorMsgs}">
	<font style="color:red">請修正以下錯誤:</font>
	<ul>
		<c:forEach var="message" items="${errorMsgs}">
			<li style="color:red">${message}</li>
		</c:forEach>
	</ul>
</c:if>

	<h3>地點新增 - addLoc.jsp</h3>
	<h3>新增地點</h3>
	<form method="post" action="loc.do" enctype="multipart/form-data">
		<label>地點名稱 : </label>
		<input type="text" name="loc_name" maxlength="15"><br>
		
		<label>經度 : </label>
		<input type="text" name="longitude" maxlength="30"><br>
		
		<label>緯度 : </label>
		<input type="text" name="latitude" maxlength="30"><br>
		
		<label>地址 : </label>
		<input type="text" name="address" maxlength="30"><br>
		
		<label>電話 : </label>
		<input type="text" name="phone" maxlength="15"><br>
		
		<label>地點圖片 : </label>
		<input type="file" name="loc_pic" accept=".jpg,.png,.jpeg"><br>
		
		
		<input type="hidden" name="action" value="insert">
		<input type="submit" value="送出新增">
<!-- 		<button type="submit">送出新增</button> -->
	</form>
</body>
</html>