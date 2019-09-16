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
	<!-- paging -->
	<link rel="stylesheet" href="resources/css/mypage.css" type="text/css" />
	
	<!-- Document Title
	============================================= -->
	<title>커뮤니티</title>

	

</head>

<body class="stretched">

	<!-- Document Wrapper
	============================================= -->
	<div id="wrapper" class="clearfix">


	<!-- <header id="header" class="full-header dark"> -->
	<jsp:include page="Header.jsp" />
	

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


					<jsp:include page="SideBar.jsp" />
				 


						<!-- Posts Area
						============================================= -->
						<div class="col-lg-9">
						
						<div class="col-md-12 mt-5">
							<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-chalkboard"></i></span> FAQ</h4>
									<div class="line line-xs line-sports"></div>
							</div>
						<div>
							<div class="col_two_fifth">
								<table class="table" style="border-bottom: solid #DDD 1px;white-space: nowrap;">
								<tr>
												<td><h4>자주 묻는 질문 검색</h4></td>
								</tr>
												<tr>
												<td>
													<form class="form-inline my-2 my-lg-0">
														<input class="form-control mr-sm-2 faqSearch" type="search" placeholder="질문 검색" aria-label="Search">
														<!-- <button class="btn btn-outline-success my-2 my-sm-0 faqSearchBtn" type="button">검색</button> -->
													</form>
												</td>
											</tr>
											
											</table>
							</div>
							
								
								<div class="col_one_fifth">
						<div class="feature-box fbox-small fbox-plain" data-animate="fadeIn" data-delay="600">
							<div class="fbox-icon">
								<a href="#"><i class="icon-search"></i></a>
							</div>
							<h3>자주 묻는 질문</h3>
							<p>질문사항을 검색하거나 찾으실수 있습니다.</p>
						</div>
					</div>

					<div class="col_one_fifth">
						<div class="feature-box fbox-small fbox-plain" data-animate="fadeIn" data-delay="800">
							<div class="fbox-icon">
								<a href="#"><i class=icon-question></i></a>
							</div>
							<h3>문의 게시판 문의</h3>
							<p>자주 묻는 질문에 없다면 문의 사항 게시판에 질문을 해주세요.</p>
						</div>
					</div>

					<div class="col_one_fifth col_last">
						<div class="feature-box fbox-small fbox-plain" data-animate="fadeIn" data-delay="1000">
							<div class="fbox-icon">
								<a href="#"><i class="icon-line-mail"></i></a>
							</div>
							<h3>메일 문의</h3>
							<p>관리자에게 메일로 문의 주세요 확인 즉시 답변을 해드립니다.</p>
						</div>
					</div>
							
						</div>
						<div class="line"></div>
						<div class="clear"></div>
						<div >
								
								
											
											
											<div class="tabs tabs-responsive clearfix">

							<ul class="tab-nav tab-nav2 clearfix">
								<li><a href="#tabs-1"> 전체 </a></li>
								<li><a href="#tabs-1"> 회원관련 </a></li>
								<li><a href="#tabs-1"> 게임관련</a></li>
								<li><a href="#tabs-1"> 포인트관련</a></li>
								<li class="hidden-phone"><a href="#tabs-1"> 기타 </a>
							</ul>

							<div class="tab-container">

								<div class="tab-content tab-container notopmargin toggle toggle-border pt-0 clearfix faqBox" style="border-left:0;border-top:0;border-right:0;" id="tabs-1">
								<div id="member">
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">회원가입은 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
													<div class="togglec">
														<span class="text-warning"><i class="icon-font"></i></span>
														회원가입은 묻지마 홈페이지에서 가능하며,<br> 본인 명의의 핸드폰 인증을 통하여 1개의
														아이디만 가입 가능하며, <br> 중복 가입은 불가합니다. <br>
														아래 링크를 누르면 회원가입 페이지로 이동합니다. <br>
														<a href="termService.do">회원가입</a>
													</div>
												</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">회원탈퇴는 어디서 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>
												묻지마 홈페이지 로그인 후, <br>
[마이페이지 > 프로필 정보 > 회원탈퇴] 메뉴에서 진행하시면 됩니다. <br>
												
												</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">개인정보 수정은 어떻게 하나요? <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 홈페이지 로그인 후, <br>
[마이페이지 > 프로필 정보 > 정보수정] 메뉴에서 진행하시면 됩니다. <br>
												</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">아이디는 변경 가능한가요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>시스템상의 이유로 가입된 아이디는 변경할 수 없습니다. <br>
