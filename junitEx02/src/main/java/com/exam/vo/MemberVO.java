package com.exam.vo;

import java.util.Date;

public class MemberVO {
	private String uid;
	private String pwd;
	private String username;
	private String email;
	private Date regdate;
	private Date updateDate;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String uid, String pwd, String username, String email, Date regdate, Date updateDate) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.username = username;
		this.email = email;
		this.regdate = regdate;
		this.updateDate = updateDate;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	
	
	
	
	
}
