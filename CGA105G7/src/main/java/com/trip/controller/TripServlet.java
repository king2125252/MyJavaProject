package com.trip.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trip.model.TripService;
import com.trip.model.TripVO;

@WebServlet("/front-end/TripAll/trip.do")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 5 * 1024 * 1024, maxRequestSize = 5 * 5 * 1024 * 1024)
public class TripServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
		if ("insert".equals(action)) {//來自userTrip.jsp的請求
			//1.接收請求參數
			String tripName = req.getParameter("trip_name");
			Date startDate = Date.valueOf(req.getParameter("start_date"));
			Date endDate = Date.valueOf(req.getParameter("end_date"));
			String note = req.getParameter("note").trim().length() ==0 ? null : req.getParameter("note");
			byte[] coverPic = req.getPart("cover-pic").getSubmittedFileName().isEmpty()? null:req.getPart("cover-pic").getInputStream().readAllBytes();
			
			Integer userId = Integer.valueOf(req.getParameter("userId"));
			
			//2.開始新增資料
			TripService tripSvc = new TripService();
			TripVO tripVO = tripSvc.addTrip(tripName, startDate, endDate, coverPic, note, userId);
			
			req.setAttribute("tripVO", tripVO);
			//3.完成新增準備轉交
			String url = "/front-end/TripAll/userTripAll.jsp";
			req.getRequestDispatcher(url).forward(req, res);
		}
		
		if ("delete".equals(action)) {//來自userTrip.jsp的請求
			//1.接收請求參數
			Integer tripId = Integer.valueOf(req.getParameter("TRIP_ID"));
			
			//2.開始刪除行程
			TripService tripSvc = new TripService();
			tripSvc.deleteTrip(tripId);
			
			//3.完成刪除準備轉交
			String url = "/front-end/TripAll/userTripAll.jsp";
			req.getRequestDispatcher(url).forward(req, res);
		}
		
		if ("getPic_For_Update".equals(action)) {
			//1.接收請求參數
			Integer tripId =Integer.valueOf(req.getParameter("TRIP_ID"));
			
			//2.開始查詢圖片
			TripService tripSvc = new TripService();
			TripVO tripVO = tripSvc.getOneTrip(tripId);
			
			//3.開啟modal
			Boolean openPicModal = true;
			
			req.setAttribute("openPicModal", openPicModal);
			req.setAttribute("tripVO", tripVO);
			
			//4.完成後準備轉交
			String url = "/front-end/TripAll/userTripAll.jsp";
			req.getRequestDispatcher(url).forward(req, res);
		}
		
	}
}