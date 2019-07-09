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
						<a href="index.html" class="standard-logo" data-dark-logo="resources/demos/business/images/logo-dark.png"><img src="resources/demos/business/images/logo.png" alt="Canvas Logo"></a>
						<a href="index.html" class="retina-logo" data-dark-logo="resources/demos/business/images/logo-dark@2x.png"><img src="resources/demos/business/images/logo@2x.png" alt="Canvas Logo"></a>
					</div>

					<!-- Primary Navigation
					============================================= -->
					<nav id="primary-menu" class="d-lg-flex d-xl-flex justify-content-xl-between justify-content-lg-between fnone with-arrows" >


						<ul class="align-self-start">
							<li><span class="menu-bg col-auto align-self-start d-flex"></span></li>
							<li class="active"><a href="#"><div  style="font-weight: bold;">NEWS</div></a></li>
							<li ><a href="#"><div  style=" font-weight: bold;">커뮤니티</div></a>
								 <ul>									
									<li><a href="#"><div  style="font-weight: bold;">공지사항</div></a></li>
									<li><a href="freeboard.do?pagenum=1&contentnum=20&boardname=free"><div  style="font-weight: bold;">자유게시판</div></a></li>
									<li><a href="#"><div  style="font-weight: bold;">유머게시판</div></a></li>
									<li><a href="#"><div  style="font-weight: bold;">게임게시판</div></a></li>
									<li><a href="#"><div  style="font-weight: bold;">문의게시판</div></a></li>
									
								</ul> 
							</li>
							<li class="#"><a href="#"><div  style="font-weight: bold;">경마정보</div></a>
								<!--  <ul>
									<li><a href="index-corporate.html"><div>Home - Corporate</div></a>
										<ul>
											<li><a href="index-corporate.html"><div>Corporate - Layout 1</div></a></li>
											<li><a href="index-corporate-2.html"><div>Corporate - Layout 2</div></a></li>
											<li><a href="index-corporate-3.html"><div>Corporate - Layout 3</div></a></li>
											<li><a href="index-corporate-4.html"><div>Corporate - Layout 4</div></a></li>
										</ul>
									</li>
									<li><a href="index-portfolio.html"><div>Home - Portfolio</div></a>
										<ul>
											<li><a href="index-portfolio.html"><div>Portfolio - Layout 1</div></a></li>
											<li><a href="index-portfolio-2.html"><div>Portfolio - Layout 2</div></a></li>
											<li><a href="index-portfolio-3.html"><div>Portfolio - Masonry</div></a></li>
											<li><a href="index-portfolio-4.html"><div>Portfolio - AJAX</div></a></li>
										</ul>
									</li>
									<li><a href="index-blog.html"><div>Home - Blog</div></a>
										<ul>
											<li><a href="index-blog.html"><div>Blog - Layout 1</div></a></li>
											<li><a href="index-blog-2.html"><div>Blog - Layout 2</div></a></li>
											<li><a href="index-blog-3.html"><div>Blog - Layout 3</div></a></li>
										</ul>
									</li>
									<li><a href="index-shop.html"><div>Home - Shop</div></a>
										<ul>
											<li><a href="index-shop.html"><div>Shop - Layout 1</div></a></li>
											<li><a href="index-shop-2.html"><div>Shop - Layout 2</div></a></li>
										</ul>
									</li>
									<li><a href="index-magazine.html"><div>Home - Magazine</div></a>
										<ul>
											<li><a href="index-magazine.html"><div>Magazine - Layout 1</div></a></li>
											<li><a href="index-magazine-2.html"><div>Magazine - Layout 2</div></a></li>
											<li><a href="index-magazine-3.html"><div>Magazine - Layout 3</div></a></li>
										</ul>
									</li>
									<li><a href="landing.html"><div>Home - Landing Page</div></a>
										<ul>
											<li><a href="landing.html"><div>Landing Page - Layout 1</div></a></li>
											<li><a href="landing-2.html"><div>Landing Page - Layout 2</div></a></li>
											<li><a href="landing-3.html"><div>Landing Page - Layout 3</div></a></li>
											<li><a href="landing-4.html"><div>Landing Page - Layout 4</div></a></li>
											<li><a href="landing-5.html"><div>Landing Page - Layout 5</div></a></li>
										</ul>
									</li>
									<li><a href="index-fullscreen-image.html"><div>Home - Full Screen</div></a>
										<ul>
											<li><a href="index-fullscreen-image.html"><div>Full Screen - Image</div></a></li>
											<li><a href="index-fullscreen-slider.html"><div>Full Screen - Slider</div></a></li>
											<li><a href="index-fullscreen-video.html"><div>Full Screen - Video</div></a></li>
										</ul>
									</li>
									<li><a href="index-onepage.html"><div>Home - One Page</div></a>
										<ul>
											<li><a href="index-onepage.html"><div>One Page - Default</div></a></li>
											<li><a href="index-onepage-2.html"><div>One Page - Submenu</div></a></li>
											<li><a href="index-onepage-3.html"><div>One Page - Dots Style</div></a></li>
										</ul>
									</li>
									<li><a href="index-wedding.html"><div>Home - Wedding</div></a></li>
									<li><a href="index-restaurant.html"><div>Home - Restaurant</div></a></li>
									<li><a href="index-events.html"><div>Home - Events</div></a></li>
									<li><a href="index-parallax.html"><div>Home - Parallax</div></a></li>
									<li><a href="index-app-showcase.html"><div>Home - App Showcase</div></a></li>
									<li><a href="index-boxed.html"><div>Home - Boxed Layout</div></a></li>
								</ul> -->
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