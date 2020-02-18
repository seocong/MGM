
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
var color = ['#C02942','#EB9C4D','#59BA41','#40C0CB','#1265A8','#5D4157'];
function selhorseBtn(num){
	var parent = num.parentNode.parentNode;
	var childBtn = parent.getElementsByTagName('button');
	var buttonNum = ['button1','button2','button3','button4','button5','button6'];
	for(var i in buttonNum){
		document.getElementById(buttonNum[i]).style.borderColor=color[i];
		document.getElementById(buttonNum[i]).style.color=color[i];
		document.getElementById(buttonNum[i]).style.backgroundColor='white';
		document.getElementById(buttonNum[i]).classList.remove('btnChk');
	}
	var selNum = Number(num.innerHTML.substr(0,1))-1;
	num.classList.add('btnChk');
	document.getElementById(buttonNum[selNum]).style.borderColor=color[selNum];
	document.getElementById(buttonNum[selNum]).style.color='white';
	document.getElementById(buttonNum[selNum]).style.backgroundColor=color[selNum];
};

document.getElementById("betBtn").onclick = function(){
	var chkHr = document.getElementsByClassName('btnChk');
//	if(!chkHr){
//		alert('오잉?')
//	}
	var pointBox = document.getElementById('chkPoint');
	var chkPoint = pointBox.options[pointBox.selectedIndex].text;
	document.getElementById('chkMsg').innerHTML = chkHr[0].innerHTML + '에 '+ chkPoint+'베팅 하시겠습니까?';
}

//main chart 1
var todayResult = document.getElementById("todayResult");
var child = todayResult.getElementsByTagName('div');
var ctx = document.getElementById('todayChart').getContext('2d');
var chart = new Chart(ctx, {
    // The type of chart we want to create
    type: 'bar',

    // The data for our dataset
    data: {
        labels: ['1번', '2번', '3번', '4번', '5번', '6번'],
        datasets: [{
            label: 'none',
            backgroundColor: ['#C02942','#EB9C4D','#59BA41','#40C0CB','#1265A8','#5D4157'],
            borderColor: 'rgb(255, 99, 132)',
            data: [child[0].innerHTML,child[1].innerHTML,child[2].innerHTML,child[3].innerHTML,child[4].innerHTML,child[5].innerHTML]
        }]
    },

    // Configuration options go here
    options: {
    	 legend: {
             display:false
         }
    	
    }
});

//main chart 2
var todayResult2 = document.getElementById("weekResult");
var child2 = todayResult2.getElementsByTagName('div');
var ctx2 = document.getElementById('weekChart').getContext('2d');
var chart2 = new Chart(ctx2, {
    // The type of chart we want to create
    type: 'bar',

    // The data for our dataset
    data: {
        labels: ['1번', '2번', '3번', '4번', '5번', '6번',],
        datasets: [{
            label: 'none',
            backgroundColor: ['#C02942','#EB9C4D','#59BA41','#40C0CB','#1265A8','#5D4157'],
            borderColor: 'rgb(255, 99, 132)',
            data: [child2[0].innerHTML,child2[1].innerHTML,child2[2].innerHTML,child2[3].innerHTML,child2[4].innerHTML,child2[5].innerHTML]
        }]
    },

    // Configuration options go here
    options: {
    	 legend: {
             display:false
         }
    }
});

//main chart 3
var todayResult3 = document.getElementById("weekResult");
var child3 = todayResult3.getElementsByTagName('div');
var ctx3 = document.getElementById('yearChart').getContext('2d');
var chart3 = new Chart(ctx3, {
    // The type of chart we want to create
    type: 'bar',

    // The data for our dataset
    data: {
        labels: ['1번', '2번', '3번', '4번', '5번', '6번',],
        datasets: [{
            label: 'none',
            backgroundColor: ['#C02942','#EB9C4D','#59BA41','#40C0CB','#1265A8','#5D4157'],
            borderColor: 'rgb(255, 99, 132)',
            data: [child3[0].innerHTML,child3[1].innerHTML,child3[2].innerHTML,child3[3].innerHTML,child3[4].innerHTML,child3[5].innerHTML]
        }]
    },

    // Configuration options go here
    options: {
    	 legend: {
             display:false
         }
    }
});
$('iframeA').contents().find()
