<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.springbook.biz.user.*" %>
<%@ page import="com.springbook.biz.user.impl.*" %>

<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO dao = new UserDAO();
	UserVO user = dao.getUser(vo);
	
	if(user != null){
		session.setAttribute("id", vo.getId());
		response.sendRedirect("getBoardList.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
%>
