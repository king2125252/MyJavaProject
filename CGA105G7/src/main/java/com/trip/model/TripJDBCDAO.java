package com.trip.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TripJDBCDAO implements TripDAO_interface{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test01?serverTimezone=Asia/Taipei";
	String userid = "root";
	String passwd = "King297145";
	
	private static final String INSERT_STMT = 
			"INSERT INTO trip (TRIP_NAME,START_DATE,END_DATE,COVER_PIC,NOTES) VALUES (?,?,?,?,?)";
		private static final String GET_ALL_STMT = 
			"SELECT TRIP_ID,TRIP_NAME,START_DATE,END_DATE,COVER_PIC,NOTES FROM trip order by TRIP_ID";
		private static final String GET_ONE_STMT = 
			"SELECT TRIP_ID,TRIP_NAME,START_DATE,END_DATE,COVER_PIC,NOTES FROM trip where TRIP_ID = ?";
		private static final String DELETE = 
			"DELETE FROM trip where TRIP_ID = ?";
		private static final String UPDATE = 
			"UPDATE trip set TRIP_NAME=?, START_DATE=?, END_DATE=?, COVER_PIC=?, NOTES=? where TRIP_ID = ?";
	
	@Override
	public void insert(TripVO tripVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setString(1, tripVO.getTripName());
			pstmt.setDate(2, tripVO.getStartDate());
			pstmt.setDate(3, tripVO.getEndDate());
			pstmt.setBytes(4, tripVO.getCoverPic());
			pstmt.setString(5, tripVO.getNotes());
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
	public void update(TripVO tripVO) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(UPDATE);
			
			pstmt.setString(1, tripVO.getTripName());
			pstmt.setDate(2, tripVO.getStartDate());
			pstmt.setDate(3, tripVO.getEndDate());
			pstmt.setBytes(4, tripVO.getCoverPic());
			pstmt.setString(5, tripVO.getNotes());
			pstmt.setInt(6, tripVO.getTripId());
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
	public void delete(Integer tripId) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, tripId);

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
	public TripVO findByPrimaryKey(Integer tripId) {
		TripVO tripVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, tripId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				tripVO = new TripVO();
				tripVO.setTripId(rs.getInt("TRIP_ID"));
				tripVO.setTripName(rs.getString("TRIP_NAME"));
				tripVO.setStartDate(rs.getDate("START_DATE"));
				tripVO.setEndDate(rs.getDate("END_DATE"));
				tripVO.setCoverPic(rs.getBytes("COVER_PIC"));
				tripVO.setNotes(rs.getString("NOTES"));
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
		return tripVO;
	}

	@Override
	public List<TripVO> getAll() {
		List<TripVO> list = new ArrayList<TripVO>();
		TripVO tripVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// empVO 也稱為 Domain objects
				tripVO = new TripVO();
				tripVO.setTripId(rs.getInt("TRIP_ID"));
				tripVO.setTripName(rs.getString("TRIP_NAME"));
				tripVO.setStartDate(rs.getDate("START_DATE"));
				tripVO.setEndDate(rs.getDate("END_DATE"));
				tripVO.setCoverPic(rs.getBytes("COVER_PIC"));
				tripVO.setNotes(rs.getString("NOTES"));

				list.add(tripVO); // Store the row in the list
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
	
	public static void main(String[] args) {
		TripJDBCDAO dao = new TripJDBCDAO();
		
		//insert
//		TripVO tripVO1 = new TripVO();
//		tripVO1.setTripName("Z003");
//		tripVO1.setStartDate(java.sql.Date.valueOf("2022-12-10"));
//		tripVO1.setEndDate(java.sql.Date.valueOf("2022-12-20"));
//		tripVO1.setCoverPic(new byte[0]);
//		tripVO1.setNotes("Test03");
//		dao.insert(tripVO1);
		
		//update
//		TripVO tripVO2 = new TripVO();
//		tripVO2.setTripId(10);
//		tripVO2.setTripName("Z002");
//		tripVO2.setStartDate(java.sql.Date.valueOf("2022-12-26"));
//		tripVO2.setEndDate(java.sql.Date.valueOf("2022-12-28"));
//		tripVO2.setCoverPic(new byte[0]);
//		tripVO2.setNotes("Test0201");
//		dao.update(tripVO2);
		
		//delete
//		dao.delete(8);
		
		//query
//		TripVO tripVO3 = dao.findByPrimaryKey(9);
//		System.out.print(tripVO3.getTripId() + ", ");
//		System.out.print(tripVO3.getTripName() + ", ");
//		System.out.print(tripVO3.getStartDate()+ ", ");
//		System.out.print(tripVO3.getEndDate()+ ", ");
//		System.out.print(tripVO3.getCoverPic() + ", ");
//		System.out.println(tripVO3.getNotes());
//		System.out.println("-------------------------------");
		
		//queryAll
//		List<TripVO> list = dao.getAll();
//		for(TripVO trip : list) {
//			System.out.print(trip.getTripId() + ", ");
//			System.out.print(trip.getTripName() + ", ");
//			System.out.print(trip.getStartDate()+ ", ");
//			System.out.print(trip.getEndDate()+ ", ");
//			System.out.print(trip.getCoverPic() + ", ");
//			System.out.println(trip.getNotes());
//			System.out.println("-------------------------------");
//		}
		
	}

}