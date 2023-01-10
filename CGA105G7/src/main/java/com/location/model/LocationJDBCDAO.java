package com.location.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.locationPic.model.LocationPicJDBCDAO;
import com.locationPic.model.LocationPicVO;

public class LocationJDBCDAO implements LocationDAO_interface{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test01?serverTimezone=Asia/Taipei";
	String userid = "root";
	String passwd = "King297145";
	
	private static final String INSERT_STMT = 
			"INSERT INTO location (USER_ID,LOC_NAME,LONGITUDE,LATITUDE,LOC_ADDRESS,LOC_PHONE) VALUES (?,?,?,?,?,?)";
	private static final String UPDATE = 
			"UPDATE location set USER_ID=?, LOC_NAME=?, LONGITUDE=?, LATITUDE=?, LOC_ADDRESS=?,LOC_PHONE=?,LOC_UPDATE=? where LOC_ID = ?";
	private static final String DELETE = 
			"DELETE FROM location where LOC_ID = ?";
	private static final String GET_ONE_STMT = 
			"SELECT LOC_ID,USER_ID,LOC_NAME,LONGITUDE,LATITUDE,LOC_ADDRESS,LOC_PHONE,LOC_UPDATE FROM location where LOC_ID = ?";
	private static final String GET_ALL_STMT = 
			"SELECT LOC_ID,USER_ID,LOC_NAME,LONGITUDE,LATITUDE,LOC_ADDRESS,LOC_PHONE,LOC_UPDATE FROM location order by LOC_ID";
	
	@Override
	public void insert(LocationVO locationVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, locationVO.getUserId());
			pstmt.setString(2, locationVO.getLocName());
			pstmt.setString(3, locationVO.getLongitude());
			pstmt.setString(4, locationVO.getLatitude());
			pstmt.setString(5, locationVO.getLocAddress());
			pstmt.setString(6, locationVO.getLocPhone());
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
	public void update(LocationVO locationVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(UPDATE);
			
			pstmt.setInt(1, locationVO.getUserId());
			pstmt.setString(2, locationVO.getLocName());
			pstmt.setString(3, locationVO.getLongitude());
			pstmt.setString(4, locationVO.getLatitude());
			pstmt.setString(5, locationVO.getLocAddress());
			pstmt.setString(6, locationVO.getLocPhone());
			pstmt.setInt(7, locationVO.getLocUpdate());
			pstmt.setInt(8, locationVO.getLocId());
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
	public void delete(Integer locId) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, locId);

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
	public LocationVO findByPrimaryKey(Integer locId) {
		LocationVO locationVO =null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, locId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				locationVO = new LocationVO();
				locationVO.setLocId(rs.getInt("LOC_ID"));
				locationVO.setUserId(rs.getInt("USER_ID"));
				locationVO.setLocName(rs.getString("LOC_NAME"));
				locationVO.setLongitude(rs.getString("LONGITUDE"));
				locationVO.setLatitude(rs.getString("LATITUDE"));
				locationVO.setLocAddress(rs.getString("LOC_ADDRESS"));
				locationVO.setLocPhone(rs.getString("LOC_PHONE"));
				locationVO.setLocUpdate(rs.getInt("LOC_UPDATE"));
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
		return locationVO;
	}

	@Override
	public List<LocationVO> getAll() {
		List<LocationVO> list = new ArrayList<LocationVO>();
		LocationVO locationVO =null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// empVO �]�٬� Domain objects
				locationVO = new LocationVO();
				locationVO.setLocId(rs.getInt("LOC_ID"));
				locationVO.setUserId(rs.getInt("USER_ID"));
				locationVO.setLocName(rs.getString("LOC_NAME"));
				locationVO.setLongitude(rs.getString("LONGITUDE"));
				locationVO.setLatitude(rs.getString("LATITUDE"));
				locationVO.setLocAddress(rs.getString("LOC_ADDRESS"));
				locationVO.setLocPhone(rs.getString("LOC_PHONE"));
				locationVO.setLocUpdate(rs.getInt("LOC_UPDATE"));

				list.add(locationVO); // Store the row in the list
			}

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

	@Override
	public void insert2(LocationVO locationVO,byte[] locPic) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			
			con.setAutoCommit(false);
			String cols[] = {"LOC_ID"};
			pstmt = con.prepareStatement(INSERT_STMT,cols);
			pstmt.setInt(1, locationVO.getUserId());
			pstmt.setString(2, locationVO.getLocName());
			pstmt.setString(3, locationVO.getLongitude());
			pstmt.setString(4, locationVO.getLatitude());
			pstmt.setString(5, locationVO.getLocAddress());
			pstmt.setString(6, locationVO.getLocPhone());
			pstmt.executeUpdate();
			
			//得到對應的自增PK
			String nextLocID = null;
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				nextLocID = rs.getString(1);
				System.out.println("自增PK : " + nextLocID +"(成功新增)");
			}else {
				System.out.println("新增失敗 沒有PK");
			}
			
			LocationPicJDBCDAO locPicDAO = new LocationPicJDBCDAO();
			LocationPicVO locPicVO = new LocationPicVO();
			locPicVO.setLocId(Integer.parseInt(nextLocID));
			locPicVO.setLocPic(locPic);
			locPicDAO.insert2(locPicVO, con);
			
			con.commit();
			con.setAutoCommit(true);
			
			System.out.println("成功!!");
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
	
	public static void main(String[] args) {
		LocationJDBCDAO dao = new LocationJDBCDAO();
		
		//insert
		LocationVO locVO = new LocationVO();
		locVO.setUserId(1);
		locVO.setLocName("瑋育TibaMe");
		locVO.setLongitude("121.22490314513891");
		locVO.setLatitude("24.95977994971896");
		locVO.setLocAddress("桃園中壢區復興路46號9樓");
		locVO.setLocPhone("034251108");
		locVO.setLocUpdate(0);
		dao.insert(locVO);
//		
	}
		
		//update
//		LocationVO locVO3 = new LocationVO();
//		locVO3.setLocId(3);
//		locVO3.setUserId(2);
//		locVO3.setLocName("財政部");
//		locVO3.setLongitude("121");
//		locVO3.setLatitude("24");
//		locVO3.setLocAddress("桃園市中壢區");
//		locVO3.setLocUpdate(0);
//		dao.update(locVO3);
		
		//delete
//		dao.delete(3);
		
		//query
//		LocationVO locVO4 = dao.findByPrimaryKey(2);
//		System.out.print(locVO4.getLocId()+", ");
//		System.out.print(locVO4.getUserId()+", ");
//		System.out.print(locVO4.getLocName()+", ");
//		System.out.print(locVO4.getLongitude()+", ");
//		System.out.print(locVO4.getLatitude()+", ");
//		System.out.print(locVO4.getLocAddress()+", ");
//		System.out.print(locVO4.getLocPhone()+", ");
//		System.out.println(locVO4.getLocUpdate());
//		System.out.println("--------------------------------");
		
		//queryAll
//		List<LocationVO> list =dao.getAll();
//		for(LocationVO loc : list) {
//			System.out.print(loc.getLocId()+", ");
//			System.out.print(loc.getUserId()+", ");
//			System.out.print(loc.getLocName()+", ");
//			System.out.print(loc.getLongitude()+", ");
//			System.out.print(loc.getLatitude()+", ");
//			System.out.print(loc.getLocAddress()+", ");
//			System.out.print(loc.getLocPhone()+", ");
//			System.out.println(loc.getLocUpdate());
//			System.out.println("--------------------------------");
//		}
//	}
}
