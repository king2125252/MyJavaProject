package com.location.controller;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.location.model.LocationService;
import com.location.model.LocationVO;

//@WebServlet("/back-end/Location/") 等同到web.xml註冊
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 5 * 1024 * 1024, maxRequestSize = 5 * 5 * 1024 * 1024)
public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");

		if ("insert".equals(action)) {
			String locName = req.getParameter("loc_name");
			String longitude = req.getParameter("longitude");
			String latitude = req.getParameter("latitude");
			String address = req.getParameter("address");
			String phone = req.getParameter("phone");

			LocationVO locVO = new LocationVO();
			locVO.setLocName(locName);
			locVO.setLongitude(longitude);
			locVO.setLatitude(latitude);
			locVO.setLocAddress(address);
			locVO.setLocPhone(phone);
			//解析圖片
			Collection<Part> pic = req.getParts();

//					開始新增資料					
			LocationService locSer = new LocationService();
			locVO = locSer.addLoc(locName, longitude, latitude, address, phone, pic);

//					完成新增準備轉交
			String url = "/back-end/Location/locManage.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}

		if ("update".equals(action)) {

		}

		if ("getAll".equals(action)) {

		}

	}
}
