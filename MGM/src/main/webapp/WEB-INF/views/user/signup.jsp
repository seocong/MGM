<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<%response.setContentType("text/html;charset=utf-8"); %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<link href="http://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700%7CRoboto:400,500,700" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css" />
	<link rel="stylesheet" href="resources/style.css" type="text/css" />
	<link rel="stylesheet" href="resources/css/dark.css" type="text/css" />
	<link rel="stylesheet" href="resources/css/swiper.css" type="text/css" />
	
	<link rel="stylesheet" href="resources/css/font-icons.css" type="text/css" />
	<link rel="stylesheet" href="resources/one-page/css/et-line.css" type="text/css" />
	<link rel="stylesheet" href="resources/css/animate.css" type="text/css" />
	<link rel="stylesheet" href="resources/css/magnific-popup.css" type="text/css" />

	<link rel="stylesheet" href="resources/css/responsive.css" type="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1"/>

	<!-- Theme Color Stylesheet -->
	<link rel="stylesheet" href="resources/demos/news/css/colors.css" type="text/css" />
	<link rel="stylesheet" href="resources/demos/news/css/fonts.css" type="text/css" />

	<!-- News Demo Specific Stylesheet -->
	<link rel="stylesheet" href="resources/demos/news/news.css" type="text/css" />
	<!-- / -->

	
	<!-- NonProfit Demo Specific Stylesheet -->
	<link rel="stylesheet" href="resources/css/colors.php?color=C6C09C" type="text/css" /> <!-- Theme Color -->
	<link rel="stylesheet" href="resources/demos/nonprofit/css/fonts.css" type="text/css" />
	<link rel="stylesheet" href="resources/demos/nonprofit/nonprofit.css" type="text/css" />
	<!-- Document Title
	============================================= -->
	<title>커뮤니티</title>
</head>

