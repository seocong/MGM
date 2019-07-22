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
<title>마이페이지</title>
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

							<div class="container clearfix">

								<!-- Postcontent
					============================================= -->
								<div class="col-md-12 mt-5 mb-4">
									<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-user-friends"></i></span>
										마이페이지
									</h4>
									<div class="line line-xs line-sports mb-5"></div>
									<div class="row clearfix">
										<div class="col-md-6">
											<h4 class="mb-3 uppercase t700" style="font-size: 115%;">회원정보</h4>
											<div class="card border">
												<div class="card-body table-responsive">
													<table class="table table-bordered mt-3 ">
														<tbody>
															<tr>
																<td class="table-dark text-center x-large">아이디</td>
																<td class="text-center">${memberInfo.member_id}</td>
															</tr>
															<tr>
																<td class="table-dark text-center">포인트</td>
																<td class="text-center">${memberInfo.member_point}</td>
															</tr>
															<tr>
																<td class="table-dark text-center">받은 쪽지</td>
																<td class="text-center">${memberInfo.message_count}<span>개</span></td>
															</tr>
															<tr>
																<td class="table-dark text-center">작성게시글</td>
																<td class="text-center">${memberInfo.board_count}<span>개</span></td>
															</tr>
															<tr>
																<td class="table-dark text-center">전화번호</td>
																<td class="text-center">${memberInfo.member_phnum}</td>
															</tr>
														</tbody>
													</table>
													<div class="col-md-12 ml-3 mt-4">
														<button class="button button-3d col-md-5" type="button" onclick="window.location='userUpdateForm.do?id=${memberInfo.member_id}'">정보수정</button>
														<button class="button button-3d col-md-5" type="button"
															data-toggle="modal" data-target="#signout">회원탈퇴</button>
														<!-- Modal -->
														<div class="modal fade" id="signout" tabindex="-1"
															role="dialog" aria-labelledby="exampleModalLabel"
															aria-hidden="true">
															<div class="modal-dialog" role="document">
																<div class="modal-content">
																	<div class="modal-header">
																		<h5 class="modal-title" id="exampleModalLabel">회원탈퇴</h5>
																		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
																			<span aria-hidden="true">&times;</span>
																		</button>
																	</div>
																	<div class="modal-body text-center">탈퇴를 진행하시려면 비밀번호를 입력해주세요.<br><br>
																			<input id="withdrawalPW" type="password">
																			<div class="errorAlet t700 small mt-1" style="color:red; display:none;">비밀번호가 틀립니다.</div>
																	</div>
																	
																	<div class="modal-footer">
																		<button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
																		<button type="button" class="btn btn-primary" id="signOutBtn">탈퇴하기</button>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>

										<div class="col-md-6">
											<h4 class="mb-3 uppercase t700" style="font-size: 115%;">포인트
												사용내역</h4>
											<div class="card border">
												<div class="card-body">
													<div class="scroll-wrap" style="max-height: 321px;">
														<table class="table table-striped mt-3">
															<thead>
																<tr style="text-align: center;">
																	<th>일자</th>
																	<th>사용내용</th>
																	<th>추가</th>
																	<th>사용</th>
																	<th>잔여 포인트</th>
																</tr>
															</thead>
															<c:forEach items="${memberInfo.pointDto}" var="point">
																<tr style="text-align: center;">
																	<td class="small"><fmt:formatDate
																			value="${point.point_regdate}" pattern="yyyy-MM-dd" /><br>
																	<fmt:formatDate value="${point.point_regdate}"
																			pattern="HH:mm" /></td>
																	<td class="align-middle">${point.point_title}</td>
																	<c:choose>
																		<c:when test="${point.point_sign eq 'P'}">
																			<td class="align-middle">${point.point_price}</td>
																			<td class="align-middle">0</td>
																		</c:when>
																		<c:otherwise>
																			<td class="align-middle">0</td>
																			<td class="align-middle">${point.point_price}</td>
																		</c:otherwise>
																	</c:choose>
																	<td class="align-middle">${memberInfo.member_point}</td>
																</tr>
															</c:forEach>
														</table>
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
	<!-- withdrawal js  -->
	<script src="resources/js/user/userModified.js"></script>
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

</body>
</html>