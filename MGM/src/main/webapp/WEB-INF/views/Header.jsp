<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<%
	response.setContentType("text/html; charset=utf-8");
%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<header id="header" class="clearfix static-sticky">

			<div id="header-wrap">

				<div class="container clearfix">

					<div id="primary-menu-trigger"><i class="icon-reorder"></i></div>

					<!-- Logo
					============================================= -->
					<!-- <div id="logo">
						<a href="index.html" class="standard-logo" data-dark-logo="resources/images/logo-dark.png"><img src="resources/images/logo.png" alt="Canvas Logo"></a>
						<a href="index.html" class="retina-logo" data-dark-logo="resources/images/logo-dark@2x.png"><img src="resources/images/logo@2x.png" alt="Canvas Logo"></a>
					</div> --><!-- #logo end -->
					<div id="logo">
						<a href="main.do" class="standard-logo" data-dark-logo="resources/demos/business/images/logo-dark.png"><img src="resources/demos/business/images/logo.png" alt="Canvas Logo"></a>
						<a href="main.do" class="retina-logo" data-dark-logo="resources/demos/business/images/logo-dark@2x.png"><img src="resources/demos/business/images/logo@2x.png" alt="Canvas Logo"></a>
					</div>

					<!-- Primary Navigation
					============================================= -->
					<nav id="primary-menu" class="d-lg-flex d-xl-flex justify-content-xl-between justify-content-lg-between fnone with-arrows" >


						<ul class="align-self-start">
							<li><span class="menu-bg col-auto align-self-start d-flex"></span></li>
							<li class="active"><a href="#"><div  style="font-weight: bold;">NEWS</div></a></li>
							<li ><a href="freeboard.do?pagenum=1&contentnum=20&board_name=alert"><div  style=" font-weight: bold;">커뮤니티</div></a>
								 <ul>									
									<li><a href="freeboard.do?pagenum=1&contentnum=20&board_name=alert"><div  style="font-weight: bold;">공지사항</div></a></li>
									<li><a href="freeboard.do?pagenum=1&contentnum=20&board_name=free"><div  style="font-weight: bold;">자유게시판</div></a></li>
									<li><a href="freeboard.do?pagenum=1&contentnum=20&board_name=fun"><div  style="font-weight: bold;">유머게시판</div></a></li>
									<li><a href="freeboard.do?pagenum=1&contentnum=20&board_name=game"><div  style="font-weight: bold;">게임게시판</div></a></li>
									<li><a href="answerboard.do?pagenum=1&contentnum=20"><div  style="font-weight: bold;">문의게시판</div></a></li>
									
								</ul> 
							</li>
							<li><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10"><div  style="font-weight: bold;">경마정보</div></a>
								  <ul>								
									<li><a href="racingInfo.do"><div style="font-weight: bold;">출전정보</div></a>
										<ul>
											<li><a href="racingInfo.do"><div  style="font-weight: bold;">출전상세정보</div></a></li>
											<li><a href="#"><div  style="font-weight: bold;">출전내역</div></a></li>
											<li><a href="#"><div  style="font-weight: bold;">기승불가기수</div></a></li>
											<li><a href="#"><div  style="font-weight: bold;">출전등록현황</div></a></li>
										</ul>
									<li><a href="recordInfo.do?ri_meet=1&pagenum=1&contentnum=10"><div style="font-weight: bold;">경주성적표</div></a></li>
									</li>
									<li><a href="horseInfo.do?hr_meet=1"><div style="font-weight: bold;">경주마정보</div></a></li>
									<li><a href="jokyoInfo.do?tr_meet=1"><div style="font-weight: bold;">조교사정보</div></a></li>
									<li><a href="jockeyInfo.do?jk_meet=1"><div style="font-weight: bold;">기수정보</div></a></li>
									<li><a href="ownerInfo.do?ow_meet=1"><div style="font-weight: bold;">마주정보</div></a></li>
									<li><a href="racePlan.do"><div style="font-weight: bold;">시행정보</div></a></li>
								</ul> 
							</li>
							<li class="#"><a href="#"><div  style="font-weight: bold;">경마채널</div></a>
								
							</li>
							<li class="#"><a href="#"><div  style="font-weight: bold;">지난경기</div></a>
							
							</li>
							<li><a href="#"><div  style="font-weight: bold;">게임랜드</div></a>
								
							</li>
							<li class="#"><a href="#"><div  style="font-weight: bold;">마이페이지</div></a>
								<ul>							
									<li><a href="#"><div  style="font-weight: bold;">쪽지함</div></a>
										<ul>
											<li><a href="#"><div  style="font-weight: bold;">쪽지보내기</div></a></li>
											<li><a href="#"><div  style="font-weight: bold;">받은메시지</div></a></li>
											<li><a href="#"><div  style="font-weight: bold;">보낸메시지</div></a></li>
										</ul>
									</li>
									<li><a href="#"><div  style="font-weight: bold;">포인트</div></a>
										<ul>
											<li><a href="#"><div  style="font-weight: bold;">포인트사용내역</div></a></li>									
										</ul>
									</li>		
									<li><a href="#"><div  style="font-weight: bold;">정보수정</div></a></li>
									<li><a href="#"><div  style="font-weight: bold;">회원탈퇴</div></a></li>
									<li><a href="hrinsert.do"><div  style="font-weight: bold;">임시페이지</div></a></li>
									<li><a href="adminPage.do"><div  style="font-weight: bold;">관리자 임시</div></a></li>
								</ul>
							</li>
							<!-- <li class="#"><a href="#"><div>고객센터</div></a>
								<ul>
									<li><a href="#"><div>회사소개</div></a></li>
									<li><a href="#"><div>이용약관</div></a></li>
									<li><a href="#"><div>개인정보 처리방침</div></a></li>
									<li><a href="#"><div>사이트 소개</div></a></li>
									<li><a href="#"><div>Q&A</div></a></li>
								</ul>
							</li> -->
						</ul>

					<!-- 	<ul class="not-dark align-self-end">
							<li><a href="#" class="header-button"><div>Donate</div></a></li>
						</ul> -->

					</nav>
	
				</div>

			</div>

		</header>