/**
 * 
 */
$(function() {
			var boardname = $("#boardname").attr("data-boardname");
			if(boardname == "free"){
				$("#tabfree").addClass('current');
			}else if(boardname == "fun"){
				$("#tabfun").addClass('current');
			}else if(boardname == "alert"){
				$("#tabalert").addClass('current');
			}else if(boardname == "game"){
				$("#tabgame").addClass('current');
			}		
});

function page(idx) {
	var pagenum = idx;
	var contentnum = 20;//$("#contentnum option:selected").val();
	var boardname = $('#boardname').attr("data-boardname");//boardname을 받아옴
	location.href="freeboard.do?pagenum="+pagenum+"&contentnum="+contentnum+"&boardname="+boardname;
}

/*function page2(idx) {
	var pagenum = idx;
	var contentnum = 20;//$("#contentnum option:selected").val();
	var boardname = $('#boardname').attr("data-boardname");//boardname을 받아옴
	location.href="detail.do?pagenum="+pagenum+"&contentnum="+contentnum+"&boardname="+boardname;
}*/