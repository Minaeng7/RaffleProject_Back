package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("SListDTO")
public class SListDTO {

	int sell_rno;
	int memberno;
	String Rafflename;
	String nickname;
	String username;
	String post;
	String addr1;
	String addr2;
	String phone;
	public SListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SListDTO(int sell_rno, int memberno, String rafflename, String nickname, String username, String post,
			String addr1, String addr2, String phone) {
		super();
		this.sell_rno = sell_rno;
		this.memberno = memberno;
		Rafflename = rafflename;
		this.nickname = nickname;
		this.username = username;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "SListDTO [sell_rno=" + sell_rno + ", memberno=" + memberno + ", Rafflename=" + Rafflename
				+ ", nickname=" + nickname + ", username=" + username + ", post=" + post + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", phone=" + phone + "]";
	}
	public int getSell_rno() {
		return sell_rno;
	}
	public void setSell_rno(int sell_rno) {
		this.sell_rno = sell_rno;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getRafflename() {
		return Rafflename;
	}
	public void setRafflename(String rafflename) {
		Rafflename = rafflename;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}