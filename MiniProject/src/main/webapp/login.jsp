<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<style>
/* 전체 스타일 리셋 */
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #FFFFFF;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
}

/* 로고 스타일 */
.logo {
    position: absolute;
    top: 20px; /* 상단 여백 조정 */
    left: 20px; /* 왼쪽 여백 조정 */
    width: 150px; /* 로고 너비 조정 */
    height: auto; /* 로고 높이 자동 조정 */
}

/* 라인 스타일 */
.line {
    position: absolute;
    width: 100%; /* 화면 전체 너비로 확장 */
    height: 2px; /* 라인의 두께 */
    background-color: #F6F6F6; /* 라인의 색상 */
    top: 80px; /* 로고 하단과 구분선 사이의 여백 조정 */
    left: 0;
}

/* 로그인 박스 스타일 */
.login-box {
    position: relative;
    width: 450px; /* 로그인 박스 너비 확장 */
    border: 1px solid #F6F6F6;
    box-shadow: 0px 5px 2px rgba(0, 0, 0, 0.25);
    border-radius: 5px;
    background-color: #FFFFFF;
}

/* 로그인 박스 상단 텍스트 */
.login-header {
    width: 100%;
    text-align: center;
    font-family: 'Inter', sans-serif;
    font-weight: 700;
    font-size: 24px; /* 상단 텍스트 폰트 크기 조정 */
    line-height: 30px; /* 텍스트 높이 조정 */
    letter-spacing: 0.06em;
    color: #FFFFFF;
    background: #4149FF;
    border-radius: 5px 5px 0 0;
    padding: 10px 0; /* 상단 패딩 조정 */
}

/* 로그인 입력 필드 레이블 */
.input-label {
    font-family: 'Inter', sans-serif;
    font-weight: 300;
    font-size: 15px;
    line-height: 18px;
    letter-spacing: 0.06em;
    color: #000000;
    margin-bottom: 5px;
}

/* 로그인 입력 필드 */
.input-field {
    width: calc(100% - 20px);
    margin: 0 10px 10px;
    padding: 10px;
    border: 1px solid #F6F6F6;
    border-radius: 5px;
    box-sizing: border-box;
}

/* 로그인 및 가입 버튼 */
.button {
    width: calc(100% - 20px);
    margin: 10px;
    padding: 10px;
    border: none;
    border-radius: 5px;
    background: #4149FF;
    color: #FFFFFF;
    font-family: 'Inter', sans-serif;
    font-weight: 700;
    font-size: 20px;
    line-height: 24px;
    letter-spacing: 0.06em;
    cursor: pointer;
    text-align: center;
}

.button:hover {
    background-color: #3333FF;
}

/* JOIN US 버튼 스타일 */
.button_join {
    background-color: #00A0FF;
}
</style>
</head>
<body>
    <header>
        <!-- 헤더 로고 -->
        <img src="resources/logo.png" alt="logo" class="logo">
        <!-- 로고 구분선 -->
        <div class="line"></div>
    </header>
    
    <!-- 로그인 박스 -->
    <div class="login-box">
    <form class="loginFrm" action="/login.do">
        <div class="login-header">LOGIN</div>
        <div style="padding: 20px;" action="/login.do">
            <!-- ID 입력 필드 -->
            <div class="input-label">ID</div>
            <input type="text" class="input-field" placeholder="아이디를 입력하세요">
            <!-- PASSWORD 입력 필드 -->
            <div class="input-label">PASSWORD</div>
            <input type="pass" class="input-field" placeholder="비밀번호를 입력하세요">
            <!-- 로그인 버튼 -->
            <button type="submit" class="button_login" onclick="location.href='index.jsp'">LOGIN</button>
            <!-- 가입 버튼 -->
            <button type="submit" class="button_join" onclick="location.href='join.do'">JOIN US</button>
        </div>
       </form>
    </div>
</body>
</html>
