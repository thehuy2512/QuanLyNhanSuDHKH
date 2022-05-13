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
 * Servlet implementation class xoaphongkhoaController
 */
@WebServlet("/xoaphongkhoaController")
public class xoaphongkhoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xoaphongkhoaController() {
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
		    int mapk = Integer.parseInt(request.getParameter("mapk"));
		    PhongKhoaBo pkbo = new PhongKhoaBo();
		    boolean flag= pkbo.deletePhongKhoaById(mapk);
		    if(flag==false) {
		    	request.setAttribute("message", "Xoá không thành công!");
		    	RequestDispatcher rd = request.getRequestDispatcher("cocautochucController");
				rd.forward(request, response);
		    }
		    else {
		    	request.setAttribute("message", "Xoá thành công!");
		    	RequestDispatcher rd = request.getRequestDispatcher("cocautochucController");
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
