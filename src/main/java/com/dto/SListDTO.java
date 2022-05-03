package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("SListDTO")
public class SListDTO {

	String Raffleno;
	String memberno;
	String Rafflename;
	String nickname;
	String username;
	int post;
	String addr1;
	String addr2;
	String phone;
	public SListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SListDTO(String raffleno, String memberno, String rafflename, String nickname, String username, int post,
			String addr1, String addr2, String phone) {
		super();
		Raffleno = raffleno;
		this.memberno = memberno;
		Rafflename = rafflename;
		this.nickname = nickname;
		this.username = username;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
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
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
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
	@Override
	public String toString() {
		return "SListDTO [Raffleno=" + Raffleno + ", memberno=" + memberno + ", Rafflename=" + Rafflename
				+ ", nickname=" + nickname + ", username=" + username + ", post=" + post + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", phone=" + phone + "]";
	}


}