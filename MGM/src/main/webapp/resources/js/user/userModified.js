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