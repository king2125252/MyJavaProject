package com.location.model;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.Part;

public interface LocationDAO_interface {
	public void insert(LocationVO locationVO);
	public void insertHasPic(LocationVO locationVO,Collection<Part> locPic);
	public void update(LocationVO locationVO);
	public void delete(Integer locId);
	public LocationVO findByPrimaryKey(Integer locId);
	public List<LocationVO> getAll();
}
