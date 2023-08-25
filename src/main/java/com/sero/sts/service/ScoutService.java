package com.sero.sts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sero.sts.dao.ScoutDAO;
import com.sero.sts.vo.ProDetailsVO;

@Service("scoutService")
@Transactional(propagation = Propagation.REQUIRED)
public class ScoutService {
	@Autowired
	private static ScoutDAO scoutDAO;

	public static List<ProDetailsVO> listPros() throws DataAccessException {
		List<ProDetailsVO> proList = null;
		proList = scoutDAO.selectAllProList();
		return proList;
	}
	
	public static ProDetailsVO getProInfo(int proNum) throws DataAccessException {
		return ScoutDAO.getPro(proNum);
	}

	
	public static int addPro(ProDetailsVO pro) throws DataAccessException {
		return ScoutDAO.insertPro(pro);
	}
	
}
