package com.miniproject.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispacherServlet extends HttpServlet {
	
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	@Override
	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();							//port媛��� ���명�� �� 二쇱���ㅼ�� 媛�怨���
		String path = uri.substring(uri.lastIndexOf("/"));  		//  .../login.do
		
		System.out.println(path);
		
		Controller ctrl = handlerMapping.getController(path);		//new LoginController()������ ��蹂대�� 諛�����
		
		String viewName = ctrl.handlerRequest(request, response ) ;
		
		String view = null;
		
		if(!viewName.contains(".do")) {
			view = viewResolver.getView(viewName);		//	./login.jsp
		}else {
			view = viewName;							//	getBoardList.do
		}
		
		response.sendRedirect(view); 
		
		
		
		
		
		
		
		
		
		
		//model2諛⑹��
//		if(path.equals("/login.do")) {
//			System.out.println("濡�洹몄�� 泥�由�");
			
//			String id = req.getParameter("id");
//			String password = req.getParameter("password");
//			
//			UserVO vo = new UserVO();
//			vo.setId(id);
//			vo.setPass(password);
//			
//			UserDAO dao = new UserDAO();
//			UserVO user = dao.getUser(vo);
//			
//			if(user != null) {
//				HttpSession session = req.getSession();
//				session.setAttribute("id", vo.getId());
//				resp.sendRedirect("getBoardList.do");
//			}else {
//				resp.sendRedirect("login.jsp");
//			}
			
			
			
//		}else if(path.equals("/logout.do")) {
//			System.out.println("濡�洹몄���� 泥�由�");
		
//			HttpSession session = req.getSession();
//			session.invalidate();
//			
//			resp.sendRedirect("login.jsp");
			
//		}else if(path.equals("/insertBoard.do")) {
//			System.out.println("湲� �깅� 泥�由�");
			
//			req.setCharacterEncoding("utf-8");
//
//			String title = req.getParameter("title");
//			String writer = req.getParameter("writer");
//			String content = req.getParameter("content");
//			
//			BoardVO vo = new BoardVO();
//			BoardDAO dao = new BoardDAO();
//			
//			vo.setTitle(title);
//			vo.setWriter(writer);
//			vo.setContent(content);
//			
//			dao.insertBoard(vo);
//			
//			resp.sendRedirect("getBoardList.do");
			
//		}else if(path.equals("/updateBoard.do")) {
//			System.out.println("湲� ���� 泥�由�");
			
//			req.setCharacterEncoding("utf-8");
//			
//			String seq = req.getParameter("seq");
//			String title = req.getParameter("title");
//			String content = req.getParameter("content");
//			
//			BoardVO vo = new BoardVO();
//			BoardDAO dao = new BoardDAO();
//			
//			vo.setSeq(Integer.parseInt(seq));
//			vo.setTitle(title);
//			vo.setContent(content);
//			
//			dao.updateBoard(vo);
//			
//			resp.sendRedirect("getBoardList.do");
			
//		}else if(path.equals("/deleteBoard.do")) {
//			System.out.println("湲� ���� 泥�由�");
			
//			String seq = req.getParameter("seq");	
//
//			BoardVO vo = new BoardVO();
//			BoardDAO dao = new BoardDAO();
//			
//			vo.setSeq(Integer.parseInt(seq));
//
//			dao.deleteBoard(vo);
//			
//			resp.sendRedirect("getBoardList.do");
			
//		}else if(path.equals("/getBoard.do")) {
//			System.out.println("湲� ���� 議고�� 泥�由�");
			
//			String seq = req.getParameter("seq");
//			
//			BoardDAO dao = new BoardDAO();
//			BoardVO vo = new BoardVO();
//			
//			vo.setSeq(Integer.parseInt(seq));
//			
//			BoardVO board = dao.getBoard(vo);
//			
//			HttpSession session = req.getSession();
//			session.setAttribute("board", board);
//			resp.sendRedirect("getBoard.jsp");
			
//		}else if(path.equals("/getBoardList.do")) {
//			System.out.println("湲� 紐⑸� 寃��� 泥�由�");
			
//			BoardVO vo = new BoardVO();
//			BoardDAO boardDAO = new BoardDAO();
//			
//			List<BoardVO> boardList = boardDAO.getBoardList(vo);
//		
//			HttpSession session = req.getSession();
//			session.setAttribute("boardList", boardList);
//			resp.sendRedirect("getBoardList.jsp");
//		}
	}
}








