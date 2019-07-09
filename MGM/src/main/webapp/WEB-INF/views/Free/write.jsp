<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>홈 페이지</title>
</head>
<body>
<h1>게시글 작성 완료</h1>
<table border="2" style="width: 460px;">
   <tr>
         <td>제목</td>
         <td>${title}</td>
      </tr>
<tr>
<tr><td>본문</td></tr>
<tr>
<td colspan="2">${smarteditor}</td>
</tr>

</table>
<input type="button" value="수정"  style="width: 15%; text-align: center;" onclick="location.href='freeupdateform.do'"/>
<input type="button" value="목록"  style="width: 15%; text-align: center;" onclick="location.href='freeboard.do'"/>
</body>
</html>