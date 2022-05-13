package com.quanlynhansu.model.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quanlynhansu.model.bo.ChiTietTuDienBo;
import com.quanlynhansu.model.bo.HoSoBo;
import com.quanlynhansu.model.bo.PhongKhoaBo;

/**
 * Servlet implementation class suanhansuController
 */
@WebServlet("/suanhansuController")
public class suanhansuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suanhansuController() {
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
	    if(request.getParameter("submit")==null) {
		    int MaHS = Integer.parseInt(request.getParameter("mahs"));
		    
		    HoSoBo hsbo = new HoSoBo();
		    request.setAttribute("nhansu", hsbo.getHoSoById(MaHS));

		    request.setAttribute("message", "");
		    ChiTietTuDienBo ctbo = new ChiTietTuDienBo();
		    PhongKhoaBo pkbo = new PhongKhoaBo();
		    request.setAttribute("dschucvu", ctbo.getChiTietTuDienByTen(20));
		    request.setAttribute("dshv", ctbo.getChiTietTuDienByTen(9));
		    request.setAttribute("dstinh", ctbo.getChiTietTuDienByTen(2));
		    request.setAttribute("dsngachcongchuc", ctbo.getChiTietTuDienByTen(28));
		    request.setAttribute("dschucvuhientai", ctbo.getChiTietTuDienByTen(22));
		    request.setAttribute("dspk", pkbo.getPhongKhoa());
		    
		    request.setAttribute("tinhthanh", ctbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(MaHS).getTinhThanhPho(), 2).getTenChiTietTuDien());
		    request.setAttribute("tinhthanh2", ctbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(MaHS).getTinhThanhPho2(), 2).getTenChiTietTuDien());
		    request.setAttribute("quanhuyen", ctbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(MaHS).getQuanHuyen(), 3).getTenChiTietTuDien());
		    request.setAttribute("quanhuyen2", ctbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(MaHS).getQuanHuyen2(), 3).getTenChiTietTuDien());
		    //request.setAttribute("quanhuyen",)
		    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/suathongtinnhansu.jsp");
	    	rd.forward(request, response);
	    }else {
	    	HoSoBo hsbo = new HoSoBo();
	    	ChiTietTuDienBo cttdbo= new ChiTietTuDienBo();
	    	int Mahs = Integer.parseInt(request.getParameter("MaHoSo"));
	    	String DonViQuanLy = request.getParameter("DonVi");
	    	String HoTen = request.getParameter("HoTen");
	    	String GioiTinh = request.getParameter("GioiTinh");
	    	
	    	Date NgaySinh = new Date();
	    	Date NgayCap = new Date();
	    	if(request.getParameter("NgaySinh")==null||request.getParameter("NgaySinh").isEmpty()) {
	    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    		try {
	    			NgaySinh = sdf.parse(request.getParameter("NgaySinhBD"));
	    		} catch (ParseException e) {
	    			// TODO: handle exception
	    			e.printStackTrace();
	    			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
	    			rd.forward(request, response);
	    		}
	    	}else {
	    		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	    		try {
	    			NgaySinh = sdf1.parse(request.getParameter("NgaySinh"));
	    		} catch (ParseException e) {
	    			// TODO: handle exception
	    			e.printStackTrace();
	    			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
	    			rd.forward(request, response);
	    		}
			}
	    	int QuanHuyen =Integer.parseInt(request.getParameter("QuanHuyen"));
	    	int TinhThanhPho =Integer.parseInt(request.getParameter("TinhThanhPho"));
	    	String DiaChi = request.getParameter("DiaChi");
	    	int QuanHuyen2 =Integer.parseInt(request.getParameter("QuanHuyen2"));
	    	int TinhThanhPho2 =Integer.parseInt(request.getParameter("TinhThanhPho2"));
	    	// xu ly đẩy ban đầu qua bằng int để lấy về bằng int
	    	
	    	
	    	String CCCD = request.getParameter("CCCD");
	    	 
	    	if(request.getParameter("NgayCap")==null||request.getParameter("NgayCap").isEmpty()) {
	    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    		try {
	    			NgayCap = sdf.parse(request.getParameter("NgayCapBD"));
	    		} catch (ParseException e) {
	    			// TODO: handle exception
	    			e.printStackTrace();
	    			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
	    			rd.forward(request, response);
	    		}
	    	}else{
	    		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	    		try {
	    			NgayCap = sdf1.parse(request.getParameter("NgayCap"));
	    		} catch (ParseException e) {
	    			// TODO: handle exception
	    			e.printStackTrace();
	    			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
	    			rd.forward(request, response);
	    		}
	    	}
	    	String DienThoai = request.getParameter("DienThoai");
	    	String DiDong = request.getParameter("DiDong");
	    	String Email = request.getParameter("Email");
	    	String ChucDanh = request.getParameter("ChucDanh");
	    	String HocVi = request.getParameter("HocVi");
	    	String NgachCongChuc = request.getParameter("NgachCongChuc");
	    	String ChucVu = request.getParameter("ChucVu");
	    	String PhongBan = request.getParameter("PhongBan");
	    	
	    	
	    	//HoSoBean nhansu = hsbo.getHoSoById(Mahs);
	    	if(hsbo.suaHoSoById(Mahs,HoTen,DonViQuanLy,GioiTinh,NgaySinh,QuanHuyen,TinhThanhPho,DiaChi,QuanHuyen2,TinhThanhPho2,CCCD,NgayCap,DienThoai,DiDong,Email,ChucDanh,HocVi,NgachCongChuc,ChucVu,PhongBan)==true) {
	    		
				request.setAttribute("tinhthanh", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getTinhThanhPho(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getQuanHuyen(), 3).getTenChiTietTuDien());
				request.setAttribute("tinhthanh2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getTinhThanhPho2(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getQuanHuyen2(), 3).getTenChiTietTuDien());
	    		request.setAttribute("message", "Sửa thành công!");
	    		request.setAttribute("hs", hsbo.getHoSoById(Mahs));
				//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
				//rd.forward(request, response);
	    	}else {
	    		
				request.setAttribute("tinhthanh", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getTinhThanhPho(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getQuanHuyen(), 3).getTenChiTietTuDien());
				request.setAttribute("tinhthanh2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getTinhThanhPho2(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(Mahs).getQuanHuyen2(), 3).getTenChiTietTuDien());
	    		request.setAttribute("message", "Sửa không thành công!");
	    		request.setAttribute("hs", hsbo.getHoSoById(Mahs));
				//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
				//rd.forward(request, response);
	    	}	
	    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
			rd.forward(request, response);
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
