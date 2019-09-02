/**
 * 
 */

//kakao 주소 api
function addrApi() {
	new daum.Postcode({
		oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

			// 각 주소의 노출 규칙에 따라 주소를 조합한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			var addr = ''; // 주소 변수
			var extraAddr = ''; // 참고항목 변수

			//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
				addr = data.roadAddress;
			} else { // 사용자가 지번 주소를 선택했을 경우(J)
				addr = data.jibunAddress;
			}

			// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
			if(data.userSelectedType === 'R'){
				// 법정동명이 있을 경우 추가한다. (법정리는 제외)
				// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
				if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
					extraAddr += data.bname;
				}
				// 건물명이 있고, 공동주택일 경우 추가한다.
				if(data.buildingName !== '' && data.apartment === 'Y'){
					extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
				}
				// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
				if(extraAddr !== ''){
					extraAddr = ' (' + extraAddr + ')';
				}
				// 조합된 참고항목을 해당 필드에 넣는다.
				document.getElementById("notes").value = extraAddr;
			} else {
				document.getElementById("notes").value = '';
			}

			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			document.getElementById('zipcode').value = data.zonecode;
			document.getElementById('zipcode').classList.remove('error');
			document.getElementById("address").value = addr;
			document.getElementById('address').classList.remove('error');

			// 커서를 상세주소 필드로 이동한다.
			document.getElementById("detailAddress").focus();
		}
	}).open();
}

//일 선택 js
$(function(){
	$("#monthBox").change(function(){
		var year = $("#yearBox").val();
		var month = $("#monthBox").val();
		var date = new Date(year,month,0);
		var lastDate = date.getDate();
		var tags = '<option value="">일</option>';
		for(var i=1;i<=lastDate;i++){
			if(i<10){
				tags += '<option value="0'+i+'">'+i+'</option>';
			}else{
				tags += '<option value="'+i+'">'+i+'</option>';
			}

		};
		$("#dateBox").html(tags);
	});
});


//빈칸일 경우
function nulChk(val){
	if(!val.val()){
		val.addClass('error');
		val.parent().find(".blur_alert").html('필수입력 항목 입니다.');
		return false;
	}
	else{
		return true;
	};
};
//바리데이션
function check(re,values){
	if(re.test(values)){
		return true;
	}else{
		return false;
	}
}

//아이디 체크
$(function(){
	$("#idBox").blur(function(){
		var focus = $('#idBox');
		var id = focus.val();
		var re = /^[a-z0-9]{5,20}$/;
		if(nulChk(focus)){
			if(check(re,id)){
				$.ajax({
					url:"idCheck.do",
					method:"post",
					data:{"id":id},
					success:function(is){
						//console.log(is);
						if(is){
							$('#idBox').removeClass('error');
							$('#idBox').parent().find(".blur_alert").css('color','green');
							$('#idBox').parent().find(".blur_alert").html('사용가능한 아이디입니다.');
						}else{
							$('#idBox').addClass('error');
							$('#idBox').parent().find(".blur_alert").css('color','red');
							$('#idBox').parent().find(".blur_alert").html('이미 사용중인 아이디입니다.');
						};
					},
					error:function(){
						//console.log("ajax통신 에러");
					}
				});
			}else{
				$('#idBox').addClass('error');
				$('#idBox').parent().find(".blur_alert").css('color','red');
				$('#idBox').parent().find(".blur_alert").html('5 ~ 20자 이내 영소문자와 숫자만 사용 가능합니다.');
			};
		};
	});
});
//이름 체크
$(function(){
	$("#nameBox").blur(function(){
		var focus = $('#nameBox');
		var name = focus.val();
		//console.log(name);
		var re = /^[가-힣]{2,30}$/;
		if(nulChk(focus)){
			if(check(re,name)){
				$('#nameBox').removeClass('error');
				$('#nameBox').parent().find(".blur_alert").html('');
			}else{
				$('#nameBox').addClass('error');
				$('#nameBox').parent().find(".blur_alert").css('color','red');
				$('#nameBox').parent().find(".blur_alert").html('한글만 입력 가능합니다.');
			}
		}
	});
});
//비밀번호 체크
$(function(){
	var focus = $('#pwBox');
	focus.blur(function(){
		var pw = focus.val();
//		//console.log(pw);
		var re = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,30}$/;
		if(nulChk(focus)){
			if(check(re,pw)){
				focus.removeClass('error');
				focus.parent().find(".blur_alert").html('');
			}else{
				focus.addClass('error');
				focus.parent().find(".blur_alert").css('color','red');
				focus.parent().find(".blur_alert").html('8 ~ 30자리 이내 숫자, 문자, 특수문자 각각 1개 이상 포함해야 합니다.');
			}
		}
	});
	$('#pwchkBox').blur(function(){
		if(focus.val()!=$('#pwchkBox').val()){
			$('#pwchkBox').addClass('error');
			$('#pwchkBox').parent().find(".blur_alert").css('color','red');
			$('#pwchkBox').parent().find(".blur_alert").html('입력하신 비밀번호와 다릅니다.');
		}else{
			$('#pwchkBox').removeClass('error');
			$('#pwchkBox').parent().find(".blur_alert").html('');
		}
	});
});
//생년월일 체크
$(function(){
	var focus = $('#yearBox');
	var date = new Date();
	var year = date.getFullYear();
	focus.blur(function(){
		var inputDate = focus.val();
		var re = /^[0-9]{4,4}$/;
		if(nulChk(focus)){
			if(check(re,inputDate)){
				if(year-19>=inputDate){
					focus.removeClass('error');
					focus.parent().find(".blur_alert").html('');
				}else{
					focus.addClass('error');
					focus.parent().find(".blur_alert").css('color','red');
					focus.parent().find(".blur_alert").html('만 19세 이상만 가입 가능합니다.');
				}
			}else{
				focus.addClass('error');
				focus.parent().find(".blur_alert").css('color','red');
				focus.parent().find(".blur_alert").html('숫자만 입력해주세요.');
			}
		}
	});
});
//전화번호 체크
$(function(){
	var focus = $('#phnumBox');
	var re = /^[010]{3}[0-9]{8}$/;
	focus.blur(function(){
		var ph = focus.val();
		if(nulChk(focus)){
			if(check(re,ph)){
				focus.removeClass('error');
				focus.parent().find(".blur_alert").html('');
			}else{
				focus.addClass('error');
				focus.parent().find(".blur_alert").css('color','red');
				focus.parent().find(".blur_alert").html('형식에 맞지 않습니다.');
			}
		}
	});

	$('#template-contactform-phone').click(function(){
		var ph = focus.val();
		if(nulChk(focus)){
			if(check(re,ph)){
				$.ajax({
					url:"phCheck.do",
					method:"post",
					data:{"ph":ph},
					success:function(is){
						//console.log(is);
						if(is){
							focus.removeClass('error');
							focus.parent().find(".blur_alert").html('');
						}else{
							focus.addClass('error');
							focus.parent().find(".blur_alert").css('color','red');
							focus.parent().find(".blur_alert").html('이미 가입된 전화번호 입니다.');
						};
					},
					error:function(){
						console.log("ajax통신 에러");
					}
				});
			}else{
				focus.addClass('error');
				focus.parent().find(".blur_alert").css('color','red');
				focus.parent().find(".blur_alert").html('형식에 맞지 않습니다.');
			}
		}
	});
});

$('#signUpSubmit').click(function(){
	var errorChk=$('.error');
//	//console.log(errorChk.length);
	if(errorChk.length==0){
		$('#sign-up').submit();
	}else{
		$('.error').eq(0).focus();
	}
});

