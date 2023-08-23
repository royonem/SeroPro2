package com.joon.sts.board.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.joon.sts.board.vo.BoardVO;

public interface BoardService {

	List<BoardVO> listBoards() throws DataAccessException;;



}
