package com.ColArt.model;

import java.util.List;

import com.Users.model.UsersDAO_interface;
import com.Users.model.UsersJDBCDAO;
import com.Users.model.UsersVO;

public class ColArtService {
	private ColArtDAO_interface dao;

	public ColArtService() {
		dao = new ColArtJDBCDAO();
	}
	public ColArtVO addColArt(Integer artId,Integer userId){
		ColArtVO colArtVO = new ColArtVO();
		colArtVO.setArtId(artId);
		colArtVO.setUserId(userId);
		return colArtVO;
	}
	public ColArtVO updateColArt(Integer artId,Integer userId,Integer artIdW,Integer userIdW){
		ColArtVO colArtVO = new ColArtVO();
		colArtVO.setArtId(artId);
		colArtVO.setUserId(userId);
		colArtVO.setArtIdW(artIdW);
		colArtVO.setUserIdW(userIdW);
		return colArtVO;
	}	
	public void deleteColArt(Integer artId,Integer userId) {
		dao.delete(artId,userId);
	}
	public ColArtVO getOneColArt(Integer artId,Integer userId) {
		return dao.findByPrimaryKey(artId,userId);
	}

	public List<ColArtVO> getAll() {
		return dao.getAll();
	}
}

