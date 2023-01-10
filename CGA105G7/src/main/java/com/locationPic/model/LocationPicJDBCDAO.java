package com.locationPic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationPicJDBCDAO implements LocationPicDAO_interface{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test01?serverTimezone=Asia/Taipei";
	String userid = "root";
	String passwd = "King297145";
	
	private static final String INSERT_STMT = 
			"INSERT INTO location_pic (LOC_ID,LOC_PIC) VALUES (?,?)";
	private static final String DELETE = 
			"DELETE FROM location_pic where LOC_PIC_ID = ?";
	private static final String GET_GROUP_STMT = 
			"SELECT LOC_PIC_ID,LOC_ID,LOC_PIC FROM location_pic where LOC_ID = ?";
	@Override
	public void insert(LocationPicVO locationPicVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, locationPicVO.getLocId());
			pstmt.setBytes(2, locationPicVO.getLocPic());
			pstmt.executeUpdate();
			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. "+ e.getMessage());
			// Handle any SQL errors
		}catch (SQLException se) {
			throw new RuntimeException("A database error occured. "+ se.getMessage());
			// Clean up JDBC resources
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public void delete(Integer locPicId) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, locPicId);

			pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. "
					+ e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public LocationPicVO findByForeignKey(Integer locId) {
		LocationPicVO locationPicVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_GROUP_STMT);

			pstmt.setInt(1, locId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				locationPicVO = new LocationPicVO();
				locationPicVO.setLocPicId(rs.getInt("LOC_PIC_ID"));
				locationPicVO.setLocId(rs.getInt("LOC_ID"));
				locationPicVO.setLocPic(rs.getBytes("LOC_PIC"));
			}

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. "+ e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "+ se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return locationPicVO;
	}
	
	@Override
	public void insert2(LocationPicVO locationPicVO, Connection con) {
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, locationPicVO.getLocId());
			pstmt.setBytes(2, locationPicVO.getLocPic());
			pstmt.executeUpdate();
			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. "+ e.getMessage());
			// Handle any SQL errors
		}catch (SQLException se) {
			throw new RuntimeException("A database error occured. "+ se.getMessage());
			// Clean up JDBC resources
		}
		
	}


//	public static void main(String[] args) {
//		LocationPicJDBCDAO dao = new LocationPicJDBCDAO();
		
		//insert
//		LocationPicVO locP = new LocationPicVO();
//		locP.setLocId(2);
//		locP.setLocPic(null);
//		dao.insert(locP);
		
		//delete
//		dao.delete(2);
		
		//query
//		LocationPicVO locP1 = dao.findByForeignKey(1);
//		System.out.print(locP1.getLocPicId()+", ");
//		System.out.print(locP1.getLocId()+", ");
//		System.out.println(locP1.getLocPic());
//		System.out.println("------------------------------");
//	}
}
