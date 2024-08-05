package com.springbook.view.user;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class UpdateBoardController {

	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글수정 처리");
		
//		String seq = request.getParameter("seq");
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO vo = new BoardVO();
//		
//		vo.setSeq(Integer.parseInt(seq));
//		vo.setTitle(title);
//		vo.setContent(content);
		
		boardDAO.updateBoard(vo);
		
		return "redirect:getBoardList.do";
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		//mav.setViewName("getBoardList.do");
		
		
		
		//return "getBoardList.do";
	}

}


