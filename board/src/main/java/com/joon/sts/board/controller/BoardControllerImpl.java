package com.joon.sts.board.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.joon.sts.board.service.BoardService;
import com.joon.sts.board.vo.BoardVO;

@Controller("boardController")
public class BoardControllerImpl extends MultiActionController implements BoardController {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(BoardControllerImpl.class);
	@Autowired
	private BoardService boardService;

	@Autowired
	private BoardVO boardVO;

	public BoardControllerImpl() {
	}

	@Override
	@RequestMapping(value= "/board/boardsList.do" , method = RequestMethod.GET)
	public ModelAndView listBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		System.out.println("Controller 호출");
		logger.info("viewname:" + viewName);
	
		
		List<BoardVO> boardsList = boardService.listBoards();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("boardsList",boardsList);
		
		return mav;
	}

	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}
}
