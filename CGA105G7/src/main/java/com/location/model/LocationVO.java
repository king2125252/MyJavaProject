package com.location.model;

import java.io.Serializable;

public class LocationVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer locId;
	private Integer userId;
	private String locName;
	private String longitude;
	private String Latitude;
	private String locAddress;
	private String locPhone;
	private Integer locUpdate;
	
	
	public Integer getLocId() {
		return locId;
	}
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLocAddress() {
		return locAddress;
	}
	public void setLocAddress(String locAddress) {
		this.locAddress = locAddress;
	}
	public String getLocPhone() {
		return locPhone;
	}
	public void setLocPhone(String locPhone) {
		this.locPhone = locPhone;
	}
	public Integer getLocUpdate() {
		return locUpdate;
	}
	public void setLocUpdate(Integer locUpdate) {
		this.locUpdate = locUpdate;
	}
}