package com.sero.sts.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.sero.sts.vo.ProDetailsVO;
import com.sero.sts.vo.ProStatsVO;
import com.sero.sts.HomeController;

@RestController
@RequestMapping("/scout")
public class ScoutController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
@RequestMapping(value="/", method = RequestMethod.POST)
   public String home(Locale locale, Model model){
	
	
	return "main";
	
}

@RequestMapping(value="proJSON", method=RequestMethod.POST )
public ResponseEntity<List<ProDetailsVO>> prolist(){
	logger.info("선수목록 ㅎㅇ");
	List<ProDetailsVO> list =new ArrayList<ProDetailsVO>();
	
	for (int i = 0; i < 10; i++) {
		ProDetailsVO vo = new ProDetailsVO();
		vo.setProNum(i);
		vo.setProName("선수이름"+i);
	}
	
	return new ResponseEntity(list, HttpStatus.OK);
	
}
}
