package com.sero.sts.vo;

public class ProDetailsVO {
	int proNum;
	String proAddress;
	String proSchool;
	String proState;
	int proZip;
	String proName;
	String proDetails;
	String proVid;

	public ProDetailsVO() {

	}

	public ProDetailsVO(int proNum, String proAddress, String proSchool, String proState, int proZip, String proName,
			String proDetails, String proVid) {
		super();
		this.proNum = proNum;
		this.proAddress = proAddress;
		this.proSchool = proSchool;
		this.proState = proState;
		this.proZip = proZip;
		this.proName = proName;
		this.proDetails = proDetails;
		this.proVid = proVid;
	}

	@Override
	public String toString() {
		return "ProDetailsVO [proNum=" + proNum + ", proAddress=" + proAddress + ", proSchool=" + proSchool
				+ ", proState=" + proState + ", proZip=" + proZip + ", proName=" + proName + ", proDetails="
				+ proDetails + ", proVid=" + proVid + "]";
	}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public String getProAddress() {
		return proAddress;
	}

	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}

	public String getProSchool() {
		return proSchool;
	}

	public void setProSchool(String proSchool) {
		this.proSchool = proSchool;
	}

	public String getProState() {
		return proState;
	}

	public void setProState(String proState) {
		this.proState = proState;
	}

	public int getProZip() {
		return proZip;
	}

	public void setProZip(int proZip) {
		this.proZip = proZip;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProDetails() {
		return proDetails;
	}

	public void setProDetails(String proDetails) {
		this.proDetails = proDetails;
	}

	public String getProVid() {
		return proVid;
	}

	public void setProVid(String proVid) {
		this.proVid = proVid;
	}

}
