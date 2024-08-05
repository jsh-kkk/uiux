<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.biz.board.*" %>
<%@ page import="com.springbook.biz.board.impl.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>글 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateBoard.do" method="post">
		
			<input name="seq" type="hidden" value="${board.seq }" >
			
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left">
						<input name="title" type="text" value="${board.title }" />
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">작성자</td>
					<td align="left">
						${board.writer }
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">내용</td>
					<td align="left">
						<textarea name="content" cols="40" rows="10">${board.content } </textarea>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">등록일</td>
					<td align="left">
						${board.regDate }
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">조회수</td>
					<td align="left">
						${board.cnt }
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">글등록</a>
		<a href="deleteBoard.do?seq=${board.seq }">글삭제</a>
		<a href="getBoardList.do">글목록</a>
	</center>
</body>
</html>



