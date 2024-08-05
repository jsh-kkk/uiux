<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.biz.board.*" %>
<%@ page import="com.springbook.biz.board.impl.*" %> 
<%

	request.setCharacterEncoding("UTF-8");
	
	String seq = request.getParameter("seq");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	
	vo.setSeq(Integer.parseInt(seq));
	vo.setTitle(title);
	vo.setContent(content);
	
	dao.updateBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>