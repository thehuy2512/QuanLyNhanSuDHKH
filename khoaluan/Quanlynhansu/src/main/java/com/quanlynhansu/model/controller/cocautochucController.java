package com.quanlynhansu.model.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bo.PhongKhoaBo;

/**
 * Servlet implementation class cocautochucController
 */
@WebServlet("/cocautochucController")
public class cocautochucController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cocautochucController() {
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
			
		    int ml =1;
		    String mp = request.getParameter("mpb");
		    if(mp!=null&&!mp.isEmpty()) {
		    	ml = Integer.parseInt(mp);
		    }
			PhongKhoaBo pkbo = new PhongKhoaBo();
			request.setAttribute("dspb", pkbo.getPhongKhoa());
			request.setAttribute("phonghientai", pkbo.getPhongKhoaById(ml));
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/cocautochuc.jsp");
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
