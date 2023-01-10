package com.location.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.location.model.LocationService;
import com.location.model.LocationVO;

@MultipartConfig
public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");

		if ("insert".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
			req.setAttribute("errorMsgs", errorMsgs);

//			 		接收請求參數 - 格式輸入錯誤處理
			String locName = req.getParameter("loc_name");
			if (locName == null || locName.trim().length() == 0) {
				errorMsgs.add("地點名稱 : 請勿空白");
			}

			String longitude = req.getParameter("longitude");
			if (longitude == null || longitude.trim().length() == 0) {
				errorMsgs.add("經度 : 請勿空白");
			}

			String latitude = req.getParameter("latitude");
			if (latitude == null || latitude.trim().length() == 0) {
				errorMsgs.add("緯度 : 請勿空白");
			}

			String address = req.getParameter("address");
			if (address == null || address.trim().length() == 0) {
				errorMsgs.add("地址 : 請勿空白");
			}

			String phone = req.getParameter("phone");

			LocationVO locVO = new LocationVO();
			locVO.setLocName(locName);
			locVO.setLongitude(longitude);
			locVO.setLatitude(latitude);
			locVO.setLocAddress(address);
			locVO.setLocPhone(phone);
			byte[] pic = req.getPart("loc_pic").getInputStream().readAllBytes();

			if (!errorMsgs.isEmpty()) {//如果有錯誤訊息會進來
				req.setAttribute("locationVO", locVO);
				RequestDispatcher failureView = req.getRequestDispatcher("/back-end/addLoc.jsp");
				failureView.forward(req, res);
				return;
			}

//					開始新增資料					
			LocationService locSer = new LocationService();
			locVO = locSer.addLoc(locName, longitude, latitude, address, phone, pic);

//					完成新增準備轉交
			String url = "";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);

		}

		if ("update".equals(action)) {

		}

		if ("getAll".equals(action)) {

		}
		
		if ("getAll".equals(action)) {

		}

	}
}
