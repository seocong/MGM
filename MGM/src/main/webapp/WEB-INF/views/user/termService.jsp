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
<link
	href="http://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700%7CRoboto:400,500,700"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="resources/css/bootstrap.css"
	type="text/css" />
<link rel="stylesheet" href="resources/style.css" type="text/css" />
<link rel="stylesheet" href="resources/css/mypage.css" type="text/css" />
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
										이용약관동의
									</h4>
									<div class="line line-xs line-sports mb-5"></div>
									<div class="clearfix">
									<div class="col-md-12"style="align-content: center;">
										<div class="col-md-9 mb-4">
											<h4 class="mb-3 uppercase t700"><span class="icon-files t700" style="font-size:20px;color:#444444; font-size: 16px;">&nbsp;이용약관</span></h4>
											<div class="card border">
												<div class="card-body">
													<div class="scroll-wrap" style="height: 230px; border:1px solid #dee2e6;">
														<p><h5>※ 묻지마 이용약관</h5></p>
<p>
제1장 총칙<br>

제1조 (목적)<br>

이 약관은 ㈜감앤소프트(영문명 gam&soft, 이하 "회사"라 합니다)가 유, 무선인터넷 서비스(이하 "서비스"라 합니다)를 제공함에 있어 회사와 회원간의 권리, 의무, 이용조건 및 절차, 기타 필요한 사항을 규정함을 목적으로 합니다.<br>

제2조 (약관의 효력 및 변경)<br>

① 이 약관은 서비스를 통하여 이를 공지하거나 전자우편, 기타의 방법으로 회원에게 통지함으로써 효력이 발생됩니다. ② 회사는 사정상 중요한 사유가 발생될 경우 이 약관의 내용을 변경할 수 있으며, 변경된 약관은 제1항과 같은 방법으로 공지 또는 통지함으로써 효력이 발생됩니다. ③ 회원은 신설 또는 변경된 약관에 동의하지 않을 경우 회원탈퇴를 요청할 수 있으며, 신설 또는 변경된 약관의 효력발생일 이후에도 서비스를 계속 사용할 경우 약관의 변경사항에 동의한 것으로 간주됩니다.<br>

제3조 (약관외 준칙)<br>

이 약관에 명시되지 아니한 사항에 대해서는 전기통신기본법, 전기통신사업법, 정보통신망 이용촉진등에 관한 법률 및 기타 관련 법령의 규정에 따릅니다.<br>

제4조 (회원에 대한 통지)<br>

① 회사가 회원에 대해 통지를 하는 경우, 회원이 회사에 제출한 전자우편 주소, 전화, 서면 등의 방법으로 할 수 있습니다. ② 회사는 불특정다수 회원에 대한 통지의 경우 서비스 게시판에 공지함으로써 개별 통지에 갈음할 수 있습니다.<br>

제5조 (용어의 정의)<br>

이 약관에서 사용하는 용어의 정의는 다음과 같습니다.<br>

①. 회원 : 회사와 서비스 이용에 관한 계약을 체결한 자 ②. 아이디(ID) : 회원 식별과 회원의 서비스 이용을 위하여 회원이 선정하고 회사가 승인 하는 문자와 숫자의 조합 ③. 비밀번호 : 회원이 통신상의 자신의 비밀을 보호하기 위해 선정한 문자와 숫자의 조합 ④. 전자우편(E-Mail) : 인터넷을 통한 우편 ⑤. 모바일 : 휴대폰을 통한 정보서비스와 문자서비스, URL SMS을 통한 서비스 ⑥. 해지 : 회사 또는 회원이 서비스 이용 이후 그 이용계약을 종료시키는 의사표시<br>
</p>
<br>
<p>
제2장 회원가입계약<br>

제6조 (회원가입계약의 성립)<br>

① 회원가입계약은 신청자의 가입신청에 대하여 회사가 승낙을 함으로써 성립합니다. ② 회원가입신청에 대한 회사의 승낙시점은 회원가입이 되었다는 내용의 웹브라우저가 열린 때, 또는 시스템상으로 로그인이 가능해진 시점으로 보며, 무선인터넷 접속도 로그인 시점으로 봅니다.<br>

