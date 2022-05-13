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
import com.quanlynhansu.model.bo.TuDienBo;

/**
 * Servlet implementation class suachitiettudienController
 */
@WebServlet("/suachitiettudienController")
public class suachitiettudienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suachitiettudienController() {
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
	    	int macttd = Integer.parseInt(request.getParameter("macttd"));
	    	int matd = Integer.parseInt(request.getParameter("matd"));
		    
		    ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
		    if(request.getParameter("Submit")==null) {		

		    	request.setAttribute("MaTD", matd);
		    	request.setAttribute("MaCTTD", macttd);
		    	request.setAttribute("chitiettudien", cttdbo.getChiTietTuDienByMaCT(macttd, matd));
		    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/suachitiettudien.jsp");
		    	rd.forward(request, response);
		    }
		    else {
				String tencttd = request.getParameter("TenCT");
		
					
					if(cttdbo.suaChiTietTuDien(macttd, matd, tencttd)==false) {
				    	request.setAttribute("MaTD", matd);
				    	request.setAttribute("MaCTTD", macttd);
						request.setAttribute("message", "Update không thành công!");
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/suachitiettudien.jsp");
						rd.forward(request, response);
					}
					else {
						
						TuDienBo tdbo = new TuDienBo();
					    
					    ChiTietTuDienBo ctbo = new ChiTietTuDienBo();
				    	request.setAttribute("MaTD", matd);
				    	request.setAttribute("MaCTTD", macttd);
					    request.setAttribute("tudien", tdbo.getTuDienByMaTuDien(matd));
					    request.setAttribute("dschitiet", ctbo.getChiTietTuDienByTen(matd));
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitiettudien.jsp");
						rd.forward(request, response);
					}
				
		    }
			}catch (Exception e) {
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
