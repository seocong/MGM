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
<div class="col-lg-3 sticky-sidebar-wrap topmargin ">
	<div class="sticky-sidebar">

		<!-- Sidebar Widget 2
								============================================= -->
		<div class="widget clearfix">
			<!-- <div class="line line-xs line-market"></div> -->
			<div class="card">
				<div class="card-body" style="padding: 5px;">
					<c:if test="${uid eq null }">
					<form class="form-signin" method="post" action="login.do">
						<!-- <div class="center">
												<i class="icon-sticker-mule text-muted mb-3" style="font-size: 48px;line-height: 1"></i>
												<h3 class="h3 mb-3 font-weight-normal font-primary">묻지마 로고</h3>
												<p class="font-secondary mb-2">로그인을 하시면 하시면 편리하게 이용하실수 있습니다.</p>
											</div> -->
					
						<div class="form-label-group">
							<input name="id" type="text" id="inputId" class="form-control" placeholder="아이디" required>
								<label class="pt-2" for="inputId">아이디</label>
						</div>
						<div class="form-label-group">
							<input name="pw" type="password" id="inputPassword" class="form-control" placeholder="비밀번호" required>
							<label class="pt-2" for="inputPassword">비밀번호</label>
						</div>
						<button class="btn btn-lg text-white btn-block uppercase ls1"
							style="background-color: #3A486E;" type="submit">Sign in</button>
						<div class="center">
							<small class="mt-5 text-muted font-italic"><a href="#">아이디.비밀번호
									찾기</a></small>
						</div>
						<div class="center">
							<small class="mt-5 text-muted font-italic"><a href="#">회원가입</a></small>
						</div>
					</form>
					</c:if>
					<c:if test="${uid ne null }">
						<div>${uid.member_id}</div>
						<a href="logout.do">로그아웃</a>
					</c:if>
				</div>
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
					<div class="scroll-wrap" style="height: 400px;">
						<div class="scroll" id="output">
							<article class="spost pt-0 notopborder clearfix">
								<div class="entry-c">
									<div class="entry-title">
										<h4 class="t600">
											<a href="#">UK government weighs Tesla's Model.</a>
										</h4>
									</div>
									<ul class="entry-meta clearfix">
										<li><span>by</span> <a href="#">John Doe</a></li>
										<li><i class="icon-time"></i><a href="#">11 Mar 2016</a></li>
									</ul>
								</div>
							</article>
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
<script>
$(function(){
	$('#btnSend').on('click', function(evt) {
		evt.preventDefault();
		if (socket.readyState !== 1){
			return;
		};
		let msg = $('#msgs').val();
		socket.send(msg);
		$('#msgs').val('');
	});
	
	connect();
});
</script>
<script>
	var socket = null;
	
	function connect() {
		var output = $("#output");
		var outputbox;
		var ws = new WebSocket("ws://localhost:9999/mgm/echo-ws.do");
		socket = ws;
		ws.onopen = function() {/* 이벤트  리스너 커넥션이 연결되었을때 들어옴*/
			console.log('Info: connection opened.');

			//onmessage는 연결안에 적어도 상관없음. 연결외 된 후에 실행되는것이기 때문에
			//밖에 적어도 상관은 없으나 원칙상 onopen 안에 있어야 된다.
		};

		ws.onmessage = function(event) {
			console.log("ReCeiveMesssage",event.data + '\n');
			writeResponse(event.data);
		};

		ws.onclose = function(event) {
			console.log('Info: connection closed.');
			//setTimeout(function() {connect();}, 1000); //retry connection!!
		};
		ws.onerror = function(error) {
			console.log('Info: error.' + error);
		};
		
		function writeResponse(text){
			$(output).append(text+"<div></div>");
			$(output).scrollTop($(output).prop('scrollHeight'));
     }
	}
</script>
<script>
		$(function(){
			$('#signup').click(function(){
				location.href="signupform.do";
			});
		});
</script>