제7조(회원가입 신청)<br>

① 회원가입 신청자는 서비스를 통하여 본 약관에 동의한다는 의사표시와 함께 회사가 요청하는 소정의 가입양식에 회원정보를 기재하여 신청합니다. ② 회원가입 신청양식에 기재하는 모든 회원정보는 실제 데이터인 것으로 간주하며 실명이나 실제 정보를 입력하지 않은 사용자는 법적인 보호를 받을 수 없으며, 서비스사용의 제한을 받으실 수 있습니다.<br>

제8조 (회원가입신청의 승낙)<br>

① 회사는 제7조에 따른 가입신청에 대하여 특별한 사정이 없는 한 접수순서에 따라서 가입신청을 승낙합니다. ② 회사는 다음 각호의 1에 해당하는 경우 신청에 대한 승낙을 제한할 수 있고, 그 사유가 해소될 때까지 승낙을 유보할 수 있습니다.<br>

1. 서비스 관련 설비의 용량이 부족한 경우 2. 기술상 장애사유가 있는 경우 3. 기타 회사가 필요하다고 인정되는 경우<br>

제9조(회원탈퇴)<br>

①	 회원은 회원가입계약을 해지하고자 하는 경우에는 묻지마 운영자 E-Mail ( wnsdldi@hanmail.net )로 탈퇴 요청을 하여야 하며 회원의 탈퇴 요청에 대해 회사는 빠른 시간내로 탈퇴처리를 할 의무가 있습니다 ② 회원이 사망한 때는 회원자격을 상실합니다. ③ 회사는 회원이 제19조 회원의 의무에 위배되는 행위를 한 경우 사전통지 없이 회원가입계약을 해지하거나 회원자격을 적절한 방법으로 제한 및 정지할 수 있습니다.<br>

제10조(회원자격 해지, 제한, 정지의 절차)<br>

① 회사는 제9조 제3항의 규정에 의하여 회원자격을 해지, 제한 또는 정지하고자 하는 경우에는 그 사유, 일시 및 기간을 정하여 전자우편, 서면 또는 전화 등의 방법에 의하여 해당 회원 또는 대리인에게 통지합니다. 다만, 회사가 긴급하게 회원의 서비스 이용을 정지할 필요가 있다고 인정하는 경우에는 그러하지 아니합니다. ② 제1항에 의하여 이용제한의 통지를 받은 회원 또는 그 대리인이 이용제한 통지에 대하여 이의가 있는 경우에는 이의신청을 할 수 있습니다. ③ 회사는 제2항의 규정에 의한 이의신청에 대하여 그 확인을 위한 기간까지 이용제한을 일시 연기할 수 있으며, 그 결과를 이용자 또는 그 대리인에게 통지합니다. ④ 회사는 이용제한기간 중에 그 사유가 해소된 것이 확인된 경우에는 이용제한 조치를 즉시 해제합니다.<br>
</p>
<br>
<p>
제3장 서비스제공 및 이용<br>

제11조(서비스의 내용 및 변경)<br>

①	 회사는 다음과 같은 서비스를 제공합니다. 1. 경마장 별 경마 정보 제공 서비스 2. 경마의 이해 3. 채팅, 게시판, 동호회 서비스 4. 선물 제공 이벤트 서비스② 회사는 필요한 경우 언제든지 서비스의 내용을 추가 또는 변경할 수 있습니다.<br>

제12조(서비스의 요금)<br>

① 별도로 표시된 유료서비스를 제외한 모든 서비스는 회원들에게 무료로 제공됩니다 ② 유료 서비스의 이용요금과 결재방식은 해당 서비스에 명시되어 있는 별도의 규정에 따릅니다. ③ 정액제서비스의 경우 기간별로 정해진 가격으로 과금을 하며 정해진 기간내의 명시된 서비스에 대해 원활한 서비스를 해야합니다.<br>

제13조 (서비스의 개시)<br>

서비스는 회사가 제6조에 따라서 이용신청을 승낙한 때로부터 즉시 개시됩니다. 다만 제16조에 해당하는 경우 서비스의 개시시점이 연기될 수 있습니다.<br>

제14조 (서비스 이용시간)<br>