<body class="stretched">

	<!-- Document Wrapper
	============================================= -->
	<div id="wrapper" class="clearfix">


	<!-- <header id="header" class="full-header dark"> -->
	<jsp:include page="../Header.jsp" />
	

		<!-- Slider
		============================================= -->
		<section id="slider" class="slider-element dark swiper_wrapper full-screen force-full-screen slider-parallax clearfix" style="max-height: 400px;">

			<div class="slider-parallax-inner">

				<div class="swiper-container swiper-parent">
					<div class="swiper-wrapper">
						<div class="swiper-slide dark" style="background: linear-gradient(rgba(0,0,0,.3), rgba(0,0,0,.5)), url('resources/demos/nonprofit/images/slider/kuyngma.jpg') no-repeat center center ; background-size: cover;max-height: 400px; ">
							<div class="container clearfix">
								<div class="slider-caption">
									<h2 class="nott" data-animate="fadeInUp">Help the Homeless & Hungry People.</h2>
									<p style="font-size: 17px;" data-animate="fadeInUp" data-delay="200">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem molestiae, cum ratione at temporibus aperiam repudiandae consectetur, illo nam maiores.</p>
									<!-- <a href="#" data-animate="fadeInUp" data-delay="400" class="button button-rounded button-large button-light text-dark bgcolor shadow nott ls0 ml-0 mt-4">Know More</a> -->
								</div>
							</div>
						</div>
						<div class="swiper-slide dark" style="background: linear-gradient(rgba(0,0,0,0), rgba(0,0,0,.8)), url('resources/demos/nonprofit/images/slider/6.jpeg') no-repeat center center; background-size: cover;max-height: 400px;">
							<div class="container clearfix">
								<div class="slider-caption">
									<h2 class="nott" data-animate="fadeInUp">Welcome to Canvas</h2>
									<p style="font-size: 17px;" data-animate="fadeInUp" data-delay="200">Seamlessly transition standardized channels whereas maintainable web services. Competently unleash exceptional portals through timely infomediaries.</p>
									<!-- <a href="#" data-animate="fadeInUp" data-delay="400" class="button button-rounded button-large button-light text-dark bgcolor shadow nott ls0 ml-0 mt-4">Know More</a> -->
								</div>
							</div>
						</div>
					</div>
					<div class="swiper-navs">
						<div class="slider-arrow-left"><i class="icon-line-arrow-left"></i></div>
						<div class="slider-arrow-right"><i class="icon-line-arrow-right"></i></div>
					</div>
					<div class="swiper-scrollbar">
						<div class="swiper-scrollbar-drag">
						<div class="slide-number"><div class="slide-number-current"></div><span>/</span><div class="slide-number-total"></div></div></div>
					</div>
				</div>

			</div>

		</section>
		
		

		<!-- Content
		============================================= -->
		<section id="content">

			<div class="content-wrap nopadding" >

				<div class="container clearfix">

					<div class="row clearfix">


					<jsp:include page="../SideBar.jsp" />
				 


						<!-- Posts Area
						============================================= -->
						<div class="col-lg-9">
						
							<div class="container clearfix">

					<!-- Postcontent
					============================================= -->
					

						<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-user-friends"></i></span> 회원가입</h4>
									<div class="line line-xs line-sports"></div>

							<!-- <div class="form-widget"> -->
							<div class="form-result"></div>

							<form action="signup.do" method="post" class="nobottommargin" id="sign-up">

								<div class="form-process"></div>

								<div class="col_one_third">
									<label for="idBox t700">아이디 <small>*</small></label>
									<input type="text" id="idBox" name="id" class="sm-form-control required mandatory"/>
									<div id="error_id" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="clear"></div>
								
								<div class="col_one_third">
									<label for="nameBox t700">이름 <small>*</small></label>
									<input type="text" id="nameBox" name="name"  class="sm-form-control required mandatory" />
									<div id="error_name" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="clear"></div>
								
								<div class="col_one_third">
									<label for="pwBox t700">비밀번호 <small>*</small></label>
									<input type="password" id="pwBox" name="pw"  class="required  sm-form-control mandatory" />
									<div id="error_pw" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>

								<div class="col_one_third ">
									<label for="pwchkBox t700">비밀번호확인</label>
									<input type="password" id="pwchkBox" name="pwcheck" class="sm-form-control mandatory" />
									<div id="error_pwchk" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
				
								<div class="clear"></div>
								
								<div class="col_one_sixth mr-2" style="display:inline;">
									<label for="yearBox t700">생년월일</label>
									<input type="text" id="yearBox" name="year" class="sm-form-control mandatory" maxlength="4" placeholder="년(4자)"/>
									<div id="error_year" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="col_one_sixth mr-2" style="display:inline;">
									<label for="monthBox t700"><br></label>
									<select id="monthBox" name="month" class="sm-form-control">
										<option value="">월</option>
										<option value="01">1</option>
										<option value="02">2</option>
										<option value="03">3</option>
										<option value="04">4</option>
										<option value="05">5</option>
										<option value="06">6</option>
										<option value="07">7</option>
										<option value="08">8</option>
										<option value="09">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
									</select>
									<div id="error_month" class="pt-1 click_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="col_one_sixth" style="display:inline;">
									<label for="dateBox t700"><br></label>
									<select id="dateBox" name="date" class="sm-form-control">
										<option value="">일</option>
									</select>
								</div>

								<div class="clear"></div>
								
								<div class="col_two_fifth">
									<label for="phnumBox t700">전화번호</label>
									<input type="text" id="phnumBox" name="phnum" class="sm-form-control mandatory" placeholder="숫자만 입력해주세요."/>
									<div id="error_phnum" class="pt-1 blur_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>	
								<div class="col_one_sixth">
									<label for="template-contactform-phone t700" >인증하기</label>
									<input type="button" id="template-contactform-phone" name="template-contactform-phone" value="button" class="sm-form-control" />
								</div>								
								<div class="clear"></div>
								
								<div class="col_one_sixth mb-1 mr-3" >
									<label for="zipcode t700">우편번호 <small>*</small></label>
									<input type="text" id="zipcode" name="zipcode" readonly="readonly" class="required sm-form-control" />
								</div>
								<div class="col_one_sixth mb-1">
									<label for="searchBtn t700" ><br></label>
									<input type="button" id="searchBtn" name="template-contactform-phone" value="우편번호 검색" class="sm-form-control t700" onclick="addrApi()"/>
								</div>
								<div class="clear"></div>
								<div class="col_half mb-1" >
									<label for="address t700">주소<small>*</small></label>
									<input type="text" id="address" name="address" readonly="readonly" class="required sm-form-control" />
									<div id="error_addr" class="pt-1 t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="clear"></div>
								<div class="col_one_fourth">
									<label for="detailAddress t700">상세주소<small>*</small></label>
									<input type="text" id="detailAddress" name="detailAddress"  class="required sm-form-control mandatory" />
									<div id="error_detailAddr" class="pt-1 blur_alert click_alert t700" style="color:#E42C3E; font-size:12px;"></div>
								</div>
								<div class="col_one_fourth">
									<label for="notes t700">참고<small>*</small></label>
									<input type="text" id="notes" name="notes" class="sm-form-control" />
								</div>
								<div class="clear"></div>

							

								<div class="col_full hidden">
									<input type="text" id="template-contactform-botcheck" name="template-contactform-botcheck" value="" class="sm-form-control" />
								</div>

								<div class="col_full">
									<button id="signUpSubmit" class="button button-3d nomargin" type="button">회원가입</button>
									<button class="button button-3d nomargin" type="button" onclick="location.href='main.do'">메인가기</button>
								</div>
							</form>
						<!-- </div> -->
					</div><!-- .postcontent end -->
				</div>		
						<div class="line"></div>
					</div>                                                              <!-- 본문내용끝 -->
				</div> <!-- Container End -->
				</div>
				
			</div>
		</section><!-- #content end -->

		<!-- Footer
		============================================= -->
		<jsp:include page="../Footer.jsp" />
		<!-- #footer end -->

	</div><!-- #wrapper end -->

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

	<!-- SLIDER REVOLUTION 5.x SCRIPTS  -->
	<script src="resources/include/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
	<script src="resources/include/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>

	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.actions.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.carousel.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.kenburn.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.layeranimation.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.migration.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.navigation.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.parallax.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.slideanims.min.js"></script>
	<script src="resources/include/rs-plugin/js/extensions/revolution.extension.video.min.js"></script>

	<!-- ADD-ONS JS FILES -->
	
	</body>
	</html>