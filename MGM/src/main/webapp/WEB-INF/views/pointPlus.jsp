<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<%
	response.setContentType("text/html;charset=utf-8");
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="SemiColonWeb" />


<!-- Stylesheets
	============================================= -->
<link
	href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800"
	rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700%7CRoboto:400,500,700"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="resources/css/bootstrap.css"
	type="text/css" />
<link rel="stylesheet" href="resources/style.css" type="text/css" />
<link rel="stylesheet" href="resources/css/dark.css" type="text/css" />
<link rel="stylesheet" href="resources/css/swiper.css" type="text/css" />

<link rel="stylesheet" href="resources/css/font-icons.css"
	type="text/css" />
<link rel="stylesheet" href="resources/one-page/css/et-line.css"
	type="text/css" />
<link rel="stylesheet" href="resources/css/animate.css" type="text/css" />
<link rel="stylesheet" href="resources/css/magnific-popup.css"
	type="text/css" />

<link rel="stylesheet" href="resources/css/responsive.css"
	type="text/css" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Theme Color Stylesheet -->
<link rel="stylesheet" href="resources/demos/news/css/colors.css"
	type="text/css" />
<link rel="stylesheet" href="resources/demos/news/css/fonts.css"
	type="text/css" />

<!-- News Demo Specific Stylesheet -->
<link rel="stylesheet" href="resources/demos/news/news.css"
	type="text/css" />
<!-- / -->
<link rel="stylesheet" href="resources/css/mypage.css" type="text/css" />

<!-- NonProfit Demo Specific Stylesheet -->
<link rel="stylesheet" href="resources/css/colors.php?color=C6C09C"
	type="text/css" />
<!-- Theme Color -->
<link rel="stylesheet" href="resources/demos/nonprofit/css/fonts.css"
	type="text/css" />
<link rel="stylesheet" href="resources/demos/nonprofit/nonprofit.css"
	type="text/css" />
<!-- Document Title
	============================================= -->
<title>커뮤니티</title>
</head>

<body class="stretched">

	<!-- Document Wrapper
	============================================= -->
	<div id="wrapper" class="clearfix">
		<!-- Content
		============================================= -->
		<section id="content">

			<div class="content-wrap nopadding">

				<div class="row nopadding">

					<div class="col-lg-12">

						<div class="col-md-12 mt-3">
							<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
								<span class="text-dark"><i class="icon-email"></i>&nbsp;포인트 등록</span>
							</h4>
							<div class="line line-xs line-sports"></div>
						</div>
						<form id="pointplus" method="post">
						<div class="col-md-12 mt-3">
							<div style="vertical-align: middle;">
							<label for="allMember"><span class="text-gray uppercase" style="font-size:12px; font-weight: bold;">전체 선택 </span></label>&nbsp;<input class="small" id="allMember" type="checkbox" name="allMember" value="all">
							</div>
							<span class="text-dark t700 uppercase">대상 아이디: </span><input id="idbox" type="text" name="id" >
							<button class="memberSearchBtn mt-2" id="memberSearchBtn" type="button">검색</button>
						</div>
						<div class="col-md-12">
						<div id="error_id" class="pt-1 blur_alert t700 ml-5" style="color:#E42C3E; font-size:12px;"></div>
						</div>
						<!-- .postcontent end -->
						<!-- <div class="card-body"> -->
						<div class="col-12 mb-3 mt-2">
							<span class="text-dark t700 uppercase">구&nbsp;&nbsp;&nbsp;분: </span>
							<select id="sign" name="sign" style="border:1px solid #dee2e6; height: 25px;">
								<option value="P">충전</option>
								<option value="M">차감</option>
							</select>
						</div>
						<div class="col-12 mb-3">
							<span class="text-dark t700 uppercase">포인트: </span><input type="text" name="point" id="point" class="col-4" style="border:1px solid #dee2e6;">
						</div>
						<div class="col-12 mb-3">
							<span class="text-dark t700 uppercase">내&nbsp;&nbsp;&nbsp;용: </span><input maxlength="20" type="text" id="reason" name="reason" class="col-4" style="border:1px solid #dee2e6;">
						</div>
						<div><button class="mypageBtn mt-4 mr-4" id="msgClose">취소</button></div>
						<div><button type="button" class="mypageBtn mt-4 mr-2" style="width:80px;" onclick='pointplus()'>확인</button></div>
						<!-- </div> -->
						<div class="mt-4 mb-3"style="border-bottom: solid 1px #dee2e6;"></div>
						</form>
					</div>
				</div>
				<!-- Container End -->
			</div>
		</section>
		<!-- #content end -->
	</div>
	<!-- #wrapper end -->

	<!-- Go To Top
	============================================= -->
	<div id="gotoTop" class="icon-angle-up"></div>


	<!-- External JavaScripts
	============================================= -->
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/plugins.js"></script>
	<script src="resources/js/tabsJs.js"></script>
	<!-- kakao Map api -->
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<!-- signupForm js -->
	<script src="resources/js/user/signup.js"></script>
	<!-- Footer Scripts
	============================================= -->
	<script src="resources/js/functions.js"></script>
	<script src="resources/js/manager.js"></script>
	<!-- SLIDER REVOLUTION 5.x SCRIPTS  -->
	<script
		src="resources/include/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>

	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.actions.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.carousel.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.kenburn.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.layeranimation.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.migration.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.navigation.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.parallax.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.slideanims.min.js"></script>
	<script
		src="resources/include/rs-plugin/js/extensions/revolution.extension.video.min.js"></script>

	<!-- ADD-ONS JS FILES -->

</body>
</html>