package com.sero.sts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private ScoutDAO scoutDAO;
	
	static Logger logger = LoggerFactory.getLogger(ScoutService.class);
	
	public List<ProDetailsVO> listPros() throws DataAccessException {
		logger.info("proList Service 호출");
		List<ProDetailsVO> proList = null;
		proList = scoutDAO.selectAllProList();
		return proList;
	}
	
	public ProDetailsVO getProInfo(int proNum) throws DataAccessException {
		return scoutDAO.getPro(proNum);
	}

	
	public int addPro(ProDetailsVO pro) throws DataAccessException {
		return scoutDAO.insertPro(pro);
	}
	
	public ScoutService() {
	}
}
