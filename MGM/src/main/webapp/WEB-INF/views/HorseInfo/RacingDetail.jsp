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
							 <div id="rp_meet" data-rp_meet = "${rp_meet}" ></div>	
								<div class="col-md-12 mt-5">
								
								<table class="allmargin">
	
								
								
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
								</table>
								
								
								
								
									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 150%;">
										<span class="text-warning"><i class="icon-user-friends"></i></span>
										출전 상세 정보<span style="font-size: 60%;"></span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab" style="border-bottom: solid #DDD 1px;">
											<li id="tabseoul"><a href="racingInfo.do?rp_meet=1"> 서울경마</a></li>
											<li id="tabbusan"><a href="racingInfo.do?rp_meet=3"> 부산경마</a></li>
											<li id="tabjeju"><a href="racingInfo.do?rp_meet=2"> 제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
												<div>
												<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy">라운드별 경주정보</i></span></h4>
												
												<table class="table" style="border-bottom: solid #DDD 1px;" >
													<tr>
														<td width="6%" class="titleColor">경주</td>
														<c:forEach items="${roundlist}" var="roundlist">
															<td width="2%" ><a class="link" href="racingDetail.do?rp_meet=${roundlist.rp_meet}&rp_rcNo=${roundlist.rp_rcNo}&rp_rcDate=<fmt:formatDate value="${roundlist.rp_rcDate}" pattern="yyyyMMdd"/>">${roundlist.rp_rcNo}R</a></td>
														</c:forEach>
													</tr>
												</table>
											</div>
											<div >
											<!-- 	<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy"></i></span>소유말 현황</h4> -->
												<table class="table table-bordered tableColor" style="border-bottom: solid #DDD 1px;">
												<tr style="text-align: center;">
												<th class="titleColor"  width="100%" colspan="4"><fmt:formatDate value="${rpDto.rp_rcDate}" pattern="yyyy년MM월dd일"/>(${rpDto.rp_rcDay}) ${rpDto.rp_ilsu}일차 제${rpDto.rp_rcNo}경주 </th>
												
											</tr>
											<tr style="text-align: center;">
												<td width="25%"> ${rpDto.rp_rank} ${rpDto.rp_rcDist}M ${rpDto.rp_budam}</td>
												<td width="25%">${rpDto.rp_rcName}</td>
												<td width="25%">${rpDto.rp_prizeCond}</td>
												<td width="25%">${rpDto.rp_ageCond}</td>
												
											</tr>
											</table>
											<table class="table table-bordered ">
											<tr style="text-align: center;">
												<th width="20%" class="titleColor" >순위상금</th>
												<td width="16%">${rpDto.rp_chaksun1}원</td>
												<td width="16%">${rpDto.rp_chaksun2}원</td>
												<td width="16%">${rpDto.rp_chaksun3}원</td>
												<td width="16%">${rpDto.rp_chaksun4}원</td>
												<td width="16%">${rpDto.rp_chaksun5}원</td>
											</tr>
											</table>
											</div>
											
											<div class="tabs tabs-responsive clearfix">

							<ul class="tab-nav clearfix">
								<li><a href="#tab-responsive-1"> 출전표 </a></li>
								<li><a href="#tab-responsive-2"> 전적 </a></li>								
							</ul>
							
							
							<div class="tab-container">

								<div class="tab-content clearfix" id="tab-responsive-1">
								
											
												
													<table class="table table-bordered table-striped tableColor">													
											<tr class="titleColor"  style="text-align: center; white-space:nowrap; ">
												<th width="5%" >번호</th>
												<th width="15%" >마명</th>
												<th width="5%">산지</th>
												<th width="5%">성별</th>
												<th width="5%">연령</th>
												<th width="6%">레이팅</th>
												<th width="5%">중량</th>
												<th width="10%">기수명</th>
												<th width="10%">조교사</th>
												<th width="12%">마주명</th>
												<th width="11%">장구현황</th>
												<th width="11%">특이사항</th>
											</tr>
											<c:forEach items="${list}" var="list">									
											<tr>
												<td>${list.rp_chulNo}</td>
												<td><a href="horseDetail.do?hr_htName=${list.rp_hrName}&hr_meet=${list.rp_meet}">${list.rp_hrName}</a></td>
												<td>${list.rp_prd}</td>
												<td>${list.rp_sex}</td>
												<td>${list.rp_age}</td>
												<td>${list.rp_rating}</td>
												<td>${list.rp_wgBudam}</td>
												<td>${list.rp_jkName}</td>
												<td>${list.rp_trName}</td>
												<td>${list.rp_owName}</td>
												<td></td>
												<td></td>
											</tr>
											</c:forEach>
									</table>

								</div>
								
								<div class="tab-content clearfix" id="tab-responsive-2">
								<div>
								<!-- <h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
										<span class="text-dark"><i class="icon-trophy"></i></span> 최근6개월 성적 </h4>	 -->
									<table  class="table table-bordered table-striped tableColor">
										
										<tr class="titleColor"  style="text-align: center;">
											<th width="16%" rowspan="2">마명</th>
											<th width="42%" colspan="4">최근1년전적</th>
											<th width="42%" colspan="4">통산전적</th>											
											</tr>
										<tr>
											<td>출전(1/2/3)</td>
											<td>승률</td>
											<td>복승률</td>
											<td>연승률</td>
											<td>출전(1/2/3)</td>
											<td>승률</td>
											<td>복승률</td>
											<td>연승률</td>									
										</tr>
										<tbody>
										<c:forEach items="${list}" var="list">
													<tr>
														<td><a href="horseDetail.do?hr_htName=${list.rp_hrName}&hr_meet=${list.rp_meet}">${list.rp_hrName}</a></td>
														<td>${list.hr_rcCntY}(${list.hr_ord1CntY}/${list.hr_ord2CntY}/${list.hr_ord3CntY})</td>
														<td>${list.totalWinY}</td>														
														<td>${list.win1Y}</td>														
														<td>${list.win2Y}</td>
														<td>${list.hr_rcCntT}(${list.hr_ord1CntT}/${list.hr_ord2CntT}/${list.hr_ord3CntT})</td>														
														<td>${list.totalWinT}</td>														
														<td>${list.win1T}</td>														
														<td>${list.win2T}</td>																										
													</tr>
												</c:forEach>												
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
		var rp_meet = $("#rp_meet").attr("data-rp_meet");
		if(rp_meet == 1){
			$("#tabseoul").addClass('current');
			$(".titleColor").css("background-color","#fbeae6");
			$(".tableColor").css("border-top","solid #b30003 3px");
		}else if(rp_meet == 2){
			$("#tabjeju").addClass('current');
			$(".titleColor").css("background-color","#ecf5f9");
			$(".tableColor").css("border-top","solid #2a4e8b 3px");
		}else if(rp_meet == 3){
			$("#tabbusan").addClass('current');
			$(".titleColor").css("background-color","#e9f3d9");
			$(".tableColor").css("border-top","solid #5a9e01 3px");
		}	
	});
	
	$(function(){
		var page = ${rpDto.rp_rcNo}-1;
		var rp_meet = $("#rp_meet").attr("data-rp_meet");
		if(rp_meet == 1){
		$(".link").eq(page).css({
			"background-color":"#b30003",
			"color":"white"
		});
		}else if(rp_meet == 2){
			$(".link").eq(page).css({
				"background-color":"#2a4e8b",
				"color":"white"
			});
			}else if(rp_meet == 3){
				$(".link").eq(page).css({
					"background-color":"#5a9e01",
					"color":"white"
				});
				}
	});
		</script>
		
 	
	</body>
	</html>