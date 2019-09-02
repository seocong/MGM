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
				alert("에러");
			},
		});
	});
});
//페이징
$(function(){
	var paging = $('.paging');
	for(var i in paging){
		var pageParam = '';
		switch(paging){
		case 0:
			pageParam='rpagenum';
			break;
		case 1:
			pageParam='spagenum';
			break;
		case 2:
			pageParam='boardnum';
			break;
		}
		var count = $('.paging').eq(i).attr('data-count');
		if(count>Math.floor(count)){
			count=Math.floor(count)+1;
		}else{
			count=Math.floor(count);
		};
		var pageNum = $('.paging').eq(i).attr('data-pageNum');
		//현재 보고있는 페이지 섹션
		var pageSelSection = 0;
		if(pageNum%5==0){
			pageSelSection=pageNum/5;
		}else{
			pageSelSection = pageNum/5+1;
		}
		//전체 페이지 섹션
		var pageTotalSection = 0;
		if(count%5==0){
			pageTotalSection=count/5;
		}else{
			pageTotalSection = count/5+1;
		}
		for(var j=0;j<=count;j++){
			if(pageNum==j){
				$('.paging').eq(i).append(
					'<a class="pageLink" href="mypage.do?'+pageParam+'='+j+'"><div class="mr-1 pagingItem selpage">'+(j+1)+'</div></a>'
				);
			}else{
				$('.paging').eq(i).append(
					'<a class="pageLink" href="mypage.do?'+pageParam+'='+j+'"><div class="mr-1 pagingItem">'+(j+1)+'</div></a>'
				);
			}
			if(i==5){
				break;
			}
		}
	}
	if(count>4 && pageSelSection!=pageTotalSection){
		$('.paging').eq(i).append(
				'<a class="pageLink" href="mypage.do?'+pageParam+'='+(pageNum+5)+'"><div class="mr-1 pagingItem">»</div></a>'
		);
	};
	if(pageNum>5){
		'<a class="pageLink" href="mypage.do?'+pageParam+'='+(pageNum-5)+'"><div class="mr-1 pagingItem">«</div></a>'
	};
});
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
	$('.mypageBtn').eq(0).click(function(){
		$('#sMsgDel').submit();
	});
	$('.mypageBtn').eq(1).click(function(){
		$('#rMsgDel').submit();
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
			$('#msgSend').attr('action','msgSend.do');
			$('#msgSend').submit();
		}else{
			$('#error_id').css('color','#E42C3E');
			$('#error_id').addClass("error").html('아이디 검색이 필요합니다.');
		}
	}
}
//메시지 보내기 창 열기
$(function(){
	$('#msgWrite').click(function(){
		var popupX = (window.screen.width / 2) - (400 / 2);
		// 만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음
		var popupY= (window.screen.height / 2) - (405 / 2);
		window.open("msgSendOpen.do","쪽지보내기","width=400px,height=420px,left="+ popupX + ", top="+ popupY+",toolbar=no,status=no,resizable=no,scrollbars=no,location=no,menubar=no");
	});
});
function msgDetail(seq,div){
	var popupX = (window.screen.width / 2) - (400 / 2);
	// 만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음
	var popupY= (window.screen.height / 2) - (405 / 2);
	window.open("msgDetail.do?div="+div+"&msgSeq="+seq,"쪽지상세보기","width=400px,height=405px,left="+ popupX + ", top="+ popupY+",toolbar=no,status=no,resizable=no,scrollbars=no,location=no,menubar=no");
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