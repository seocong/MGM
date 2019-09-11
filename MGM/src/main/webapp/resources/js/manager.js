/**
 * 
 */
var board_name = $("#board_name").attr("data-board_name");
$(function() {
	if(board_name == "member"){
		$("#tabmember").addClass('current');
	}else if(board_name == "board"){
		$("#tabboard").addClass('current');
	}else if(board_name == "point"){
		$("#tabpoint").addClass('current');
	}else if(board_name == "reset"){
		$("#tabresetdata").addClass('current');
	}	
	if(board_name=="member"){
		var preAddr = $('.addrChange');
		for(var i in preAddr){
			var splitAddr = preAddr.eq(i).html().split(',');
			var postAddr = '';
			for(var j in splitAddr){
				postAddr = postAddr+'<br>'+splitAddr[j];
			}
			$(".addrChange").eq(i).html(postAddr);
		}
	}

});

//페이징
$(function(){
	var paging = $('.paging');
	var id=$('#searchId').attr('data-searchId');
	for(var i in paging){
		var div=board_name;
		var count = $('.paging').eq(i).attr('data-count');
		if(count>18){
			if(count%18==0){
				count=Math.floor(count/20);
			}else{
				count=Math.floor(count/20)+1;
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
//		console.log('pageNum:'+pageNum);

		for(var j=pageSelSection*5;j<(pageSelSection+1)*5;j++){
			if(j==count){
				break;
			}
			if(pageNum==j){
				$('.paging').eq(i).append(
						'<a class="pageLink" href="adminPage.do?div='+div+'&pagenum='+(j)+'&searchId='+id+'"><div class="mr-1 pagingItem selpage">'+(j+1)+'</div></a>'
				);
			}else{
				$('.paging').eq(i).append(
						'<a class="pageLink" href="adminPage.do?div='+div+'&pagenum='+(j)+'&searchId='+id+'"><div class="mr-1 pagingItem" style="background-color:white;">'+(j+1)+'</div></a>'
				);
			}	
		}

		if(count>4 && (pageSelSection+1)!=pageTotalSection){
			$('.paging').eq(i).append(
					'<a class="pageLink" href="adminPage.do?div='+div+'&pagenum='+(pageSelSection+1)*5+'&searchId='+id+'"><div class="mr-1 pagingItem">»</div></a>'
			);
		};

		if(pageSelSection>0){
			$('.paging').eq(i).prepend(
					'<a class="pageLink" href="adminPage.do?div='+div+'&pagenum='+(pageSelSection-1)*5+'&searchId='+id+'"><div class="mr-1 pagingItem">«</div></a>'
			);
		};
	}
});
$(function(){
	$('.parentChk').change(function(){
		$('input[name="chkvalue"]').each(function(){
			$(this).prop('checked',!$(this).prop('checked'));
		});
	});
});
//지우기
$(".delbtn").click(function(){
	$('input[name="divs"]').attr('value',board_name);
	$(".delForm").submit();
});
//document.addEventListener('keydown', function(event) {
//	  if (event.keyCode === 13) {
//	    event.preventDefault();
//	  };
//}, true);
$(function(){
		$('.searchId').keydown(function(key){
			if(key.keycode==13){
				var id = $('#searchbox').val();
//				console.log(id);
				location.href='adminPage.do?div='+board_name+'&searchId='+id;
			}
		});
		$('.searchId').click(function(){
			var id = $('#searchbox').val();
//			console.log(id);
			location.href='adminPage.do?div='+board_name+'&searchId='+id;
		});
})
//포인트 차감 박스
$(function(){
	$('.pointBtn').click(function(){
		var popupX = (window.screen.width / 2) - (400 / 2);
		// 만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음
		var popupY= (window.screen.height / 2) - (405 / 2);
		window.open("pointplusOpen.do","쪽지보내기","width=400px,height=350px,left="+ popupX + ", top="+ popupY+",toolbar=no,status=no,resizable=no,scrollbars=no,location=no,menubar=no");
	});
});
//아이디 검색
$('#memberSearchBtn').click(function(){
	var id=$('#idbox').val();
	if(id!='admin'&&id!='Admin'){
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
					$('#error_id').addClass("error").html('포인트와 사유를 적어주세요.');
				};
			},
			error:function(){
				//console.log("ajax통신 에러");
			}
		});
	}else{
		$('#error_id').css('color','#E42C3E');
		$('#error_id').addClass("error").html('아이디를 제대로 작성해주세요.');
	}
	
});
$('#point').blur(function(){
	var point = $('#point').val();
	if(!point){
		$('#error_id').css('color','E42C3E');
		$('#error_id').addClass("error").html('포인트를 적어주세요.');
	}else{
		if(isNaN(point)){
			if(Number(point)>2147483647){
				$('#error_id').css('color','E42C3E');
				$('#error_id').addClass("error").html('숫자가 너무 큽니다. 2147483647 미만 입력 ');
			}else{
				$('#point').val('');
				$('#error_id').css('color','E42C3E');
				$('#error_id').addClass("error").html('포인트는 숫자만 작성해주세요.');
			}
		}else{
			$('#error_id').removeClass("error").html('');
		}
	}
});
$('#reason').blur(function(){
	var reason = $('#reason').val();
	if(!reason){
		$('#error_id').css('color','E42C3E');
		$('#error_id').addClass("error").html('내용를 적어주세요.');
	}else{
		$('#error_id').removeClass("error").html('');
	}
});
//등록하기
function pointplus(){
	var id = $('#idbox').val();
	var point = $('#point').val();
	var reason = $('#reason').val();
	var sessionId = $("#idbox",opener.document).html();
	if(!point || !id || !reason){
		if(!reason){
		$('#error_id').css('color','#E42C3E');
		$('#error_id').addClass("error").html('내용를 작성해주세요.');
	}
		if(!point){
			$('#error_id').css('color','E42C3E');
			$('#error_id').addClass("error").html('포인트를 적어주세요.');
		}
		if(!id){
			$('#error_id').css('color','#E42C3E');
			$('#error_id').addClass("error").html('아이디를 작성해주세요.');
		}
	}else{
		if($('#idbox').attr('data-success')=='Y'){
			if(sessionId!=id){
				$('#pointplus').attr('action','pointplus.do');
				$('#pointplus').submit();
			}else{
				$('#error_id').css('color','#E42C3E');
				$('#error_id').addClass("error").html('아이디를 다시 검색해주세요.');
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
$('#msgClose').click(function(){
	self.close();
});
$('#allMember').change(function(){
	if($(this).prop('checked')){
		$('#idbox').attr('readonly','readonly');
		$('#idbox').val('전체');
		$('#idbox').css('background-color','#eeeeee');
		$('#memberSearchBtn').attr('disabled',true);
		$('#idbox').attr('data-success','Y');
		$('#error_id').removeClass("error").html('');
	}else{
		$('#idbox').attr('readonly',false);
		$('#idbox').val('');
		$('#idbox').css('background-color','white');
		$('#memberSearchBtn').attr('disabled',false);
		$('#idbox').attr('data-success','N');
	}
});
