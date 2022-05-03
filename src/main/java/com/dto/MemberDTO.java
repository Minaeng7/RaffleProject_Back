package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("MemberDTO")
public class MemberDTO {
	private int memberno;
	private String userid;
	private String passwd;
	private String username;
	private String nickname;
	private String post;
	private String addr1;
	private String addr2;
	private String phone;
	private String birth;
	private String email1;
	private String email2;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(int memberno, String userid, String passwd, String username, String nickname, String post,
			String addr1, String addr2, String phone, String birth, String email1, String email2) {
		super();
		this.memberno = memberno;
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.nickname = nickname;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
		this.birth = birth;
		this.email1 = email1;
		this.email2 = email2;
	}
	@Override
	public String toString() {
		return "MemberDTO [memberno=" + memberno + ", userid=" + userid + ", passwd=" + passwd + ", username="
				+ username + ", nickname=" + nickname + ", post=" + post + ", addr1=" + addr1 + ", addr2=" + addr2
				+ ", phone=" + phone + ", birth=" + birth + ", email1=" + email1 + ", email2=" + email2 + "]";
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
}
