package com.sero.sts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sero.sts.dao.ScoutDAO;

@Service
public class ScoutService {

	@Autowired
	private ScoutDAO scoutDAO;
	
	public boolean login(String id, String pw) {
		return scoutDAO.login(id, pw);
	}

}
