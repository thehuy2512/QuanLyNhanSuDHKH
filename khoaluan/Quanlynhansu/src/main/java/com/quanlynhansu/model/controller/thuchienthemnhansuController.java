package com.quanlynhansu.model.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.quanlynhansu.model.bo.HoSoBo;

/**
 * Servlet implementation class thuchienthemnhansuController
 */
@WebServlet("/thuchienthemnhansuController")
public class thuchienthemnhansuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thuchienthemnhansuController() {
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
		 DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		 String dirUrl1 = request.getServletContext().getRealPath("") +  File.separator + "files";
		 response.getWriter().println(dirUrl1);
		
		try {
			int MaHoSo =0;
	    	String HoTen = "";
	    	String DonVi = "";
	    	String GioiTinh = "";
	    	//String NgaySinh = "";
	    	Date NgaySinh=null;
	    	int Quan1 = 0;
	    	int Tinh1 = 0;
//	    	String QuocGia1 = "";
	    	String DiaChi = ""; 
	    	int Quan2 = 0;
	    	int Tinh2 = 0;
	    	String CCCD = "";
	    	//String NgayCap = "";
	    	Date NgayCap=null;
	    	String DienThoai = "";
	    	String DiDong = "";
	    	String Email = "";
	    	String ChucDanh = "";
	    	String HocVi = "";
	    	String NgachCongChuc ="";
	    	String ChucVu = "";
	    	String PhongBan = "";
	    	String anh = null;
	    	
	    	
	    	
			List<FileItem> fileItems = upload.parseRequest(request);//L???y v??? c??c ?????i t?????ng g???i l??n
			//duy???t qua c??c ?????i t?????ng g???i l??n t??? client g???m file v?? c??c control
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {// N???u ko ph???i c??c control=>upfile l??n
					// x??? l?? file
					String nameimg = fileItem.getName();
					if (!nameimg.equals("")) {
						// L???y ???????ng d???n hi???n t???i, ch??? ?? x??? l?? tr??n dirUrl ????? c?? ???????ng d???n ????ng
						String dirUrl = request.getServletContext().getRealPath("") + "assets/imageHoSo";
						File dir = new File(dirUrl);
						if (!dir.exists()) {// n???u ko c?? th?? m???c th?? t???o ra
							dir.mkdir();
						}
						String fileImg = dirUrl + File.separator + nameimg;
						File file = new File(fileImg);// t???o file
						try {
							fileItem.write(file);// l??u file
							System.out.println("UPLOAD TH??NH C??NG...!");
							System.out.println("???????ng d???n l??u file l??: " + dirUrl);
							anh = nameimg;
						} catch (Exception e) {
							e.printStackTrace();
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
							rd.forward(request, response);
						}
					}
				} else// Neu la control
				{
					try {
					//ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
					if (fileItem.getFieldName().equals("MaHoSo"))
						MaHoSo = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));
					if (fileItem.getFieldName().equals("HoTen"))
						HoTen = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("DonVi"))
						DonVi = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("GioiTinh"))
						GioiTinh = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("NgaySinh")) {
						SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
						try {
							NgaySinh = sdf1.parse(fileItem.getString());
						} catch (ParseException e) {
							// TODO: handle exception
							e.printStackTrace();
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
							rd.forward(request, response);
						}
					}
					if (fileItem.getFieldName().equals("QuanHuyen"))
						//Quan1 = fileItem.getString(request.getCharacterEncoding());
						Quan1 = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));
						
					if (fileItem.getFieldName().equals("TinhThanhPho"))
						//Tinh1 = fileItem.getString(request.getCharacterEncoding());
						Tinh1 = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));
//					if (fileItem.getFieldName().equals("QuocGia"))
//						QuocGia1 = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("DiaChi"))
						DiaChi = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("QuanHuyen2"))
						//Quan2 = fileItem.getString(request.getCharacterEncoding());
						Quan2 = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));
					if (fileItem.getFieldName().equals("TinhThanhPho2"))
						//Tinh2 = fileItem.getString(request.getCharacterEncoding());
						Tinh2 = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));
					if (fileItem.getFieldName().equals("CCCD"))
						CCCD = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("NgayCap")) {
						SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
						try {
							NgayCap = sdf2.parse(fileItem.getString());
						} catch (ParseException e) {
							// TODO: handle exception
							e.printStackTrace();
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
							rd.forward(request, response);
						}
					}
					if (fileItem.getFieldName().equals("DienThoai"))
						DienThoai = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("DiDong"))
						DiDong = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("Email"))
						Email = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("ChucDanh"))
						ChucDanh = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("HocVi"))
						HocVi = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("NgachCongChuc"))
						NgachCongChuc = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("ChucVu"))
						ChucVu = fileItem.getString(request.getCharacterEncoding());
					if (fileItem.getFieldName().equals("PhongBan"))
						PhongBan = fileItem.getString(request.getCharacterEncoding());

					//QueQuan = Quan1 + ", " + Tinh1 + ", " + QuocGia1;
					//NoiOHienTai = DiaChi + ", " + Quan2 + ", " + Tinh2;

					
					  System.out.println(MaHoSo); System.out.println(HoTen);
					  System.out.println(DonVi); System.out.println(GioiTinh);
					  System.out.println(NgaySinh); System.out.println(CCCD);
					  System.out.println(NgayCap); System.out.println(DienThoai);
					  System.out.println(DiDong); System.out.println(Email);
					  System.out.println(ChucDanh); System.out.println(HocVi);
					  System.out.println(NgachCongChuc); System.out.println(ChucVu);
					  System.out.println(PhongBan); System.out.println(anh);
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
						rd.forward(request, response);
					}

				}
			}
			 HoSoBo hsbo = new HoSoBo();
			if(hsbo.getHoSoById(MaHoSo)!=null) {
					request.setAttribute("message", "M?? h??? s?? ???? t???n t???i!");
			}else {
					if(hsbo.themHoSoBy(MaHoSo, HoTen, DonVi, GioiTinh, NgaySinh, Quan1, Tinh1, DiaChi, Quan2, Tinh2, CCCD, NgayCap,DienThoai,DiDong,Email,ChucDanh,HocVi,NgachCongChuc,ChucVu,PhongBan,anh)==false) {
						request.setAttribute("message", "Th??m kh??ng th??nh c??ng!");
					}
					else {
						request.setAttribute("message", "Th??m th??nh c??ng!");
					}
			}		
			 RequestDispatcher rd = request.getRequestDispatcher("themnhansuController");
			 rd.forward(request, response);
		} catch (FileUploadException e) {
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
