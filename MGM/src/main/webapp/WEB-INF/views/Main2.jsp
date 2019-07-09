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
	<title>News Demo | Canvas</title>

	<style>
		/* Revolution Slider Styles */
		.hesperiden .tp-tab { border-bottom: 0; }
		.hesperiden .tp-tab:hover,
		.hesperiden .tp-tab.selected { background-color: #E5E5E5; }

	</style>

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
						
						
						
							<div class="row clearfix"> 
						<!-- <div class="fancy-title title-dotted-border">
						
						</div> -->
						
							
								<div class="col-md-5 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-user-friends"></i></span> 커뮤니티</h4>
									<div class="line line-xs line-sports"></div>
								<div class="card border">
											<!-- <div class="card-header p-3 pl-4 bg-transparent">
												<h4 class="ls1 mb-0 uppercase t700" style="font-size: 120%;"><span class="text-warning"><i class="icon-chess-knight"></i></span> 커뮤니티</h4>
											</div> -->
											<div class="card-body">
										<div class="scroll-wrap" style="height: 400px;">
													<div class="scroll"> 
									<!-- Post Article -->
									<!-- <article class="ipost">
										<div class="entry-image mb-3">
											<a href="#"><img src="resources/demos/news/images/posts/lifestyle/1.jpg" alt="Image 3"></a>
											<div class="entry-categories"><a href="#" class="bg-lifestyle">lifestyle</a></div>
										</div>
										<div class="entry-title">
											<h3><a href="#">Death, lifestyle And Taxes</a></h3>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-time"></i><a href="#">11 Mar 2016</a></li>
										</ul>
										<div class="entry-content mt-0 clearfix">
											<p>Pellentesque hic illo beatae rhoncus sint, quis, fugiat imperdiet unde architecto magna dui hymenaeos autem lorem eligendi, quae! Orci commodo, aute reiciendis, scelerisque inceptos, quibusdam iste debitis? Venenatis. Alias porta?</p>
										</div>
									</article> -->
									<div class="tabs nobottommargin clearfix">
										<!-- <h4 class="mb-0 pr-2 ls1 uppercase t700">커뮤니티</h4>
										<br> -->
										<ul class="tab-nav clearfix">
											<li><a href="#tabs-1">인기글</a></li>
											<li><a href="#tabs-2">공지</a></li>
											<li><a href="#tabs-3">자유게시판</a></li>
											<li><a href="#tabs-4">유머게시판</a></li>
											<!-- <li><a href="#tabs-3"><i class="icon-comments-alt norightmargin"></i></a></li> -->
										</ul>
										
										<div class="tab-container" >

											<div class="tab-content clearfix" id="tabs-1" >
											<div id="recent-post-list-sidebar">
													 <div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-secondary"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding" >07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-danger"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-warning"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>													
														</div>
													</div>
														<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-secondary"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-secondary"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-danger"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >인기글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-2">
												<div id="recent-post-list-sidebar">
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													 <div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding" >07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>													
														</div>
													</div>
														<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >공지사항입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >전체공지사항입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-3">
												<div id="recent-post-list-sidebar">
													 <div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding" >07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
														<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>													
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >자유게시판글입니다.이번주부터는 열심히 합시다</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
												</div>
											</div>
												<div class="tab-content clearfix" id="tabs-4">
												<div id="recent-post-list-sidebar">
													 <div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남rlasasdfasdfasdfas</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding" >07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
														<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남werqrqwerwqrsef</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-full"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>													
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남asdfsafsadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남aheresadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>															
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남asdfsfadf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남aasdfasafsadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-half"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남asdfsadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-three-quarters"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남asdfsafsadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-empty"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
													<div class="spost pt-0  notopborder clearfix">
														<div class="row no-gutters">
															<div class="col-lg-7 "  >김일남김일남김일남asdfsafsadfasdf</div>
															<div class="col-lg-3 nopadding"><span class="text-dark"><i class="icon-battery-quarter"></i></span> admin</div>
															<div class="col-lg-2 nopadding">07.03</div>														
														</div>
													</div>
												</div>
											</div>	
										</div>
										</div>
										</div>
										</div>
										</div>
										<a href="#" class="card-footer ls1 uppercase t700 text-white btn-block border-top-0 text-center" style="background-color: #3A486E;">커뮤니티바로가기</a>	<!--카드세션-->
									</div>
								</div>

								<div class="col-md-7 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size:120%;"><span class="text-success "><i class="icon-gamepad"></i></span> 미니게임존</h4>
									<div class="line line-xs line-sports"></div>
								<form action="#">
								<div class="card border">
											
											<div class="card-body nopadding">
									<!-- Post Article -->
									<article class="ipost">
									<div class="entry-image mb-3">
												<iframe width="560" height="315" src="https://www.youtube.com/embed/6ZfuNTqbHE8" allowfullscreen style="border: 0;"></iframe>
											</div>
										<!-- <div class="entry-image mb-3">
											<a href="#"><img src="resources/demos/news/images/posts/fashion/1.jpg" alt=""></a>
											<div class="entry-categories"><a href="#" class="bg-fashion">Fashion</a></div>
										</div>
										<div class="entry-title">
											<h4 class="t600"><a href="#">The Ultimate Guide To Fashion</a></h4>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-time"></i><a href="#">11 Mar 2016</a></li>
										</ul>
										<div class="entry-content mt-0 clearfix">
											<p>Tempus nullam sed ullam doloremque unde habitasse auctor tortor. Cursus, culpa numquam ut esse, harum alias? Lorem. Mattis eum, placeat eius turpis quam dapibus, eius quia atque tristique nostrud reiciendis</p>
										</div> -->
									</article>
									
									
									
									<article class="spost clearfix " >
										<ul class="entry-meta clearfix" >
										<li><a href="#" class="button button-border button-rounded button-red">PICK</a></li>
										<li><a href="#" class="button button-border button-rounded button-yellow">PICK</a></li>
										<li><a href="#" class="button button-border button-rounded button-green">PICK</a></li>
										<li><a href="#" class="button button-border button-rounded button-black">PICK</a></li>
										<li><a href="#" class="button button-border button-rounded button-blue">PICK</a></li>
										</ul>									
									</article>
									</div>
								</div>
									<br><input type="submit" value="BET" class="button button-rounded button-reveal button-large button-border tright" style="float: right;">
										</form>
								</div>
								
								
							<!-- Ad
							============================================= -->
							<!-- <a href="#"><img src="resources/demos/news/images/ad/728x90.jpg" width="728" alt="Ad" class="mt-5 mt-lg-2 mb-4 mb-lg-3 aligncenter"></a> -->
							
							<div class="col-md-12 mt-4">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-secondary"><i class="icon-bars1"></i></span> 지난경기내역</h4>
									<div class="line line-xs line-sports"></div>
								<div class="card border" >
											
											<div class="card-body">
											<div class="tabs tabs-responsive clearfix">

							<ul class="tab-nav tab-nav2 clearfix">
								<li><a href="#tabs-9"> 68회차경기내역 </a></li>
								<li><a href="#tabs-10"> 일일통계 </a></li>
								<li><a href="#tabs-11"> 일주통계 </a></li>
								<li class="hidden-phone"><a href="#tabs-12"> 일년통계 </a></li>
							</ul>

							<div class="tab-container">

								<div class="tab-content clearfix" id="tabs-9">
									Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris. Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo. Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat. Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.
								</div>
								<div class="tab-content clearfix" id="tabs-10">
									Morbi tincidunt, dui sit amet facilisis feugiat, odio metus gravida ante, ut pharetra massa metus id nunc. Duis scelerisque molestie turpis. Sed fringilla, massa eget luctus malesuada, metus eros molestie lectus, ut tempus eros massa ut dolor. Aenean aliquet fringilla sem. Suspendisse sed ligula in ligula suscipit aliquam. Praesent in eros vestibulum mi adipiscing adipiscing. Morbi facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla. Aliquam erat volutpat. Pellentesque convallis. Maecenas feugiat, tellus pellentesque pretium posuere, felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris consectetur tortor et purus.
								</div>
								<div class="tab-content clearfix" id="tabs-11">
									<p>Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.</p>
									
								</div>
								<div class="tab-content clearfix" id="tabs-12">
									Praesent in eros vestibulum mi adipiscing adipiscing. Morbi facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla. Aliquam erat volutpat. Pellentesque convallis. Maecenas feugiat, tellus pellentesque pretium posuere, felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris consectetur tortor et purus.
								</div>

							</div>

						</div>
											
											</div>
											</div>
											</div>
							
							
							<!-- Articles
							============================================= -->
						
						</div>
						
						
						
						
						 <div class="row clearfix"> 
							<!-- <div class="line line-xs line-market"></div> -->
								<div class="col-md-6 mt-4">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-warning"><i class="icon-note"></i></span> 경주결과</h4>
									<div class="line line-xs line-sports"></div>
							<div class="card border">
											
											<div class="card-body">
											<div class="scroll-wrap" style="height: 500px;">
													<div class="scroll"> 
									<!-- Post Article -->
									<!-- <article class="ipost">
										<div class="entry-image mb-3">
											<a href="#"><img src="resources/demos/news/images/posts/lifestyle/1.jpg" alt="Image 3"></a>
											<div class="entry-categories"><a href="#" class="bg-lifestyle">lifestyle</a></div>
										</div>
										<div class="entry-title">
											<h3><a href="#">Death, lifestyle And Taxes</a></h3>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-time"></i><a href="#">11 Mar 2016</a></li>
										</ul>
										<div class="entry-content mt-0 clearfix">
											<p>Pellentesque hic illo beatae rhoncus sint, quis, fugiat imperdiet unde architecto magna dui hymenaeos autem lorem eligendi, quae! Orci commodo, aute reiciendis, scelerisque inceptos, quibusdam iste debitis? Venenatis. Alias porta?</p>
										</div>
									</article> -->
									<div class="tabs nobottommargin clearfix" id="sidebar-tabs">
										<!-- <h4 class="mb-0 pr-2 ls1 uppercase t700">커뮤니티</h4>
										<br> -->
										<ul class="tab-nav clearfix">
											<li><a href="#tabs-1">6월28일(금)</a></li>
											<li><a href="#tabs-2">6월29일(토)</a></li>
											<li><a href="#tabs-3">6월30일(일)</a></li>
											
											<!-- <li><a href="#tabs-3"><i class="icon-comments-alt norightmargin"></i></a></li> -->
										</ul>
										
										<div class="tab-container">

											<div class="tab-content clearfix" id="tabs-1">
												<div id="popular-post-list-sidebar">

							<div class="table-responsive">
							<table class="table table-striped">
								<thead>
								  <tr>
									<th>경주</th>
									<th>1착</th>
									<th>2착</th>
									<th>3착</th>
									<th>복승</th>
									<th>쌍승</th>
									<th>삼복승</th>
								  </tr>
								</thead>
								<tbody>
								  <tr>
									<td>서1R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서2R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>서3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								  <tr>
									<td>서4R</td>
									<td>⑫금매애크미</td>
									<td>②투더빅토리</td>
									<td>①만석지기</td>
									<td>17.5</td>
									<td>32.7</td>
									<td>22.7</td>
								  </tr>
								  <tr>
									<td>부1R</td>
									<td>②영성스타</td>
									<td>⑩유로신화</td>
									<td>⑧담양최강</td>
									<td>5.8</td>
									<td>6.6</td>
									<td>11.8</td>
								  </tr>
								  <tr>
									<td>서5R</td>
									<td>⑧업라이트</td>
									<td>⑦황금들판</td>
									<td>⑥슈퍼토끼</td>
									<td>13.3</td>
									<td>22.2</td>
									<td>23.1</td>
								  </tr>
								    <tr>
									<td>부2R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서6R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>부3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								    <tr>
									<td>서7R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								</tbody>
							</table>
						</div>
													
													
													

												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-2">
												<div id="recent-post-list-sidebar">

													<div class="table-responsive">
							<table class="table table-striped">
								<thead>
								  <tr>
									<th>경주</th>
									<th>1착</th>
									<th>2착</th>
									<th>3착</th>
									<th>복승</th>
									<th>쌍승</th>
									<th>삼복승</th>
								  </tr>
								</thead>
								<tbody>
								  <tr>
									<td>서1R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서2R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>서3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								  <tr>
									<td>서4R</td>
									<td>⑫금매애크미</td>
									<td>②투더빅토리</td>
									<td>①만석지기</td>
									<td>17.5</td>
									<td>32.7</td>
									<td>22.7</td>
								  </tr>
								  <tr>
									<td>부1R</td>
									<td>②영성스타</td>
									<td>⑩유로신화</td>
									<td>⑧담양최강</td>
									<td>5.8</td>
									<td>6.6</td>
									<td>11.8</td>
								  </tr>
								  <tr>
									<td>서5R</td>
									<td>⑧업라이트</td>
									<td>⑦황금들판</td>
									<td>⑥슈퍼토끼</td>
									<td>13.3</td>
									<td>22.2</td>
									<td>23.1</td>
								  </tr>
								    <tr>
									<td>부2R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서6R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>부3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								    <tr>
									<td>서7R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								</tbody>
							</table>
						</div>

												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-3">
												<div id="recent-post-list-sidebar">

													<div class="table-responsive">
							<table class="table table-striped">
								<thead>
								  <tr>
									<th>경주</th>
									<th>1착</th>
									<th>2착</th>
									<th>3착</th>
									<th>복승</th>
									<th>쌍승</th>
									<th>삼복승</th>
								  </tr>
								</thead>
								<tbody>
								  <tr>
									<td>서1R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서2R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>서3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								  <tr>
									<td>서4R</td>
									<td>⑫금매애크미</td>
									<td>②투더빅토리</td>
									<td>①만석지기</td>
									<td>17.5</td>
									<td>32.7</td>
									<td>22.7</td>
								  </tr>
								  <tr>
									<td>부1R</td>
									<td>②영성스타</td>
									<td>⑩유로신화</td>
									<td>⑧담양최강</td>
									<td>5.8</td>
									<td>6.6</td>
									<td>11.8</td>
								  </tr>
								  <tr>
									<td>서5R</td>
									<td>⑧업라이트</td>
									<td>⑦황금들판</td>
									<td>⑥슈퍼토끼</td>
									<td>13.3</td>
									<td>22.2</td>
									<td>23.1</td>
								  </tr>
								    <tr>
									<td>부2R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								  <tr>
									<td>서6R</td>
									<td>⑨러닝복스</td>
									<td>⑥버킥풀골드</td>
									<td>⑩사이먼퀸</td>
									<td>2.0</td>
									<td>2.7</td>
									<td>8.6</td>
								  </tr>
								  <tr>
									<td>부3R</td>
									<td>⑩금순이스타</td>
									<td>⑤킹오브이글</td>
									<td>⑫달리는웅지</td>
									<td>6.1</td>
									<td>10.8</td>
									<td>16.2</td>
								  </tr>
								    <tr>
									<td>서7R</td>
									<td>⑥소망의탑</td>
									<td>⑤다시두손</td>
									<td>⑦골드히어로</td>
									<td>19.9</td>
									<td>43.6</td>
									<td>292.2</td>
								  </tr>
								</tbody>
							</table>
						</div>

												</div>
											</div>
												
										</div>
										</div>
										</div>
										</div>
										</div>
										<a href="#" class="card-footer ls1 uppercase t700 text-white btn-block border-top-0 text-center" style="background-color: #3A486E;">더보기</a>	<!--카드세션-->
										</div>
										</div>
										
							
							 
								<div class="col-md-6 mt-4">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-info"><i class="icon-chess-knight"></i></span> NEWS</h4>
									<div class="line line-xs line-sports"></div>
							<div class="card border">
											
											<div class="card-body">
											<div class="scroll-wrap" style="height: 500px;">
													<div class="scroll"> 
									<!-- Post Article -->
									<!-- <article class="ipost">
										<div class="entry-image mb-3">
											<a href="#"><img src="resources/demos/news/images/posts/lifestyle/1.jpg" alt="Image 3"></a>
											<div class="entry-categories"><a href="#" class="bg-lifestyle">lifestyle</a></div>
										</div>
										<div class="entry-title">
											<h3><a href="#">Death, lifestyle And Taxes</a></h3>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-time"></i><a href="#">11 Mar 2016</a></li>
										</ul>
										<div class="entry-content mt-0 clearfix">
											<p>Pellentesque hic illo beatae rhoncus sint, quis, fugiat imperdiet unde architecto magna dui hymenaeos autem lorem eligendi, quae! Orci commodo, aute reiciendis, scelerisque inceptos, quibusdam iste debitis? Venenatis. Alias porta?</p>
										</div>
									</article> -->
									<div class="tabs nobottommargin clearfix" id="sidebar-tabs">
										<!-- <h4 class="mb-0 pr-2 ls1 uppercase t700">커뮤니티</h4>
										<br> -->
										<ul class="tab-nav clearfix">
											<li><a href="#tabs-1">전체</a></li>
											<li><a href="#tabs-2">뉴스</a></li>
											<li><a href="#tabs-3">마사회행사</a></li>
											
											<!-- <li><a href="#tabs-3"><i class="icon-comments-alt norightmargin"></i></a></li> -->
										</ul>
										
										<div class="tab-container">

											<div class="tab-content clearfix" id="tabs-1">
												<div id="popular-post-list-sidebar">
												
													<div class="ipost mb-4 mb-lg-4 row clearfix">
									<div class="col-md-6">
										<div class="entry-image mb-0">
											<a href="#"><img src="resources/demos/news/images/posts/sports/2.jpg" alt="Image"></a>
											<div class="entry-categories"><a href="#" class="bg-sports">sports</a></div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="entry-title mt-lg-0 mt-3">
											<h3><a href="#">Papers: Real Madrid plot Pogba bid</a></h3>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-line-clock"></i>11 Mar 2016</li>
											<li><a href="#"><i class="icon-camera-retro"></i></a></li>
										</ul>
										<div class="entry-content mt-0">
											<p>Asperiores, tenetur, blanditiis, quaerat odit ex exercitationem pariatur quibusdam veritatis quisquam laboriosam esse beatae hic perferendis.</p>
										</div>
									</div>
								</div>
								<div class="line" ></div>
								
								<div class="ipost mb-4 mb-lg-4 row clearfix">
									<div class="col-md-6">
										<div class="entry-image mb-0">
											<div class="fslider" data-arrows="false" data-speed="400" data-pause="4000">
												<div class="flexslider">
													<div class="slider-wrap">
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/posts/food/4.jpg" alt="Image 1"></a>
														</div>
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/posts/fashion/4.jpg" alt="Image 2"></a>
														</div>
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/posts/travel/3.jpg" alt="Image 2"></a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="entry-title mt-lg-0 mt-3">
											<h3><a href="#">Toyotas next minivan will let you shout at your kids without turning around</a></h3>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-line-clock"></i>11 Mar 2016</li>
											<li><a href="#"><i class="icon-camera-retro"></i></a></li>
										</ul>
										<div class="entry-content mt-0">
											<p>Asperiores, tenetur, blanditiis, quaerat odit ex exercitationem pariatur quibusdam veritatis quisquam laboriosam esse beatae hic perferendis.</p>
										</div>
									</div>
								</div>
								
								
													<!-- <div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/3.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Debitis nihil placeat, illum est nisi</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 35 Comments</li>
															</ul>
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/2.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Elit Assumenda vel amet dolorum quasi</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 24 Comments</li>
															</ul>
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/1.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Lorem ipsum dolor sit amet, consectetur</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 19 Comments</li>
															</ul>
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>Site Admin:</strong> Deleniti magni labore laboriosam odio...
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/2.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Elit Assumenda vel amet dolorum quasi</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 24 Comments</li>
															</ul>
														</div>
													</div> -->

												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-2">
												<div id="recent-post-list-sidebar">

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/1.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Lorem ipsum dolor sit amet, consectetur</a></h4>
															</div>
															<ul class="entry-meta">
																<li>10th July 2014</li>
															</ul>
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/2.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Elit Assumenda vel amet dolorum quasi</a></h4>
															</div>
															<ul class="entry-meta">
																<li>10th July 2014</li>
															</ul>
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/3.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Debitis nihil placeat, illum est nisi</a></h4>
															</div>
															<ul class="entry-meta">
																<li>10th July 2014</li>
															</ul>
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>Site Admin:</strong> Deleniti magni labore laboriosam odio...
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/2.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Elit Assumenda vel amet dolorum quasi</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 24 Comments</li>
															</ul>
														</div>
													</div>

												</div>
											</div>
											<div class="tab-content clearfix" id="tabs-3">
												<div id="recent-post-list-sidebar">

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>John Doe:</strong> Veritatis recusandae sunt repellat distinctio...
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>Mary Jane:</strong> Possimus libero, earum officia architecto maiores....
														</div>
													</div>

													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>Site Admin:</strong> Deleniti magni labore laboriosam odio...
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/icons/avatar.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<strong>Site Admin:</strong> Deleniti magni labore laboriosam odio...
														</div>
													</div>
													<div class="spost clearfix">
														<div class="entry-image">
															<a href="#" class="nobg"><img class="rounded-circle" src="images/magazine/small/2.jpg" alt=""></a>
														</div>
														<div class="entry-c">
															<div class="entry-title">
																<h4><a href="#">Elit Assumenda vel amet dolorum quasi</a></h4>
															</div>
															<ul class="entry-meta">
																<li><i class="icon-comments-alt"></i> 24 Comments</li>
															</ul>
														</div>
													</div>

												</div>
											</div>
											
										</div>
										</div>
										</div>
										</div>
										</div>
										<a href="#" class="card-footer ls1 uppercase t700 text-white btn-block border-top-0 text-center" style="background-color: #3A486E;">더보기</a>	<!--카드세션-->
										</div>
										</div>
										
										</div>
										
										
										
						
						<div class="line"></div>
						
					
						<div class="line line-xs line-sports"></div>
								<div class="ipost mb-4 mb-lg-4 row clearfix">
									<div class="col-md-6">
										<div class="entry-image mb-0">
											<div class="fslider" data-arrows="false" data-speed="300" data-pause="4000">
												<div class="flexslider">
													<div class="slider-wrap">
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/mario.png" alt="Image 1"></a>
														</div>
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/tetris.png" alt="Image 2"></a>
														</div>
														<div class="slide">
															<a href="#"><img src="resources/demos/news/images/bubble.jpg" alt="Image 2"></a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="entry-title mt-lg-0 mt-3">
											<h2><a href="#">게임랜드</a></h2>
										</div>
										<ul class="entry-meta clearfix">
											<li><span>by</span> <a href="#">John Doe</a></li>
											<li><i class="icon-line-clock"></i>11 Mar 2016</li>
											<li><a href="#"><i class="icon-camera-retro"></i></a></li>
										</ul>
										<div class="entry-content mt-0">
											<p>재미있는 추억의 게임을 즐기세요.남녀노소 누구나 좋아하는 추억의 오락실 게임 </p>
											<a href="resources/demos/news/demo-news-2.html" class="mt-4 button button-dark button-rounded ls1 uppercase load-next-portfolio" style="background-color: #3A486E;">더 보기</a>
										</div>
									</div>
								</div>
				
						
						
						
							 <div class="line line-xs line-sports"></div> 
							 <div class="ipost mb-4 mb-lg-4 row clearfix">
								<div class="col-md-6">					
							<div class="entry-title mt-lg-0 mt-3">
								<h2><a href="blog-single-full.html">YOUTUBE 방송보기</a></h2>
							</div>
							<ul class="entry-meta clearfix">
								<li><i class="icon-calendar3"></i> 30th Apr 2014</li>
								<li><a href="blog-single-full.html#comments"><i class="icon-comments"></i> 34</a></li>
								<li><a href="#"><i class="icon-film"></i></a></li>
							</ul>
							<div class="entry-content">
								<p>유투브 채널로 즐기세요.다양한 컨텐츠가 있는 유투브 방송 보세요 </p>
								<a href="resources/demos/news/demo-news-2.html" class="mt-4 button button-dark button-rounded ls1 uppercase load-next-portfolio" style="background-color: #3A486E;">더 보기</a>
							</div>
							</div>
							<div class="col-md-6">
							<div class="entry-image mb-0">
								<iframe width="560" height="315" src="http://www.youtube.com/embed/SZEflIVnhH8" frameborder="0" allowfullscreen></iframe>
							</div>
							</div>
						</div>
					
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

						<!-- Top Sidebar Area
						============================================= -->
						
					
						
					<!-- Sidebar End -->
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
	<script>
		var tpj=jQuery;
		var revapi19;
		tpj(document).ready(function() {
			if(tpj("#rev_slider_19_1").revolution == undefined){
				revslider_showDoubleJqueryError("#rev_slider_19_1");
			}else{
				revapi19 = tpj("#rev_slider_19_1").show().revolution({
					sliderType:"carousel",
					jsFileLocation: "include/rs-plugin/js/",
					sliderLayout:"fullwidth",
					dottedOverlay:"none",
					delay:7000,
					navigation: {
						keyboardNavigation:"off",
						keyboard_direction: "horizontal",
						mouseScrollNavigation:"off",
						onHoverStop:"on",
						tabs: {
							style:"hesperiden",
							enable:true,
							width:260,
							height:80,
							min_width:260,
							wrapper_padding:25,
							wrapper_color:"#F5F5F5",
							wrapper_opacity:"1",
							tmp:'<div class="tp-tab-content">  <span class="tp-tab-date">{{param1}}</span>  <span class="tp-tab-title font-secondary">{{title}}</span> <span class="tp-tab-date tp-tab-para">{{param2}}</span></div><div class="tp-tab-image"></div>',
							visibleAmount: 9,
							hide_onmobile: false,
							hide_under:480,
							hide_onleave:false,
							hide_delay:200,
							direction:"horizontal",
							span:true,
							position:"outer-bottom",
							space:0,
							h_align:"left",
							v_align:"bottom",
							h_offset:0,
							v_offset:0
						}
					},
					carousel: {
						horizontal_align: "center",
						vertical_align: "center",
						fadeout: "on",
						vary_fade: "on",
						maxVisibleItems: 3,
						infinity: "on",
						space: 0,
						stretch: "off",
						showLayersAllTime: "off",
						easing: "Power3.easeInOut",
						speed: "800"
					},
					responsiveLevels:[1140,992,768,576],
					visibilityLevels:[1140,992,768,576],
					gridwidth:[850,700,400,300],
					gridheight:[580,600,500,400],
					lazyType:"single",
					shadow:0,
					spinner:"off",
					stopLoop:"on",
					stopAfterLoops:-1,
					stopAtSlide:-1,
					shuffle:"off",
					autoHeight:"off",
					disableProgressBar:"off",
					hideThumbsOnMobile:"off",
					hideSliderAtLimit:0,
					hideCaptionAtLimit:0,
					hideAllCaptionAtLilmit:0,
					debugMode:false,
					fallbacks: {
						simplifyAll:"off",
						nextSlideOnWindowFocus:"off",
						disableFocusListener:false,
					}
				});
			}
		});	/* Revolution Slider End */

		// Navbar on hover
		$('.nav.tab-hover a.nav-link').hover(function() {
			$(this).tab('show');
		});

		// Current Date
		var weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],
			month = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
			a = new Date();

			jQuery('.date-today').html( weekday[a.getDay()] + ', ' + month[a.getMonth()] + ' ' + a.getDate() );

		// Infinity Scroll
		jQuery(window).on( 'load', function(){

			var $container = $('.infinity-wrapper');

			$container.infiniteScroll({
				path: '.load-next-portfolio',
				button: '.load-next-portfolio',
				scrollThreshold: false,
				history: false,
				status: '.page-load-status'
			});

			$container.on( 'load.infiniteScroll', function( event, response, path ) {
				var $items = $( response ).find('.infinity-loader');
				// append items after images loaded
				$items.imagesLoaded( function() {
					$container.append( $items );
					$container.isotope( 'insert', $items );
					setTimeout( function(){
						SEMICOLON.widget.loadFlexSlider();
					}, 1000 );
				});
			});

		});

		$('#oc-news').owlCarousel({
			items: 1,
			margin: 20,
			dots: false,
			nav: true,
		    navText: ['<i class="icon-angle-left"></i>','<i class="icon-angle-right"></i>'],
			responsive:{
				0:{ items: 1,dots: true, },
				576:{ items: 1,dots: true },
				768:{ items: 2,dots:true },
				992:{ items: 2 },
				1200:{ items: 3 }
			}
		});

		</script>

	</body>
	</html>