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
<jsp:useBean id="util" class="com.gam.utils.Util"/>
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

							<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-youtube-sign"></i></span> 경마 채널</h4>
								<div class="line line-xs line-sports"></div>
								
								<div class="card border">
											<div class="card-body nopadding">
									<!-- Post Article -->
									<article class="ipost">
									<div class="entry-image nomargin">
												<iframe style="width: 100%; height: 550px;" src="https://www.youtube.com/embed/${ytDto.ytAddress}" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
											</div>
										
									</article>
									<br>
									<div><h4 class="mb-2 ls1 uppercase t700 " style="font-size: 150%;"><i class="icon-line-play"></i>${ytDto.ytTitle}</h4></div>
									<div></div>
									<c:choose>
											<c:when
												test="${uid.member_id ne 'admin' || empty uid.member_id  }">
									 <article class="spost clearfix nomargin"  style="float: right;">
										<ul class="entry-meta clearfix " >
										<li><a href="ytList.do?pagenum=${page.pagenum+1}&contentnum=10"" class="button button-border button-rounded button-black">목록가기</a></li>																	
										
										</ul>									
									</article> 
									</c:when>
									<c:otherwise>
									 <article class="spost clearfix nomargin"  style="float: right;">
										<ul class="entry-meta clearfix " >																	
										<li><a href="ytDel.do" class="button button-border button-rounded button-black">삭제하기</a></li>
										</ul>									
									</article>
									</c:otherwise>
									</c:choose>
									</div>
								</div>
								
								 <div class="line allmargin-sm"></div> 
							<div class="row clearfix"> 
							<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-comments"></i></span>댓글</h4>
									<div class="line line-xs line-sports"></div>
									<table class="col-md-12">
									<c:forEach var="repList" items="${repList}" >
									<tr>
									<c:choose>
										<c:when test="${repList.ytDelflag == 1 }">
												<td>삭제된 글입니다.</td>
											</c:when>
											<c:otherwise>
												<td>
													<jsp:setProperty property="arrowNbsp" name="util" value="${repList.ytDepth}"/>
					       	 						<jsp:getProperty property="arrowNbsp" name="util"/>
													${repList.ytWriter}(<fmt:formatDate value="${repList.ytRegDate}" pattern="yyyy-MM-dd HH:mm:ss"/>)
													<br>
													${repList.ytContents}
													<br>
													<br>
												<div class="line nomargin"></div>
												</td>
											</c:otherwise>
									</c:choose>
									</tr>
									</c:forEach>								
									</table>
									<form action="ytcommentInsert.do" method="post">
							<input type="hidden" name="ytNum" value="${ytDto.ytNum}">
							<input type="hidden" name= "pagenum" value="${page.pagenum+1}">
							<input type="hidden" name= "contentnum" value="10">
							<div class="allmargin-sm">
								<textarea name ="ytContents" id="ytContents" rows="4" cols="130" placeholder="댓글을 작성해주세요"></textarea>
							</div>
							<button class="button button-3d nomargin" type="submit" style="float: right;" >댓글등록</button>
						 	</form>
									</div>
									</div>
									
								
								<table class="table table-striped topmargin">
									<col width="10%">
									<col width="20%">
									<col width="60%">
									<col width="10%">
									<thead>
										<tr style="text-align: center;">
											<th>번호</th>
											<th></th>
											<th>제목</th>
											<th>작성자</th>

										</tr>
									</thead>

									<tbody>
										<c:choose>
											<c:when test="${empty list}">
												<!-- empty  null인지 확인 -->
												<tr>
													<td colspan="10">---작성된 글이 없습니다.---</td>
												</tr>
											</c:when>
											<c:otherwise>
												<c:forEach items="${list}" var="YoutubeDto">
													<tr>
														<td style="text-align: center;">${YoutubeDto.ytNum}</td>
														<td style="text-align: center;"><a
															href="ytDetail.do?ytNum=${YoutubeDto.ytNum}&pagenum=${page.pagenum+1}&contentnum=10"><img
																width="120px" height="80px"
																src="http://img.youtube.com/vi/${YoutubeDto.ytAddress}/0.jpg"></a></td>
														<td style="text-align: center;">
														<a href="ytDetail.do?ytNum=${YoutubeDto.ytNum}&pagenum=${page.pagenum+1}&contentnum=10">${YoutubeDto.ytTitle}</a></td>
														<td style="text-align: center;">운영자</td>
													</tr>
												</c:forEach>
											</c:otherwise>
										</c:choose>
									</tbody>
									<tr>
										<td colspan="3">
											<ul
												class="pagination pagination-rounded pagination-inside-transparent pagination-button">
												<c:if test="${page.prev}">
													<li class="page-item"><a class="page-link"
														href="javascript:page4(${page.getStartPage()-1});"
														aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
												</c:if>
												<c:forEach begin="${page.getStartPage()}"
													end="${page.getEndPage()}" var="idx">
													<li class="page-item"><a class="page-link"
														href="javascript:page4(${idx});">${idx}</a></li>
												</c:forEach>
												<c:if test="${page.next }">
													<li class="page-item"><a class="page-link"
														href="javascript:page4(${page.getEndPage()+1});"
														aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
												</c:if>
											</ul>
										</td>
										<c:choose>
											<c:when
												test="${uid.member_id ne 'admin' || empty uid.member_id  }">
												<td>
													<div class="row form-group" style="text-align: center;">
														<div class="col-md-12">
															<button class="button button-3d nomargin" type="button"
																onclick="location.href='main.do'">메인가기</button>
														</div>
													</div>
												</td>

											</c:when>
											<c:otherwise>
												<td>
													<div class="row form-group" style="text-align: center;">
														<div class="col-md-12">
															<button class="button button-3d nomargin" type="button"
																onclick="location.href='youtubeInsert.do'">업로드하기</button>
														</div>
													</div>
												</td>
											</c:otherwise>
										</c:choose>
									</tr>
								</table>

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
	<!-- <script src="resources/js/tabsJs.js"></script> -->

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
	<script type="text/javascript">
	function page4(idx) {
		var pagenum = idx;
		var contentnum = 10;
		location.href="ytList.do?pagenum="+pagenum+"&contentnum="+contentnum; 
	}
	</script>
		
 	<script>
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