① 서비스는 회사의 업무상 또는 기술상 장애, 기타 특별한 사유가 없는 한 연중무휴, 1일 24시간 이용할 수 있습니다. 다만 설비의 점검 등 회사가 필요한 경우 또는 설비의 장애, 서비스 이용의 폭주 등 불가항력 사항으로 인하여 서비스 이용에 지장이 있는 경우 예외적으로 서비스 이용의 전부 또는 일부에 대하여 제한할 수 있습니다. ② 회사는 제공하는 서비스중 일부에 대한 서비스 이용시간을 별도로 정할 수 있으며, 이 경우 그 이용시간을 사전에 회원에게 공지 또는 통지합니다.<br>

제15조 (정보의 제공 및 광고의 게재)<br>

① 회사는 서비스를 운용함에 있어서 각종 정보를 서비스에 게재하는 방법 등으로 회원에게 제공할 수 있습니다. ② 회사는 서비스의 운용과 관련하여 서비스화면, 홈페이지, 전자우편 등에 광고 등을 게재할 수 있습니다.<br>

제16조 (서비스 제공의 중지)<br>

회사는 다음 각호의 1에 해당하는 경우 서비스의 제공을 중지할 수 있습니다.<br>

1. 설비의 보수 등을 위하여 부득이한 경우 2. 전기통신사업법에 규정된 기간통신사업자가 전기통신서비스를 중지하는 경우 3. 기타 회사가 불가피하게 서비스를 제공할 수 없는 사유가 발생한 경우.<br>
</p>
<br>
<p>
제4장 서비스와 관련한 권리와 의무관계<br>

제17조 (회사의 의무)<br>

① 회사는 제14조 및 제16조에서 정한 경우를 제외하고는 계속적, 안정적으로 서비스를 제공할 수 있도록 최선의 노력을 다하여야 합니다. ② 회사는 서비스에 관련된 설비를 항상 운용할 수 있는 상태로 유지,보수하고, 장애가 발생하는 경우 지체없이 이를 수리복구할 수 있도록 최선의 노력을 다하여야 합니다. ③ 회사는 서비스와 관련한 회원의 불만사항이 접수되는 경우 이를 조속히 처리하도록 최선의 노력을 다하여야 합니다.<br>

제18조 (개인정보의 보호)<br>

① 회사는 서비스와 관련하여 기득한 회원의 개인정보를 본인의 사전 승낙없이 타인에게 누설, 공개 또는 배포할 수 없습니다. 다만, 다음 각 호의 1에 해당하는 경우에는 그러하지 아니합니다. 1. 관계법령에 의하여 수사상의 목적으로 관계기관으로부터 요구받은 경우 2. 정보통신윤리위원회의 요청이 있는 경우 3. 기타 관계법령에 의한 경우 4. 특정 개인을 식별할 수 없는 통계작성, 홍보자료, 학술연구 등의 목적일 때 ② 제1항의 범위 내에서, 회사는 광고업무와 관련하여 회원 전체 또는 일부의 개인정보에 관한 통계자료를 작성하여 이를 사용할 수 있고, 서비스를 통하여 회원의 컴퓨터에 쿠키를 전송할 수 있습니다. 이 경우 회원은 쿠키의 수신을 거부하거나 쿠키의 수신에 대하여 경고하도록 사용하는 컴퓨터의 브라우저의 설정을 변경할 수 있습니다.<br>

제19조(회원의 의무)<br>

