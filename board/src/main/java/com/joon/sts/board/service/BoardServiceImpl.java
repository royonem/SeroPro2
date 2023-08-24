package com.joon.sts.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.joon.sts.board.dao.BoardDAO;
import com.joon.sts.board.vo.BoardVO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public BoardServiceImpl() {
		System.out.println("ServiceImpl");
	}

	@Override
	public List<BoardVO> listBoards() {
		List<BoardVO> boardsList= null;
		
		boardsList = boardDAO.selectAllBoardList();
		return boardsList;
	}

}
