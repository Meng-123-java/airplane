package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Airplane;
import com.service.AirplaneService;
import com.service.impl.AirplaneServiceImpl;
@WebServlet("/showairplane")
public class ShowAirplaneServlet extends HttpServlet{

	private AirplaneService airplaneService = new AirplaneServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int takeid = 0;
		String takeIdStr = req.getParameter("takeid");
		if(takeIdStr!=null &&!takeIdStr.equals("")) {
			takeid = Integer.parseInt(takeIdStr);
		}
		int landid = 0;
		String landIdStr = req.getParameter("landid");
		if(landIdStr!=null&&!landIdStr.equals("")) {
			landid = Integer.parseInt(landIdStr);
		}
		
		List<Airplane> list = airplaneService.show(takeid, landid);
		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, res);
		
	}
	
	
}
