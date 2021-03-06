package com.quanlynhansu.model.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bo.TaiKhoanBo;

/**
 * Servlet implementation class TaiKhoanController
 */
@WebServlet("/TaiKhoanController")
public class TaiKhoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaiKhoanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
		    response.setCharacterEncoding("utf-8");
			String user = request.getParameter("Username");
			String pass = request.getParameter("Password");
			HttpSession session = request.getSession();
			TaiKhoanBo tkbo = new TaiKhoanBo();
			if(user!=null&&pass!=null&&!user.isEmpty()&&!pass.isEmpty()) {
				if(tkbo.getTaiKhoan(user, pass)!=null) {
					session.setAttribute("tk", tkbo.getTaiKhoan(user, pass));
					RequestDispatcher rd = request.getRequestDispatcher("homeController");
					rd.forward(request, response);
				}else {
					session.setAttribute("tk", null);
					request.setAttribute("message", "Sai tên đăng nhập hoặc mật khẩu");
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
					rd.forward(request, response);
				}
		
			}else {
				if(user==null||user.isEmpty()) {
					session.setAttribute("tk", null);
					request.setAttribute("message", "Username trống");
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
					rd.forward(request, response);
				}
				if(pass==null||pass.isEmpty()) {
					session.setAttribute("tk", null);
					request.setAttribute("message", "Password trống");
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
					rd.forward(request, response);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
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
