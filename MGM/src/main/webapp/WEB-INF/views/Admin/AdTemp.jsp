<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>임시 관리자 페이지</title>
<script src="resources/js/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$('button').click(function(){
			$('div').html("등록중");
		});
		var msg = "${msg}";
		if(!(!msg)){
			alert(msg);
			msg=null;
		}
	});
</script>
</head>
<body>
	<!-- <input type="button" value="출마표 등록" onclick="location.href='rcSchInsert.do'"><br> -->
	<input type="button" value="경주마 등록" onclick="location.href='hrInset.do'"><br>
	<input type="button" value="경주마 추가정보" onclick="location.href='hrUpdate.do'"><br>
	<input type="button" value="기수 등록" onclick="location.href='jockeyInput.do'"><br>
	<input type="button" value="조교사 등록" onclick="location.href='trainerInput.do'"><br>
	<input type="button" value="마주 등록" onclick="location.href='owInput.do'"><br>
	<input type="button" value="경기기록 등록" onclick="location.href='rcResultInput.do'"><br>
	<input type="button" value="경기개요 등록" onclick="location.href='raceInfo.do'"><br>
	<div></div>
</body>
</html>