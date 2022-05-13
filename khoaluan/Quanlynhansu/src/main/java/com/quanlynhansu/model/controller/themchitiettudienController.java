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

/**
 * Servlet implementation class themchitiettudienController
 */
@WebServlet("/themchitiettudienController")
public class themchitiettudienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public themchitiettudienController() {
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
		    ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
		    int matd = Integer.parseInt(request.getParameter("MaTD"));
		    
		    if(request.getParameter("Submit")==null) {
		    	if(matd==3) {
		    		// xu ly truong hop quan huyen
		    		request.setAttribute("dstinhthanh", cttdbo.getChiTietTuDienByTen(2));
		    		request.setAttribute("MaTD",matd);
		    		request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
		    		request.setAttribute("message", "");
		    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
		    		rd.forward(request, response);
		    	}else {
		    		request.setAttribute("MaTD",matd);
		    		request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
		    		request.setAttribute("message", "");
		    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
		    		rd.forward(request, response);
		    	}
		    }else {
		    	
				int macttd = Integer.parseInt(request.getParameter("MaCT"));
				String tencttd = request.getParameter("TenCT");
				//int matd1= Integer.parseInt(request.getParameter("MaTD"));
				if(matd!=3) {
					
				
			
				if(cttdbo.getChiTietTuDienByMaCT(macttd, matd)!=null) {
					request.setAttribute("MaTD",matd);
					request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
					request.setAttribute("message", "Mã chi tiết đã tồn tại!");
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
					rd.forward(request, response);
				}
				else {
					
					if (cttdbo.themChiTietTuDien(macttd, matd, tencttd)==false) {
						request.setAttribute("MaTD",matd);
						request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
						request.setAttribute("message", "Thêm không thành công");
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
						rd.forward(request, response);
					}
					else {
						request.setAttribute("MaTD",matd);
						request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
						request.setAttribute("message", "Thêm thành công");
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
						rd.forward(request, response);
					}
				}
				}else {
					// xu ly truong hop them quan huyen
					int macha= Integer.parseInt(request.getParameter("TinhThanh"));
					if(cttdbo.getChiTietTuDienByMaCT(macttd, matd)!=null) {
						request.setAttribute("dstinhthanh", cttdbo.getChiTietTuDienByTen(2));
						request.setAttribute("MaTD",matd);
						request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
						request.setAttribute("message", "Mã chi tiết đã tồn tại!");
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
						rd.forward(request, response);
					}
					else {
						
						//if (cttdbo.themChiTietTuDien(macttd, matd, tencttd)==false) {
						if (cttdbo.themChiTietTuDienQuanHuyen(macttd, matd, tencttd,macha)==false) {
							request.setAttribute("dstinhthanh", cttdbo.getChiTietTuDienByTen(2));
							request.setAttribute("MaTD",matd);
							request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
							request.setAttribute("message", "Thêm không thành công");
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
							rd.forward(request, response);
						}
						else {
							request.setAttribute("dstinhthanh", cttdbo.getChiTietTuDienByTen(2));
							request.setAttribute("MaTD",matd);
							request.setAttribute("dschitiet", cttdbo.getChiTietTuDienByTen(matd));
							request.setAttribute("message", "Thêm thành công");
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/themchitiettudien.jsp");
							rd.forward(request, response);
						}
					}
				}
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