① 회원은 관계법령, 이 약관의 규정, 이용안내 및 주의사항 등 회사가 통지하는 사항을 준수하여야 하며, 기타 회사의 업무에 방해되는 행위를 하여서는 안됩니다. ② 회원은 회사의 사전 승낙없이 서비스를 이용하여 어떠한 영리행위도 할 수 없습니다. ③ 회원은 서비스를 이용하여 얻은 정보를 회사의 사전 승낙없이 복사, 복제, 변경, 번역, 출판, 방송 기타의 방법으로 사용하거나 이를 타인에게 제공할 수 없습니다. ④ 회원은 회원가입신청서의 기재내용 중 변경된 내용이 있는 경우 서비스를 통하여 그 내용을 회사에 통지하여야 합니다. ⑤ 회원은 서비스 이용과 관련하여 다음 각 호의 행위를 하여서는 아니됩니다. 1. 다른 회원의 아이디(ID)를 부정사용하는 행위 2. 범죄행위를 목적으로 하거나 기타 범죄행위와 관련된 행위 3. 미풍양속, 기타 사회질서를 해하는 행위 4. 타인의 명예를 훼손하거나 모욕하는 행위 5. 타인의 지적재산권 등의 권리를 침해하는 행위 6. 해킹행위 또는 컴퓨터바이러스의 유포행위 7. 타인의 의사에 반하여 광고성 정보 등 일정한 내용을 전송하는 행위 8. 서비스의 안전적인 운영에 지장을 주거나 줄 우려가 있는 일체의 행위 9. 기타 관계법령에 위배되는 행위 10. 기타 회사가 부적절하다고 판단하는 행위<br>

제20조(회원의 ID 및 비밀번호에 대한 의무)<br>

① 회원은 서비스를 이용하는 경우 ID 및 비밀번호를 사용해야 합니다. ② ID 및 비밀번호에 대한 모든 관리의 책임은 회원에게 있습니다. ③ 회원은 ID 및 비밀번호를 제3자에게 이용하게 해서는 안됩니다. ④ ID 및 비밀번호의 관리상 불충분, 사용상의 과실, 제3자의 사용 등에 의한 손해의 책임은 회원이 집니다. ⑤ 회원은 ID 및 비밀번호를 도난당하거나 제3자에게 되고 있음을 인지한 경우에는 바로 회사에 통보하고 회사의 지시가 있는 경우에는 그에 따라야 합니다.<br>

제21조(게시물 또는 내용물의 삭제)<br>

회사는 서비스의 게시물 또는 내용물이 다음 각호의 1에 해당한다고 판단되는 경우 회원에게 사전통지나 동의 없이 이를 삭제할 수 있습니다.<br>

1. 제19조 회원의 의무에 위배되는 행위를 한 경우 2. 회사소정의 게시기간을 초과하는 경우 3. 게시판의 성격에 부합되지 않는 게시물의 경우 4. 회원이 게시한 게시물(답글,댓글 포함)이 다음 사항에 해당된다고 판단 되는 경우에 사전 통지 없이 삭제 할 수 있습니다. - 모든 광고물-상호 협의되지 않은-홈페이지, ARS번호, 문자정보, 카페, 개인사이트 E-mail주소 등 - 음란.욕설 및 공공질서 및 미풍양속에 위반되는 내용인 경우 - 타인을 비방하거나 중상모략으로 개인 및 단체의 명예를 손상시키는 내용인 경우 - 공공질서 및 미풍양속에 위반되는 내용인 경우 - 범죄적 행위에 부합된다고 인정되는 내용인 경우 - 타인의 저작권 등 기타의 권리를 침해하는 내용인 경우 - 전문가 유,무료 홍보, 비방 관련 내용인 경우 - 주민번호나 ,전화번호, 계좌번호 등 개인정보가 포함된 글 - 욕설, 협박, 음란물, 지역감정 조장등 게시판의 개설 취지에 부합하지 않는 경우 - 모든 광고물(홈페이지, ARS, 문자정보, 카페, 개인사이트 등) - 무단전재, 임의링크, 재배포 등이 포함된 글 - 기타 연습, 오류성, 장난성의 내용인 경우 등<br>
</p>
<br>
<p>
제5장 기타<br>

제22조(저작권의 귀속)<br>

① 회사가 작성한 서비스에 관한 저작권 및 기타 지적재산권은 회사에 귀속됩니다. ② 회원이 작성한 게시물에 대한 모든 권리 및 책임은 이를 게시한 회원에게 있습니다. 다만, 회원이 회사에 제공한 공개적인 게시물은 회사가 동 게시물을 전부 또는 일부를 사용, 복제, 수정, 개조, 출판, 번역, 창작물을 제작하거나 배포, 실행 또는 전시할 수 있는 권리 및 사용권을 회원이 회사에 부여한 것으로 봅니다.<br>

제23조 (양도금지)<br>

회원은 서비스의 이용권한, 결제내용 등, 기타 이용계약상 지위를 타인에게 양도, 증여할 수 없으며, 이를 담보로 제공할 수 없습니다.<br>

