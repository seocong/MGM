<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<%response.setContentType("text/html;charset=utf-8"); %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="com.gam.utils.Util"%>
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
<style>
		#container {
			width:1000px;
			margin:0 auto;
			text-align:center;
		}
		.tab {
			list-style:none;
			margin: 0;
			padding: 0;
			overflow: hidden;
			
		}
		/* Float the list items side by side */
		.tab li {
			float: left;
			
		}
		/* Style the links inside the list items */
		.tab li a {
			display: inline-block;
			color: #000;
			text-align: center;
			text-decoration: none;
			padding: 14px 16px;
			font-size: 14px;
			transition:0.3s;
			border: solid #DDD 1px;
		
		}
		/* Style the tab content */
		.tabcontent {
			display: block;
			color:#fff;
		}
		ul.tab li.current{
			background-color: #fff;
			color: #222;
			
		}
		ul.tab li{
		background-color:#F2F2F2;
		}
	</style>
	

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

							
							<div class="row clearfix">
							<div id="ri_meet" data-ri_meet = "${ri_meet}" ></div>	
								<div class="col-md-12 mt-5">
						
								<!-- <table class="allmargin">

														
								<tr style="text-align: center; white-space: nowrap;">
									<td width="12%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="racingInfo.do?rp_meet=1">출전정보</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10">경주성적표</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="horseInfo.do?hr_meet=1">경주마정보</a></td>
									<td width="11%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;" ><a href="jockeyInfo.do?jk_meet=1">기수정보</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="jokyoInfo.do?tr_meet=1">조교사정보</a></td>
									<td width="11%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="ownerInfo.do?ow_meet=1">마주정보</a></td>
									<td width="14%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="racingEntryInfo.do?re_meet=1&pagenum=1&contentnum=10">출전등록현황</a></td>
									<td width="11%" style="font-size: 120%;font-weight: bold;"><a href="raceoperView.do">시행정보</a></td>
								</tr>
								</table> -->
								<div class = " center">
									<ul class="clearfix"  style="list-style: none;">
										<li style="float:left;"><a href="racingInfo.do?rp_meet=1" class="button button-border button-border-thin ">출전정보</a></li>
										<li style="float:left;"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10" class="button button-border button-border-thin ">경주성적표</a></li>
										<li style="float:left;"><a href="horseInfo.do?hr_meet=1" class="button button-border button-border-thin">경주마정보</a></li>
										<li style="float:left;"><a href="jockeyInfo.do?jk_meet=1" class="button button-border button-border-thin ">기수정보</a></li>
										<li style="float:left;"><a href="jokyoInfo.do?tr_meet=1" class="button button-border button-border-thin ">조교사정보</a></li>
										<li style="float:left;"><a href="ownerInfo.do?ow_meet=1" class="button button-border button-border-thin ">마주정보</a></li>
										<li style="float:left;"><a href="racingEntryInfo.do?re_meet=1&pagenum=1&contentnum=10" class="button button-border button-border-thin ">출전등록현황</a></li>
										<li style="float:left;"><a href="raceoperView.do" class="button button-border button-border-thin ">시행정보</a></li>
									</ul>
								</div>
								
								<div class="line mt-2 mb-4"></div>
								
									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 150%;">
										<span class="text-warning"><i class="icon-user-friends"></i></span>
										경주 성적표<span style="font-size: 60%;"></span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab" style="border-bottom: solid #DDD 1px;">
											<li id="tabseoul"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10"> 서울경마</a></li>
											<li id="tabbusan"><a href="recordInfo.do?ri_meet=3&pagenum=1&contentnum=10"> 부산경마</a></li>
											<li id="tabjeju"><a href="recordInfo.do?ri_meet=2&pagenum=1&contentnum=10"> 제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
											<br>
												<div>
												<table class="table " style="border-bottom: solid #DDD 1px;">
													<tr>
														<td width="6%" class="titleColor">경주</td>
														<c:forEach items="${list}" var="list">
															<td width="2%" ><a class="link" href="recordDetail.do?ri_meet=${list.ri_meet}&ri_rcNo=${list.ri_rcNo}&ri_rcDate=<fmt:formatDate value="${list.ri_rcDate}" pattern="yyyyMMdd"/>">${list.ri_rcNo}R</a></td>
														</c:forEach>
													</tr>
												</table>
											</div>
											<div>
											 <h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy">경주별 상세 성적표</i></span></h4> 
												<table class="table table-bordered tableColor" style="border-bottom: solid #DDD 1px;">
												<tr style="text-align: center;">
													<c:if test="${riDto.ri_meet == 1}">
												<th class="titleColor"  width="100%" colspan="4"><fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyy년MM월dd일(E)"/> 제${riDto.ri_rcNo}경주 서울 ${riDto.ri_ilsu}일차  ${riDto.ri_weather} ${riDto.ri_track}</th>
												</c:if>
												<c:if test="${riDto.ri_meet == 3}">
												<th class="titleColor"  width="100%" colspan="4"><fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyy년MM월dd일(E)"/> 제${riDto.ri_rcNo}경주 부산 ${riDto.ri_ilsu}일차  ${riDto.ri_weather} ${riDto.ri_track}</th>
												</c:if>
												<c:if test="${riDto.ri_meet == 2}">
												<th class="titleColor"  width="100%" colspan="4"><fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyy년MM월dd일(E)"/> 제${riDto.ri_rcNo}경주 제주 ${riDto.ri_ilsu}일차  ${riDto.ri_weather} ${riDto.ri_track}</th>
												</c:if>
											</tr>
											<tr style="text-align: center;">
												<td width="25%"> ${riDto.ri_rank} ${riDto.ri_rcDist}${riDto.ri_budam}</td>
												<td width="25%">${riDto.ri_rcName}</td>
												<td width="25%">R1 ~ 35</td>
												<td width="25%">${riDto.ri_ageCond}</td>
												
											</tr>
											</table>
											<table class="table table-bordered ">
											<tr style="text-align: center;">
												<th width="20%" class="titleColor" >순위상금</th>
												<td width="16%"><fmt:formatNumber value="${riDto.ri_chaksun1}" pattern="#,###.##"/>원</td>
												<td width="16%"><fmt:formatNumber value="${riDto.ri_chaksun2}" pattern="#,###.##"/>원</td>
												<td width="16%"><fmt:formatNumber value="${riDto.ri_chaksun3}" pattern="#,###.##"/>원</td>
												<td width="16%"><fmt:formatNumber value="${riDto.ri_chaksun4}" pattern="#,###.##"/>원</td>
												<td width="16%"><fmt:formatNumber value="${riDto.ri_chaksun5}" pattern="#,###.##"/>원</td>
											</tr>
											</table>
											</div>
											
												<div>												
													<table class="table table-bordered table-striped tableColor">
													
															
																<tr class="titleColor" style="text-align: center; ">
																	<th  style="white-space: nowrap;" width="5%">순위</th>
																	<th  style="white-space: nowrap;" width="5%">마번</th>
																	<th  style="white-space: nowrap;" width="10%">마명</th>
																	<th  style="white-space: nowrap;" width="5%">산지</th>													
																	<th  style="white-space: nowrap;"width="5%">성별</th>													
																	<th  style="white-space: nowrap;"width="5%">연령</th>													
																	<th  style="white-space: nowrap;"width="5%">중량</th>													
																	<th  style="white-space: nowrap;"width="6%">레이팅</th>													
																	<th  style="white-space: nowrap;"width="10%">기수명</th>													
																	<th  style="white-space: nowrap;"width="10%">조교사명</th>													
																	<th   style="white-space: nowrap;"width="10%">마주명</th>													
																	<th  style="white-space: nowrap;"width="6%">도착차</th>													
																	<th  style="white-space: nowrap;"width="8%">마체중</th>													
																	<th  style="white-space: nowrap;"width="5%">단승</th>													
																	<th  style="white-space: nowrap;"width="5%">연승</th>																									
																</tr>
																<c:forEach items="${rrList}" var="rrList">
																<tr style="text-align: center;white-space: nowrap;">
																	<td >${rrList.rr_ord}</td>
																	<td >${rrList.rr_chulNo}</td>
																	<td><a href="horseDetail.do?hr_htName=${rrList.rr_hrName}&hr_meet=${rrList.rr_meet}">${rrList.rr_hrName}</a></td>
																	<td >${rrList.hr_name}</td>
																	<td>${rrList.hr_sex}</td>
																	<td>${rrList.hr_age}세</td>
																	<td>${rrList.rr_wgBudam}</td>
																	<td>${rrList.rr_rating}</td>
																	<td><a href="jockeyDetail.do?jk_no=${rrList.rr_jkNo}">${rrList.rr_jkName}</a></td>
																	<td><a href="jokyoDetail.do?tr_no=${rrList.rr_trNo}">${rrList.rr_trName}</a></td>
																	<td><a href="ownerDetail.do?ow_no=${rrList.rr_owNo}&ow_meet=${rrList.rr_meet}">${rrList.rr_owName}</a></td>
																	<td>${rrList.rr_diffUnit}</td>
																	<td>${rrList.rr_wgHr}</td>
																	<td>${rrList.rr_winOdds}</td>
																	<td>${rrList.rr_plcOdds}</td>
																</tr>
																</c:forEach>
													</table>
												</div>
												<div>
													<table class="table table-bordered table-striped tableColor">
														<thead>
															<tr class="titleColor" style="text-align: center;white-space: nowrap; ">
																
																<th width="5%">순위</th>
																<th width="5%">마번</th>
																<th width="26%">S1F-1C-2C-3C-4C-G1F</th>
																<th width="8%">S-1F</th>
																<th width="8%">1코너</th>
																<th width="8%">2코너</th>
																<th width="8%">3코너</th>
																<th width="8%">4코너</th>
																<th width="8%">G-3F</th>
																<th width="8%">G-1F</th>
																<th width="8%">경주기록</th>
																
															</tr>
														</thead>

														<tbody>

															<c:forEach items="${rrList}" var="rrList">
																<tr style="text-align: center;">
																	<td>${rrList.rr_ord}</td>
																	<td>${rrList.rr_chulNo}</td>
																	<td>${rrList.rr_ordS1f} - ${rrList.rr_g8f_1c} - ${rrList.rr_g6f_2c} - ${rrList.rr_g4f_3c} - ${rrList.rr_g3f_4c} - ${rrList.rr_ordG1f}</td>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTimeS1f ne '0:00.0'}">
																		<td>${rrList.rr_rcTimeS1f}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTime_1c ne '0:00.0'}">
																		<td>${rrList.rr_rcTime_1c}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTime_2c ne '0:00.0'}">
																		<td>${rrList.rr_rcTime_2c}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTime_3c ne '0:00.0'}">
																		<td>${rrList.rr_rcTime_3c}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTime_4c ne '0:00.0'}">
																		<td>${rrList.rr_rcTime_4c}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTimeG3f ne '0:00.0'}">
																		<td>${rrList.rr_rcTimeG3f}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTimeG1f ne '0:00.0'}">
																		<td>${rrList.rr_rcTimeG1f}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>
																	<c:choose>
																	<c:when test="${rrList.rr_rcTime ne '0:00.0'}">
																		<td>${rrList.rr_rcTime}</td>
																	</c:when>
																	<c:otherwise>
																		<td></td>
																	</c:otherwise>
																	</c:choose>																	
																</tr>
															</c:forEach>
														</tbody>
													</table>
												</div>
												<div>
													<table class="table table-bordered tableColor">
														<tr>
															<th class="titleColor"  width="20%" rowspan="4"  style="text-align: center;">매출액</th>
															<td width="40%" style="text-align:left;">단승식 : <fmt:formatNumber value="${riDto.ri_winAmt}" type="number" /></td>
															<td width="40%" style="text-align:left;">연승식 : <fmt:formatNumber value="${riDto.ri_plcAmt}" type="number" /></td>
														</tr>
														<tr>
															<td style="text-align:left;">복승식 : <fmt:formatNumber value="${riDto.ri_qnlAmt}" type="number" /></td>
															<td style="text-align:left;">쌍승식 : <fmt:formatNumber value="${riDto.ri_qplAmt}" type="number" /></td>
														</tr>
														<tr>
															<td style="text-align:left;">복연승 : <fmt:formatNumber value="${riDto.ri_exaAmt}" type="number" /></td>
															<td style="text-align:left;">삼복승 : <fmt:formatNumber value="${riDto.ri_tlaAmt}" type="number" /></td>
														</tr>
														<tr>
															<td style="text-align:left;">삼쌍승 : <fmt:formatNumber value="${riDto.ri_triAmt}" type="number" /></td>
															<td style="text-align:left;">합계 : <fmt:formatNumber value="${riDto.ri_totalAmt}" type="number" /></td>
														</tr>
													</table>
													</div>
													<div>
													<table class="table table-bordered oddsTable tableColor" height="100%">
														<tr>
															<th class="titleColor"  width="20%" rowspan="4"  style="text-align: center;">배당률</th>
															<td width="40%" style="text-align:left;" data-winNo="${riDto.ri_winChulNo}" data-winOdds="${riDto.ri_winOdds}">단승식 : </td>
															<td width="40%" style="text-align:left;" data-plcNo="${riDto.ri_plcChulNo}" data-plcOdds="${riDto.ri_plcOdds}">연승식 : </td>
														</tr>
														<tr>
															<td style="text-align:left;" data-qnlNo="${riDto.ri_qnlChulNo}" data-qnlOdds="${riDto.ri_qnlOdds}">복승식 : </td>
															<td style="text-align:left;" data-exaNo="${riDto.ri_exaChulNo}" data-exaOdds="${riDto.ri_exaOdds}">쌍승식 : </td>
														</tr>
														<tr>
															<td style="text-align:left;" data-qplNo="${riDto.ri_qplChulNo}" data-qplOdds="${riDto.ri_qplOdds}">복연승 : </td>
															<td style="text-align:left;" data-tlaNo="${riDto.ri_tlaChulNo}" data-tlaOdds="${riDto.ri_tlaOdds}">삼복승 : </td>
														</tr>
														<tr>
															<td colspan="2" style="text-align:left;" data-triNo="${riDto.ri_triChulNo}" data-triOdds="${riDto.ri_triOdds}">삼쌍승 : </td>
														</tr>
													</table>
												</div>
												<div>
													<table class="table table-bordered ">
														<tr>
														</tr>
														<tr>
														</tr>
													</table>
												</div>										
												<div>
													<table class="table table-bordered tableColor">
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">S-1F</th>
															<td width="45%" style="text-align:left;">${riDto.ri_passrankS1f}</td>
															<!-- <th class="titleColor"  width="10%" style="text-align: center;">3F</th>
															<td width="30%" style="text-align:left;"></td> -->
														</tr>
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">1코너</th>
															<td width="45%" style="text-align:left;">${riDto.ri_passrankG8f_1c}</td>
															<!-- <th class="titleColor"  width="10%" style="text-align: center;">4F</th>
															<td width="30%" style="text-align:left;"></td> -->
														</tr>
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">2코너</th>
															<td width="85%" style="text-align:left;" colspan="3">${riDto.ri_passrankG6f_2c}</td>
														</tr>
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">3코너</th>
															<td width="85%" style="text-align:left;" colspan="3">${riDto.ri_passrankG4f_3c}</td>
														</tr>
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">4코너</th>
															<td width="85%" style="text-align:left;" colspan="3">${riDto.ri_passrankG3f_4c}</td>
														</tr>
														<tr>
															<th class="titleColor"  width="15%" style="text-align: center;">G-1F</th>
															<td width="85%" style="text-align:left;" colspan="3">${riDto.ri_passrankG1f}</td>
														</tr>
													</table>
												</div>
												<div>
												<c:choose>
														<c:when test="${not empty refreeList}">
																<table class="table table-bordered tableColor">
														<tr>
															<th class="titleColor" colspan="6"
																style="text-align: center;">재결사항</th>
														</tr>
														<tr>
															<th class="titleColor" width="10%" style="text-align: center">구분</th>
															<th class="titleColor" width="6%" style="text-align: center">출전번호</th>
															<th class="titleColor" width="15%" style="text-align: center">대상명</th>
															<th class="titleColor" width="12%" style="text-align: center">처분종류</th>
															<th class="titleColor" width="19%" style="text-align: center">처분내용</th>
															<th class="titleColor" width="38%" style="text-align: center">세부내용</th>
														</tr>
														
														<c:forEach items="${refreeList}" var="list">
															<tr>
																<td>${list.rf_prGubun}</td>
																<td>${list.rf_chulNo}</td>
																<td>${list.rf_prName}</td>
																<td>${list.rf_kind}</td>
																<c:choose>
																	<c:when test="${list.rf_fine ne 0}">
																		<td>과태료 ${list.rf_fine}</td>
																	</c:when>
																	<c:when test="${not empty list.rf_stDate}">
																		<td>${list.rf_stDate}~${list.rf_spDate}</td>
																	</c:when>
																	<c:otherwise>
																		<td>-</td>
																	</c:otherwise>
																</c:choose>
																<td>${list.rf_reason}</td>
															</tr>
														</c:forEach>
													</table>
														</c:when>
												</c:choose>
												
												</div>
												<div>
												<table class="table" style="border-bottom: solid #DDD 1px;">
													<tr>
														<td width="6%" class="titleColor">경주</td>
														<c:forEach items="${list}" var="list">
															<td width="2%" ><a class="link" href="recordDetail.do?ri_meet=${list.ri_meet}&ri_rcNo=${list.ri_rcNo}&ri_rcDate=<fmt:formatDate value="${list.ri_rcDate}" pattern="yyyyMMdd"/>">${list.ri_rcNo}R</a></td>
														</c:forEach>
													</tr>
												</table>
											</div>
											</div>


										</div>

									</div>
								</div>


								
							</div>

							<div class="line"></div>

						</div>
						<!-- 본문내용끝 -->
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
	<!-- 만든거만든거 배당률 -->
	<script src="resources/js/recordjs.js"></script>

	<!-- ADD-ONS JS FILES -->
	<script>
	$(function() {
		var ri_meet = $("#ri_meet").attr("data-ri_meet");
		if(ri_meet == 1){
			$("#tabseoul").addClass('current');
			$(".titleColor").css("background-color","#fbeae6");
			$(".tableColor").css("border-top","solid #b30003 3px")
		}else if(ri_meet == 2){
			$("#tabjeju").addClass('current');
			$(".titleColor").css("background-color","#ecf5f9");
			$(".tableColor").css("border-top","solid #2a4e8b 3px")
		}else if(ri_meet == 3){
			$("#tabbusan").addClass('current');
			$(".titleColor").css("background-color","#e9f3d9");
			$(".tableColor").css("border-top","solid #5a9e01 3px")
		}	
	});
	
	$(function(){
		var page = ${riDto.ri_rcNo}-1;
		var ri_meet = $("#ri_meet").attr("data-ri_meet");
		if(ri_meet == 1){
		$(".link").eq(page).css({
			"background-color":"#b30003",
			"color":"white"
		});
		}else if(ri_meet == 2){
			$(".link").eq(page).css({
				"background-color":"#2a4e8b",
				"color":"white"
			});
			}else if(ri_meet == 3){
				$(".link").eq(page).css({
					"background-color":"#5a9e01",
					"color":"white"
				});
				}
	});
	
	
	</script>
		
 	
	</body>
	</html>
</html>