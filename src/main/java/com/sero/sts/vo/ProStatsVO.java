package com.sero.sts.vo;

public class ProStatsVO {
	int proNum;
	String proAddress;
	String proSchool;
	String proName;
	String proDetails;
	String proVid;	
	String proAge;
	double proHeight;
	String proPos;
	double batAvg;
	double war;
	double ops;
	double era;
	double whip;
	String mbti;
	int proSign;

	public ProStatsVO() {

	}

	public ProStatsVO(int proNum, String proAddress, String proSchool, String proState, int proZip, String proName,
			String proDetails, String proVid, String proAge, double proHeight, String proPos, double batAvg, double war,
			double ops, double era, double whip, String mbti, int proSign) {
		super();
		this.proNum = proNum;
		this.proAddress = proAddress;
		this.proSchool = proSchool;
		this.proName = proName;
		this.proDetails = proDetails;
		this.proVid = proVid;
		this.proAge = proAge;
		this.proHeight = proHeight;
		this.proPos = proPos;
		this.batAvg = batAvg;
		this.war = war;
		this.ops = ops;
		this.era = era;
		this.whip = whip;
		this.mbti = mbti;
		this.proSign = proSign;
	}

	@Override
	public String toString() {
		return "ProStatsVO [proNum=" + proNum + ", proAddress=" + proAddress + ", proSchool=" + proSchool
				+ ", proState=" + ", proZip="  + ", proName=" + proName + ", proDetails="
				+ proDetails + ", proVid=" + proVid + ", proAge=" + proAge + ", proHeight=" + proHeight + ", proPos="
				+ proPos + ", batAvg=" + batAvg + ", war=" + war + ", ops=" + ops + ", era=" + era + ", whip=" + whip
				+ ", mbti=" + mbti + ", proSign=" + proSign + "]";
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

	public String getProAge() {
		return proAge;
	}

	public void setProAge(String proAge) {
		this.proAge = proAge;
	}

	public double getProHeight() {
		return proHeight;
	}

	public void setProHeight(double proHeight) {
		this.proHeight = proHeight;
	}

	public String getProPos() {
		return proPos;
	}

	public void setProPos(String proPos) {
		this.proPos = proPos;
	}

	public double getBatAvg() {
		return batAvg;
	}

	public void setBatAvg(double batAvg) {
		this.batAvg = batAvg;
	}

	public double getWar() {
		return war;
	}

	public void setWar(double war) {
		this.war = war;
	}

	public double getOps() {
		return ops;
	}

	public void setOps(double ops) {
		this.ops = ops;
	}

	public double getEra() {
		return era;
	}

	public void setEra(double era) {
		this.era = era;
	}

	public double getWhip() {
		return whip;
	}

	public void setWhip(double whip) {
		this.whip = whip;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public int getProSign() {
		return proSign;
	}

	public void setProSign(int proSign) {
		this.proSign = proSign;
	}
	
}