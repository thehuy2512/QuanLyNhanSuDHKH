package com.quanlynhansu.model.controller;

import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bean.LoaiTuDienBean;
import com.quanlynhansu.model.bean.TuDienBean;
import com.quanlynhansu.model.bo.LoaiTuDienBo;
import com.quanlynhansu.model.bo.TuDienBo;

/**
 * Servlet implementation class quanlytudienController
 */
@WebServlet("/quanlytudienController")
public class quanlytudienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quanlytudienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	    HttpSession session = request.getSession();
	    if(session.getAttribute("tk")!=null) {
		try {
			
		    LoaiTuDienBo lbo = new LoaiTuDienBo();
		    TuDienBo tbo = new TuDienBo();
		    ArrayList<LoaiTuDienBean> dsl = lbo.getLoaiTuDien();
//		    request.setAttribute("dsloai",dsl);
		    HashMap<LoaiTuDienBean, ArrayList<TuDienBean>> map = new HashMap<LoaiTuDienBean, ArrayList<TuDienBean>>();
//		    TreeMap<LoaiTuDienBean, ArrayList<TuDienBean>> map = new TreeMap<LoaiTuDienBean, ArrayList<TuDienBean>>();
		    for(LoaiTuDienBean d:dsl) {
		    	ArrayList<TuDienBean> dstd = new ArrayList<TuDienBean>();
		    	dstd= tbo.getTuDienByMaLoai(d.getMaLoaiTuDien());
//		    	for(TuDienBean td:dstd) {
//		    		map.put(d, td);
//		    	}
		    	map.put(d, dstd);
		    }
		    
		    request.setAttribute("ds", map);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/quanlytudien.jsp");
			rd.forward(request, response);
		    
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
