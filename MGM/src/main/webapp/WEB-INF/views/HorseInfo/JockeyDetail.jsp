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
			color:#000;
		}
		ul.tab li.current{
			background-color: #fff;
			color: #222;
			
		}
		ul.tab li{
		background-color:#F2F2F2;
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
							<div id="jk_meet" data-jk_meet = "${jk_meet}" ></div>	
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
								
								
								<tr id="tableSt">
									<td width="12%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="#">출전정보</a></td>
									<td width="13%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10">경주성적표</a></td>
									<td width="13%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="horseInfo.do?hr_meet=1">경주마정보</a></td>
									<td width="11%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;" ><a href="jockeyInfo.do?jk_meet=1">기수정보</a></td>
									<td width="13%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="jokyoInfo.do?tr_meet=1">조교사정보</a></td>
									<td width="11%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="ownerInfo.do?ow_meet=1">마주정보</a></td>
									<td width="14%" style="text-align: center;border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="#">출주예정마필</a></td>
									<td width="11%" style="text-align: center;font-size: 120%;font-weight: bold;"><a href="#">시행정보</a></td>
								</tr>
								</table>
								
								
								
								
									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 150%;">
										<span class="text-warning"><i class="icon-user-friends"></i></span>
										기수정보<span style="font-size: 60%;">기수 전적 및 승률 정보</span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab" style="border-bottom: solid #DDD 1px;">
											<li id="tabseoul"><a href="jockeyInfo.do?jk_meet=1"> 서울경마</a></li>
											<li id="tabbusan"><a href="jockeyInfo.do?jk_meet=3"> 부산경마</a></li>
											<li id="tabjeju"><a href="jockeyInfo.do?jk_meet=2"> 제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
												<div>
												<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy"></i></span>기수 프로필</h4>
													<table class="table table-bordered" >
														
														<%--  <col width="100px">
														<col width="140px">
														<col width="140px">
														<col width="140px">
														<col width="140px"> --%>

														<tbody>

																<tr>
																	<td style="text-align: center;padding: 0px;" rowspan="4" width="11%"><img alt="미등록" src="http://race.kra.co.kr/ijrc_pub/photo/jcky/${jkDto.jk_no}.jpg"></td>
																	<td class="titleColor" style="text-align: center;padding: 0px;" width="19%">성명</td>
																	<td style="text-align: center;padding: 0px;" width="19%">${jkDto.jk_name}</td>
																	<td class="titleColor"  style="text-align: center;padding: 0px;" width="19%">소속조</td>
																	<td style="text-align: center;padding: 0px;" width="19%">${jkDto.jk_part}</td>
																	<td class="titleColor"  style="text-align: center;padding: 0px;" width="12%">복색</td>
																</tr>
																<tr>
																	<td class="titleColor"  style="text-align: center;padding: 0px;">생년월일</td>
																	<td style="text-align: center;padding: 0px;">${jkDto.jk_birthday}(${jkDto.jk_age}세)</td>
																	<td class="titleColor"  style="text-align: center;padding: 0px;">데뷔날짜</td>
																	<td style="text-align: center;padding: 0px;">${jkDto.jk_debut}</td>
																	<td style="text-align: center;padding: 0px;" rowspan="3"><img alt="미등록" src="http://race.kra.co.kr/ijrc_pub/photo/jcky/${jkDto.jk_no}a.jpg"></td>
																</tr>
																<tr>
																	<td class="titleColor"  style="text-align: center;padding: 0px;">통산전적</td>
																	<td style="text-align: center;padding: 0px;">${jkDto.jk_rcCntT}전(${jkDto.jk_ord1CntT}/${jkDto.jk_ord2CntT})</td>
																	<td style="text-align: center;padding: 0px;">승률 : ${totalWin}</td>
																	<td style="text-align: center;padding: 0px;">복승률 : ${pass}</td>
																</tr>
																<tr>
																	<td class="titleColor"  style="text-align: center;padding: 0px;">최근1년</td>
																	<td style="text-align: center;padding: 0px;">${jkDto.jk_rcCntY}전(${jkDto.jk_ord1CntY}/${jkDto.jk_ord2CntY})</td>
																	<td style="text-align: center;padding: 0px;">승률 : ${yearWin}</td>
																	<td style="text-align: center;padding: 0px;">복승률 : ${yearPass}</td>
																</tr>
														</tbody>

													</table>
												</div>



											<div class="tabs tabs-responsive clearfix">

							<ul class="tab-nav clearfix">
								<li><a href="#tab-responsive-1">최근6개월 전적</a></li>
								<li><a href="#tab-responsive-2">년도별월별성적</a></li>								
							</ul>
							
							
							<div class="tab-container">

								<div class="tab-content clearfix" id="tab-responsive-1">
								<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
										<span class="text-dark"><i class="icon-trophy"></i></span>
										최근 6개월간 전적 및 수득상금
									</h4>
									<table class="table table-bordered ">
										<thead>
											<tr class="titleColor"  style="text-align: center;">
												<th width="10%">월별</th>
												<th width="15%"></th>
												<th width="15%"></th>
												<th width="15%"></th>
												<th width="15%"></th>
												<th width="15%"></th>
												<th width="15%"></th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>전적</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr>
												<td>상금</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>
								<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
										<span class="text-dark"><i class="icon-trophy"></i></span>
										최근 6개월간 마필기승 내역
									</h4>
									<table class="table table-bordered ">
										<thead>
										<tr class="titleColor"  style="text-align: center;">
											<th width="15%">경주일자</th>
											<th width="15%">기승마필</th>
											<th width="9%">순위</th>
											<th width="9%">등급</th>
											<th width="8%">거리</th>
											<th width="24%">경마종류</th>
											<th width="10%">조교사</th>
											<th width="10%">마주</th>
											</tr>
										</thead>
										<tbody>
											<c:choose>
									<c:when test="${empty list}">
										<tr><td colspan = "8">---전적 및 정보가 없습니다.---</td></tr>
											</c:when>
											<c:otherwise>
												<c:forEach items="${list}" var="list">
													<tr>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
													</tr>
												</c:forEach>
												
											</c:otherwise>
											</c:choose>
										</tbody>
									</table>
								</div>
								<div class="tab-content clearfix" id="tab-responsive-2">
									<table class="table table-bordered ">
										<thead>
										<tr class="titleColor"  style="text-align: center;">
											<th width="10%">년도</th>
											<th width="18%">출추횟수</th>
											<th width="18%">1착횟수</th>
											<th width="18%">2착횟수</th>
											<th width="18%">승률</th>
											<th width="18%">복승률</th>
											
											</tr>
										</thead>
										<tbody>
											<c:choose>
									<c:when test="${empty list}">
										<tr><td colspan = "6">---전적 및 정보가 없습니다.---</td></tr>
											</c:when>
											<c:otherwise>
												<c:forEach items="${jkList}" var="jkList">
													<tr>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>
														<td></td>														
													</tr>
												</c:forEach>
												<tr>
													<td>합계</td>
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

	<!-- ADD-ONS JS FILES -->
	<script>
	$(function() {
		var jk_meet = $("#jk_meet").attr("data-jk_meet");
		if(jk_meet == 1){
			$("#tabseoul").addClass('current');
			$(".titleColor").css("background-color","#fbeae6");
		}else if(jk_meet == 2){
			$("#tabjeju").addClass('current');
			$(".titleColor").css("background-color","#ecf5f9");
		}else if(jk_meet == 3){
			$("#tabbusan").addClass('current');
			$(".titleColor").css("background-color","#e9f3d9");
		}	
	});

		</script>
		
 	
	</body>
	</html>