package com.ColArt.model;

import java.sql.Date;
import java.sql.Timestamp;

public class ColArtVO implements java.io.Serializable {
	private Integer artId;
	private Integer userId;
	private Integer artIdW;
	private Integer userIdW;

	public Integer getArtIdW() {
		return artIdW;
	}

	public void setArtIdW(Integer artIdW) {
		this.artIdW = artIdW;
	}

	public Integer getUserIdW() {
		return userIdW;
	}

	public void setUserIdW(Integer userIdW) {
		this.userIdW = userIdW;
	}

	public Integer getArtId() {
		return artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
