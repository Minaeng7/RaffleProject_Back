package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("SwinDTO")
public class SwinDTO {
	
	int sell_rno;
	String nickname;
	String username;
	String post;
	String addr1;
	String addr2;
	String phone;
	public SwinDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SwinDTO(int sell_rno, String nickname, String username, String post, String addr1, String addr2,
			String phone) {
		super();
		this.sell_rno = sell_rno;
		this.nickname = nickname;
		this.username = username;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "SwinDTO [sell_rno=" + sell_rno + ", nickname=" + nickname + ", username=" + username + ", post=" + post
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone=" + phone + "]";
	}
	public int getSell_rno() {
		return sell_rno;
	}
	public void setSell_rno(int sell_rno) {
		this.sell_rno = sell_rno;
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
