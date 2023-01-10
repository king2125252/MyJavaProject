package com.location.model;

import java.util.List;

public interface LocationDAO_interface {
	public void insert(LocationVO locationVO);
	public void insert2(LocationVO locationVO,byte[] locPic);
	public void update(LocationVO locationVO);
	public void delete(Integer locId);
	public LocationVO findByPrimaryKey(Integer locId);
	public List<LocationVO> getAll();
}