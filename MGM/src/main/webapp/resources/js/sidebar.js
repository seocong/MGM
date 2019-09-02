/**
 * 
 */
//소켓 
$(function(){
	var id = $('#idbox').html();
	$('#msgs').keydown(function(key){
		
			if(key.keyCode==13){
				if(!(!id)){
				if(socket.readyState !== 1){
					return;
				};
				let msg = $('#msgs').val();
				socket.send(msg);
				$('#msgs').val('');
			}else{
				alert("로그인 후 이용해주세요.");
				$('#msgs').val('');
			};
		};
	});
	$('#btnSend').on('click', function(evt) {
		if(!(!id)){
		if (socket.readyState !== 1){
			return;
		};
		let msg = $('#msgs').val();
		socket.send(msg);
		$('#msgs').val('');
		}else{
			alert("로그인 후 이용해주세요.");
			$('#msgs').val('');
		}
	});

	connect();
});


var socket = null;

function connect() {
	var output = $("#output");
	var outputbox;
//	var ws = new WebSocket("ws://122.47.139.101:8888/mgm/echo-ws.do");
	var ws = new WebSocket("ws://localhost:8888/mgm/echo-ws.do");
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
		var message = text.split(':');
		var senderId = null;
		var textMsg = null;
		for(var i in message){
			if(i==0){
				senderId = message[i];
			}else if(i==1){
				textMsg = message[i];
			}
		}
		var loginId=$('#idbox').html();
		if(loginId == senderId){
			$('#output').append('<div class="chatBox-inner"><div class="mychat '+senderId+'">'+senderId+'</div>'+'<div class="myTextMsg">'+textMsg+'</div></div><div class="clearfix mb-3"></div>');
		}else{
			$('#output').append('<div class="chatBox-inner"><div class="chatId '+senderId+'">'+senderId+'</div>'+'<div class="textMsg">'+textMsg+'</div></div><div class="clearfix mb-3"></div>');
		}
		$('#chatBox').scrollTop($("#chatBox").prop('scrollHeight'));
	}
}
//소켓 종료
//쪽지확인
window.onload=function(){
	var id = $('#idbox').html();
//	alert(id);
	if(!(!id)){
		setInterval(function(){
			$.ajax({
				url:"msgCheck.do",
				method:"post",
				data:{"id":id},
				success:function(result){
//					console.log(result);
					if(!(!result)){
						$('#msgCount').html('<a href="mypage.do">'+result+'</a>');	
					}
				},
				error:function(){
					//console.log("ajax통신 에러");
				}
			});
		},1200);
	};
};
//로그인
$(function(){
	$('#mypage').hover(function(){
		$('#mypage').css('color','#3A486E');
		$('#mypage').css('font-weight','bold');
	},function(){
		$('#mypage').css('color','#808080');
		$('#mypage').css('font-weight','normal');
	});
	$('.logoutLink').hover(function(){
		$('.logoutLink').css('border-color','black');
	},function(){
		$('.logoutLink').css('border-color','#e2e2e2');
	});
	$('#signup2').click(function(){
		$('#hidden-box').css('display','block');
		$('#signup2').css('display','none');
	});
});