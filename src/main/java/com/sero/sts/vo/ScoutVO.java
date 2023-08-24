package com.sero.sts.vo;

public class ScoutVO {
	int scoutNum;
	String scoutId;
	String scoutPW;
	String manual;
	int contractNum;
	String contractDet;

	public ScoutVO() {
		
	}

	
	
	public ScoutVO(int scoutNum, String scoutId, String scoutPW, String manual, int contractNum, String contractDet) {
		super();
		this.scoutNum = scoutNum;
		this.scoutId = scoutId;
		this.scoutPW = scoutPW;
		this.manual = manual;
		this.contractNum = contractNum;
		this.contractDet = contractDet;
	}



	@Override
	public String toString() {
		return "ScoutVO [scoutNum=" + scoutNum + ", scoutId=" + scoutId + ", scoutPW=" + scoutPW + ", manual=" + manual
				+ ", contractNum=" + contractNum + ", contractDet=" + contractDet + "]";
	}



	public int getScoutNum() {
		return scoutNum;
	}

	public void setScoutNum(int scoutNum) {
		this.scoutNum = scoutNum;
	}

	public String getScoutId() {
		return scoutId;
	}

	public void setScoutId(String scoutId) {
		this.scoutId = scoutId;
	}

	public String getScoutPW() {
		return scoutPW;
	}

	public void setScoutPW(String scoutPW) {
		this.scoutPW = scoutPW;
	}

	public String getManual() {
		return manual;
	}

	public void setManual(String manual) {
		this.manual = manual;
	}

	public int getContractNum() {
		return contractNum;
	}

	public void setContractNum(int contractNum) {
		this.contractNum = contractNum;
	}

	public String getContractDet() {
		return contractDet;
	}

	public void setContractDet(String contractDet) {
		this.contractDet = contractDet;
	}

	
}