아이디 변경을 원하시면 회원탈퇴 이후 새로운 아이디로 가입하여야 합니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">비밀번호는 어떻게 변경하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 홈페이지 로그인 후, <br>
[마이페이지 > 프로필 정보 > 정보수정] 메뉴에서 진행하시면 됩니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">핸드폰 번호는 어떻게 변경하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 홈페이지 로그인 후, <br>
[마이페이지 > 프로필 정보 > 정보수정] 메뉴에서 진행하시면 됩니다. <br>
핸드폰 인증 시 본인명의가 아닐 경우 핸드폰 번호 변경이 불가합니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">아이디 / 비밀번호를 잊어버렸을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>로그인 버튼 하단 아이디, 비밀번호 찾기에서 진행하시면 됩니다. <br>
아이디 및 비밀번호를 찾을 경우 핸드폰 인증이 필요함으로 <br>
반드시 핸드폰을 지참후에 진행하시길 바랍니다. <br>
핸드폰을 이용할 수 없을 시 고객센터(wndsdldi@hanmail.net)로 문의바랍니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">핸드폰에 인증문자가 오지 않을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>1. 핸드폰스팸 메시지 확인<br>

2. 핸드폰스팸 설정 확인 > 스팸 차단 해제 후 다시 시도<br>
- 1899 번호로 발송되는 문자를 수신 거부한 경우, 인증번호를 수신할 수 없습니다. <br>

스팸 필터링 또는 스팸 차단 부가 서비스 등으로 수신 차단되거나, <br>
통화품질 쪽 관련 문제로 수신이 불가능할 수도 있습니다. <br>

핸드폰 통신사에 문의하여 인증번호 문자 수신 여부에 대해 확인해 보시기 바랍니다. <br>

[통신사 고객센터] <br>
- SK 텔레콤 : 핸드폰에서 국번 없이 114<br>
- KT : 핸드폰에서 국번 없이 100<br>
- LG U+ : 핸드폰에서 국번 없이 114 또는 1544-0010<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">핸드폰 인증정보가 일치하지 않는다고 나올 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>대소문자, 띄어쓰기를 모두 구별하여 인증정보를 입력하여야 하며, <br>
계속 입력정보가 일치하지 않는다는 메시지가 나올 경우, <br>
고객센터(wndsdldi@hanmail.net)로 문의바랍니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">다른 사람 명의 핸드폰 번호로 가입가능 한가요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마는 보안과 개인정보분쟁의 이유로 <br>
본인 명의의 핸드폰으로만 가입을 허가하고 있습니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">회원가입 시 등록된 핸드폰 번호라고 메시지가 나올 경우 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마는 본인명의의 핸드폰 번호당 1개의 아이디만 가입이 가능합니다. <br>
만약 본인이 가입한 경우가 아니라면, <br>
이전 가입자의 핸드폰 번호이동 등을 가입시 번호가 중복 될 수 있습니다. <br>
이미 서버에 입력된 핸드폰 번호의 경우 가입이 불가능함으로<br>
고객센터(wndsdldi@hanmail.net)로 문의바랍니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">회원등급이 변경이 안될 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>회원등급 기준 <br>
0~2000 포인트 -> “”<br>
2000~4000 포인트 -> “”<br>
4000~6000 포인트 -> “”<br>
6000~8000 포인트 -> “”<br>
8000~10000 포인트 -> “”<br>
해당 포인트 기준에 따라 회원등급은 자동으로 변경됩니다. <br>
해당 포인트 기준을 충족시에도 회원등급이 변경되지 않을 경우, <br>
새로고침 및 재로그인을 통하여 다시 한번 확인바랍니다. <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">회원탈퇴 후 같은 아이디로 가입이 가능한가요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 가입 약관에 따라 회원정보는 탈퇴 이후 부정 이용 방지를 위해<br>
3개월 동안 보존되며, <br>
이에 따라 동일한 3개월이내 동일한 아이디로는 재가입이 불가능합니다. <br>
</div>
											</div>
											</div>
											<div id="point">
											<!-- 포인트 -->
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">포인트 정보가 다르게 나올 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>새로고침 및 재로그인을 통해 다시 한번 확인 부탁드립니다. <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게임 후에 포인트가 정산이 되지 않습니다.</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>게임 이 후 서버의 지연으로 다소 늦춰질 경우가 발생할 수도 있습니다. <br>
10~20초 후 새로고침 및 재로그인을 통해 다시 한번 확인 부탁드리며, <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">포인트는 어디에 사용하는 건가요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 홈페이지 내에서 포인트는 홈페이지 메인화면에 게임 이용과 <br>
회원등급 기준을 나누는데 사용됩니다. <br>
게임 이용방법은 메인페이지와 [FAQ > 게임]탭에서 확인 가능합니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">포인트는 어떻게 얻을 수 있나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span><묻지마 포인트 지급 규칙><br>
최초 회원가입: 100p<br>
게시글 작성 시: 50p<br>
게시글 댓글 작성 시: 10p<br>
	메인페이지 게임 이용: 승 100p<br>
                              패 -50p<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게임 베팅 시 포인트가 부족하다고 나올때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>메인페이지 우측 상단 포인트 또는 [마이페이지]에서 <br>
