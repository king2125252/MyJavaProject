package com.tripDetail.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TripDetailJDBCDAO implements TripDetailDAO_interface{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test01?serverTimezone=Asia/Taipei";
	String userid = "root";
	String passwd = "King297145";
	
	private static final String INSERT_STMT = 
			"INSERT INTO trip_detail (TRIP_ID,LOC_ID,ARRIVAL_TIME,LEAVE_TIME) VALUES (?,?,?,?)";
	private static final String UPDATE = 
			"UPDATE trip_detail set TRIP_ID=?, LOC_ID=?, ARRIVAL_TIME=?, LEAVE_TIME=? where TRIP_DETAIL_ID = ?";
	private static final String DELETE = 
			"DELETE FROM trip_detail where TRIP_DETAIL_ID = ?";
	private static final String GET_ONE_STMT = 
			"SELECT TRIP_DETAIL_ID,TRIP_ID,LOC_ID,ARRIVAL_TIME,LEAVE_TIME FROM trip_detail where TRIP_DETAIL_ID = ?";
	private static final String GET_ALL_STMT = 
			"SELECT TRIP_DETAIL_ID,TRIP_ID,LOC_ID,ARRIVAL_TIME,LEAVE_TIME FROM trip_detail order by TRIP_DETAIL_ID";
	@Override
	public void insert(TripDetailVO tripDetailVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, tripDetailVO.getTripId());
			pstmt.setInt(2, tripDetailVO.getLocId());
			pstmt.setTimestamp(3, tripDetailVO.getArrivalTime());
			pstmt.setTimestamp(4, tripDetailVO.getLeaveTime());
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
	public void update(TripDetailVO tripDetailVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			pstmt = con.prepareStatement(UPDATE);
			
			pstmt.setInt(1, tripDetailVO.getTripId());
			pstmt.setInt(2, tripDetailVO.getLocId());
			pstmt.setTimestamp(3, tripDetailVO.getArrivalTime());
			pstmt.setTimestamp(4, tripDetailVO.getLeaveTime());
			pstmt.setInt(5, tripDetailVO.getTripDatailId());
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
	public void delete(Integer tripDetailId) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, tripDetailId);

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
	public TripDetailVO findByPrimaryKey(Integer tripDetailId) {
		TripDetailVO tripDetailVO =null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, tripDetailId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				tripDetailVO = new TripDetailVO();
				tripDetailVO.setTripDatailId(rs.getInt("TRIP_DETAIL_ID"));
				tripDetailVO.setTripId(rs.getInt("TRIP_ID"));
				tripDetailVO.setLocId(rs.getInt("LOC_ID"));
				tripDetailVO.setArrivalTime(rs.getTimestamp("ARRIVAL_TIME"));
				tripDetailVO.setLeaveTime(rs.getTimestamp("LEAVE_TIME"));
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
		return tripDetailVO;
	}

	@Override
	public List<TripDetailVO> getAll() {
		List<TripDetailVO> list = new ArrayList<TripDetailVO>();
		TripDetailVO tripDetailVO =null;

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
				tripDetailVO = new TripDetailVO();
				tripDetailVO.setTripDatailId(rs.getInt("TRIP_DETAIL_ID"));
				tripDetailVO.setTripId(rs.getInt("TRIP_ID"));
				tripDetailVO.setLocId(rs.getInt("LOC_ID"));
				tripDetailVO.setArrivalTime(rs.getTimestamp("ARRIVAL_TIME"));
				tripDetailVO.setLeaveTime(rs.getTimestamp("LEAVE_TIME"));
				
				list.add(tripDetailVO); // Store the row in the list
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
		TripDetailJDBCDAO dao = new TripDetailJDBCDAO();
		
		//insert
//		TripDetailVO tD1 = new TripDetailVO();
//		tD1.setTripId(10);
//		tD1.setLocId(2);
//		tD1.setArrivalTime(java.sql.Timestamp.valueOf("2022-11-5 23:55:50"));
//		tD1.setLeaveTime(java.sql.Timestamp.valueOf("2022-12-08 12:55:50"));
//		dao.insert(tD1);
		
		//update
//		TripDetailVO tD2 = new TripDetailVO();
//		tD2.setTripDatailId(2);
//		tD2.setTripId(9);
//		tD2.setLocId(1);
//		tD2.setArrivalTime(java.sql.Timestamp.valueOf("2022-11-5 23:55:50"));
//		tD2.setLeaveTime(java.sql.Timestamp.valueOf("2022-12-08 12:55:50"));
//		dao.update(tD2);
		
		//delete
//		dao.delete(3);
		
		//query
//		TripDetailVO tD3 = dao.findByPrimaryKey(1);
//		System.out.print(tD3.getTripDatailId()+", ");
//		System.out.print(tD3.getTripId()+", ");
//		System.out.print(tD3.getLocId()+", ");
//		System.out.print(tD3.getArrivalTime()+", ");
//		System.out.println(tD3.getLeaveTime());
//		System.out.println("---------------------------------");
		
		//queryAll
//		List<TripDetailVO> list = dao.getAll();
//		for(TripDetailVO tD4 : list) {
//			System.out.print(tD4.getTripDatailId()+", ");
//			System.out.print(tD4.getTripId()+", ");
//			System.out.print(tD4.getLocId()+", ");
//			System.out.print(tD4.getArrivalTime()+", ");
//			System.out.println(tD4.getLeaveTime());
//			System.out.println("---------------------------------");
//		}
	}

}