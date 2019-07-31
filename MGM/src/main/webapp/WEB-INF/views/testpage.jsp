<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testtest</title>
</head>
<body>
	<c:forEach items="${champList}" var="champList">
		<table>
			<tr>
				<td>${champList.rc_date}</td>
				<td>${champList.rc_name}</td>
				<td>${champList.hr_name}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>