package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(@ModelAttribute("userVO") UserVO vo) {     // 객체저장명 -> userVO
		System.out.println("로그인 화면으로 이동...");
		vo.setId("test");
		vo.setPassword("1234");
		return "login.jsp";
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO,HttpSession session) {
		System.out.println("로그인 인증 처리...");
		if(userDAO.getUser(vo) != null) {
			session.setAttribute("id", userDAO.getUser(vo).getId());
			session.setAttribute("userName", userDAO.getUser(vo).getName());
			return "getBoardList.do";
		}else {
			return "login.jsp";
		}
	}
	
	
	
	

//	public String login(UserVO vo,UserDAO userDAO) {
//		
//		System.out.println("로그인 처리");
//		
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
		
//		if(userDAO.getUser(vo) != null) {
//			return "redirect:getBoardList.do";
//		}else {
//			return "login.jsp";
//		}
		
		
		
//		ModelAndView mav = new ModelAndView();
		
//		if(user != null) {
//			mav.setViewName("redirect:getBoardList.do");    // redirect:는 viewResolver를 무시한다.
//		}else {
//			mav.setViewName("redirect:login.jsp");  
//		}
//		
//		return mav;
		
//		if(user != null){
//			HttpSession session = request.getSession();
//			session.setAttribute("id", vo.getId());
//			return "getBoardList.do";
//		}else{
//			return "login";
//		}
//	}
}
