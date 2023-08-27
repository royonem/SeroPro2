package com.sero.sts.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.sero.sts.vo.ProDetailsVO;
import org.apache.ibatis.session.SqlSession;


@Repository("scoutDAO")
public class ScoutDAO {
	
	static Logger logger = LoggerFactory.getLogger(ScoutDAO.class);

    @Autowired
	private SqlSession sqlSession;
	
	public int insertPro(ProDetailsVO pro) throws DataAccessException {
        logger.debug("Inserting pro: {}", pro);
		int result = sqlSession.insert("mapper.scout.insertPro", pro);
		return result;
		}

	public List<ProDetailsVO> selectAllProList() throws DataAccessException {
		logger.info("proList DAO 호출");
		List<ProDetailsVO> proList = null;
		proList = sqlSession.selectList("mapper.scout.selectAllProList");
		return proList;
	}

	public ProDetailsVO getPro(int proNum) throws DataAccessException {
		ProDetailsVO proView = null;
		proView = sqlSession.selectOne("mapper.scout.selectPro", proNum);

		return proView;
	}

}
