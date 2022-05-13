package com.quanlynhansu.model.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bo.ChiTietTuDienBo;
import com.quanlynhansu.model.bo.HoSoBo;

/**
 * Servlet implementation class xoaanhnhansuController
 */
@WebServlet("/xoaanhnhansuController")
public class xoaanhnhansuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xoaanhnhansuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("tk")!=null) {
		try {
			request.setCharacterEncoding("utf-8");
		    response.setCharacterEncoding("utf-8");
		    
		    HoSoBo hsbo = new HoSoBo();
		    int mahs = Integer.parseInt(request.getParameter("mahs"));
		    if(hsbo.suaAnhHoSoById(null, mahs)==true) {
		    	ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
				request.setAttribute("tinhthanh", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen(), 3).getTenChiTietTuDien());
				request.setAttribute("tinhthanh2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho2(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen2(), 3).getTenChiTietTuDien());
				request.setAttribute("hs", hsbo.getHoSoById(mahs));
		    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
				rd.forward(request, response);
		    }else {
		    	ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
				request.setAttribute("tinhthanh", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen(), 3).getTenChiTietTuDien());
				request.setAttribute("tinhthanh2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho2(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen2(), 3).getTenChiTietTuDien());
				request.setAttribute("hs", hsbo.getHoSoById(mahs));
		    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
				rd.forward(request, response);
		    }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
			rd.forward(request, response);
		}
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("loginController");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
