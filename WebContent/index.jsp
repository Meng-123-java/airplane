<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	起飞机场:
	<select>
		<option>请选择</option>
		<c:forEach items="${showTakePort}" var="take">
			<option value="${take.id}">${take.portName}</option>
		</c:forEach>
	</select>
	降落机场:
	<select>
		<option>请选择</option>
		<c:forEach items="${showLandPort}" var="land">
			<option value="${land.id}">${land.portName}</option>
		</c:forEach>
	</select>
	<button>查询</button>
	<table border="1">
		<tr>
			<th>飞机编号</th>
			<th>起飞机场</th>
			<th>起飞城市</th>
			<th>降落机场</th>
			<th>降落城市</th>
			<th>航行时间</th>
			<th>票价（元）</th>
		</tr>
		<c:forEach items="${list }" var="plane">
			<tr>
				<td>${plane.airNo }</td>
				<td>${plane.takeport.portName }</td>
				<td>${plane.takeport.cityName }</td>
				<td>${plane.landport.portName }</td>
				<td>${plane.landport.cityName }</td>
				<td>
					<c:if test="${plane.time%60>0}">
						<c:if test="${(plane.time-plane.time%60)/60>0}">
							${(plane.time-plane.time%60)/60}小时
						</c:if>
						${plane.time%60}分钟
					</c:if>
				</td>
				<td>${plane.price }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