제24조 (손해배상)<br>

회사가 제공하는 서비스와 관련하여 회원에게 어떠한 손해가 발생하더라도 동 손해가 회사의 중대한 과실에 의한 경우를 제외하고는 회사는 이에 대하여 책임을 부담하지 아니합니다.<br>

제25조 (면책)<br>

ⓛ 회사는 회원의 귀책사유로 인한 서비스이용의 장애에 대하여 책임을 지지 않습니다. ② 회원은 아이디(ID)와 비밀번호의 관리와 관련하여 당해 회원의 귀책사유에 의한 손해 또는 제3자에 의한 부정사용 등에 대한 책임은 모두 회원에게 있습니다. ③ 회사는 회원이 서비스에 게재한 정보, 자료, 사실의 정확성, 신뢰성 등 그 내용에 관하여는 어떠한 책임도 부담하지 아니합니다. ④ 회사가 제공하는 정보와 자료는 거래의 목적으로 이용될 수 없습니다. 따라서 본 서비스의 정보와 자료 등에 근거한 거래는 전적으로 회원자신의 책임과 판단아래 수행되는 것이며 회사는 이에 대하여 책임을 부담하지 않습니다. ⑤ 회원이 제19조, 기타 이 약관의 규정을 위반함으로 인하여 회사가 회원 또는 제3자에 대하여 책임을 부담하게 되고, 이로써 회사에게 손해가 발생되는 경우 이 약관을 위반한 당해 회원은 회사에게 발생하는 모든 손해를 배상하여야 하며, 동 손해로부터 회사를 면책시켜야 합니다.<br>

제26조(분쟁의 해결)<br>

① 회사와 회원은 서비스와 관련하여 발생한 분쟁을 원만하게 해결하기 위하여 필요한 모든 노력을 하여야 합니다 ② 제1항의 규정에도 불구하고, 동 분쟁으로 인하여 소송이 제기될 경우 동 소송은 회사의 본사소재지를 관할하는 법원의 관할로 합니다.<br>

부칙<br>

제1조 (시행일) 이 약관은 2019년 10월 10일부터 시행합니다 제2조 (경과조치) 이 약관 시행전에 가입한 회원은 시행일부터 이 약관의 적용을 받습니다.<br>
</p>																		
														
													</div>
													<!-- 이용약관 스크롤 끝 -->
													<div class="mt-2"><input class="chkAgree" type="checkbox" value="Y"><span style="font-weight: bold;">&nbsp;묻지마 이용약관에 동의</span><span style="color:red;">&nbsp;(필수)</span></div>
												</div>
											</div>
										</div>
										<div class="col-md-9 mb-4">
											<h4 class="mb-3 uppercase t700"><span class="icon-files t700" style="font-size:20px;color:#444444; font-size: 16px;">&nbsp;개인정보수집 이용 및 처리방침 안내</span></h4>
											<div class="card border">
												<div class="card-body">
													<div class="scroll-wrap" style="height: 230px; border:1px solid #dee2e6;">
														<p><h5>※ 개인정보수집 이용 및 처리방침 안내</h4></p>
<p>	
* 수집하는 개인정보의 항목 및 수집방법<br>													
1. 수집하는 개인정보의 항목<br>
① 회사는 회원가입, 원활한 고객상담 및 각종 서비스의 제공을 위해 최초 회원가입 당시 아래와 같은 최소한의 정보를 수집합니다.<br> 
- 필수항목 : 이름, 아이디, 비밀번호, 생년월일, 전화번호, 주소<br>

② 서비스 이용과정이나 사업처리 과정에서 아래와 같은 개인정보 항목이 자동으로 생성되어 수집될 수 있습니다.<br>
- IP주소, 쿠키, 방문기록, 서비스 이용 기록, 불량 이용기록 등<br>

