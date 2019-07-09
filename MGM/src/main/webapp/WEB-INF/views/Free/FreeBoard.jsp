<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<%response.setContentType("text/html;charset=utf-8"); %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
<%-- <script type="text/javascript" src="<c:url value="/resources/js/paging.js"/>"></script> --%>
<script type="text/javascript">
	function page(idx) {
		var pagenum = idx;
		var contentnum = 10;//$("#contentnum option:selected").val();
		location.href="freeboard.do?pagenum="+pagenum+"&contentnum="+contentnum;
	}
</script>
</head>
<body>
<h1>자유게시판</h1>
	<table border="1">
	<col width="50px"><col width="300px"><col width="100px"><col width="150px"><col width="60px"><col width="50px">
	
	<tr style="background-color: red;">
		
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
		<th>추천</th>
		
	</tr>
	<c:choose>
		<c:when test="${empty list}"><!-- empty  null인지 확인 -->
			<tr><td colspan = "10">---작성된 글이 없습니다.---</td></tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list}" var="boardDto">
				<tr>
					
					<td  style="text-align: center;">${boardDto.board_seq}</td>
					<c:choose>
						<c:when test="${boardDto.board_delflag=='Y'}">
							<td>---삭제된 글입니다.---</td>
						</c:when>
						<c:otherwise>    
					        <td  style="text-align: center;">
					        <a href="freedetail.do?board_seq=${boardDto.board_seq}">${boarDto.board_title}</a>
					        </td>				            									
						</c:otherwise>
					</c:choose>
					<td  style="text-align: center;">${boardDto.board_writer}</td>				
					<td  style="text-align: center;"> <fmt:formatDate value="${boardDto.board_regdate}" pattern="yyyy년MM월dd일"/> </td>
					<td  style="text-align: center;">${boardDto.board_readcount}</td>	
					<td  style="text-align: center;">${boardDto.board_pushnum}</td>				
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>	
	
	<tr>
   <td colspan="5" style="text-align: center;">
   
   	<c:if test="${page.prev }">
   		<a style="text-decoration: none;"href="javascript:page(${page.getStartPage()-1});">&laquo;</a>
   	</c:if>
   	<c:forEach begin="${page.getStartPage()}" end="${page.getEndPage()}" var="idx">
   		<a style="text-decoration: none;" href="javascript:page(${idx});">${idx}</a>
   	</c:forEach>
   <c:if test="${page.next }">
   		<a style="text-decoration: none;"href="javascript:page(${page.getEndPage()+1});">&raquo;</a>
   	</c:if>
    <%-- <div class="pagination"  style="size: 12px;">
            <c:if test="${p.pageStartNum ne 1}">
                <!--맨 첫페이지 이동 -->
                <span style="margin-right:15px;"><a onclick='pagePre(${p.pageCnt+1},${p.pageCnt});' style="color: black; font-weight: bold; border-radius: 10%; width: 40px;">‹‹</a></span>
                <!--이전 페이지 이동 -->
                 <span><a onclick='pagePre(${p.pageStartNum},${p.pageCnt});' style="color: black; font-weight: bold;">‹</a></span> 
            </c:if>
            
            <!--페이지번호 -->
            <c:forEach var='i' begin="${p.pageStartNum}" end="${p.pageLastNum}" step="1">
                <span class='pageIndex${i}'><a onclick='pageIndex(${i});' style="color: black; font-weight: bold;">${i}</a></span>
            </c:forEach>
            
            <c:if test="${p.lastChk}">
                <!--다음 페이지 이동 -->
                <span><a onclick='pageNext(${p.pageStartNum},${p.total},${p.listCnt},${p.pageCnt});' style="color: black; font-weight: bold;  border-radius: 10%; width: 40px;">></a></span>
                <!--마지막 페이지 이동 -->
                <span><a onclick='pageLast(${p.pageStartNum},${p.total},${p.listCnt},${p.pageCnt});' style="color: black; font-weight: bold; border-radius: 10%; width: 35px;">»</a></span> 
            </c:if>
        </div>
        
       
        <form action="freeboard.do" method="post" id='frmPaging'>
            <!--출력할 페이지번호, 출력할 페이지 시작 번호, 출력할 리스트 갯수 -->
            <input type='hidden' name='index' id='index' value='${p.index}'>
            <input type='hidden' name='pageStartNum' id='pageStartNum' value='${p.pageStartNum}'>
            <input type='hidden' name='listCnt' id='listCnt' value='${p.listCnt}'>    
        </form> --%>
    
       
        </td>
        <td>
				<div class="row form-group" style="text-align: center;">
                <div class="col-md-12">
                  <input type="button" value="글쓰기" onclick="location.href='freeinsertform.do'">
                </div>
              </div>
	
        
        </td>
	</tr>
	</table>
</body>
</html>