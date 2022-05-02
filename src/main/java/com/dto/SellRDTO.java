package com.dto;

public class SellRDTO {
	
	String sell_rno;
	String memberno;
	String nickname;
	String rafflename;
	String  raffleprice;
	String raffleamount;
	String duration;
	String text;
	public SellRDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SellRDTO(String sell_rno, String memberno, String nickname, String rafflename, String raffleprice,
			String raffleamount, String duration, String text) {
		super();
		this.sell_rno = sell_rno;
		this.memberno = memberno;
		this.nickname = nickname;
		this.rafflename = rafflename;
		this.raffleprice = raffleprice;
		this.raffleamount = raffleamount;
		this.duration = duration;
		this.text = text;
	}
	@Override
	public String toString() {
		return "Sell_rDTO [sell_rno=" + sell_rno + ", memberno=" + memberno + ", nickname=" + nickname + ", rafflename="
				+ rafflename + ", raffleprice=" + raffleprice + ", raffleamount=" + raffleamount + ", duration="
				+ duration + ", text=" + text + "]";
	}
	public String getSell_rno() {
		return sell_rno;
	}
	public void setSell_rno(String sell_rno) {
		this.sell_rno = sell_rno;
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
		return rafflename;
	}
	public void setRafflename(String rafflename) {
		this.rafflename = rafflename;
	}
	public String getRaffleprice() {
		return raffleprice;
	}
	public void setRaffleprice(String raffleprice) {
		this.raffleprice = raffleprice;
	}
	public String getRaffleamount() {
		return raffleamount;
	}
	public void setRaffleamount(String raffleamount) {
		this.raffleamount = raffleamount;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
