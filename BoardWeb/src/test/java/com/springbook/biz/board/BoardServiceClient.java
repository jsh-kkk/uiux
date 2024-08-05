package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		
		// 글등록
		
		vo.setTitle("임시제목");
		vo.setWriter("홍길동");
		vo.setContent("임시내용.....");
		boardService.insertBoard(vo);
		
		// 글 상세 조회
//		vo.setSeq(3);
//		BoardVO boardVO = boardService.getBoard(vo);
//		System.out.println(boardVO.toString());
		
		//글 수정 
		//제목 , 내용 수정하기
//		vo.setSeq(1);
//		vo.setTitle("임시제목 수정");
//		vo.setContent("임시내용 수정");
//		boardService.updateBoard(vo);
			
		// 글 삭제
//		vo.setSeq(2);
//		boardService.deleteBoard(vo);
		
		// 글 목록 조회
		List<BoardVO> boardList =  boardService.getBoardList(vo);
		for(BoardVO board:boardList) {
			System.out.println("-->" + board.toString());
		}
			
	}
}
