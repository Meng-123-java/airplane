package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Mairno;
import com.service.MairnoService;
import com.service.impl.MairnoServiceImpl;
@WebServlet("/showmairno")
public class ShowMairnoServlet extends HttpServlet{

	private MairnoService mairnoService = new MairnoServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Mairno> showMairno = mairnoService.showMairno();
		req.setAttribute("showMairno", showMairno);
		req.getRequestDispatcher("showleadername").forward(req, res);
	}
	
}
