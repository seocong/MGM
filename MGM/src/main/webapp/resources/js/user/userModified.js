/**
 * 
 */
//회원탈퇴 아작스
$(function(){
	$("#signOutBtn").click(function(){
		var password = $("#withdrawalPW").val();
		$.ajax({
			type:"post",
			url: "checkUser.do",
			data: {'pw':password},
			success:function(data){
				if(data == 'fail'){
					$(".errorAlet").css("display","block");
				}else if(data == 'success'){
					$.post(
							"withdrawal.do",
							function(result){
								if(result=='fail'){
									alert('회원탈퇴에 실패했습니다. 다시 시도해주세요.');
									window.location = "mypage.do";
								}else if(result=='success'){
									alert('그 동안 이용해주셔서 감사합니다.');
									window.location = "main.do";
								}
							});
				}
			},
			error:function(data,textStatus){
				console.log(data, textStatus)
			},
		});
	});
});
//페이징
$(function(){
	var paging = $('.paging');
	for(var i in paging){
		var pageParam = '';
		if(i==0){
			pageParam='pointnum';
		}else if(i==1){
			pageParam='rpagenum';
		}else if(i==2){
			pageParam='spagenum';
		}else{
			pageParam='boardnum';
		}
		var count = $('.paging').eq(i).attr('data-count');
		if(count>18){
			if(count%18==0){
				count=Math.floor(count/18);
			}else{
				count=Math.floor(count/18)+1;
			};
		}else{
			count=1;
		}
		var pageNum = $('.paging').eq(i).attr('data-pageNum');
		//현재 보고있는 페이지 섹션 
		var pageSelSection=Math.floor(pageNum/5);
		
		//전체 페이지 섹션
		var pageTotalSection = 0;
		if(count%5==0){
			pageTotalSection=Math.floor(count/5);
		}else{
			pageTotalSection = Math.floor(count/5)+1;
		}
		console.log('pageNum:'+pageNum);
		
		for(var j=pageSelSection*5;j<(pageSelSection+1)*5;j++){
			if(j==count){
				break;
			}
			if(pageNum==j){
				$('.paging').eq(i).append(
					'<a class="pageLink" href="mypage.do?'+pageParam+'='+(j)+'"><div class="mr-1 pagingItem selpage">'+(j+1)+'</div></a>'
				);
			}else{
				$('.paging').eq(i).append(
					'<a class="pageLink" href="mypage.do?'+pageParam+'='+(j)+'"><div class="mr-1 pagingItem">'+(j+1)+'</div></a>'
				);
			}	
		}
		
		if(count>4 && (pageSelSection+1)!=pageTotalSection){
			$('.paging').eq(i).append(
					'<a class="pageLink" href="mypage.do?'+pageParam+'='+(pageSelSection+1)*5+'"><div class="mr-1 pagingItem">»</div></a>'
			);
		};

		if(pageSelSection>0){
			$('.paging').eq(i).prepend(
			'<a class="pageLink" href="mypage.do?'+pageParam+'='+(pageSelSection-1)*5+'"><div class="mr-1 pagingItem">«</div></a>'
			);
		};
	}
});
//메세지 읽음여부 표시
var readChk = $('.msgReadChk');
for(var i in readChk){
	if(readChk.eq(i).attr('data-read')=='Y'){
		readChk.eq(i).find('a').css('color','gray');
	}
}
function readMsg(obj){
	$(obj).attr('data-read','Y');
	$(obj).find('a').css('color','gray');
}
//메세지 삭제
$(function(){
	$('#sAllCheck').change(function(){
		$('input[name="sDelChk"]').each(function(){
			$(this).prop('checked', !$(this).prop('checked'));
		});
	});
	$('#rAllCheck').change(function(){
		$('input[name="rDelChk"]').each(function(){
			$(this).prop('checked', !$(this).prop('checked'));
		});
	});
	$('#rMsgDelBtn').click(function(){
		$('#rMsgDel').submit();
	});
	$('#sMsgDelBtn').click(function(){
		$('#sMsgDel').submit();
	});
});
//상세보기 메세지 삭제
$('#msgClose').click(function(){
	self.close();
});
function msgDel(seq,div){
//		var result = confirm("쪽지를 삭제하시겠습니까?");
//		if(result){
			location.href="msgDel.do?div="+div+"&msgSeq="+seq;
//		}
}
//메시지 보내기
function msgSend(){
	var id = $('#idbox').val();
	var textarea = $('textarea').val();
	var sessionId = $("#idbox",opener.document).html();
	if(!textarea&&!id){
		if(!textarea){
			$('#error_id').css('color','E42C3E');
			$('#error_id').addClass("error").html('메시지를 작성해 주세요.');
		}
		if(!id){
			$('#error_id').css('color','#E42C3E');
			$('#error_id').addClass("error").html('아이디를 작성해주세요.');
		}
	}else{
		if($('#idbox').attr('data-success')=='Y'){
			if(sessionId!=id){
				$('#msgSend').attr('action','msgSend.do');
				$('#msgSend').submit();
			}else{
				$('#error_id').css('color','#E42C3E');
				$('#error_id').addClass("error").html('본인에게는 메세지를 보낼 수 없습니다.');
			}
		}else{
			$('#error_id').css('color','#E42C3E');
			$('#error_id').addClass("error").html('아이디를 검색해주세요.');
		}
	}
}
$('#idbox').on('change keyup paste',function(){
	$('#idbox').attr('data-success','N');
});
//메시지 보내기 창 열기
$(function(){
	$('#msgWrite').click(function(){
		var popupX = (window.screen.width / 2) - (400 / 2);
		// 만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음
		var popupY= (window.screen.height / 2) - (405 / 2);
		window.open("msgSendOpen.do","쪽지보내기","width=400px,height=420px,left="+ popupX + ", top="+ popupY+",toolbar=no,status=no,resizable=no,scrollbars=no,location=no,menubar=no");
	});
});
//메세지 디테일 창 열기
function msgDetail(seq,div){
		$.ajax({
			type:"post",
			url: "msgRead.do",
			data:{"seq":seq,"div":div},
			success:function(is){
				if(is){
					console.log("읽기 처리 완료");
					var popupX = (window.screen.width / 2) - (400 / 2);
					// 만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음
					var popupY= (window.screen.height / 2) - (405 / 2);
					window.open("msgDetail.do?div="+div+"&msgSeq="+seq,"쪽지상세보기","width=400px,height=405px,left="+ popupX + ", top="+ popupY+",toolbar=no,status=no,resizable=no,scrollbars=no,location=no,menubar=no");
				}else{
					console.log("읽기 처리 실패");
				}
			},
			error:function(data){
				console.log(data+"아작스 에러");
			}
		});
};
//메세지 수신인 검색 ajax
$('#memberSearchBtn').click(function(){
	var id=$('#idbox').val();
	$.ajax({
		url:"idCheck.do",
		method:"post",
		data:{"id":id},
		success:function(is){
			//console.log(is);
			if(is){
				$('#idbox').val('');
				$('#error_id').css('color','#E42C3E');
				$('#error_id').addClass("error").html('아이디를 찾을 수 없습니다.');
			}else{
				$('#idbox').attr('data-success','Y');
				$('#error_id').css('color','green');
				$('#error_id').addClass("error").html('메시지를 작성해 주세요.');
			};
		},
		error:function(){
			//console.log("ajax통신 에러");
		}
	});
});

//게시판 이름 바꾸기
$('.board_name').each(function(index,item){
	switch($(item).html()){
	case 'free':
		$(item).html('자유');
		break;
	case 'fun':
		$(item).html('유머');
		break;
	case 'game':
		$(item).html('게임');
		break;
	}
});

//이용약관 동의
$('.btn-agree').click(function(){
	var chkAgree = $('.chkAgree');
	var useAgree = false;
	var infoAgree = false;
//	alert(chkAgree.length);
	for(var i in chkAgree){
		if(i==0){
			useAgree = chkAgree.eq(i).is(":checked");
		}else if(i==1){
			infoAgree = chkAgree.eq(i).is(":checked");
		}
	}
//	alert(useAgree);
//	alert(infoAgree);
	if(useAgree && infoAgree){
		location.href='signupform.do';
	}else{
		if(!useAgree){
			alert('이용약관에 동의해야합니다.');
		}else if(!infoAgree){
			alert('개인정보이용방침에 동의해야합니다.');
		}
	}
});
$('.btn-cancle').click(function(){
	location.href="main.do";
});
