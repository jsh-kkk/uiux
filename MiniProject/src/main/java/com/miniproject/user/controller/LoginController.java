package com.miniproject.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miniproject.user.UserVO;
import com.miniproject.userImpl.UserDAO;

@Controller
public class LoginController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value="/login.do", method=RequestMethod.GET)
    public String loginView(@ModelAttribute("userVO") UserVO vo) {
        System.out.println("로그인 화면으로 이동...");
        vo.setId("test");
        vo.setPass("1234");
        return "login.jsp";
    }

    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    public String login(UserVO vo, HttpSession session) {
        System.out.println("로그인 인증 처리...");
        UserVO user = userDAO.insertUser(vo);
        if(user != null) {
            session.setAttribute("id", user.getId());
            session.setAttribute("userName", user.getName());
            return "index.do";
        } else {
            return "login.jsp";
        }
    }
}
