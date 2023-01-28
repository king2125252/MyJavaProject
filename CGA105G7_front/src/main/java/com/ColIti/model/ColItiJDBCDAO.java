package com.ColIti.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColItiJDBCDAO implements ColItiDAO_interface {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String userid = "root";
	String passwd = "Cephas1981";

	private static final String INSERT_STMT = "INSERT INTO COL_ITI (TRIP_SHARE_ID,USER_ID) VALUES (?, ?)";
	private static final String GET_ALL_STMT = "SELECT TRIP_SHARE_ID,USER_ID FROM COL_ITI order by TRIP_SHARE_ID";
	private static final String GET_ONE_STMT = "SELECT TRIP_SHARE_ID,USER_ID FROM COL_ITI WHERE TRIP_SHARE_ID=? AND USER_ID=?";
	private static final String DELETE = "DELETE FROM COL_ITI where TRIP_SHARE_ID = ? AND USER_ID = ?";
	private static final String UPDATE = "UPDATE COL_ITI set TRIP_SHARE_ID = ?,USER_ID = ? where TRIP_SHARE_ID = ? AND USER_ID = ?";

	@Override
	public void insert(ColItiVO colItiVO) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
	Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(INSERT_STMT);


			pstmt.setInt(1, colItiVO.getTripShareId());
			pstmt.setInt(2, colItiVO.getUserId());
			pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
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
	public void update(ColItiVO colItiVO) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setInt(1, colItiVO.getTripShareId());
			pstmt.setInt(2, colItiVO.getUserId());
			pstmt.setInt(3, colItiVO.getTripShareIdW());
			pstmt.setInt(4, colItiVO.getUserIdW());
			pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
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
	public void delete(Integer TRIP_SHARE_ID,Integer USER_ID) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, TRIP_SHARE_ID);
			pstmt.setInt(2, USER_ID);
			pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
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
	public ColItiVO findByPrimaryKey(Integer TRIP_SHARE_ID,Integer USER_ID) {
		ColItiVO colItiVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
				
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ONE_STMT);
			
			pstmt.setInt(1, TRIP_SHARE_ID);
			pstmt.setInt(2, USER_ID);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				colItiVO = new ColItiVO();
				colItiVO.setTripShareId(rs.getInt("TRIP_SHARE_ID"));
				colItiVO.setUserId(rs.getInt("USER_ID"));
			}

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
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
		return colItiVO;
	}

	@Override
	public List<ColItiVO> getAll() {
		List<ColItiVO> list = new ArrayList<ColItiVO>();
		ColItiVO colItiVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				colItiVO = new ColItiVO();
				colItiVO.setTripShareId(rs.getInt("TRIP_SHARE_ID"));
				colItiVO.setUserId(rs.getInt("USER_ID"));

				list.add(colItiVO); // Store the row in the list
			}

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
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
		return list;
	}

	public static void main(String[] args) {

		ColItiJDBCDAO dao = new ColItiJDBCDAO();
		// 新增
//		ColItiVO colItiVO1 = new ColItiVO();
//		colItiVO1.setTripShareId(1);
//		colItiVO1.setUserId(3);
//		dao.insert(colItiVO1);

		//修改
//		ColItiVO colItiVO2 = new ColItiVO();
//		colItiVO2.setTripShareId(2);
//		colItiVO2.setUserId(4);
//		colItiVO2.setTripShareIdW(1);//where=?
//		colItiVO2.setUserIdW(3);//where=?
//		dao.update(colItiVO2);

		// 刪除
//		dao.delete(3,1);//雙PK

		// 查詢
//		ColItiVO colItiVO3 = dao.findByPrimaryKey(1,3);//雙PK
//		System.out.print(colItiVO3.getTripShareId() + ",");
//		System.out.print(colItiVO3.getUserId() + ",");
//		System.out.println("---------------------");

		// 查詢all
		List<ColItiVO> list = dao.getAll();
		for (ColItiVO colItiVO : list) {
		System.out.print(colItiVO.getTripShareId() + ",");
		System.out.print(colItiVO.getUserId() + ",");
		}
	}
}
