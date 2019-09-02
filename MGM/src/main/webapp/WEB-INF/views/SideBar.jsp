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
<style>
#logout{
	float:right;
}
.chatId{
	font-weight:bold;
	border-radius: 6px;
	background-color: #C02942;
	color: white;
	padding:5px 10px;
	float:left;
}
.textMsg{
	border-radius: 6px;
	background-color: #f2f2f2;
	padding:5px 10px;
	float:left;
	max-width: 265px;
}
.cahtBox-inner{
	margin-bottom: 10px;
	clear: both;
}
.mychat{
	font-weight:bold;
	border-radius: 6px;
	background-color: #1265A8;
	color: white;
	padding:5px 10px;
	float:right;
}
.myTextMsg{
	border-radius: 6px;
	background-color: #f2f2f2;
	padding:5px 10px;
	float:right;
	max-width: 265px;
}

</style>
<div class="col-lg-3 sticky-sidebar-wrap topmargin ">
	<div class="sticky-sidebar">

		<!-- Sidebar Widget 2
								============================================= -->
		<div class="widget clearfix">
			<!-- <div class="line line-xs line-market"></div> -->
			<div class="card">
				
					<c:if test="${uid eq null }">
					<div class="card-body" style="padding: 5px;">
					<form class="form-signin" method="post" action="login.do">
						<!-- <div class="center">
												<i class="icon-sticker-mule text-muted mb-3" style="font-size: 48px;line-height: 1"></i>
												<h3 class="h3 mb-3 font-weight-normal font-primary">묻지마 로고</h3>
												<p class="font-secondary mb-2">로그인을 하시면 하시면 편리하게 이용하실수 있습니다.</p>
											</div> -->
					<div id="hidden-box" style="display:none;">
						<div class="form-label-group">
							<input name="id" type="text" id="inputId" class="form-control" placeholder="아이디" required>
								<label class="pt-2" for="inputId">아이디</label>
						</div>
						<div class="form-label-group">
							<input name="pw" type="password" id="inputPassword" class="form-control" placeholder="비밀번호" required>
							<label class="pt-2" for="inputPassword">비밀번호</label>
						</div>
						<button id="signup" class="btn btn-lg text-white btn-block uppercase ls1"
							style="background-color: #3A486E;" type="submit">Login</button>
					</div>
						<button id="signup2" class="btn btn-lg text-white btn-block uppercase ls1"
							style="background-color: #3A486E;" type="button">Login</button>
						<div class="center mt-1">
							<small class="mt-5 text-muted font-italic"><a href="#">아이디.비밀번호
									찾기</a></small>
						</div>
						<div class="center">
							<small class="mt-5 text-muted font-italic"><a href="signupform.do">회원가입</a></small>
						</div>
					</form>
					</div>
					</c:if>
					
					<c:if test="${uid ne null }">
					<div class="px-4 py-3" >
						<div class="mt-1 pb-1"style="border-bottom: solid 1px; border-color:#808080;">
						<span id="idbox" style=" font-weight: bold; font-size: 20px;">${uid.member_id}</span><span>님</span>
						&nbsp;
						<span><a id="mypage" href="mypage.do" style="color:gray;">마이페이지</a></span>
						</div>
						<div class="mt-2">
						<span style="font-weight:bold;">포인트: </span>
						<span style="color:#3A486E; font-weight:bold;">${uid.member_point}</span>
						&nbsp;&nbsp;
						<span style="font-weight:bold;">쪽지: </span>
						<span id="msgCount" style="color:#3A486E; font-weight:bold;"><a href="mypage.do">${uid.msgCount}</a></span>
						<span id="logout"><a class="py-1 px-1 logoutLink" href="logout.do" style="/* background-color: #3A486E;  */ font-weight: bold; color: black; font-size:12px; border:solid 1px; border-color: #e2e2e2; color:#555555;">로그아웃</a></span>
						 </div>
					</div>
					</c:if>
				
			</div>
		</div>




		<div class="widget clearfix" style="margin-top: 10px;">

			<h4 class="mb-2 ls1 uppercase t700" style="font-size: 120%;">
				<span class="text-primary"><i class="icon-chat-3"></i></span> 실시간채팅
			</h4>
			<div class="line line-xs line-sports"></div>
			<!-- Post Article -->
			<div class="card border">
				<div class="card-body">
					<div class="scroll-wrap" id="chatBox" style="height: 400px;">
						<div class="scroll" id="output">
						</div>
					</div>
				</div>
			</div>
			<!-- chatting form -->
				<div class="input-group divcenter">
					<input type="text" class="form-control" id="msgs"
						placeholder="욕설,비속어등은 제제대상입니다.">
					<div class="input-group-append">
						<button class="btn btn-success" id="btnSend">
							<i class="icon-email2"></i>
						</button>
					</div>
				</div>
		</div>
	</div>
</div>
<script src="resources/js/jquery.js"></script>
<script src="resources/js/sidebar.js"></script>