
var dates = document.getElementsByClassName('infoDate');
var week = ['일','월','화','수','목','금','토'];
for(var i in dates){
	var strDate = dates[i].innerHTML; 
	var strmodify = strDate.substring(0,4)+'-'+strDate.substring(4,6)+'-'+strDate.substring(6,strDate.length);
	var dayOfWeek = week[new Date(strmodify).getDay()];
	strmodify = strDate.substring(4,6)+'월'+strDate.substring(6,strDate.length)+'일'+'('+dayOfWeek+')';
	dates[i].innerHTML = strmodify;
}