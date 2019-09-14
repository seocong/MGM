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
														<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
														<button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
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
								<li><a href="#tabs-2"> 회원관련 </a></li>
								<li><a href="#tabs-3"> 게임관련</a></li>
								<li><a href="#tabs-4"> 포인트관현</a></li>
								<li class="hidden-phone"><a href="#tabs-5"> 기타 </a>
							</ul>

							<div class="tab-container">

								<div class="tab-content clearfix" id="tabs-1">
											<div class="toggle toggle-border nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle Title <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
										</div>
								<div class="tab-content clearfix" id="tabs-2">
									<div class="toggle toggle-border nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle Title <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
								</div>
								<div class="tab-content clearfix" id="tabs-3">
									<div class="toggle toggle-border nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle Title <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
									
								</div>
								<div class="tab-content clearfix" id="tabs-4">
									<div class="toggle toggle-border nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle Title <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
								</div>
								<div class="tab-content clearfix" id="tabs-5">
									<div class="toggle toggle-border nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle Title <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin  nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											<div class="toggle toggle-border notopmargin nobottommargin nobottomborder">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
											
											<div class="toggle toggle-border notopmargin">
												<div class="togglet">
													<i class="icon-quora"></i>This is a Toggle <span
														class=" toggle-closed icon-chevron-down1"
														style="float: right;"></span><span
														class="toggle-open icon-chevron-up1" style="float: right;"></span>
												</div>
												<div class="togglec"><span class="text-warning"><i class="icon-font"></i></span> This is a Toggle Content???</div>
											</div>
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