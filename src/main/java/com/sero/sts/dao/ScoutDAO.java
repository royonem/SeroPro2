package com.sero.sts.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.sero.sts.vo.ProDetailsVO;

@Repository("ScoutDAO")
@Aspect
public class ScoutDAO {

	@Autowired
	private static SqlSession sqlSession;

	public static int insertPro(ProDetailsVO pro) throws DataAccessException {
		int result = sqlSession.insert("mapper.scout.insertBook", pro);

		return result;
		}

	public List<ProDetailsVO> selectAllProList() throws DataAccessException {
		List<ProDetailsVO> bookList = null;
		bookList = sqlSession.selectList("mapper.scout.selectAllProList");
		return bookList;
	}

	public static ProDetailsVO getPro(int proNum) throws DataAccessException {
		ProDetailsVO proView = null;
		proView = sqlSession.selectOne("mapper.scout.selectPro", proNum);

		return proView;
	}

}
