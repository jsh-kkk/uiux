package com.springbook.view.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class GetBoardListController {

	@RequestMapping(value="/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글목록 검색 처리");
		
//		BoardVO vo = new BoardVO();
//		BoardDAO boardDAO = new BoardDAO();
		
//		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
//		ModelAndView mav = new ModelAndView();
		
		mav.addObject("boardList",boardDAO.getBoardList(vo));    // request영역에 저장된다
		mav.setViewName("getBoardList.jsp");         //    /WEB-INF/board/getBoardList.jsp
		return mav;
		
// -----------------------------------------------------------				
				
		//mav.setViewName("getBoardList.jsp");   //    /WEB-INF/board/getBoardList.jsp.jsp
		
// -----------------------------------------------------------		
		
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
//		
//		return "getBoardList";
	}

}








