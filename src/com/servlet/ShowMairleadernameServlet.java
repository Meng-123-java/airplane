package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Mairleader;
import com.service.MairleaderService;
import com.service.impl.MairleaderServiceImpl;
@WebServlet("/showleadername")
public class ShowMairleadernameServlet extends HttpServlet{

	private MairleaderService mairleadernameService = new MairleaderServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Mairleader> showLeaderName = mairleadernameService.showLeaderName();
		req.setAttribute("showLeaderName", showLeaderName);
		req.getRequestDispatcher("showairplane").forward(req, res);
	}
	
}
