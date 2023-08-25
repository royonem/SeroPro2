package com.sero.sts.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoutDAO {

	@Autowired
	private SqlSession session;

	public boolean login(String id, String pw) {
		Map<String, String> user = new HashMap<String, String>();
		user.put("id", id);
		user.put("pw", pw);
		String result = (String) session.selectOne("mapper.scout.selectId", user);
		
		if (result == null)
			return false;
		else
			return true;
	}

}
