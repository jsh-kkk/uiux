package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class GetBoardController {

	@RequestMapping(value="/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {

		System.out.println("글상세 조회 처리");
		
//		String seq= request.getParameter("seq");
//
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO vo = new BoardVO();
//		
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardVO board = boardDAO.getBoard(vo);
//		
//		ModelAndView mav = new ModelAndView();
		
		mav.addObject("board",boardDAO.getBoard(vo));       //  request영역에 저장된다
		mav.setViewName("getBoard.jsp");        //  /WEB-INF/board/getBoard.jsp
		return mav;
		
		
		//mav.setViewName("getBoard.jsp");
		
		
		
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
//		
//		return "getBoard";
	}

}
