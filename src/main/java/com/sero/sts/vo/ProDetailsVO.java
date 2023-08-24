package com.sero.sts.vo;

public class ProDetailsVO {
	int proNum;
	String proPos;
	String proName;	
	int proSign;

	public ProDetailsVO() {

	}

	public ProDetailsVO(int proNum, String proPos, String proName, int proSign) {
		super();
		this.proNum = proNum;
		this.proPos = proPos;
		this.proName = proName;
		this.proSign = proSign;
	}
	
	
	@Override
	public String toString() {
		return "ProDetailsVO [proNum=" + proNum + ", proPos=" + proPos + ", proName=" + proName + ", proSign=" + proSign
				+ "]";
	}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public String getProPos() {
		return proPos;
	}

	public void setProPos(String proPos) {
		this.proPos = proPos;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProSign() {
		return proSign;
	}

	public void setProSign(int proSign) {
		this.proSign = proSign;
	}




}