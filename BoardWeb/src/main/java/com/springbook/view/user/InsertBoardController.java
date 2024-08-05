package com.springbook.view.user;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class InsertBoardController{

	@RequestMapping(value="/insertBoard.do")
//	public void insertBoard(HttpServletRequest request) {
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {    // BoardVO vo -> command객체(spring container가 관리)
		System.out.println("글 등록 처리");
		
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);

//		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
		
		
// --------------------------------------------------		
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		
// --------------------------------------------------			
		
//		mav.setViewName("getBoardList.do");
//		return "getBoardList.do";
	}

}




