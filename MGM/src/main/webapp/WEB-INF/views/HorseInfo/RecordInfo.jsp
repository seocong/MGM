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
							<div id="ri_meet" data-ri_meet = "${ri_meet}" ></div>	
								<div class="col-md-12 mt-5">						
								<table class="allmargin">																					
								<tr style="text-align: center; white-space: nowrap;">
									<td width="12%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="#">출전정보</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10">경주성적표</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="horseInfo.do?hr_meet=1">경주마정보</a></td>
									<td width="11%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;" ><a href="jockeyInfo.do?jk_meet=1">기수정보</a></td>
									<td width="13%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="jokyoInfo.do?tr_meet=1">조교사정보</a></td>
									<td width="11%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="ownerInfo.do?ow_meet=1">마주정보</a></td>
									<td width="14%" style="border-right : solid 2px #DDD; font-size: 120%;font-weight: bold;padding-right:0.5rem;padding-left:0.5rem;"><a href="#">출주예정마필</a></td>
									<td width="11%" style="font-size: 120%;font-weight: bold;"><a href="#">시행정보</a></td>
								</tr>
								</table>

									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 150%;">
										<span class="text-warning"><i class="icon-user-friends"></i></span>
										경주성적표 <span style="font-size: 60%;"> 경주 결과</span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">


										<ul class="tab">
											<li id="tabseoul"><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10"> 서울경마</a></li>
											<li id="tabbusan"><a href="recordInfo.do?ri_meet=3&pagenum=1&contentnum=10"> 부산경마</a></li>
											<li id="tabjeju"><a href="recordInfo.do?ri_meet=2&pagenum=1&contentnum=10"> 제주경마</a></li>
										</ul>

										<div>
											<div class="tabcontent">
												<div>
													<table class="table table-bordered table-striped">
																												
														<thead>
															<tr class="titleColor"  style="text-align: center;">
																
																<th width="20%">경주일자</th>
																<th width="80%">경주</th>

															</tr>
														</thead>

														<tbody>

															<c:forEach items="${riDto}" var="riDto">
																<tr>
																	<td style="text-align: center;"><a href="recordDetail.do?ri_rcDate=<fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyyMMdd"/>&ri_rcNo=1&ri_meet=${ri_meet}"> <fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyy년MM월dd일"/></a></td>
																	<td class="nopadding">
																	<ul style="list-style: none">
																	<c:forEach begin="1" end="${riDto.ri_cnt}" var="cnt">
																		<li style="display: inline; float:left;padding: 10px;"><a href="recordDetail.do?ri_rcDate=<fmt:formatDate value="${riDto.ri_rcDate}" pattern="yyyyMMdd"/>&ri_rcNo=${cnt}&ri_meet=${ri_meet}">${cnt}</a></li>
																		</c:forEach>
																	</ul>
																	</td>
																</tr>
															</c:forEach>
																<tr>
  																	 <td colspan="2">
   																		<ul class="pagination pagination-rounded pagination-inside-transparent pagination-button">
   																		<c:if test="${page.prev}">
   																		<li class="page-item"><a class="page-link" href="javascript:page3(${page.getStartPage()-1});"aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
   																		</c:if>
   																		<c:forEach begin="${page.getStartPage()}" end="${page.getEndPage()}" var="idx">
   																		<li class="page-item"><a class="page-link" href="javascript:page3(${idx});">${idx}</a></li>
   																			</c:forEach>
   																			<c:if test="${page.next }">
   																	 <li class="page-item"><a class="page-link" href="javascript:page3(${page.getEndPage()+1});" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
   																			</c:if>
 																			</ul>
       																			 </td>
       
																			</tr>

														</tbody>

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

	<!-- ADD-ONS JS FILES -->
	<script>
	$(function() {
		var ri_meet = $("#ri_meet").attr("data-ri_meet");
		if(ri_meet == 1){
			$("#tabseoul").addClass('current');
			$(".titleColor").css("background-color","#fbeae6");
		}else if(ri_meet == 2){
			$("#tabjeju").addClass('current');
			$(".titleColor").css("background-color","#ecf5f9");
		}else if(ri_meet == 3){
			$("#tabbusan").addClass('current');
			$(".titleColor").css("background-color","#e9f3d9");
		}	
	});
	
	function page3(idx) {
		var pagenum = idx;
		var contentnum = 10;//$("#contentnum option:selected").val();
		var ri_meet = $('#ri_meet').attr("data-ri_meet");//boardname을 받아옴
		location.href="recordInfo.do?pagenum="+pagenum+"&contentnum="+contentnum+"&ri_meet="+ri_meet;
	}
	
	/* function list(cnt) {
		var pagenum = cnt;
		var contentnum = 10;//$("#contentnum option:selected").val();
		var board_name = $('#board_name').attr("data-board_name");//boardname을 받아옴
		location.href="detail.do?pagenum="+pagenum+"&contentnum="+contentnum+"&board_name="+board_name;
	} */
	$(function(){
		var pagenum = ${page.pagenum};
		if(pagenum>=5){
			pagenum=parseInt(pagenum)-4;
		}
		$(".page-link").eq(pagenum).css({
			"background-color":"#3A486E",
			"color":"white"
		});
	});
		</script>
		
 	
	</body>
	</html>