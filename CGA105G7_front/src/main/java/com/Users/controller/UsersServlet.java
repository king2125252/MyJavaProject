package com.Users.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.catalina.connector.Response;

import com.Users.model.UsersService;
import com.Users.model.UsersVO;

@MultipartConfig
@WebServlet("/usersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		if ("index".equals(action)) {
			String userAccount = req.getParameter("userAccount");
//			UsersVO usersVO = (UsersVO) session.getAttribute("usersVO"); 
		
		}


//====================================================================================
		
		if ("login".equals(action)) {
			String userAccount = req.getParameter("userAccount");// 來自login.jsp的請求
			String password = req.getParameter("password");
			UsersService userSvc = new UsersService();
			if (userSvc.login(userAccount, password) == true) {
				UsersService userSvc1 = new UsersService();
				UsersVO usersVO = userSvc1.getOneUseremail(userAccount);
//				PrintWriter out = res.getWriter();
//				System.out.println(usersVO);
				req.getSession().setAttribute("usersVO", usersVO);
				RequestDispatcher success = req.getRequestDispatcher("/front-end/index.jsp");
				success.forward(req, res);
			} else {
				req.getRequestDispatcher("/front-end/member/loginFail.html").forward(req, res);
			}
//====================================================================================
			
		}
		if ("loginout".equals(action)) {// 來自loginout.jsp的請求
			req.getSession().invalidate(); 
 res.sendRedirect(req.getContextPath()+"/front-end/member/login.jsp");
		
		}
//====================================================================================
		if ("addMember".equals(action)) {
//			PrintWriter out = res.getWriter();
			UsersService userSvc1 = new UsersService();
			String userAccount = req.getParameter("userAccount");// 來自addMemner.jsp的請求
			String userPassword = req.getParameter("userPassword");
			String userName = req.getParameter("userName");
			String userNickname = req.getParameter("userNickname");
			String userIdNo = req.getParameter("userIdNo");
			java.sql.Date userBrthday = java.sql.Date.valueOf(req.getParameter("userBrthday"));
			String userPhone = req.getParameter("userPhone");
			String userAddress = req.getParameter("userAddress");
			String userGender = req.getParameter("userGender");
			Part part = req.getPart("userPic");
			InputStream in = part.getInputStream();
			byte[] userPic = new byte[in.available()];
			in.read(userPic);
			in.close();
			byte userCertificationStatus = (byte) 0;
			byte userStatus = (byte) 0;
			byte userForumLevel = (byte) 0;
			byte userShopLevel = (byte) 0;
			Integer bonusPoints = 0;
			Float alltogetherScore = (float) 0.0;
			Integer alltogetherScorePeople = 0;
			Integer artCount = 0;
			Integer likeTotalCount = 0;
			Integer purchaseTotal = 0;
			Byte reportTotalCount = (byte) 0;
			userSvc1.addUser(userAccount, userPassword, userName, userNickname, userIdNo, userBrthday, userPhone,
					userAddress, userCertificationStatus, userStatus, userGender, userForumLevel, userPic,
					userShopLevel, bonusPoints, alltogetherScore, alltogetherScorePeople, artCount, likeTotalCount,
					purchaseTotal, reportTotalCount);
			RequestDispatcher success = req.getRequestDispatcher("/front-end/member/insertOk.jsp");
			success.forward(req, res);
			
		} 

		// ====================================================================================
		if ("userInfo".equals(action)) {
			
			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);
			/***************************1.接收請求參數 - 輸入格式的錯誤處裡**********************/
			String userAccount = req.getParameter("userAccount");// 來自userInfo.jsp的請求
			String userNickname = req.getParameter("userNickname");
			String userPhone = req.getParameter("userPhone");
			Part part = req.getPart("userPic");
			InputStream in = part.getInputStream();
			byte[] userPic = new byte[in.available()];
			in.read(userPic);
			in.close();
			
			if(userNickname==null| (userNickname.trim()).length() == 0) {
				errorMsgs.add("請輸入匿名");
				res.sendRedirect("/front-end/member/login.jsp");
				return;
			}
			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req
						.getRequestDispatcher("/front-end/member/login.jsp");
				failureView.forward(req, res);
				return;
			}
			UsersService userSvc = new UsersService();
			UsersVO usersVO = userSvc.getOneUseremail(userAccount);
			userSvc.updateUserInfo(userNickname, userPhone, userPic, userAccount);
			req.getSession().setAttribute("usersVO", usersVO);
			RequestDispatcher successView = req.getRequestDispatcher("/front-end/member/updateOk.jsp");
			successView.forward(req, res);
		 
			
		}

	}
}
