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
		th{
		background-color: #fafafa;
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
										
										경마시행개요<span style="font-size: 60%;"></span>
									</h4>
									<div class="line line-xs line-sports"></div>

									<div id="container" class="nomargin">
									 <div class="tleft">
									<h5 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-codepen"></i></span> 경마시행기간
									</h5>
									<p><span style="font-size: 80%;"><strong>총 시행기간</strong> : 2019. 1. 4.(금)∼12.29.(일)</span></p>
									</div>
									 <div class="tleft">
									<h5 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-codepen"></i></span> 경주마 운영지표
									</h5><span style="font-size: 80%;float: right;" >(단위:두)</span>							
									</div>
									<div>
										<table class=" table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
											<tr>
												<th rowspan="2" width="10%">구분</th>
												<th width="30%" colspan="3">서울</th>
												<th width="30%" colspan="3">부경</th>
												<th width="30%" colspan="3">계</th>											
											</tr>
											<tr>
												<th>국산마</th>
												<th>외산마</th>
												<th>소계</th>
												<th>국산마</th>
												<th>외산마</th>
												<th>소계</th>
												<th>국산마</th>
												<th>외산마</th>
												<th>계</th>
											</tr>
											<tr>
												<th>신마도입</th>
												<td>490</td>
												<td>160</td>
												<td>650</td>
												<td>350</td>
												<td>120</td>
												<td>470</td>
												<td>840</td>
												<td>280</td>
												<td>1,120</td>
											</tr>
										</table>
									</div>
									 <div class="tleft">
									<h5 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-codepen"></i></span> 경주마 관계자 운영지표
									</h5><span style="font-size: 80%;float: right;" >(단위:명)</span>							
									</div>
									<div>
									<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="10%">구분</th>
											<th width="30%">조교시</th>
											<th width="30%">기수</th>
											<th width="30%">관리사</th>	
										</tr>
										<tr>
											<th>서울</th>
											<td>48(외국인 3)</td>
											<td>54.6(외국인 7)</td>
											<td>485</td>
										</tr>
										<tr>
											<th>부경</th>
											<td>32(외국인 4)</td>
											<td>35.6(외국인 6)</td>
											<td>316</td>
										</tr>
										<tr>
											<th>계</th>
											<td><strong>80(외국인 7)</strong></td>
											<td><strong>90.2(외국인 13)</strong></td>
											<td><strong>801</strong></td>
										</tr>
									</table>
									</div>
									
									<div class="tleft">
									<h5 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
										<span class="text-dark"><i class="icon-codepen"></i></span> 경주마 시행규모
									</h5><p><span style="font-size: 80%;"><strong>경마장별 시행규모 총괄</strong></span></p>
									<span style="font-size: 80%;float: right;" >(단위:일,경주)</span>							
									</div>
									<div>
									<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="40%" colspan="2">구분</th>
											<th width="20%">서울</th>
											<th width="20%">부경</th>
											<th width="20%">제주</th>	
										</tr>
										<tr>
											<th colspan="2">경마일수</th>
											<td>96</td>
											<td>96</td>
											<td>95</td>
										</tr>
										<tr>
											<th colspan="2">경주수</th>
											<td>1,101</td>
											<td>803</td>
											<td>797</td>
										</tr>
										<tr>
											<th colspan="2">발매일수</th>
											<td>150</td>
											<td>150</td>
											<td>95</td>
										</tr>
										<tr>
											<th width="20%" rowspan="4">발매(중계)<p>경주수<p></th>
											<th width="20%">계</th>
											<td>2,399</td>
											<td>2,028</td>
											<td>797</td>
										</tr>
										<tr>
											<th width="20%">서울</th>
											<td>1,101</td>
											<td>1,101</td>
											<td>-</td>
										</tr>
										<tr>
											<th width="20%">부경</th>
											<td>803</td>
											<td>803</td>
											<td>-</td>
										</tr>
										<tr>
											<th width="20%">제주</th>
											<td>495</td>
											<td>124</td>
											<td>797</td>
										</tr>
									</table>
										</div>
										<div class="tleft">
										<p>ㅇ 사감위 중계경주 지침(경마장별 중계경주 60% 이내로 단계적 감축)에 의거, 부경 본장의 제주 중계경주 시행규모 축소 편성(전년대비 △66R)</p> 
										<p>* 사감위「제3차 사행산업 건전발전 종합계획」에 의거 교차수신 목표 비율 조정 가능(경마장 신설·폐쇄, 경영수지 등 여건 변화 시에 한정)<p>
  										<p>** 제주경마의 중계경주수 및 제주경마장 발매경주수는 연중 변동 가능<p>
  										<p><strong>경마장별 휴장기 운영</strong></p>
										</div>
										<div>
										<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="15%">구분</th>
											<th width="10%">서울</th>
											<th width="10%">부경</th>
											<th width="10%">제주</th>	
											<th width="55%">비고</th>	
										</tr>
										<tr>
											<td>1.4.~6.</td>
											<td>시행</td>
											<td>시행</td>
											<td class="title">휴장</td>
											<td>서울 27R,부경 18R</td>
										</tr>
										<tr>
											<td>2.8.~10.</td>
											<td class="title">휴장</td>
											<td class="title">휴장</td>
											<td class="title">휴장</td>
											<td>설 휴장</td>
										</tr>
										<tr>
											<td>7.26.~28.</td>
											<td>시행</td>
											<td>시행</td>
											<td class="title">휴장</td>
											<td>서울 27R,부경 19R</td>
										</tr>
										<tr>
											<td>8.2.~4.</td>
											<td class="title">휴장</td>
											<td>시행</td>
											<td>시행</td>
											<td>부경 23R,제주 22R</td>
										</tr>
										<tr>
											<td>8.9.~11.</td>
											<td>시행</td>
											<td class="title">휴장</td>
											<td>시행</td>
											<td>서울 26R,제주 20R</td>
										</tr>
										<tr>
											<td>9.13.~15.</td>
											<td class="title">휴장</td>
											<td class="title">휴장</td>
											<td class="title">휴장</td>
											<td>추석 휴장</td>
										</tr>
										<tr>
											<td>12.20.~22.</td>
											<td>시행</td>
											<td class="title">휴장</td>
											<td>시행</td>
											<td>서울 26R,제주 20R</td>
										</tr>
										<tr>
											<td>12.27.~29.</td>
											<td class="title">휴장</td>
											<td>시행</td>
											<td>시행</td>
											<td>부경 25R,제주 14R+보전경주</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>* 혹서기 경마장별 휴장 : 제주(7.26.~28.), 서울(8.2.~4.), 부경(8.9.~11.)</p>
											<p>** 교차 휴장기 중 서울 휴장 시(8월 1주, 12월 4주)에는 부경경마가 서울경마를 대체하여 시행요일 변경(금요일→토요일 시행)</p>
											<p><strong>경주당 편성두수 : 서울 11.0두, 부경 10.5두</strong></p><br>
											<p><strong>요일별 기본 발매경주 수</strong></p>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="10%">구분</th>
											<th width="30%">금요일</th>
											<th width="30%">토요일</th>
											<th width="30%">일요일</th>		
										</tr>
										<tr>
											<th>발매경주 수</th>
											<td>15R</td>
											<td>16R</td>
											<td>17R</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
										<p>* 교차휴장기 등 시기에 따라 소폭 변동 운영</p>
										<p><strong>월별 경주시행 규모</strong></p>
										<p class="nomargin">o 서울</p><span style="float: right;font-size: 80%;" >(단위:일,경주)</span>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="8%">구분</th>
											<th width="7%">1월</th>
											<th width="7%">2월</th>
											<th width="7%">3월</th>		
											<th width="7%">4월</th>		
											<th width="7%">5월</th>		
											<th width="7%">6월</th>		
											<th width="7%">7월</th>		
											<th width="7%">8월</th>		
											<th width="7%">9월</th>		
											<th width="7%">10월</th>		
											<th width="7%">11월</th>		
											<th width="7%">12월</th>		
											<th width="7%">계</th>		
										</tr>
										<tr>
											<th>경주 수</th>
											<td>8</td>
											<td>6</td>
											<td>10</td>
											<td>8</td>
											<td>8</td>
											<td>10</td>
											<td>8</td>
											<td>8</td>
											<td>6</td>
											<td>8</td>
											<td>10</td>
											<td>6</td>
											<td>96</td>
										</tr>
										<tr>
											<th>경주 수</th>
											<td>99</td>
											<td>71</td>
											<td>115</td>
											<td>88</td>
											<td>88</td>
											<td>105</td>
											<td>90</td>
											<td>92</td>
											<td>71</td>
											<td>92</td>
											<td>116</td>
											<td>74</td>
											<td>1.101</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>- 주당 23R을 기본으로 하되, 경주편성 자원을 고려하여 국산마교체기(4~8월)에는 주당 21R~22R, 연말·연초에는 주당 24R 시행</p>
											<p class="nomargin">o 부경</p><span style="float: right;font-size: 80%;" >(단위:일,경주)</span>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="8%">구분</th>
											<th width="7%">1월</th>
											<th width="7%">2월</th>
											<th width="7%">3월</th>		
											<th width="7%">4월</th>		
											<th width="7%">5월</th>		
											<th width="7%">6월</th>		
											<th width="7%">7월</th>		
											<th width="7%">8월</th>		
											<th width="7%">9월</th>		
											<th width="7%">10월</th>		
											<th width="7%">11월</th>		
											<th width="7%">12월</th>		
											<th width="7%">계</th>		
										</tr>
										<tr>
											<th>경주 수</th>
											<td>8</td>
											<td>6</td>
											<td>10</td>
											<td>8</td>
											<td>8</td>
											<td>10</td>
											<td>8</td>
											<td>8</td>
											<td>6</td>
											<td>8</td>
											<td>10</td>
											<td>6</td>
											<td>96</td>
										</tr>
										<tr>
											<th>경주 수</th>
											<td>69</td>
											<td>53</td>
											<td>85</td>
											<td>64</td>
											<td>60</td>
											<td>75</td>
											<td>64</td>
											<td>68</td>
											<td>53</td>
											<td>68</td>
											<td>85</td>
											<td>59</td>
											<td>803</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>- 주당 17R을 기본으로 하되, 경주편성 자원을 고려하여 국산마교체기(4~8월)에는 주당 15R~16R, 전체휴장 전·후에는 주당 18R 시행</p>
											<h5 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
											<span class="text-dark"><i class="icon-codepen"></i></span> 출발시각 운영
											</h5><p><span style="font-size: 80%;"><strong>시기별 경마 시행형태</strong></span></p>										
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="10%">구분</th>
											<th width="30%" colspan="2">서울</th>
											<th width="30%" colspan="2">부경</th>
											<th width="30%" colspan="2">제주</th>		
										</tr>
										<tr>
											<td>1~6월 /<p>9월~12월</p></td>
											<td colspan="6">주간</td>
										</tr>
										<tr>
											<td>7월1주~8월5주</td>
											<td class="title">토:야간</td>
											<td>일:주간</td>
											<td class="title">금:야간</td>
											<td>일:주간</td>
											<td class="title">금:야간</td>
											<td>토:주간</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p><strong>시행형태별 출발시간</strong></p>
											<p>o 주간경마</p>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="25%">출발시간</th>
											<th width="25%">금요일</th>
											<th width="25%">토요일</th>
											<th width="25%">일요일</th>		
										</tr>
										<tr>
											<th>첫 경주</th>
											<td>11:30</td>
											<td>10:45</td>
											<td>10:45</td>
										</tr>
										<tr>
											<th>마지막 경주</th>
											<td colspan="3">18:00</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>o 야간경마</p>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="25%">출발시간</th>
											<th width="25%">금요일</th>
											<th width="25%">토요일</th>
											<th width="25%">일요일</th>		
										</tr>
										<tr>
											<th>첫 경주</th>
											<td class="title">14:30</td>
											<td class="title">14:00</td>
											<td>10:45</td>
										</tr>
										<tr>
											<th>마지막 경주</th>
											<td class="title">21:00</td>
											<td class="title">21:00</td>
											<td>18:00</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>* 야간경마 출발시각은 경마장별 경마시행여건에 따라 소폭 변동 가능</p>
											<p><strong>하절기 경마장별 경마 시행형태</strong></p>
										</div>
										<div>
											<table class="table table-bordered" style="text-align: center; white-space: nowrap;border-top: solid #3A486E 3px;">
										<tr>
											<th width="25%" colspan="2">구분</th>
											<th width="25%">금요일</th>
											<th width="25%">토요일</th>
											<th width="25%">일요일</th>		
										</tr>
										<tr>
											<th width="12%" rowspan="4">7월</th>
											<th width="13%">1주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="13%">2주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="13%">3주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="13%">4주</th>
											<td>부경(야)</td>
											<td>서울(야)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="12%" rowspan="5">8월</th>
											<th width="13%">1주</th>
											<td>제주(야)</td>
											<td>부경(야),제주(주)</td>
											<td>부경(주)</td>
										</tr>
										<tr>
											<th width="13%">2주</th>
											<td>제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주)</td>
										</tr>
										<tr>
											<th width="13%">3주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="13%">4주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										<tr>
											<th width="13%">5주</th>
											<td>부경(야),제주(야)</td>
											<td>서울(야),제주(주)</td>
											<td>서울(주),부경(주)</td>
										</tr>
										</table>
										</div>
										<div class="tleft">
											<p>※ 경마장별 야간경마 시행일수 : 8일(서울·부경·제주 동일)</p>
											<p><strong>※ 경마 시행형태, 시행규모, 중계경주 수, 출발시각 등은 상황에 따라 연중 변동 가능</strong></p>
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
	
	
	
	
	$(function(){
		$(".title").css("background-color","#f3f3f3");
	});
		</script>
		
 	
	</body>
	</html>