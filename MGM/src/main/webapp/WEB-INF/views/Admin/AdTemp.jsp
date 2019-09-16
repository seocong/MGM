<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<%response.setContentType("text/html;charset=utf-8"); %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	<link rel="stylesheet" href="resources/css/mypage.css" type="text/css" />
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
	<title>관리자 페이지</title>
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
						<!-- <div class="fancy-title title-dotted-border">
						
						</div> -->
						
								<!-- board name을 div에 불러옴 , script에서 받음 -->
								<div id="board_name" style="display:none;" data-board_name = "${divs}" ></div>
								<div id="searchId" style="display:none;" data-searchId = "${searchId}" ></div>
								<div class="col-md-12 mt-5">
									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-user-friends"></i></span>
										관리자 페이지
									</h4>
									<div class="line line-xs line-sports"></div>
									<div id="container">
										<ul class="tab">
											<li id="tabmember"><a href="adminPage.do?div=member">
													회원목록</a></li>
											<li id="tabboard"><a href="adminPage.do?div=board">
													게시판 목록</a></li>
											<li id="tabpoint"><a href="adminPage.do?div=point">
													포인트 목록</a></li>
											<li id="tabresetdata"><a href="adminPage.do?div=reset">
													데이터 초기화</a></li>
										</ul>
										<c:if test="${divs eq 'member'}">
											<!-- 회원목록시작 -->
											<div>
												<div class="tabcontent" id="tab4">
													<div>
													<form class="delForm" action="managerDel.do" method="post">
													<input type="hidden" name="divs">
 														<table class="table table-striped">
															<col width="50px">
															<col width="300px">
															<col width="100px">
															<col width="150px">
															<col width="60px">
															<col width="50px">
															<thead>
																<tr style="text-align: center;">
																	<th width="5%"><input class="parentChk" type="checkbox"></th>
																	<th width="11%">아이디</th>
																	<th width="11%">이름</th>
																	<th width="14%">생년월일</th>
																	<th width="14%">전화번호</th>
																	<th width="20%">주소</th>
																	<th width="10%">보유포인트</th>
																	<th width="14%">가입일</th>
																</tr>
															</thead>
															<tbody>
																<c:choose>
																	<c:when test="${empty dto}">
																		<!-- empty  null인지 확인 -->
																		<tr>
																			<td colspan="10">---작성된 글이 없습니다.---</td>
																		</tr>
																	</c:when>
																	<c:otherwise>
																		<c:forEach items="${dto}" var="dto">
																			<tr>
																				<td><input type="checkbox" name="chkvalue" value="${dto.member_id}"></td>
																				<td style="text-align: center;">${dto.member_id}</td>
																				<td style="text-align: center;">${dto.member_name}</td>
																				<td style="text-align: center;"><fmt:formatDate
																						value="${dto.member_birth}" pattern="yyyy년MM월dd일" /></td>
																				<fmt:formatNumber var="phnum"
																					value="${dto.member_phnum}" pattern="###,####,####" />
																				<td class="text-center"><span>0<c:out
																							value="${fn:replace(phnum,',','-')}" /></span></td>
																				<td class="addrChange" style="text-align: center;">${dto.member_address}</td>
																				<td style="text-align: center;"><fmt:formatNumber
																						value="${dto.member_point}" type="number" /></td>
																				<td style="text-align: center;"><fmt:formatDate
																						value="${dto.member_regdate}"
																						pattern="yyyy년MM월dd일" /></td>
																			</tr>
																		</c:forEach>
																	</c:otherwise>
																</c:choose>

															</tbody>
															<tr>
																<td colspan="3">
																	<div class="floatreset">
																		<div class="paging mt-1" data-count="${totalCount}"
																			data-pageNum="${pagenum}"></div>
																	</div>
																</td>
																<td colspan="3">
																	<div class="searchArea col-md-12" style="float:left;">
																		<div class="col-full mr-2" style="float:left;">
																			<input type="text" class="sm-form-control col_five_sixth mb-0" id="searchbox" placeholder="아이디 검색"/>
																		</div>
																		<input type="button" class="button button-3d col_last searchId my-0" style="float:left;" value="검색">
																	</div>
																</td>
																<td colspan="2">
																	<div>
																	<div class="form-group my-0" style="text-align: center;">
																			<input class="button button-3d col-md-6 my-0 delbtn" type="button" value="회원삭제">
																	</div>
																	</div>

																</td>
															</tr>
														</table>
														</form>
													</div>

												</div>


											</div>
										</c:if>
										<!-- 회원목록 종료 -->
										<c:if test="${divs eq 'board'}">
											<!-- 회원목록시작 -->
											<div>
												<div class="tabcontent" id="tab4">
													<div>
													<form class="delForm" action="managerDel.do" method="post">
													<input type="hidden" name="divs">
														<table class="table table-striped">
															<col width="50px">
															<col width="300px">
															<col width="100px">
															<col width="150px">
															<col width="60px">
															<col width="50px">
															<thead>
																<tr style="text-align: center;">
																	<th width="5%"><input class="parentChk" type="checkbox"></th>
																	<th width="8%">번호</th>
																	<th width="38%">제목</th>
																	<th width="15%">작성자</th>
																	<th width="15%">작성일</th>
																	<th width="9%">조회수</th>
																	<th width="9%">추천</th>
																</tr>
															</thead>
															<tbody>
																<c:choose>
																	<c:when test="${empty dto}">
																		<!-- empty  null인지 확인 -->
																		<tr>
																			<td colspan="10">---작성된 글이 없습니다.---</td>
																		</tr>
																	</c:when>
																	<c:otherwise>
																		<c:forEach items="${dto}" var="dto">
																			<tr>
																				<td><input type="checkbox"  name="chkvalue" value="${dto.board_seq}"></td>
																				<td style="text-align: center;">${dto.board_seq}</td>
																				<td style="text-align: center;"><a href="detail.do?board_seq=${dto.board_seq}&pagenum=1&contentnum=20&board_name=${dto.board_name}">${dto.board_title}</a></td>
																				<td style="text-align: center;">${dto.board_writer}</td>
																				<td style="text-align: center;"><fmt:formatDate
																						value="${dto.board_regdate}" pattern="yyyy년MM월dd일" /></td>
																				<td class="addrChange" style="text-align: center;">${dto.board_readcount}</td>
																				<td style="text-align: center;"><fmt:formatNumber
																						value="${dto.board_pushnum}" type="number" /></td>
																			</tr>
																		</c:forEach>
																	</c:otherwise>
																</c:choose>

															</tbody>
															<tr>
																<td colspan="5">
																	<div class="floatreset">
																		<div class="paging mt-1" data-count="${totalCount}"
																			data-pageNum="${pagenum}"></div>
																	</div>
																<!-- </td>
																<td colspan="3"> -->
																	<div class="searchArea col-md-8 ml-5" style="float:left;">
																		<div class="col-full ml-5 mr-2" style="float:left;">
																			<input type="text" class="sm-form-control col_five_sixth mb-0 ml-4" id="searchbox" placeholder="아이디 검색"/>
																		</div>
																		<input type="button" class="button button-3d col_last searchId my-0 ml-4" style="float:left;" value="검색">
																	</div>
																</td>
																<td colspan="2">
																	<div class="row form-group mb-0" style="text-align: center;">
																		<div class="col-md-12">
																			<input class="button button-3d col-md-6 my-0 delbtn" type="button" value="삭제">
																		</div>
																	</div>
																</td>
															</tr>
														</table>
														</form>
													</div>

												</div>


											</div>
										</c:if>
										<!-- 회원목록 종료 -->
										<c:if test="${divs eq 'point'}">
											<!-- 회원목록시작 -->
											<div>
												<div class="tabcontent" id="tab4">
													<div>
													<form class="delForm" action="managerDel.do" method="post">
													<input type="hidden" name="divs">
														<table class="table table-striped">
															<col width="50px">
															<col width="300px">
															<col width="100px">
															<col width="150px">
															<col width="60px">
															<col width="50px">
															<thead>
																<tr style="text-align: center;">
																	<th width="5%"><input class="parentChk" type="checkbox"></th>
																	<th width="17%">날짜</th>
																	<th width="16%">아이디</th>
																	<th width="22%">내용</th>
																	<th width="13%">추가</th>
																	<th width="13%">사용</th>
																</tr>
															</thead>
															<tbody>
																<c:choose>
																	<c:when test="${empty dto}">
																		<!-- empty  null인지 확인 -->
																		<tr>
																			<td colspan="10">---포인트 내역이 없습니다.---</td>
																		</tr>
																	</c:when>
																	<c:otherwise>
																		<c:forEach items="${dto}" var="dto">
																			<tr>
																				<td><input type="checkbox"  name="chkvalue" value="${dto.point_seq}"></td>
																				<td><fmt:formatDate
																						value="${dto.point_regdate}" pattern="yyyy년MM월dd일" /><br>
																					<fmt:formatDate value="${dto.point_regdate}"
																						pattern="HH:mm" /></td>
																				<td style="text-align: center;">${dto.point_id}</td>
																				<td style="text-align: center;">${dto.point_title}</td>
																				<c:choose>
																					<c:when test="${dto.point_sign eq 'P'}">
																						<td class="align-middle">${dto.point_price}</td>
																						<td class="align-middle">0</td>
																					</c:when>
																					<c:otherwise>
																						<td class="align-middle">0</td>
																						<td class="align-middle">${dto.point_price}</td>
																					</c:otherwise>
																				</c:choose>
																			</tr>
																		</c:forEach>
																	</c:otherwise>
																</c:choose>

															</tbody>
															<tr>
																<td colspan="2">
																	<div class="floatreset">
																		<div class="paging mt-1" data-count="${totalCount}"
																			data-pageNum="${pagenum}"></div>
																	</div>
																</td>
																<td colspan="2">
																	<div class="searchArea col-md-9 ml-5 mt-1" style="clear:left;">
																		<div class="col-full mt-1" style="float:left;">
																			<input type="text" class="sm-form-control col_five_sixth mb-0" id="searchbox" placeholder="아이디 검색"/>
																		</div>
																		<input type="button" class="button button-3d col_last searchId" value="검색">
																	</div>
																</td>
																<td colspan="2">
																	<div class="row form-group mb-0" style="text-align: center;">
																		<div class="col-md-12">
																			<input class="button button-3d col_half point mx-0 mb-0 pointBtn" type="button" value="충전/차감">
																			<input class="button button-3d col_half col_last mb-0 delbtn" type="button" value="내역삭제">
																		</div>
																	</div>
																</td>
															</tr>
														</table>
														</form>
													</div>
												</div>
											</div>
										</c:if>
										<!-- 회원목록 종료 -->
										<c:if test="${divs eq 'reset'}">
											<div class="card border">
											<div class="card-body border">
												<div class="tabcontent" id="tab4">
													<div>
													<input class="button button-3d col-md-5" type="button" value="경주마 등록" onclick="location.href='hrInset.do'">
													<input class="button button-3d col-md-5" type="button" value="경주마 추가정보" onclick="location.href='hrUpdate.do'"><br>
													<input class="button button-3d col-md-5" type="button" value="기수 등록" onclick="location.href='jockeyInput.do'">
													<input class="button button-3d col-md-5" type="button" value="조교사 등록" onclick="location.href='trainerInput.do'"><br>
													<input class="button button-3d col-md-5" type="button" value="마주 등록" onclick="location.href='owInput.do'">
													<input class="button button-3d col-md-5" type="button" value="경기기록 등록" onclick="location.href='rcResultInput.do'"><br>
													<input class="button button-3d col-md-5" type="button" value="경기개요 등록" onclick="location.href='raceInfo.do'">
													<input class="button button-3d col-md-5" type="button" value="출마표 등록" onclick="location.href='rcPlanInput.do'"><br>
													<input class="button button-3d col-md-5" type="button" value="출전등록말 등록" onclick="location.href='rcEntryInput.do'"><br>
													</div>
													</div>
												</div>
											</div>
										</c:if>
									</div>
								</div>




								<!-- Ad
							============================================= -->
							<!-- <a href="#"><img src="resources/demos/news/images/ad/728x90.jpg" width="728" alt="Ad" class="mt-5 mt-lg-2 mb-4 mb-lg-3 aligncenter"></a> -->
							
							
							
							
							<!-- Articles
							============================================= -->
						
						</div>
						
						
						
					
										
										
										
						
						<div class="line"></div>
						
	
						

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
	<script src="resources/js/manager.js"></script>
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
	
	<!--<script>
	$(function(){
		var boardname = $("#boardname").attr("data-boardname");
		if(boardname == "free"){
			$("#freeboard").trigger("click");
		}else if(boardname == "fun"){
			$("#funboard").trigger("click");
		}else if(boardname == "alert"){
			$("#alertboard").trigger("click");
		}else if(boardname == "game"){
			$("#gameboard").trigger("click");
		}
	});
	</script>-->

	</body>
	</html>