package com.location.model;

public class LocationService {
	private LocationDAO_interface dao;
	
	public LocationService() {
		dao = new LocationJDBCDAO();
	}
	
	public LocationVO addLoc(String locName, String longitude, String latitude, String locAddresss,
			String locPhone,byte[] pic) {
		
		LocationVO locVO = new LocationVO();
		locVO.setUserId(1);
		locVO.setLocName(locName);
		locVO.setLongitude(longitude);
		locVO.setLatitude(latitude);
		locVO.setLocAddress(locAddresss);
		locVO.setLocPhone(locPhone);
		dao.insert2(locVO, pic);
		
		return locVO;
	}
}