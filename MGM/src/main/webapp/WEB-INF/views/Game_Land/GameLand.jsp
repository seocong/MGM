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

						
						
						

						<h4 class="mb-2 ls1 uppercase t700 topmargin" style="font-size: 150%;">
										<span class="text-success"><i class="icon-grin-tongue-wink"></i></span>
										게임랜드<span style="font-size: 60%;"></span>
									</h4>
									<div class="line line-xs line-sports"></div>
						
						<div id="posts" class="post-grid grid-container grid-3 clearfix " data-layout="fitRows">

						<div class="entry clearfix" >
							<div class="entry-image">
								<a href="MasterChess.do" ><img class="image_fade" src="resources/images/GameImg1.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="MasterChess.do">마스터 체스</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 마스터 체스(Master Chess)는 친구와 함께 즐길수 있는 2인용 체스 플래시 게임입니다.</p>
								<p>* 깔끔하고 세련된 디자인으로 편안히 게임에 집중할 수 있습니다.</p>
								
							</div>
						</div>
						
						<div class="entry clearfix" >
							<div class="entry-image">
								<a href="Reversi.do"><img class="image_fade" src="resources/images/GameImg2.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="Reversi.do">리버시</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 리버시는 오셀로라고 불리는 친구와 함께 즐길수 있는 게임입니다.</p>
								
							</div>
						</div>
						
						<div class="entry clearfix">
							<div class="entry-image">
								<a href="MasterCheckers.do" ><img class="image_fade" src="resources/images/GameImg3.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="MasterCheckers.do">마스터 체커스</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 마스터 체커스는 체스와 비슷한 보드게임으로,전략형 퍼즐 플래시게임입니다.</p>
								<p>* 마스터 체커스 계의 알파고를 이겨 보세요.</p>
								
							</div>
						</div>
						
						<div class="entry clearfix">
							<div class="entry-image">
								<a href="BlackJack.do" ><img class="image_fade" src="resources/images/GameImg4.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="BlackJack.do">블랙잭</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 블랙 잭은 플레이어와 딜러 간의 행운과 기술을 비교하는 카드 게임입니다.</p>
								<p>* "Twenty-One"으로 알려진 금융 게임의 변형이며 일반적으로 카지노에서 재생됩니다.</p>
								
							</div>
						</div>
						
						<div class="entry clearfix">
							<div class="entry-image">
								<a href="Tetris.do" ><img class="image_fade" src="resources/images/GameImg5.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="Tetris.do">테트리스</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 떨어지는 큐브 블록을 돌려서 큐브 스택에 맞춥니다.</p>
								<p>* 스택에 구멍을 피하십시오!공간을 확보하기 위해 완성 된 줄이 제거됩니다.</p>
							</div>
						</div>
						
						<div class="entry clearfix">
							<div class="entry-image">
								<a href="PinBall.do" ><img class="image_fade" src="resources/images/GameImg6.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="PinBall.do">핀볼</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 핀볼은 최고의 고전 아케이드 게임입니다.</p>
								<p>* 핀볼 머신(pinball machine)으로 불리는 유리로 덮힌 케이스 안에서 하나 이상의 금속 공을 이용하여 점수를 얻는 오락이다</p>
								
							</div>
						</div>
						
						<div class="entry clearfix">
							<div class="entry-image">
								<a href="CaveBalls.do" ><img class="image_fade" src="resources/images/GameImg7.png" alt="Standard Post with Image"></a>
							</div>
							<div class="entry-title">
								<h2><a href="CaveBalls.do">케이브볼</a></h2>
							</div>
							
							<div class="entry-content" style="height: 160px;">
								<p>* 공을 던져 같은 구멍으로 들어가지 않게 하는 아케이드 게임입니다.</p>
								
							</div>
						</div>


					

					</div>

					
	
						
	
						

						
						
					
						
				
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
		var tpj=jQuery;
		var revapi19;
		tpj(document).ready(function() {
			if(tpj("#rev_slider_19_1").revolution == undefined){
				revslider_showDoubleJqueryError("#rev_slider_19_1");
			}else{
				revapi19 = tpj("#rev_slider_19_1").show().revolution({
					sliderType:"carousel",
					jsFileLocation: "include/rs-plugin/js/",
					sliderLayout:"fullwidth",
					dottedOverlay:"none",
					delay:7000,
					navigation: {
						keyboardNavigation:"off",
						keyboard_direction: "horizontal",
						mouseScrollNavigation:"off",
						onHoverStop:"on",
						tabs: {
							style:"hesperiden",
							enable:true,
							width:260,
							height:80,
							min_width:260,
							wrapper_padding:25,
							wrapper_color:"#F5F5F5",
							wrapper_opacity:"1",
							tmp:'<div class="tp-tab-content">  <span class="tp-tab-date">{{param1}}</span>  <span class="tp-tab-title font-secondary">{{title}}</span> <span class="tp-tab-date tp-tab-para">{{param2}}</span></div><div class="tp-tab-image"></div>',
							visibleAmount: 9,
							hide_onmobile: false,
							hide_under:480,
							hide_onleave:false,
							hide_delay:200,
							direction:"horizontal",
							span:true,
							position:"outer-bottom",
							space:0,
							h_align:"left",
							v_align:"bottom",
							h_offset:0,
							v_offset:0
						}
					},
					carousel: {
						horizontal_align: "center",
						vertical_align: "center",
						fadeout: "on",
						vary_fade: "on",
						maxVisibleItems: 3,
						infinity: "on",
						space: 0,
						stretch: "off",
						showLayersAllTime: "off",
						easing: "Power3.easeInOut",
						speed: "800"
					},
					responsiveLevels:[1140,992,768,576],
					visibilityLevels:[1140,992,768,576],
					gridwidth:[850,700,400,300],
					gridheight:[580,600,500,400],
					lazyType:"single",
					shadow:0,
					spinner:"off",
					stopLoop:"on",
					stopAfterLoops:-1,
					stopAtSlide:-1,
					shuffle:"off",
					autoHeight:"off",
					disableProgressBar:"off",
					hideThumbsOnMobile:"off",
					hideSliderAtLimit:0,
					hideCaptionAtLimit:0,
					hideAllCaptionAtLilmit:0,
					debugMode:false,
					fallbacks: {
						simplifyAll:"off",
						nextSlideOnWindowFocus:"off",
						disableFocusListener:false,
					}
				});
			}
		});	/* Revolution Slider End */

		// Navbar on hover
		$('.nav.tab-hover a.nav-link').hover(function() {
			$(this).tab('show');
		});

		// Current Date
		var weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],
			month = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
			a = new Date();

			jQuery('.date-today').html( weekday[a.getDay()] + ', ' + month[a.getMonth()] + ' ' + a.getDate() );

		// Infinity Scroll
		jQuery(window).on( 'load', function(){

			var $container = $('.infinity-wrapper');

			$container.infiniteScroll({
				path: '.load-next-portfolio',
				button: '.load-next-portfolio',
				scrollThreshold: false,
				history: false,
				status: '.page-load-status'
			});

			$container.on( 'load.infiniteScroll', function( event, response, path ) {
				var $items = $( response ).find('.infinity-loader');
				// append items after images loaded
				$items.imagesLoaded( function() {
					$container.append( $items );
					$container.isotope( 'insert', $items );
					setTimeout( function(){
						SEMICOLON.widget.loadFlexSlider();
					}, 1000 );
				});
			});

		});

		$('#oc-news').owlCarousel({
			items: 1,
			margin: 20,
			dots: false,
			nav: true,
		    navText: ['<i class="icon-angle-left"></i>','<i class="icon-angle-right"></i>'],
			responsive:{
				0:{ items: 1,dots: true, },
				576:{ items: 1,dots: true },
				768:{ items: 2,dots:true },
				992:{ items: 2 },
				1200:{ items: 3 }
			}
		});

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