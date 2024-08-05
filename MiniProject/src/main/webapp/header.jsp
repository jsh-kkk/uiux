<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
    <!-- 헤더 로고와 버튼을 위한 컨테이너 -->
    <div class="header" >
        <!-- 헤더 로고 -->
        <img src="resources/logo.png" alt="logo" class="logo">
        
        <!-- 로그인 / 회원가입 버튼 -->
        <input type="button" class="btn1" value="로그인/회원가입" onclick="location.href='login.jsp'">
    </div>

    <!-- 네비게이션 바 -->
    <nav class="navbar">
        <a href="#">스토리</a>
        <a href="#">관광명소</a>
        <a href="#">로컬푸드</a>
        <a href="#">트래블매거진</a>
        <a href="#">이벤트</a>
        <a href="#">공지사항</a>
    </nav>
</header>
