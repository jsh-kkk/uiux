<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.biz.board.*" %>
<%@ page import="com.springbook.biz.board.impl.*" %>  
<%
	request.setCharacterEncoding("UTF-8");
	
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");

	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	dao.insertBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>