package com.quanlynhansu.model.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bean.HoSoBean;
import com.quanlynhansu.model.bo.HoSoBo;


/**
 * Servlet implementation class hienthinhansuController
 */
@WebServlet("/hienthinhansuController")
public class hienthinhansuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hienthinhansuController() {
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
			HoSoBo hsbo = new HoSoBo();
				try {
				
			    
				
				String key = request.getParameter("txttimkiem");
				String sotrang = request.getParameter("sotrang");
				
				int count = hsbo.getTotalHoSo();
				int endPage = count/10;
				if(count%10!=0) {
					endPage = count/10+1;
				}
				if (key!=null && !key.isEmpty()) {
					if(hsbo.getHoSoByKey(key).isEmpty()) {
						request.setAttribute("message", "Không tìm thấy!");
					}
					else {
						request.setAttribute("dshs", hsbo.getHoSoByKey(key));
						request.setAttribute("message", "Đã tìm thấy!");
					}
				}else {
					ArrayList<HoSoBean> dshs = null;
					if(sotrang==null) {
						dshs = hsbo.getHoSoByPage(1);
						request.setAttribute("indexPage",(int) 1);
					}
					else {
						int indexPage = Integer.parseInt(sotrang);
						dshs = hsbo.getHoSoByPage(indexPage);
						request.setAttribute("indexPage", indexPage);
					}
					request.setAttribute("message", "");
					request.setAttribute("endPage",endPage);
					request.setAttribute("dshs", dshs);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
				rd.forward(request, response);
			}
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/hienthinhansu.jsp");
			rd.forward(request, response);
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
