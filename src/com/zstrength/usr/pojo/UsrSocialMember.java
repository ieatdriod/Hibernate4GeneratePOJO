package com.zstrength.usr.pojo;

// Generated 2013/12/12 ?? 05:10:09 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * UsrSocialMember generated by hbm2java
 */
public class UsrSocialMember implements java.io.Serializable {

	private UsrSocialMemberId id;
	private String memberId;
	private Date createdDatetime;
	private Date updatedDatetime;

	public UsrSocialMember() {
	}

	public UsrSocialMember(UsrSocialMemberId id, Date createdDatetime) {
		this.id = id;
		this.createdDatetime = createdDatetime;
	}

	public UsrSocialMember(UsrSocialMemberId id, String memberId,
			Date createdDatetime, Date updatedDatetime) {
		this.id = id;
		this.memberId = memberId;
		this.createdDatetime = createdDatetime;
		this.updatedDatetime = updatedDatetime;
	}

	public UsrSocialMemberId getId() {
		return this.id;
	}

	public void setId(UsrSocialMemberId id) {
		this.id = id;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getUpdatedDatetime() {
		return this.updatedDatetime;
	}

	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

}
