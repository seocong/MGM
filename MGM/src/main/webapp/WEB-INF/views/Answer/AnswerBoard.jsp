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
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-user-friends"></i></span> 문의게시판</h4>
									<div class="line line-xs line-sports"></div>	
									<table class="table table-striped">
							<col width="10%"><col width="60%"><col width="15%"><col width="15%"><%-- <col width="60px"><col width="50px"> --%>
								<thead>
								  <tr style="text-align: center;">
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
									<!-- <th>조회수</th>
									<th>추천</th> -->
								  </tr>
								</thead>
								
								<tbody>
								  <c:choose>
									<c:when test="${empty list}"><!-- empty  null인지 확인 -->
										<tr><td colspan = "10">---작성된 글이 없습니다.---</td></tr>
											</c:when>
											<c:otherwise>
												<c:forEach items="${list}" var="ansboardDto">
										<tr>
					
												<td  style="text-align: center;">${ansboardDto.answerboard_seq}</td>
									<c:choose>
						<c:when test="${ansboardDto.answerboard_delflag=='Y'}">
							<td>---삭제된 글입니다.---</td>
						</c:when>
						<c:otherwise> 
						<c:choose>
						<c:when test="${ansboardDto.answerboard_secret=='Y'}">  
					        <td  style="text-align: center;">
					        <a href="ansdetail.do?answerboard_seq=${ansboardDto.answerboard_seq}&pagenum=${page.pagenum+1}&contentnum=20">${ansboardDto.answerboard_title}
					         </a><span class="text-dark"><i class="icon-lock"></i></span>
					        </td>
					        </c:when>
					        <c:otherwise>
					        <td  style="text-align: center;">
					        <a href="ansdetail.do?answerboard_seq=${ansboardDto.answerboard_seq}&pagenum=${page.pagenum+1}&contentnum=20">${ansboardDto.answerboard_title}
					         </a>
					        </td>
					        </c:otherwise>
					        </c:choose> 				            									
						</c:otherwise>
					</c:choose>
					<td  style="text-align: center;">${ansboardDto.answerboard_writer}</td>				
					<td  style="text-align: center;"> <fmt:formatDate value="${ansboardDto.answerboard_regdate}" pattern="yyyy년MM월dd일"/> </td>
					<%-- <td  style="text-align: center;">${boardDto.board_readcount}</td>	
					<td  style="text-align: center;">${boardDto.board_pushnum}</td>		 --%>		
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>	
			   
								</tbody>
							<tr>
   <td colspan="3">
   		<ul class="pagination pagination-rounded pagination-inside-transparent pagination-button">
   	<c:if test="${page.prev}">
   		<li class="page-item"><a class="page-link" href="javascript:page(${page.getStartPage()-1});"aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
   	</c:if>
   	<c:forEach begin="${page.getStartPage()}" end="${page.getEndPage()}" var="idx">
   		<li class="page-item"><a class="page-link" href="javascript:page(${idx});">${idx}</a></li>
   	</c:forEach>
   <c:if test="${page.next }">
   		 <li class="page-item"><a class="page-link" href="javascript:page(${page.getEndPage()+1});" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
   	</c:if>
 		</ul>
        </td>
        <td>
				<div class="row form-group" style="text-align: center;">
                <div class="col-md-12">
                  <button class="button button-3d nomargin" type="button"  onclick="location.href='ansinsertform.do'">문의하기</button>
                </div>
              </div>
	
        
        </td>
	</tr>
	</table>
								
								
								
								
								
								
								
									
						</div>			
						
					
										
										
										
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						<div class="line"></div>
						
	
						

						
						
					
						
				
					</div>                                                              <!-- 본문내용끝 -->
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