③ 회사의 이벤트 응모 및 경품 신청 과정에서 해당 서비스의 이용자에 한해서만 추가 개인정보 추가 수집이 발생할 수 있습니다. 추가 수집이 발생할 시 이용자에게 개인정보의 수집 및 이용목적, 수집하는 개인정보 항목, 개인정보의 보유 및 이용 기간'에 대해 안내 드리고 동의를 받습니다.<br>
- 이름, 주민등록번호, 전화번호, 주소 등<br>
</p>
<p>
2. 개인정보 수집방법<br>
회사는 다음과 같은 방법으로 개인정보를 수집합니다.<br>
- 홈페이지, 서면양식, 팩스, 전화, 이메일, 이벤트 응모, 배송요청<br>
</p>
<p>
* 개인정보의 수집 및 이용목적<br>

1.서비스 제공에 관한 계약 이행 및 서비스 제공에 따른 요금정산<br>
컨텐츠 서비스 제공, 물품배송 또는 청구서 등 발송, 본인인증<br>
2.회원관리<br>
회원제 서비스 이용 및 제한적 본인 확인제도에 따른 본인확인, 개인식별, 불량회원(검빛 이용약관 제19조에 따른 이용정지 회원)의 부정 이용방지와 비인가 사용방지, 가입의사 확인, 가입 및 가입횟수 제한, 분쟁 조정을 위한 기록보존, 불만처리 등 민원처리, 고지사항 전달<br>

3.신규 서비스 개발 및 마케팅광고에의 활용<br>
신규 서비스 개발 및 맞춤 서비스 제공, 서비스의 유효성 확인, 이벤트 및 광고성 정보 제공 및 참여기회 제공, 접속빈도 파악, 회원의 서비스이용에 대한 통계<br>
</p>
<p>
* 개인정보의 보유 및 이용기간<br>

이용자의 개인정보는 원칙적으로 개인정보의 수집 및 이용목적이 달성되면 지체 없이 파기합니다. 단, 다음의 정보에 대해서는 아래의 이유로 명시한 기간 동안 보존합니다.<br>

- 부정이용기록<br>
 ㆍ보존 이유와 기간 : 부정 이용 방지 보존 기간 (1년)<br>

- 탈퇴회원 정보<br>
 ㆍ보존이유 : 회원이 활동한 내역등에 대한 사후관리 (3개월)<br>

관련법령에의한정보보유사유<br>
상법, 전자상거래 등에서의 소비자보호에 관한 법률 등 관계법령의 규정에 의하여 보존할 필요가 있는 경우 회사는 관계법령에서 정한 일정한 기간 동안 회원정보를 보관합니다. 이 경우 회사는 보관하는 정보를 그 보관의 목적으로만 이용하며 보존기간은 아래와 같습니다.<br>

- 전자상거래 등에서의 소비자보호에 관한 법률<br>
 ㆍ계약 또는 청약철회 등에 관한 기록 : 5년 보관<br>
 ㆍ대금결제 및 재화 등의 공급에 관한 기록 : 5년 보관<br>
 ㆍ소비자의 불만 또는 분쟁처리에 관한 기록 : 3년 보관<br>
  
- 전자금융거래법<br>
 ㆍ전자금융에 관한 기록 : 5년보관<br>
  
- 통신비밀보호법<br>
 ㆍ로그인 기록 : 3개<br>
 

*개인정보 유효기간<br>

회사는 유효기간 동안 서비스를 이용하지 않은 회원의 개인정보에 대하여 필요한 조치를 취하며, 그 내용은 아래와 같이 규정하고 있습니다.<br>
- 유효기간 : 1년<br>
- 조치 사항 : 유효기간 경과 후, 다른 개인정보와 분리하여 저장ㆍ관리<br>
- 분리 대상 : 이용자로부터 최초 수집한 개인 정보 (이용자가 작성한 게시물, 쿠키 등 2차 생성물은 제외)<br>
</p>
</div>
																
													<div class="mt-2"><input class="chkAgree" type="checkbox" value="Y"><span style="font-weight: bold;">&nbsp;개인정보수집 이용 및 처리방침 동의</span><span style="color:red;">&nbsp;(필수)</span></div>	
													</div>
													<!-- 이용약관 스크롤 끝 -->
													
												</div>
											</div>
											</div>
											<div class="ml-2 col-md-9" id="btnBox">
												<button class="button button-3d col_half btn-agree">동의</button>
												<button class="button button-3d col_half btn-cancle">취소</button>
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