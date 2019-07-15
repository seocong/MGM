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
			width:940px;
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
	<!--  <script>
		$(document).ready(function(){
		
			$("#btnReply").click(function(){
				var comment_reply = $("#comment_reply").val();
				var comment_group = "${Dto.board_group}"
				var comment_name = "${Dto.board_name}"
				var param="comment_contents="+comment_contents+"&comment_group="+comment_group+"&comment_name="+comment_name;
				$.ajax({
					type:"post",
					url:"commentInsert.do",
					data:param,
					success: function(){
						alert("댓글이 등록되었습니다.");
						
					}
				)};
			});
			//게시글 추천시 이벤트 
			$("#btnPush").click(function(){
				location.href="pushup.do"
			});
			//게시글 삭제 이벤트
			$("#btnDelete").click(function(){
				if(comfirm("삭제하시겠습니까?")){
					location.href = "delete.do";				
				}
			});
			//게시글 수정시 이벤트
			 $("#btnUpdate").click(function(){
				 if(comfirm("삭제하시겠습니까?")){
						location.href = "replyUpdate.do";				
					}
			}); 
		});
		

	</script> -->
	
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
						
							<div class="row clearfix"> 
							<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-chalkboard"></i></span> 상세보기</h4>
									<div class="line line-xs line-sports"></div>
									
									<div class="allmargin-sm">
						 <%--  <table class="table">
							
							<tbody>
							  <tr>
							  	<td style="width: 100%;  padding: 0px;">
							  		<table style="width: 100%;" >
							  		<tr>
							  			<td style="width: 10%;">제목</td>
										<td style="width: 60%; float: left;">${Dto.board_title}</td>
										<td style="width: 30%;">${Dto.board_regdate}</td>	
							  			</tr>
							  		</table>
							  	</td>														
							  </tr>
							  <tr >
							  <td style="width: 100%;  padding: 0px;">
							  	<table style="width: 100%;">
							  	<tr>
								<td style="width: 10%;">작성자</td>
								<td style="width: 30%; float: left;">${Dto.board_writer}</td>
								<td style="width: 20%; float: right;">조회수</td>
								<td style="width: 5%;">${Dto.board_readcount}</td>
								<td style="width: 30%; float: right;">추천수</td>
								<td style="width: 5%;">${Dto.board_pushnum}</td>
							  	</tr>
							  	</table>
								
							  </td>
							  </tr>
							 <tr>
			
								<td>${Dto.board_contents}</td>

								</tr>
							</tbody>
						  </table> --%>
						  
							<div id="board_name" data-boardname = "${Dto.board_name}" ></div>
							<div id="board_seq" data-boardseq = "${Dto.board_seq}" ></div>
							
							  <div class="row clearfix nobottomborder" style="padding: 20px; border: solid 2px #DDD;" >
							 
							  		
							  			<div class="col-md-2 t700 center" style="border-right : solid 2px #DDD;" >제목</div>
										<div class="col-md-7">${Dto.board_title}</div>
										<div class="col-md-3" style="border-left : solid 2px #DDD;" ><fmt:formatDate value="${Dto.board_regdate}" pattern="yyyy년MM월dd일HH시mm분"/></div>	
							  			
							  													
							  </div>
							  <div class="row clearfix" style="padding: 20px; border: solid 2px #DDD;">
							 							  
								<div class="col-md-2 t700 center" style="border-right : solid 2px #DDD;">작성자</div>
								<div class="col-md-6">${Dto.board_writer}</div>
								<div class="col-md-1 t700" style="border-right : solid 2px #DDD;">조회수</div>
								<div class="col-md-1">${Dto.board_readcount}</div>
								<div class="col-md-1 t700" style="border-right : solid 2px #DDD;">추천수</div>
								<div class="col-md-1">${Dto.board_pushnum}</div>
							  	
							  	
							  </div>
							 <div class="row clearfix topmargin-sm" >
			
								<div class="col-md-12">${Dto.board_contents}</div>

								</div>
								<c:choose>
							  <c:when test="${uid.member_id == Dto.board_writer}">
									<div class="row clearfix" style="float: right;"> 
									<a href="#" class="button button-3d button-rounded button-red" id="btnUpdate"><i class="icon-thumbs-up1"></i>수정하기</a>
									<a href="#" class="button button-3d button-rounded button-red" id="btnDelete"><i class="icon-thumbs-up1"></i>삭제하기</a>
									</div>
								</c:when>
								<c:otherwise>  
								<div class="row clearfix" style="float: right;"> 
									<a href="#" class="button button-3d button-rounded button-red" id="btnPush" onclick="replypushnum('${Dto.board_seq}')"><i class="icon-thumbs-up1" ></i>추천하기</a>
								</div>
								</c:otherwise>
								</c:choose>
								</div>
							
							</div>
							</div>
							 <div class="line allmargin-sm"></div> 
							<div class="row clearfix"> 
							<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-comments"></i></span>댓글</h4>
									<div class="line line-xs line-sports"></div>
									<table class="col-md-12">
										<c:forEach var="row" items="${replylist}" >
											<tr>
											<c:choose>
											<c:when test="${row.comment_delflag == 'Y' }">
												<td>삭제된 글입니다.</td>
											</c:when>
											<c:otherwise>
												<td>
													${row.comment_writer}(<fmt:formatDate value="${row.comment_regdate}" pattern="yyyy-MM-dd HH:mm:ss"/>)추천수:${row.comment_pushnum}
													<br>
													<jsp:setProperty property="arrowNbsp" name="util" value="${row.comment_depth}"/>
					       	 						<jsp:getProperty property="arrowNbsp" name="util"/>${row.comment_contents}
					       	 						<c:choose>
					       	 						<c:when test="${uid.member_id == Dto.board_writer}">
					       	 							<input type="button" style="float: right;" value="삭제" onclick="delcomment('${row.comment_seq}')"/>														
													</c:when>
													<c:otherwise>
														<input type="button" style="float: right;" value="추천" onclick="replyAnspushnum('${row.comment_seq}')"/>
													</c:otherwise>
													</c:choose>
													
													
 													<input type="button" style="float: right; margin-right:5px;" value="답글" onclick="javascript:ansreplyForm();"/>
													<div class="line allmargin-sm divcenter" ></div>
													<div id="replyArea" style="display: none;">
														<form action="ansreply.do" method="post">
														<input type="hidden" name="comment_seq" value="${row.comment_seq}">
														<input type="hidden" name="comment_group" value="${row.comment_group}">
														<input type="hidden" name="comment_name" value="${row.comment_name}">
														<input type="hidden"  name="board_seq" value="${Dto.board_seq}"> 
														<input type="hidden" name= "pagenum" value="${page.pagenum+1}">
														<textarea rows="2" cols="120" name="comment_contents"></textarea>
														<button type="submit" style="float: right;"  >등록</button>																											
														</form>
														<div class="line allmargin-sm divcenter" ></div>
													</div>
												</td>
												</c:otherwise>
												</c:choose>
											</tr>
										</c:forEach>
									</table>
						 	<form action="commentInsert.do" method="post">
							<input type="hidden" name="comment_group" value="${Dto.board_group}">
							<input type="hidden" name="comment_name" value="${Dto.board_name}">
							<input type="hidden"  name="board_seq" value="${Dto.board_seq}"> 
							<input type="hidden" name= "pagenum" value="${page.pagenum+1}">
							<div class="allmargin-sm">
								<textarea name ="comment_contents" id="comment_contents" rows="4" cols="130" placeholder="댓글을 작성해주세요"></textarea>
							</div>
							<button class="button button-3d nomargin" type="submit" style="float: right;" >댓글등록</button>
						 	</form> 
							</div>
							</div>
							<div class="row clearfix"> 
						
						
					
						
								<!-- board name을 div에 불러옴 , script에서 받음 -->
								<div id="board_name" data-board_name = "${board_name}" ></div>
								<div class="col-md-12 mt-5">
								<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;"><span class="text-dark"><i class="icon-user-friends"></i></span> 커뮤니티</h4>
									<div class="line line-xs line-sports"></div>									

						<div id="container" >
							
							
							<ul class="tab">
								<li id="tabalert"><a href="freeboard.do?pagenum=1&contentnum=20&board_name=alert" > 공지게시판</a></li>
								<li id="tabfree"><a href="freeboard.do?pagenum=1&contentnum=20&board_name=free" > 자유게시판</a></li>
								<li id="tabfun"><a href="freeboard.do?pagenum=1&contentnum=20&board_name=fun" > 유머게시판</a></li>
								<li id="tabgame"><a href="freeboard.do?pagenum=1&contentnum=20&board_name=game" > 게임게시판</a></li>
							</ul>

							<div >
								<div class="tabcontent" id="tab4">
									<div >
							<table class="table table-striped">
							<col width="50px"><col width="300px"><col width="100px"><col width="150px"><col width="60px"><col width="50px">
								<thead>
								  <tr style="text-align: center;">
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
									<th>조회수</th>
									<th>추천</th>
								  </tr>
								</thead>
								
								<tbody>
								  <c:choose>
									<c:when test="${empty list}"><!-- empty  null인지 확인 -->
										<tr><td colspan = "10">---작성된 글이 없습니다.---</td></tr>
											</c:when>
											<c:otherwise>
												<c:forEach items="${list}" var="boardDto">
										<tr>
					
												<td  style="text-align: center;">${boardDto.board_group}</td>
									<c:choose>
						<c:when test="${boardDto.board_delflag=='Y'}">
							<td>---삭제된 글입니다.---</td>
						</c:when>
						<c:otherwise>    
					        <td  style="text-align: center;">
					        <a href="detail.do?board_seq=${boardDto.board_seq}&contentnum=20&board_name=${boardDto.board_name}&pagenum=${page.pagenum+1}">${boardDto.board_title}
					        <c:if test="${boardDto.board_replyCnt > 0}"><span class="text-warning">[${boardDto.board_replyCnt}]</span></c:if></a>
					        </td>				            									
						</c:otherwise>
					</c:choose>
					<td  style="text-align: center;">${boardDto.board_writer}</td>				
					<td  style="text-align: center;"> <fmt:formatDate value="${boardDto.board_regdate}" pattern="yyyy년MM월dd일"/> </td>
					<td  style="text-align: center;">${boardDto.board_readcount}</td>	
					<td  style="text-align: center;">${boardDto.board_pushnum}</td>				
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>	
			   
								</tbody>
							<tr>
   <td colspan="5">
   		<ul class="pagination pagination-rounded pagination-inside-transparent pagination-button">
   	<c:if test="${page.prev}">
   		<li class="page-item"><a class="page-link" href="javascript:page2(${page.getStartPage()-1});"aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
   	</c:if>
   	<c:forEach begin="${page.getStartPage()}" end="${page.getEndPage()}" var="idx">
   		<li class="page-item"><a class="page-link" href="javascript:page2(${idx});">${idx}</a></li>
   	</c:forEach>
   <c:if test="${page.next }">
   		 <li class="page-item"><a class="page-link" href="javascript:page2(${page.getEndPage()+1});" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
   	</c:if>
 		</ul>
        </td>
        <td>
				<div class="row form-group" style="text-align: center;">
                <div class="col-md-12">
                 <input type="button" value="글쓰기" onclick="location.href='insertform.do?board_name=${board_name}'">
                </div>
              </div>
	
        
        </td>
	</tr>
	</table>
						</div>	
									
								</div>
								

							</div>

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
	<!-- <script>
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

		</script> -->
		
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
 	<script type="text/javascript">
	function ansreplyForm(){
		if(document.getElementById("replyArea").style.display=='block'){
			document.getElementById("replyArea").style.display='none';
		}else{
			document.getElementById("replyArea").style.display='block'
		}
	};	
	function replypushnum(board_seq){
		alert("board_seq = ["+board_seq +"]");
		var board_seq = board_seq;
		$.ajax({
			type:"post",
			async:false,
			url:"push.do",
			dataType:"text",
			data:{board_seq:board_seq},
			success:function(data,textStatus){
				if(data=='useble'){
					alert('추천되었습니다.')
				}else{
					alert('추천되지 않았습니다.');
				}
			},
			error:function(data,textStatus){
				alert("에러발생");
			},
		});
	}
	
	function replyAnspushnum(comment_seq){
		alert("comment_seq = ["+comment_seq +"]");
		var comment_seq = comment_seq;
		$.ajax({
			type:"post",
			async:false,
			url:"AnsPush.do",
			dataType:"text",
			data:{comment_seq:comment_seq},
			success:function(data,textStatus){
				if(data=='useble'){
					alert('추천되었습니다.')
				}else{
					alert('추천되지 않았습니다.');
				}
			},
			error:function(data,textStatus){
				alert("에러발생");
			},
		});
	}
	
	$("#btnDelete").click(function(){
		alert("삭제안되냐")
		var board_name = $("#board_name").attr("data-boardname");
		var board_seq = $("#board_seq").attr("data-boardseq");
		var pagenum = ${page.pagenum}+1;
		
		
		alert(board_name)
		if(confirm("삭제하시겠습니까?")){
			location.href = "delete.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq;				
		}
	});
	function delcomment(comment_seq){
		alert("삭제되냐")
		var comment_seq = comment_seq;
		var board_name = $("#board_name").attr("data-boardname");
		var board_seq = $("#board_seq").attr("data-boardseq");
		var pagenum = ${page.pagenum}+1;
		if(confirm("삭제하시겠습니까?")){
			location.href = "ansdel.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&comment_seq="+comment_seq+"&board_seq="+board_seq;
	}
	}
	$("#btnUpdate").click(function(){
		alert("수정합시다")
		var board_seq = $("#board_seq").attr("data-boardseq");

		if(confirm("수정하시겠습니까?")){
			location.href = "update.do?board_seq="+board_seq;				
		}
	});
	</script> 
	</body>
	</html>