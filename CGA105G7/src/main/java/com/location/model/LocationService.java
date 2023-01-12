package com.location.model;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.Part;
public class LocationService {
	private LocationDAO_interface dao;
	
	public LocationService() {
		dao = new LocationJDBCDAO();
	}
	
	public LocationVO addLoc(String locName, String longitude, String latitude, String locAddresss,
			String locPhone,Collection<Part> pic) {
		
		LocationVO locVO = new LocationVO();
		locVO.setUserId(1);
		locVO.setLocName(locName);
		locVO.setLongitude(longitude);
		locVO.setLatitude(latitude);
		locVO.setLocAddress(locAddresss);
		locVO.setLocPhone(locPhone);
		dao.insertHasPic(locVO, pic);
		
		return locVO;
	}
	
	public List<LocationVO> getAll(){
		return dao.getAll();
	}
	
	
}
