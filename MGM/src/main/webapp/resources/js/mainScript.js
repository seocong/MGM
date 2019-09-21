
var dates = document.getElementsByClassName('infoDate');
var week = ['일','월','화','수','목','금','토'];
for(var i in dates){
	var strDate = dates[i].innerHTML+""; 
	var strmodify = strDate.substring(0,4)+'-'+strDate.substring(4,6)+'-'+strDate.substring(6,strDate.length);
	var dayOfWeek = week[new Date(strmodify).getDay()];
	strmodify = strDate.substring(4,6)+'월'+strDate.substring(6,strDate.length)+'일'+'('+dayOfWeek+')';
	dates[i].innerHTML = strmodify;
}

var meet = document.getElementsByClassName('meet');
for(var i in meet){
	var meetNum = Number(meet[i].innerHTML);
	switch(meetNum){
	case 1:
//		console.log('서울');
		meet[i].innerHTML='서';
		break;
	case 2:
//		console.log('제주');
		meet[i].innerHTML='제';
		break;
	case 3:
//		console.log('부산');
		meet[i].innerHTML='부';
		break;
	}
}

var odd1 = document.getElementsByClassName('odd1');
var odd2 = document.getElementsByClassName('odd2');
var odd3 = document.getElementsByClassName('odd3');

for(var i in odd1){
	var odds = odd1[i].innerHTML+"";
	var oddList = odds.split("/");
	for(var j in oddList){
		var odd = oddList[j].split(',');
		if(odd[0]==1){
			var chulNo = chnNo(odd[1]);
			odd1[i].innerHTML = chulNo+'<br>'+odd[2];
		}else if(odd[0]==2){
			var chulNo = chnNo(odd[1]);
			odd2[i].innerHTML = chulNo+'<br>'+odd[2];
		}else{
			var chulNo = chnNo(odd[1]);
			odd3[i].innerHTML = chulNo+'<br>'+odd[2];
		}
	}
}

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
	case '15':
		return '⑮';
	case '16':
		return '⑯';
	case '17':
		return '⑰';
	};
};

function selhorseBtn(num){
//	document.getElementById('betArea').style.display="block";
	var selNum =num.innerHTML;
	document.getElementById('betBtn').value=selNum+" 베팅";
//	document.getElementById('selhorse').innerHTML=selNum;
};