package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class DeleteBoardController {

	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("글삭제 처리");
		
//		String seq = request.getParameter("seq");
//
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO vo = new BoardVO();
//		
//		vo.setSeq(Integer.parseInt(seq));
		
		boardDAO.deleteBoard(vo);
		
		return "redirect:getBoardList.do";

// -----------------------------------------------------
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		
		//mav.setViewName("getBoardList.do");
		
			
		//return "getBoardList.do";
	}

}
