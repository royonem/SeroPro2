package com.joon.sts.board.vo;



import java.sql.Date;

import org.springframework.stereotype.Component;


//CREATE TABLE s_board (
//	    idx NUMBER(5) not null ,
//	    subJect VARCHAR2(40),
//	    title VARCHAR2(40),
//	    content CLOB,
//	    sday DATE,
//	    hit NUMBER,
//	    CONSTRAINT pk_s_board PRIMARY KEY (idx)
//	);
@Component("boardVO")
public class BoardVO {
	private int idx;
	private String subject;
	private String title;
	private String content;
	private int hit;
    private Date sdaye;
	
	public BoardVO() {
		
	}

	public BoardVO(int idx, String subject, String title, String content, int hit, Date sdaye) {
		super();
		this.idx = idx;
		this.subject = subject;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.sdaye = sdaye;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", subject=" + subject + ", title=" + title + ", content=" + content + ", hit="
				+ hit + ", sdaye=" + sdaye + "]";
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getSdaye() {
		return sdaye;
	}

	public void setSdaye(Date sdaye) {
		this.sdaye = sdaye;
	}
	
	

}
