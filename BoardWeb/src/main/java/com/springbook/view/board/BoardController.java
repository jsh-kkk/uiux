package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board")  // session 영역에 저장
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 글목록 JSON으로 변환
	@RequestMapping(value="/dataTransform.do")
	@ResponseBody // @ResponseBody 어노테이션을 사용하여 자바 객체를 HTTP 응답 본문의 객체로 변환하여 클라이언트로 전송한다. 
	public List<BoardVO> dataTransform(BoardVO vo){
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		return boardList;
	}
	
	
	// @RequestMapping 메소드가 실행 되기전에 실행된다.
	// @ModelAttribute 메소드의 실행 결과로 리턴되어지는 객체는 자동으로 Model에 저장된다.
	// @ModelAttribute 메소드의 실행를  View페이지에서 사용 할 수 있다.
	@ModelAttribute("conditionMap")
	public Map<String,String> searchConditionMap(){
		
		Map<String,String> conditionMap = new HashMap<>();
		conditionMap.put("제목","TITLE");
		conditionMap.put("내용","CONTENT");
		return conditionMap;
	}
		
	// 글 삽입
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo/* , BoardDAO boardDAO */) throws IllegalStateException, IOException {    // BoardVO vo -> command객체(spring container가 관리)
		//boardDAO.insertBoard(vo);
		
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("c://work//uploads//" + fileName));
		}
		
		boardService.insertBoard(vo);
		return "redirect:getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo/* , BoardDAO boardDAO */) {
		
		
		System.out.println(vo.getSeq());
		System.out.println(vo.getTitle());
		System.out.println(vo.getWriter());
		System.out.println(vo.getContent());
		System.out.println(vo.getRegDate());
		System.out.println(vo.getCnt());

	
		//boardDAO.updateBoard(vo);
		boardService.updateBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo/* , BoardDAO boardDAO */) {
		//boardDAO.deleteBoard(vo);
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo/* , BoardDAO boardDAO */, Model model/*ModelAndView mav*/) {
		
		model.addAttribute("board", boardService.getBoard(vo));     // request영역에 저장
		return "getBoard.jsp";
		
//		mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		mav.setViewName("getBoard.jsp"); // View 정보 저장
//		return mav;	
	}

	// 글 목록 검색
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo/* , BoardDAO boardDAO */, Model model/*ModelAndView mav*/) {
		
		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("TITLE");
		}
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp"; 
		
	}
	
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(@RequestParam(value="searchCondition",defaultValue="TITLE",required=false) String condition,
//			@RequestParam(value="searchKeyword",defaultValue="",required=false) String keyword,
//			BoardVO vo, BoardDAO boardDAO, Model model/*ModelAndView mav*/) {
//		
//		System.out.println("검색조건" + condition);
//		System.out.println("검색단어" + keyword);
//
//		
//		model.addAttribute("boardList", boardDAO.getBoardList(vo));
//		return "getBoardList.jsp";
		
//		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
//		mav.setViewName("getBoardList.jsp"); // View 정보 저장
//		return mav;
//	}
}












