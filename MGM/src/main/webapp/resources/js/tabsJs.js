/**
 * 
 */
$(function() {
			var board_name = $("#board_name").attr("data-board_name");
			if(board_name == "free"){
				$("#tabfree").addClass('current');
			}else if(board_name == "fun"){
				$("#tabfun").addClass('current');
			}else if(board_name == "alert"){
				$("#tabalert").addClass('current');
			}else if(board_name == "game"){
				$("#tabgame").addClass('current');
			}		
});
$(function() {
	var tr_meet = $("#tr_meet").attr("data-tr_meet");
	if(tr_meet == 1){
		$("#tabseoul").addClass('current');
	}else if(tr_meet == 2){
		$("#tabjeju").addClass('current');
	}else if(tr_meet == 3){
		$("#tabbusan").addClass('current');
	}	
});

function page(idx) {
	var pagenum = idx;
	var contentnum = 20;//$("#contentnum option:selected").val();
	var board_name = $('#board_name').attr("data-board_name");//boardname을 받아옴
	location.href="freeboard.do?pagenum="+pagenum+"&contentnum="+contentnum+"&board_name="+board_name;
}

function page2(idx) {
	var pagenum = idx;
	var contentnum = 20;//$("#contentnum option:selected").val();
	var board_name = $('#board_name').attr("data-board_name");//boardname을 받아옴
	location.href="detail.do?pagenum="+pagenum+"&contentnum="+contentnum+"&board_name="+board_name;
}

