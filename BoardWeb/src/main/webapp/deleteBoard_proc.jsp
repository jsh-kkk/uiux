<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.biz.board.*" %>
<%@ page import="com.springbook.biz.board.impl.*" %> 
<%
	String seq = request.getParameter("seq");

	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	
	vo.setSeq(Integer.parseInt(seq));
	
	dao.deleteBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>