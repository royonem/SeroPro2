package com.joon.sts.board.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.joon.sts.board.vo.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectAllBoardList() throws DataAccessException;

}
