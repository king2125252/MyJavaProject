package com.ColArt.model;

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

public class ColArtJDBCDAO implements ColArtDAO_interface {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String userid = "root";
	String passwd = "Cephas1981";

	private static final String INSERT_STMT = "INSERT INTO COL_ART (ART_ID,USER_ID) VALUES ( ?, ?)";
	private static final String GET_ALL_STMT = "SELECT ART_ID,USER_ID FROM COL_ART order by ART_ID";
	private static final String GET_ONE_STMT = "SELECT ART_ID,USER_ID FROM COL_ART WHERE ART_ID=? AND USER_ID=?";
	private static final String DELETE = "DELETE FROM COL_ART where ART_ID = ? AND USER_ID = ?";
	private static final String UPDATE = "UPDATE COL_ART set ART_ID = ?,USER_ID = ? where ART_ID=? AND USER_ID=?";

	@Override
	public void insert(ColArtVO colArtVO) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
	Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(INSERT_STMT);


			pstmt.setInt(1, colArtVO.getArtId());
			pstmt.setInt(2, colArtVO.getUserId());
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
	public void update(ColArtVO colArtVO) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setInt(1, colArtVO.getArtId());
			pstmt.setInt(2, colArtVO.getUserId());
			pstmt.setInt(3, colArtVO.getArtIdW());
			pstmt.setInt(4, colArtVO.getUserIdW());
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
	public void delete(Integer ART_ID,Integer USER_ID) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, ART_ID);
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
	public ColArtVO findByPrimaryKey(Integer ART_ID,Integer USER_ID) {
		ColArtVO colArtVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
				
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ONE_STMT);
			
			pstmt.setInt(1, ART_ID);
			pstmt.setInt(2, USER_ID);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				colArtVO = new ColArtVO();
				colArtVO.setArtId(rs.getInt("ART_ID"));
				colArtVO.setUserId(rs.getInt("USER_ID"));
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
		return colArtVO;
	}

	@Override
	public List<ColArtVO> getAll() {
		List<ColArtVO> list = new ArrayList<ColArtVO>();
		ColArtVO colArtVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				colArtVO = new ColArtVO();
				colArtVO.setArtId(rs.getInt("ART_ID"));
				colArtVO.setUserId(rs.getInt("USER_ID"));

				list.add(colArtVO); // Store the row in the list
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

		ColArtJDBCDAO dao = new ColArtJDBCDAO();
		// 新增
//		ColArtVO colArtVO1 = new ColArtVO();
//		colArtVO1.setArtId(1);
//		colArtVO1.setUserId(3);
//		dao.insert(colArtVO1);

//		//修改
//		ColArtVO colArtVO2 = new ColArtVO();
//		colArtVO2.setArtId(1);
//		colArtVO2.setUserId(3);
//		colArtVO2.setArtIdW(2);//where=?
//		colArtVO2.setUserIdW(4);//where=?
//		dao.update(colArtVO2);

//		// 刪除
//		dao.delete(1,3);//雙PK

		// 查詢
//		ColArtVO colArtVO3 = dao.findByPrimaryKey(2,4);//雙PK
//		System.out.print(colArtVO3.getArtId() + ",");
//		System.out.print(colArtVO3.getUserId() + ",");
//		System.out.println("---------------------");

		// 查詢all
//		List<ColArtVO> list = dao.getAll();
//		for (ColArtVO colArt : list) {
//		System.out.print(colArt.getArtId() + ",");
//		System.out.print(colArt.getUserId() + ",");
//}
	}
}
