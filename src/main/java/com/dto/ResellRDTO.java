package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ResellRDTO")
public class ResellRDTO {

	String Raffleno;
	String memberno;
	String nickname;
	String Rafflename;
	int Totalprice;
	int Attendamount;
	int Perprice;
	public ResellRDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResellRDTO(String raffleno, String memberno, String nickname, String rafflename, int totalprice,
			int attendamount, int perprice) {
		super();
		Raffleno = raffleno;
		this.memberno = memberno;
		this.nickname = nickname;
		Rafflename = rafflename;
		Totalprice = totalprice;
		Attendamount = attendamount;
		Perprice = perprice;
	}
	public String getRaffleno() {
		return Raffleno;
	}
	public void setRaffleno(String raffleno) {
		Raffleno = raffleno;
	}
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRafflename() {
		return Rafflename;
	}
	public void setRafflename(String rafflename) {
		Rafflename = rafflename;
	}
	public int getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(int totalprice) {
		Totalprice = totalprice;
	}
	public int getAttendamount() {
		return Attendamount;
	}
	public void setAttendamount(int attendamount) {
		Attendamount = attendamount;
	}
	public int getPerprice() {
		return Perprice;
	}
	public void setPerprice(int perprice) {
		Perprice = perprice;
	}
	@Override
	public String toString() {
		return "Resell_RDTO [Raffleno=" + Raffleno + ", memberno=" + memberno + ", nickname=" + nickname
				+ ", Rafflename=" + Rafflename + ", Totalprice=" + Totalprice + ", Attendamount=" + Attendamount
				+ ", Perprice=" + Perprice + "]";
	}
	
	
	
	
}
