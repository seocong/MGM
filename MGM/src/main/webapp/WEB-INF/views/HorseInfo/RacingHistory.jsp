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
							<div id="hr_meet" data-hr_meet = "${dateList[0].rp_meet}" ></div>	
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
										출전내역<span style="font-size: 60%;"></span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab" style="border-bottom: solid #DDD 1px;">
											<li id="tabseoul"><a href="racingHistory.do?meet=1&rcDate=20190824&object=jk"> 서울경마</a></li>
											<li id="tabbusan"><a href="racingHistory.do?meet=3&rcDate=20190823&object=jk"> 부산경마</a></li>
											<li id="tabjeju"><a href="racingHistory.do?meet=2&rcDate=20190824&object=jk"> 제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
											<br>
											<div>
												<form action="racingHistory.do" method="get" >
												<input type="hidden" name="meet" value="${dateList[0].rp_meet}">
	 											<table class="table" style="border-bottom: solid #DDD 1px;">
												<tr>
												
												<td width="10%">기간선택</td>
												<td width="15%">
													<select class="selectpicker" name="rcDate">
															<c:forEach items="${dateList}" var="list">
  																<option value="<fmt:formatDate value="${list.rp_rcDate}" pattern="yyyyMMdd"/>"><fmt:formatDate value="${list.rp_rcDate}" pattern="yyyy년MM월dd일"/></option>
  															</c:forEach>
													</select>
												</td>
												<td width="10%">정보선택</td>
												<td width="35%">
												<input type="radio" name="object" value="jk" class="radio-style"> 기수 기승현황 
												<input type="radio" name="object" value="tr" class="radio-style"> 조별 출전현황 
												<input type="radio" name="object" value="ow" class="radio-style"> 마주별 출전현황</td>
												<td width="10%"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button></td>
												
											</tr>
											
											</table>
											</form>
											</div>
											
											<c:choose>	
												<c:when test="${object eq 'jk'}">
												<!-- 기수 -->
												<div>
												<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy"></i></span>기수 기승 현황</h4>
													<table class="table table-bordered table-striped">
															<tbody>
																<tr>
																	<th class="titleColor"  style="text-align: center;"rowspan="2" width="6%">기수명</th>
																	<th class="titleColor"  style="text-align: center;white-space: nowrap;" rowspan="2" width="2%">출전</th>													
																	<th class="titleColor"  style="text-align: center;" colspan="${maxNo}" width="92%">경주</th>
																</tr>
																<tr>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																	<th class="titleColor"  style="text-align: center;" width="4%" >${sta.count}</th>
																	</c:forEach>																	
																</tr>
																<c:forEach items="${objCount}" var="list">
																<tr>
																	<td style="text-align: center;">${list.objName}</td>															
																	<td style="text-align: center;">${list.rcNo}</td>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																		<c:forEach items="${planList}" var="planList">
																			<c:if test="${list.objName eq planList.objName && sta.count eq planList.rcNo}">
																				<c:choose>
																					<c:when test="${planList.chulNo ne '0'}">
																						<td style="text-align: center;" class="chulNum" data-num="${planList.chulNo}" data-hrName="${planList.hrName}"></td>
																					</c:when>
																					<c:otherwise>
																						<td style="text-align: center;"></td>
																					</c:otherwise>
																				</c:choose>
																			</c:if>
																		</c:forEach>			
																	</c:forEach>													
																</tr>
																</c:forEach>
														</tbody>
													</table>
												</div>
												</c:when>
												<c:when test="${object eq 'tr'}">
												<!-- 조교사 -->
												<div>
												<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy"></i></span>조별 출전현황</h4>
													<table class="table table-bordered table-striped">
															<tbody>
																<tr>
																	<th class="titleColor"  style="text-align: center;"rowspan="2" width="2%">조</th>
																	<th class="titleColor"  style="text-align: center; padding-left: 6px;padding-right:6px;"rowspan="2" width="8%">기수명</th>
																	<th class="titleColor"  style="text-align: center;white-space: nowrap; padding-left: 4px;padding-right:4px;" rowspan="2" width="2%">출전</th>													
																	<th class="titleColor"  style="text-align: center;" colspan="${maxNo}" width="88%">경주</th>
																</tr>
																<tr>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																	<th class="titleColor"  style="text-align: center;" width="8%">${sta.count}</th>
																	</c:forEach>																	
																</tr>
																<c:forEach items="${objCount}" var="list">
																<tr>
																	<td style="text-align: center;">${list.part}</td>
																	<td style="text-align: center;">${list.objName}</td>															
																	<td style="text-align: center;">${list.rcNo}</td>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																		<c:forEach items="${planList}" var="planList">
																			<c:if test="${list.objName eq planList.objName && sta.count eq planList.rcNo}">
																				<c:choose>
																					<c:when test="${planList.chulNo ne '0'}">
																						<td style="text-align: center; " class="chulNum" data-num="${planList.chulNo}" data-hrName="${planList.hrName}"></td>
																					</c:when>
																					<c:otherwise>
																						<td style="text-align: center;"></td>
																					</c:otherwise>
																				</c:choose>
																			</c:if>
																		</c:forEach>			
																	</c:forEach>													
																</tr>
																</c:forEach>
														</tbody>
													</table>
												</div>
												</c:when>
												<c:when test="${object eq 'ow'}">
												<!-- 마주 -->
												<div>
												<h4 class="mb-3 mt-3 ls1 uppercase t700" style="font-size: 100%;float: left;">
												<span class="text-dark"><i class="icon-trophy"></i></span>마주별 출전현황</h4>
													<table class="table table-bordered table-striped">
															<tbody>
																<tr>
																	<th class="titleColor"  style="text-align: center;"rowspan="2" width="7%">마주명</th>
																	<th class="titleColor"  style="text-align: center;white-space: nowrap;" rowspan="2" width="3%">출전</th>													
																	<th class="titleColor"  style="text-align: center;" colspan="${maxNo}" width="90%">경주</th>
																</tr>
																<tr>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																	<th class="titleColor"  style="text-align: center;"  width="4%" >${sta.count}</th>
																	</c:forEach>																	
																</tr>
																<c:forEach items="${objCount}" var="list">
																<tr>
																	<td style="text-align: center;">${list.objName}</td>															
																	<td style="text-align: center;">${list.rcNo}</td>
																	<c:forEach begin="1" end="${maxNo}" varStatus="sta">
																		<c:forEach items="${planList}" var="planList">
																			<c:if test="${list.objName eq planList.objName && sta.count eq planList.rcNo}">
																				<c:choose>
																					<c:when test="${planList.chulNo ne '0'}">
																						<td style="text-align: center; text-overflow:ellipsis;" class="chulNum" data-num="${planList.chulNo}" data-hrName="${planList.hrName}"></td>
																					</c:when>
																					<c:otherwise>
																						<td style="text-align: center;"></td>
																					</c:otherwise>
																				</c:choose>
																			</c:if>
																		</c:forEach>			
																	</c:forEach>													
																</tr>
																</c:forEach>
														</tbody>
													</table>
												</div>
											</div>
										</c:when>
										</c:choose>

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
	<script src="resources/js/recordjs.js"></script>
	<!-- ADD-ONS JS FILES -->
	<script>
	$(function() {
		var hr_meet = $("#hr_meet").attr("data-hr_meet");
		if(hr_meet == 1){
			$("#tabseoul").addClass('current');
			$(".titleColor").css("background-color","#fbeae6");
		}else if(hr_meet == 2){
			$("#tabjeju").addClass('current');
			$(".titleColor").css("background-color","#ecf5f9");
		}else if(hr_meet == 3){
			$("#tabbusan").addClass('current');
			$(".titleColor").css("background-color","#e9f3d9");
		}	
		
		var selectForm = $('.selectpicker').children('option');
		for(var i in selectForm){
			if(selectForm.eq(i).attr('value') == '${selDate}'){
				selectForm.eq(i).attr('selected','selected');
			}
		}
		var radioForm = $('input:radio[name=object]');
		var obj = '${object}'
			if(obj=='jk'){
				radioForm.eq(0).prop('checked',true);
			}else if(obj=='tr'){
				radioForm.eq(1).prop('checked',true);
			}else if(obj=='ow'){
				radioForm.eq(2).prop('checked',true);
			}
		
	});
	
		</script>


</body>
	</html>
</html>