포인트를 다시 한번 확인해 보시길 바랍니다. <br>
포인트 이상이 없을 경우에 계속적으로 문제가 발생한다면, <br>
고객센터(wndsdldi@hanmail.net)로 문의 바랍니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">포인트 사용내역은 어디서 확인할 수 있나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>메인페이지 우측 상단 [마이페이지]를 통해 <br>
해당 페이지로 이동 후 확인 가능합니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게시판에 글 작성 후에 포인트가 들어오지 않을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>새로고침 및 재로그인을 통해 다시 한번 확인 부탁드립니다. <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게임은 어떻게 이용하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>메인페이지 하단 베팅 버튼을 사용하여 게임에 참가할 수 있으며, <br>
베팅을 희망하는 말 번호에 맞추어 해당 버튼을 클릭하시면 됩니다. <br>
게임 참가를 위해서 최소 50p가 필요하며, <br>
승리 시 100p가 추가되며 패배 시 50p가 차감됩니다. <br>
</div>
											</div>
											</div>
											<div id="game">
											<!-- 게임 -->
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게임 규칙을 모르겠어요.</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 홈페이지내 게임은 일반 경마와 동일하며 승리할 것 같은 말에<br>
게임 하단 베팅 버튼을 통해 베팅하시면 됩니다. <br>
승리할 것 같은 말에 베팅을 하면 경기 내용에 따라 포인트가 지급됩니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">게임이 실행되지 않을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>해당 페이지는 구글의 크롬이용을 권장하며, <br>
IE(익스플로러)10 이하의 버전에서는 원활하게 작동이 안될 수도 있습니다. <br>
또는 개인 방화벽이나 현재 사용하시는 백신프로그램에 따라 해당 페이지가 차단될 수<br>
 있으니 확인 후에 이용 부탁드립니다. <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
											</div>
											<div id="etc">
											<!--  기타 -->
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">지난경기 정보가 나오지 않을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>서버 지연으로 인해 해당 게임 정보 업로드가 늦어질 수 있습니다. 30초~1분 후에 <br>
새로고침을 해보시기 바랍니다. <br>
문제가 계속될 시 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다<br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">경품 받을 주소지가 다를 경우 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마 이벤트 경품의 경우 회원정보를 토대로 경품이 발송됩니다. <br>
다른 주소지에서 경품을 받기를 희망하실 경우 <br>
고객센터(wndsdldi@hanmail.net)를 통해 주소지 변경요청이 가능합니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">이벤트 신청은 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>해당 이벤트 페이지 이동 후 페이지 하단 이벤트 응모하기를 통해 <br>
이벤트 참여가 가능합니다. <br>
자동 응모 이벤트의 경우 당첨 시 핸드폰으로 개별 통보를 해드리고 있습니다. <br>
</div>
											</div>
												<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">채팅이 되지 않을 때는 어떻게 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>해당 페이지는 구글의 크롬이용을 권장하며, <br>
IE(익스플로러)10 이하의 버전에서는 원활하게 작동이 안될 수도 있습니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">경마정보가 나오지 않을 때는 어떻게 하나요? </span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마의 경마정보는 마사회에서 제공하는 API를 이용하고 있으며,. <br>
마사회 혹은 공공데이터포털의 서버 문제로 정보를 제공받지 못 할 수도 있습니다. <br>
홈페이지 재접속 혹은 새로고침 후에도 문제가 계속 될 경우, <br>
고객센터(wndsdldi@hanmail.net)로 문의 바랍니다. <br>
												</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">화면이 글씨가 겹치거나 표가 일그러져서 나옵니다.</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>묻지마는 컴퓨터를 기준으로 홈페이지를 운영하고 있으며, <br>
핸드폰이나 태블릿에서는 원활하게 이용이 불가능할 수도 있습니다. <br>
</div>
											</div>
											<div class="toggle toggle-border nobottommargin nobottomborder" data-visible="visible">
												<div class="togglet">
													<i class="icon-quora"></i><span class="searchSpan">1:1 문의는 어디서 하나요?</span><span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span>1:1 문의는 페이지 상단 [커뮤니티 > 문의게시판]에서 1:1 문의가 가능하며, <br>
게시판을 이용한 문의는 묻지마 홈페이지 회원만 가능합니다. <br>
비회원의 경우 고객센터(wndsdldi@hanmail.net)로 문의 바랍니다. <br>
</div>
											</div>
											</div>
										</div>
										<div id="pageBox" data-pageNum="0">
										
										</div>
							</div>

						</div>
											
											
											
											</div>
										
										

						
						<div class="line"></div>
						
						

					
						
					
						
				
					</div>                                                              <!-- 본문내용끝 -->
				</div> <!-- Container End -->
				</div>
				
			</div>
		</section><!-- #content end -->

		<!-- Footer
		============================================= -->
		<jsp:include page="Footer.jsp" />
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
	<script src="resources/js/FAQ.js"></script>

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