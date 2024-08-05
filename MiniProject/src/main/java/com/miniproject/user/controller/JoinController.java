package com.miniproject.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.miniproject.userImpl.UserDAO;
import com.miniproject.user.UserVO;

@Controller
public class JoinController extends HttpServlet {
	
	@Autowired
	private UserDAO userDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        String name = request.getParameter("name");
        String nickname = request.getParameter("nickname");
        String phone = request.getParameter("phone");

        UserVO user = new UserVO(id, pass, name, nickname, phone);
   
        UserDAO dao = new UserDAO();
        dao.insertUser(user);


        response.sendRedirect("login.jsp");
    }
}