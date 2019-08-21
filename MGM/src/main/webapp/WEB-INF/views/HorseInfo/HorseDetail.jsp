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
<style>
#container {
	width: 1000px;
	margin: 0 auto;
	text-align: center;
}

.tab {
	list-style: none;
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
	transition: 0.3s;
	border: solid #DDD 1px;
}
/* Style the tab content */
.tabcontent {
	display: block;
	color: #000;
}

ul.tab li.current {
	background-color: #fff;
	color: #222;
}

ul.tab li {
	background-color: #F2F2F2;
}
/* #tableSt td{
			text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;
		} */
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
		<section id="slider"
			class="slider-element dark swiper_wrapper full-screen force-full-screen slider-parallax clearfix"
			style="max-height: 400px;">

			<div class="slider-parallax-inner">

				<div class="swiper-container swiper-parent">
					<div class="swiper-wrapper">
						<div class="swiper-slide dark"
							style="background: linear-gradient(rgba(0, 0, 0, .3), rgba(0, 0, 0, .5)), url('resources/demos/nonprofit/images/slider/kuyngma.jpg') no-repeat center center; background-size: cover; max-height: 400px;">
							<div class="container clearfix">
								<div class="slider-caption">
									<h2 class="nott" data-animate="fadeInUp">Help the Homeless
										& Hungry People.</h2>
									<p style="font-size: 17px;" data-animate="fadeInUp"
										data-delay="200">Lorem ipsum dolor sit amet, consectetur
										adipisicing elit. Autem molestiae, cum ratione at temporibus
										aperiam repudiandae consectetur, illo nam maiores.</p>
									<!-- <a href="#" data-animate="fadeInUp" data-delay="400" class="button button-rounded button-large button-light text-dark bgcolor shadow nott ls0 ml-0 mt-4">Know More</a> -->
								</div>
							</div>
						</div>
						<div class="swiper-slide dark"
							style="background: linear-gradient(rgba(0, 0, 0, 0), rgba(0, 0, 0, .8)), url('resources/demos/nonprofit/images/slider/6.jpeg') no-repeat center center; background-size: cover; max-height: 400px;">
							<div class="container clearfix">
								<div class="slider-caption">
									<h2 class="nott" data-animate="fadeInUp">Welcome to Canvas</h2>
									<p style="font-size: 17px;" data-animate="fadeInUp"
										data-delay="200">Seamlessly transition standardized
										channels whereas maintainable web services. Competently
										unleash exceptional portals through timely infomediaries.</p>
									<!-- <a href="#" data-animate="fadeInUp" data-delay="400" class="button button-rounded button-large button-light text-dark bgcolor shadow nott ls0 ml-0 mt-4">Know More</a> -->
								</div>
							</div>
						</div>
					</div>
					<div class="swiper-navs">
						<div class="slider-arrow-left">
							<i class="icon-line-arrow-left"></i>
						</div>
						<div class="slider-arrow-right">
							<i class="icon-line-arrow-right"></i>
						</div>
					</div>
					<div class="swiper-scrollbar">
						<div class="swiper-scrollbar-drag">
							<div class="slide-number">
								<div class="slide-number-current"></div>
								<span>/</span>
								<div class="slide-number-total"></div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</section>



		<!-- Content
		============================================= -->
		<section id="content">

			<div class="content-wrap nopadding">

				<div class="container clearfix">

					<div class="row clearfix">


						<jsp:include page="../SideBar.jsp" />



						<!-- Posts Area
						============================================= -->
						<div class="col-lg-9">


							<div class="row clearfix">
								<div id="hr_meet" data-hr_meet="${hr_meet}"></div>
								<div class="col-md-12 mt-5">

									<table class="allmargin">
										<%-- <col width="120px">
								<col width="120px">
								<col width="120px">
								<col width="110px">
								<col width="120px">
								<col width="110px">
								<col width="130px">
								<col width="120px"> --%>



										<tr style="text-align: center; white-space: nowrap;"
											id="tableSt">
											<td width="12%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="racingInfo.do?rp_meet=1">출전정보</a></td>
											<td width="13%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10">경주성적표</a></td>
											<td width="13%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="horseInfo.do?hr_meet=1">경주마정보</a></td>
											<td width="11%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="jockeyInfo.do?jk_meet=1">기수정보</a></td>
											<td width="13%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="jokyoInfo.do?tr_meet=1">조교사정보</a></td>
											<td width="11%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="ownerInfo.do?ow_meet=1">마주정보</a></td>
											<td width="14%"
												style="border-right: solid 2px #DDD; font-size: 120%; font-weight: bold; padding-right: 0.5rem; padding-left: 0.5rem;"><a
												href="racingEntryInfo.do?re_meet=1&pagenum=1&contentnum=10">출전등록현황</a></td>
											<td width="11%" style="font-size: 120%; font-weight: bold;"><a
												href="raceoperView.do">시행정보</a></td>
										</tr>
									</table>




									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 150%;">
										<span class="text-warning"><i class="icon-user-friends"></i></span>
										경주마정보<span style="font-size: 60%;">경주마 성적 및 기록 정보</span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab" style="border-bottom: solid #DDD 1px;">
											<li id="tabseoul"><a href="horseInfo.do?hr_meet=1">
													서울경마</a></li>
											<li id="tabbusan"><a href="horseInfo.do?hr_meet=3">
													부산경마</a></li>
											<li id="tabjeju"><a href="horseInfo.do?hr_meet=2">
													제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
												<div>
													<h4 class="mb-3 mt-3 ls1 uppercase t700"
														style="font-size: 100%; float: left;">
														<span class="text-dark"><i class="icon-trophy"></i></span>경주마
														프로필
													</h4>
													<table class="table table-bordered">
														<tbody>
															<tr>
																<td class="titleColor" style="text-align: center;"
																	width="10%">마명</td>
																<td style="text-align: center;" width="23%">${hrDto.hr_htName}</td>
																<td class="titleColor" style="text-align: center;"
																	width="10%">마번</td>
																<td style="text-align: center;" width="23%">${hrDto.hr_no}</td>
																<td class="titleColor" style="text-align: center;"
																	width="10%">조교사</td>
																<td style="text-align: center;" width="23%">${hrDto.hr_trName}</td>
															</tr>
															<tr>
																<td class="titleColor" style="text-align: center;">연령/성별</td>
																<td style="text-align: center;">${hrDto.hr_age}세/${hrDto.hr_sex}</td>
																<td class="titleColor" style="text-align: center;">산지</td>
																<td style="text-align: center;">${hrDto.hr_name}</td>
																<td class="titleColor" style="text-align: center;">마주</td>
																<td style="text-align: center;">${hrDto.hr_owName}</td>
															</tr>
															<tr>
																<td class="titleColor" style="text-align: center;">부마/모마</td>
																<td style="text-align: center;">${hrDto.hr_faHrName}/${hrDto.hr_moHrName}</td>
																<td class="titleColor" style="text-align: center;">군(등급)</td>
																<td style="text-align: center;">${hrDto.hr_rank}</td>
																<td class="titleColor" style="text-align: center;">데뷔일자</td>
																<td style="text-align: center;">${hrDto.debut}</td>
															</tr>

															<tr>
																<td class="titleColor" style="text-align: center;">경주
																	전적</td>
																<td colspan="5" style="text-align: center;">${hrDto.hr_rcCntT}전(${hrDto.hr_ord1CntT}/${hrDto.hr_ord2CntT}/${hrDto.hr_ord3CntT})
																	승률 : ${totalWin} 복승률 : ${pass} 경매가 :</td>
															</tr>
														</tbody>
													</table>

													<h4 class="mb-3 mt-3 ls1 uppercase t700"
														style="font-size: 100%; float: left;">
														<span class="text-dark"><i class="icon-trophy"></i></span>경주마
														상금내역
													</h4>
													<table class="table table-bordered ">
														<tr class="titleColor" style="text-align: center;">
															<td width="12%" rowspan="2" style="font-weight: bold;">상금내역</td>
															<td width="22%" style="font-weight: bold;">총수득상금</td>
															<td width="22%" style="font-weight: bold;">1년수득상금</td>
															<td width="22%" style="font-weight: bold;">6개월수득상금</td>
															<td width="22%" style="font-weight: bold;">금월수득상금</td>
														</tr>
														<tr>
														<c:choose>
															<c:when test="${empty prize}">
																<tr>
																	<td colspan="12">--상금 내용이 없습니다--</td>
																</tr>
															</c:when>
															<c:otherwise>
															<td><fmt:formatNumber value="${prize.totalPrize}"
																	type="number" /></td>
															<td><fmt:formatNumber value="${prize.yearPrize}"
																	type="number" /></td>
															<td><fmt:formatNumber value="${prize.sixMonthPrize}"
																	type="number" /></td>
															<td><fmt:formatNumber value="${prize.monthPrize}"
																	type="number" /></td>
															</c:otherwise>
														</c:choose>
														</tr>
													</table>
												</div>


												<div class="tabs tabs-responsive clearfix">

													<ul class="tab-nav clearfix">
														<li><a href="#tab-responsive-1">경주마 성적</a></li>
														<li><a href="#tab-responsive-2">1년 기록 통계</a></li>
													</ul>


													<div class="tab-container">

														<div class="tab-content clearfix" id="tab-responsive-1">
															<h4 class="mb-3 mt-3 ls1 uppercase t700"
																style="font-size: 100%; float: left;">
																<span class="text-dark"><i class="icon-trophy"></i></span>
																경주마 1년 경주성적
															</h4>
															<table class="table table-bordered ">
																<thead>
																	<tr class="titleColor" style="text-align: center;">
																		<th width="14%">경주일자</th>
																		<th width="7%">순위</th>
																		<th width="7%">등급</th>
																		<th width="7%">거리</th>
																		<th width="15%">경마종류</th>
																		<th width="7%">중량</th>
																		<th width="7%">기수</th>
																		<th width="10%">경주기록</th>
																		<th width="8%">마체중</th>
																		<th width="7%">레이팅</th>
																		<th width="6%">주로</th>
																	</tr>
																</thead>
																<tbody>
																	<c:choose>
																		<c:when test="${empty recordInfo}">
																			<tr>
																				<td colspan="12">---경주 내역이 없습니다.---</td>
																			</tr>
																		</c:when>
																		<c:otherwise>
																			<c:forEach items="${recordInfo}" var="list">
																				<tr>
																					<td><fmt:formatDate value="${list.rcDate}"
																							pattern="yyyy-MM-dd" />/${list.rcNo}R</td>
																					<td>${list.ord}</td>
																					<td>${list.ranks}</td>
																					<td>${list.rcDist}</td>
																					<td>${list.rcName}</td>
																					<td>${list.wgBudam}</td>
																					<td>${list.jkName}</td>
																					<td>${list.rcTime}</td>
																					<td>${list.wgHr}</td>
																					<td>${list.rating}</td>
																					<td>${list.track}</td>
																				</tr>
																			</c:forEach>

																		</c:otherwise>
																	</c:choose>
																</tbody>
															</table>
														</div>

														<div class="tab-content clearfix" id="tab-responsive-2">
															<div>
																<h4 class="mb-3 mt-3 ls1 uppercase t700"
																	style="font-size: 100%; float: left;">
																	<span class="text-dark"><i class="icon-trophy"></i></span>
																	경주마 거리별 기록
																</h4>
																<table class="table table-bordered ">
																	<thead>
																		<tr class="titleColor" style="text-align: center;">
																			<th width="16%">경주거리</th>
																			<th width="12%">출전전적</th>
																			<th width="12%">승률</th>
																			<th width="12%">복승률</th>
																			<th width="12%">연승률</th>
																			<th width="12%">최고기록</th>
																			<th width="12%">평균기록</th>
																		</tr>
																	</thead>
																	<tbody>
																		<c:choose>
																			<c:when test="${empty distRecord}">
																				<tr>
																					<td colspan="7">---경주 내역이 없습니다.---</td>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<c:forEach items="${distRecord}" var="list">
																					<tr>
																						<td style="font-weight: bold;">${list.rcDist}</td>
																						<td>${list.totalRace}전
																							(${list.ord1st}/${list.ord2nd}/${list.ord3nd})</td>
																						<td>${list.odds1}</td>
																						<td>${list.odds2}</td>
																						<td>${list.odds3}</td>
																						<td>${list.record}</td>
																						<td>${list.avgRecord}</td>
																					</tr>
																				</c:forEach>
																			</c:otherwise>
																		</c:choose>
																	</tbody>
																</table>
															</div>
															<div>
																<h4 class="mb-3 mt-3 ls1 uppercase t700"
																	style="font-size: 100%; float: left;">
																	<c:forEach items="${chulNoRecord}" var="list">
																		<span class="chulNo" data-chulNo="${list.chulNo}"
																			data-totalRace="${list.totalRace}"
																			data-ord1st="${list.ord1st}"
																			data-ord2nd="${list.ord2nd}"></span>
																	</c:forEach>
																	<span class="text-dark"><i class="icon-trophy"></i></span>
																	경주마 게이트별 전적
																</h4>
																<table class="table table-bordered ">
																	<thead>
																		<tr class="titleColor" style="text-align: center;">
																			<th width="16%">게이트번호</th>
																			<th width="6%">1번</th>
																			<th width="6%">2번</th>
																			<th width="6%">3번</th>
																			<th width="6%">4번</th>
																			<th width="6%">5번</th>
																			<th width="6%">6번</th>
																			<th width="6%">7번</th>
																			<th width="6%">8번</th>
																			<th width="6%">9번</th>
																			<th width="6%">10번</th>
																			<th width="6%">11번</th>
																			<th width="6%">12번</th>
																			<th width="6%">13번</th>
																			<th width="6%">14번</th>
																		</tr>
																	</thead>
																	<tbody>
																		<c:choose>
																			<c:when test="${empty chulNoRecord}">
																				<tr>
																					<td colspan="15">---경주 내역이 없습니다.---</td>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<tr id="resultTd">
																					<td>결과</td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																					<td></td>
																				</tr>
																			</c:otherwise>
																		</c:choose>
																	</tbody>
																</table>
															</div>
															<div>
																<h4 class="mb-3 mt-3 ls1 uppercase t700"
																	style="font-size: 100%; float: left;">
																	<span class="text-dark"><i class="icon-trophy"></i></span>
																	경주마 기승기수별 전적
																</h4>
																<table class="table table-bordered ">
																	<thead>
																		<c:choose>
																			<c:when test="${empty jkNoRecord}">
																				<tr class="titleColor">
																					<th colspan="15">---경주 내역이 없습니다.---</th>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<tr class="titleColor chkLength"
																					style="text-align: center;">
																					<th width="10%">기승기수</th>
																					<c:forEach items="${jkNoRecord}" var="list">
																						<th width="7%">${list.jkName}</th>
																					</c:forEach>
																			</c:otherwise>
																		</c:choose>
																		</tr>
																	</thead>
																	<tbody>
																		<c:choose>
																			<c:when test="${empty jkNoRecord}">
																				<tr>
																					<td colspan="15">--------</td>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<tr class="chkLength">
																					<td>성적</td>
																					<c:forEach items="${jkNoRecord}" var="list">
																						<td>${list.totalRace}전<br>(${list.ord1st}/${list.ord2nd})
																						</td>
																					</c:forEach>
																			</c:otherwise>
																		</c:choose>
																		</tr>
																	</tbody>
																</table>
															</div>
															<div>
																<h4 class="mb-3 mt-3 ls1 uppercase t700"
																	style="font-size: 100%; float: left;">
																	<span class="text-dark"><i class="icon-trophy"></i></span>
																	경주마 부담중량별 전적
																</h4>
																<table class="table table-bordered ">
																		<thead>
																		<c:choose>
																			<c:when test="${empty jkNoRecord}">
																				<tr class="titleColor">
																					<th colspan="15">---경주 내역이 없습니다.---</th>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<tr class="titleColor chkLength1"
																					style="text-align: center;">
																					<th width="16%">부담중량</th>
																					<c:forEach items="${wgBudamNoRecord}" var="list">
																						<th width="6%">${list.wgBudam}</th>
																					</c:forEach>
																			</c:otherwise>
																		</c:choose>
																		</tr>
																	</thead>
																	<tbody>
																		<c:choose>
																			<c:when test="${empty jkNoRecord}">
																				<tr>
																					<td colspan="15">--------</td>
																				</tr>
																			</c:when>
																			<c:otherwise>
																				<tr class="chkLength1">
																					<td>성적</td>
																					<c:forEach items="${wgBudamNoRecord}" var="list">
																						<td>${list.totalRace}전<br>(${list.ord1st}/${list.ord2nd})
																						</td>
																					</c:forEach>
																			</c:otherwise>
																		</c:choose>
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


							</div>



							<div class="line"></div>

						</div>
						<!-- 본문내용끝 -->
					</div>
					<!-- Container End -->
				</div>

			</div>
		</section>
		<!-- #content end -->

		<!-- Footer
		============================================= -->
		<jsp:include page="../Footer.jsp" />
		<!-- #footer end -->

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

	<!-- Footer Scripts
	============================================= -->
	<script src="resources/js/functions.js"></script>

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
	<script>
		$(function() {
			var hr_meet = $("#hr_meet").attr("data-hr_meet");
			if (hr_meet == 1) {
				$("#tabseoul").addClass('current');
				$(".titleColor").css("background-color", "#fbeae6");
			} else if (hr_meet == 2) {
				$("#tabjeju").addClass('current');
				$(".titleColor").css("background-color", "#ecf5f9");
			} else if (hr_meet == 3) {
				$("#tabbusan").addClass('current');
				$(".titleColor").css("background-color", "#e9f3d9");
			}
		});
	</script>
	<script>
		for (var i = 0; i < $('.chulNo').length; i++) {
			$('#resultTd').children('td').eq(
					$('.chulNo').eq(i).attr('data-chulNo')).append(
					$('.chulNo').eq(i).attr('data-totalRace') + '전<br>('
							+ $('.chulNo').eq(i).attr('data-ord1st') + '/'
							+ $('.chulNo').eq(i).attr('data-ord2nd') + ')');
		}
		if($('.chkLength').eq(0).children('th').length<15){
			var loop = 15-$('.chkLength').eq(0).children().length;
			for(var i=0;i<loop;i++){
				$('.chkLength').eq(0).append('<th width="7%"></th>');	
			}
		}
		if($('.chkLength').eq(1).children('td').length<15){
			var loop = 15-$('.chkLength').eq(1).children().length;
			for(var i=0;i<loop;i++){
				$('.chkLength').eq(1).append('<td></td>');	
			}
		}
		if($('.chkLength1').eq(0).children('th').length<15){
			var loop = 15-$('.chkLength1').eq(0).children().length;
			for(var i=0;i<loop;i++){
				$('.chkLength1').eq(0).append('<th width="7%"></th>');	
			}
		}
		if($('.chkLength1').eq(1).children('td').length<15){
			var loop = 15-$('.chkLength1').eq(1).children().length;
			for(var i=0;i<loop;i++){
				$('.chkLength1').eq(1).append('<td></td>');	
			}
		}
	</script>
</body>
</html>