/**
 * 
 */
//paging();
var member = $('#member')
var point = $('#point')
var game = $('#game')
var etc = $('#etc')
$('.tab-nav li').eq(0).click(function(){
	member.css('display','block');
	point.css('display','block');
	game.css('display','block');
	etc.css('display','block');
});
$('.tab-nav li').eq(1).click(function(){
	member.css('display','block');
	point.css('display','none');
	game.css('display','none');
	etc.css('display','none');
	$('.toggle').last().removeClass('nobottommargin nobottomborder');
})
$('.tab-nav li').eq(2).click(function(){
	member.css('display','none');
	point.css('display','none');
	game.css('display','block');
	etc.css('display','none');
	$('.toggle').last().removeClass('nobottommargin nobottomborder');
});
$('.tab-nav li').eq(3).click(function(){
	member.css('display','none');
	point.css('display','block');
	game.css('display','none');
	etc.css('display','none');
	$('.toggle').last().removeClass('nobottommargin nobottomborder');
});
$('.tab-nav li').eq(4).click(function(){
	member.css('display','none');
	point.css('display','none');
	game.css('display','none');
	etc.css('display','block');
	$('.toggle').last().removeClass('nobottommargin nobottomborder');
});

$(".faqSearch").keyup(function() {
    var text = $(this).val();
    var parentBox = $(".searchSpan").parent('div');
    parentBox.parent('div').css('display','none');
    var temp = $('.searchSpan');
    for(var i in temp){
    	var question = temp.eq(i).html();
    	if(question.indexOf(text)!=-1){
//    		console.log(question);
    		var searchParent = temp.eq(i).parent('div');
    		searchParent.parent('div').css('display','block');
    	};
    };
})

////페이징
//function paging(){
//	var divBox = $('div[class="toggle toggle-border nobottommargin nobottomborder"][data-visible="visible"');
//	divBox.css('display','none');
//	var count = divBox.length;
////	console.log(divBox);
//		if(count>8){
//			if(count%8==0){
//				count=Math.floor(count/8);
//			}else{
//				count=Math.floor(count/8)+1;
//			};
//		}else{
//			count=1;
//		}
//		var pageNum = Number($('#pageBox').attr('data-pageNum'));
//		console.log(pageNum*8);
//		console.log((pageNum+1)*8);
//		//현재 보고있는 페이지 섹션 
//		var pageSelSection=Math.floor(pageNum/5);
//		var count2=0;
//		for(var i=pageNum*8;i<(pageNum+1)*8;i++){
//			divBox.eq(i).css('display','block');
//		}
//		console.log("count2 "+count2);
//		//전체 페이지 섹션
//		var pageTotalSection = 0;
//		if(count%5==0){
//			pageTotalSection=Math.floor(count/5);
//		}else{
//			pageTotalSection = Math.floor(count/5)+1;
//		}
////		console.log('pageNum:'+pageNum);
//
//		for(var j=pageSelSection*5;j<(pageSelSection+1)*5;j++){
//			if(j==count){
//				break;
//			}
//			if(pageNum==j){
//				$('#pageBox').append(
//						'<button class="pageLink px-0" style="background:none;border:0;" data-pageNum="'+j+'" onclick="pageBtn(this);"><div class="mr-1 pagingItem selpage">'+(j+1)+'</div></a>'
//				);
//			}else{
//				$('#pageBox').append(
//						'<button class="pageLink px-0" style="background:none;border:0;" data-pageNum="'+j+'" onclick="pageBtn(this);"><div class="mr-1 pagingItem" style="background-color:white;">'+(j+1)+'</div></a>'
//				);
//			}	
//		}
//
//		if(count>4 && (pageSelSection+1)!=pageTotalSection){
//			$('#pageBox').append(
//					'<button class="pageLink px-0" style="background:none;border:0;" data-pageNum="'+(pageSelSection+1)*5+'" onclick="pageBtn(this);"><div class="mr-1 pagingItem">»</div></a>'
//			);
//		};
//
//		if(pageSelSection>0){
//			$('#pageBox').prepend(
//					'<button class="pageLink px-0" style="background:none;border:0;" data-pageNum="'+(pageSelSection+1)*5+'" onclick="pageBtn(this);"><div class="mr-1 pagingItem">«</div></a>'
//			);
//		};
//};
//function pageBtn(is){
//	var pageNum = $(is).attr('data-pageNum');
//	$('#pageBox').attr('data-pageNum',pageNum);
//	$('#pageBox').empty();
//	paging();
//};
