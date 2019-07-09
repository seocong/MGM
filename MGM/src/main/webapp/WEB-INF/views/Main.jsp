<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<%response.setContentType("text/html;charset=utf-8"); %> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MGM</title>
<style>
		#container {
			width:960px;
			margin:0 auto;
			text-align:center;
		}
		.tab {
			list-style: none;
			margin: 0;
			padding: 0;
			overflow: hidden;
		}
		
		.tab li {
			float: left;
		}
		
		.tab li a {
			display: inline-block;
			color: #000;
			text-align: center;
			text-decoration: none;
			padding: 14px 16px;
			font-size: 17px;
			transition:0.3s;
		}
		
		.tabcontent {
			display: none;
			background-color:rgb(0,154,200);
			padding: 6px 12px;
			color:#fff;
		}
		ul.tab li.current{
			background-color: rgb(0,154,200);
			color: #222;
		}
		.tabcontent.current {
			display: block;
		}
	</style>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
	<div id="container">
		<h2> tab menu(확인용이니 신경쓰지마시길)</h2>
		
		<ul class="tab">
			<li class="current" data-tab="tab1"><a href="freeboard.do?pagenum=1&contentnum=10">AAAA</a></li>
			<li data-tab="tab2"><a href="#">BBBB</a></li>
			<li data-tab="tab3"><a href="#">CCCC</a></li>
			<li data-tab="tab4"><a href="#">DDDD</a></li>
		</ul>

	</div>

	<script>
		$(function() {
			$('ul.tab li').click(function() {
				var activeTab = $(this).attr('data-tab');
				$('ul.tab li').removeClass('current');
				$('.tabcontent').removeClass('current');
				$(this).addClass('current');
				$('#' + activeTab).addClass('current');
			})
		});
	</script>
</body>
</html>