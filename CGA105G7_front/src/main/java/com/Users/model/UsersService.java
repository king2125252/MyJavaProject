package com.Users.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;



public class UsersService {
	private UsersDAO_interface dao;

	public UsersService() {
		dao = new UsersJDBCDAO();
	}

	public UsersVO addUser(String userAccount, String userPassword, String userName, String userNickname,
			String userIdNo, java.sql.Date userBrthday, String userPhone, String userAddress,
			Byte userCertificationStatus, Byte userStatus, String userGender, Byte userForumLevel, byte[] userPic,
			Byte userShopLevel, Integer bonusPoints, Float alltogetherScore, Integer alltogetherScorePeople,
			Integer artCount, Integer likeTotalCount, Integer purchaseTotal, Byte reportTotalCount) {
		UsersVO usersVO = new UsersVO();
		usersVO.setUserAccount(userAccount);
		usersVO.setUserPassword(userPassword);
		usersVO.setUserName(userName);
		usersVO.setUserNickname(userNickname);
		usersVO.setUserIdNo(userIdNo);
		usersVO.setUserBrthday(userBrthday);
		usersVO.setUserPhone(userPhone);
		usersVO.setUserAddress(userAddress);
		usersVO.setUserCertificationStatus(userCertificationStatus);
		usersVO.setUserStatus(userStatus);
		usersVO.setUserGender(userGender);
//		usersVO.setUserRegistrationDate(userRegistrationDate);
		usersVO.setUserForumLevel(userForumLevel);
		usersVO.setUserPic(userPic);
		usersVO.setUserShopLevel(userShopLevel);
		usersVO.setBonusPoints(bonusPoints);
		usersVO.setAlltogetherScore(alltogetherScore);
		usersVO.setAlltogetherScorePeople(alltogetherScorePeople);
		usersVO.setArtCount(artCount);
		usersVO.setLikeTotalCount(likeTotalCount);
		usersVO.setPurchaseTotal(purchaseTotal);
		usersVO.setReportTotalCount(reportTotalCount);
		dao.insert(usersVO);
		return usersVO;
//	public UsersVO addUser() {
//		UsersVO usersVO = new UsersVO();
//		usersVO.setUserAccount("q111111111p@yahoo.com.tw");
//		usersVO.setUserPassword("Password");
//		usersVO.setUserName("userName");
//		usersVO.setUserNickname("userNickname");
//		usersVO.setUserIdNo("userIdNo");
//		usersVO.setUserBrthday(java.sql.Date.valueOf("1991-09-22"));
//		usersVO.setUserPhone("0987654333");
//		usersVO.setUserAddress("userAddress");
//		usersVO.setUserCertificationStatus((byte)0);
//		usersVO.setUserStatus((byte)0);
//		usersVO.setUserGender("userGender");
////		usersVO.setUserRegistrationDate(userRegistrationDate);
//		usersVO.setUserForumLevel((byte)0);
////		usersVO.setUserPic(userPic);
//		usersVO.setUserShopLevel((byte)0);
//		usersVO.setBonusPoints(0);
//		usersVO.setAlltogetherScore((float)0);
//		usersVO.setAlltogetherScorePeople(0);
//		usersVO.setArtCount(0);
//		usersVO.setLikeTotalCount(0);
//		usersVO.setPurchaseTotal(0);
//		usersVO.setReportTotalCount((byte)0);
//		dao.insert(usersVO);
//		return usersVO;

	}

	public UsersVO updateUser(String userAccount, String userPassword, String userName, String userNickname,
			String userIdNo, java.sql.Date userBrthday, String userPhone, String userAddress,
			Byte userCertificationStatus, Byte userStatus, String userGender, java.sql.Timestamp userRegistrationDate,
			Byte userForumLevel, byte[] userPic, Byte userShopLevel, Integer bonusPoints, Float alltogetherScore,
			Integer alltogetherScorePeople, Integer artCount, Integer likeTotalCount, Integer purchaseTotal,
			Byte reportTotalCount, Integer userId) {
		UsersVO usersVO = new UsersVO();
		usersVO.setUserAccount(userAccount);
		usersVO.setUserPassword(userPassword);
		usersVO.setUserName(userName);
		usersVO.setUserNickname(userNickname);
		usersVO.setUserIdNo(userIdNo);
		usersVO.setUserBrthday(userBrthday);
		usersVO.setUserPhone(userPhone);
		usersVO.setUserAddress(userAddress);
		usersVO.setUserCertificationStatus(userCertificationStatus);
		usersVO.setUserStatus(userStatus);
		usersVO.setUserGender(userGender);
		usersVO.setUserRegistrationDate(userRegistrationDate);
		usersVO.setUserForumLevel(userForumLevel);
		usersVO.setUserPic(userPic);
		usersVO.setUserShopLevel(userShopLevel);
		usersVO.setBonusPoints(bonusPoints);
		usersVO.setAlltogetherScore(alltogetherScore);
		usersVO.setAlltogetherScorePeople(alltogetherScorePeople);
		usersVO.setArtCount(artCount);
		usersVO.setLikeTotalCount(likeTotalCount);
		usersVO.setPurchaseTotal(purchaseTotal);
		usersVO.setReportTotalCount(reportTotalCount);
		usersVO.setUserId(userId);
		dao.update(usersVO);
		return usersVO;
	}

	public UsersVO updateUserInfo(String userNickname, String userPhone,byte[] userPic, String userAccount) {
		UsersVO usersVO = new UsersVO();
		usersVO.setUserAccount(userAccount);
		usersVO.setUserNickname(userNickname);
		usersVO.setUserPhone(userPhone);
		usersVO.setUserPic(userPic);
		dao.updateinfo(usersVO);
		return usersVO;
	}

	public void deleteUser(Integer userId) {
		dao.delete(userId);
	}

	public UsersVO getOneUser(Integer userId) {
		return dao.findByPrimaryKey(userId);
	}

	public UsersVO getOneUseremail(String userAccount) {
		return dao.findByUserAccount(userAccount);
	}

	public List<UsersVO> getAll() {
		return dao.getAll();
	}

	public boolean login(String userAccount, String userPassword) {
		return dao.login(userAccount, userPassword);
	}

	public byte[] getPic(String path) {
		return dao.getPic(path);
	}
}
