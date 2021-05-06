package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Airport;
import com.service.AirportService;
import com.service.impl.AirportServiceImpl;


@WebServlet("/showtake")
public class ShowTakeServlet extends HttpServlet{

	private AirportService airportService = new AirportServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Airport> showTakePort = airportService.showTakePort();
		
		req.setAttribute("showTakePort", showTakePort);
		req.getRequestDispatcher("showland").forward(req, res);
		
	}
	
}
