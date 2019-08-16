/**
 * 
 */
//단승
var winNo = $('.oddsTable').find('td').eq(0).attr('data-winNo');
var winOdds = $('.oddsTable').find('td').eq(0).attr('data-winOdds');
//연승
var plcNo = $('.oddsTable').find('td').eq(1).attr('data-plcNo');
var plcOdds = $('.oddsTable').find('td').eq(1).attr('data-plcOdds');
//복승
var qnlNo = $('.oddsTable').find('td').eq(2).attr('data-qnlNo');
var qnlOdds = $('.oddsTable').find('td').eq(2).attr('data-qnlOdds');
//쌍승승
var exaNo = $('.oddsTable').find('td').eq(3).attr('data-exaNo');
var exaOdds = $('.oddsTable').find('td').eq(3).attr('data-exaOdds');
//복연승
var qplNo = $('.oddsTable').find('td').eq(4).attr('data-qplNo');
var qplOdds = $('.oddsTable').find('td').eq(4).attr('data-qplOdds');
//삼복승
var tlaNo = $('.oddsTable').find('td').eq(5).attr('data-tlaNo');
var tlaOdds = $('.oddsTable').find('td').eq(5).attr('data-tlaOdds');
//삼쌍승
var triNo = $('.oddsTable').find('td').eq(6).attr('data-triNo');
var triOdds = $('.oddsTable').find('td').eq(6).attr('data-triOdds');
$(function(){
	$('.oddsTable').find('td').eq(0).append(" "+chnNo(winNo)+" "+winOdds);
	
	plcNo = plcNo.split('-');
	plcOdds = plcOdds.split('-');
	var plc = "";
	for(var i in plcNo){
		plc+=" "+chnNo(plcNo[i])+" "+plcOdds[i];
	}
	$('.oddsTable').find('td').eq(1).append(plc);
	
	qnlNo = qnlNo.split('-');
	var qnl = "";
	for(var i in qnlNo){
		qnl+=chnNo(qnlNo[i]);
	}
	$('.oddsTable').find('td').eq(2).append(" "+qnl+" "+qnlOdds);
	
	exaNo = exaNo.split('-');
	exaOdds= exaOdds.split('-');
	var exa ="";
	for(var i in exaNo){
		exa+=chnNo(exaNo[i]);
	}
	$('.oddsTable').find('td').eq(3).append(" "+exa+" "+exaOdds);
	
	qplNo = qplNo.split(',');
	qplOdds= qplOdds.split(',');
	var tqplNo ="";
	var qpl = "";
	for(var i in qplNo){
		tqplNo = qplNo[i].split('-');
		for(var j in tqplNo){
			qpl+=chnNo(tqplNo[j]);
		}
		qpl+=" "+qplOdds[i]+" ";
	}
	$('.oddsTable').find('td').eq(4).append(" "+qpl);
	
	tlaNo = tlaNo.split('-');
	tlaOdds= tlaOdds.split('-');
	var tla ="";
	for(var i in tlaNo){
		tla+=chnNo(tlaNo[i]);
	}
	$('.oddsTable').find('td').eq(5).append(" "+tla+" "+tlaOdds);
	
	triNo = triNo.split('-');
	triOdds= triOdds.split('-');
	var tri ="";
	for(var i in triNo){
		tri+=chnNo(triNo[i]);
	}
	$('.oddsTable').find('td').eq(6).append(" "+tri+" "+triOdds);
});

function chnNo(no){
	switch(no){
	case '1':
		return '①';
	case '2':
		return '②';
	case '3':
		return '③';	
	case '4':
		return '④';
	case '5':
		return '⑤';
	case '6':
		return '⑥';
	case '7':
		return '⑦';
	case '8':
		return '⑧';
	case '9':
		return '⑨';
	case '10':
		return '⑩';
	case '11':
		return '⑪';
	case '12':
		return '⑫';
	case '13':
		return '⑬';
	case '14':
		return '⑭';
	};
};