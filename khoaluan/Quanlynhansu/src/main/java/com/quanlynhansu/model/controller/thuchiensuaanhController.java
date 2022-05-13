package com.quanlynhansu.model.controller;

import java.io.File;
import java.io.IOException;

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

import com.quanlynhansu.model.bo.ChiTietTuDienBo;
import com.quanlynhansu.model.bo.HoSoBo;

/**
 * Servlet implementation class thuchiensuaanhController
 */
@WebServlet("/thuchiensuaanhController")
public class thuchiensuaanhController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thuchiensuaanhController() {
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
		    	String anh = "";
		    	int mahs = 0;
				List<FileItem> fileItems = upload.parseRequest(request);//Lấy về các đối tượng gửi lên
				//duyệt qua các đối tượng gửi lên từ client gồm file và các control
				for (FileItem fileItem : fileItems) {
					if (!fileItem.isFormField()) {// Nếu ko phải các control=>upfile lên
						// xử lý file
						String nameimg = fileItem.getName();
						if (!nameimg.equals("")) {
							// Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
							String dirUrl = request.getServletContext().getRealPath("") + "assets/imageHoSo";
							File dir = new File(dirUrl);
							if (!dir.exists()) {// nếu ko có thư mục thì tạo ra
								dir.mkdir();
							}
							String fileImg = dirUrl + File.separator + nameimg;
							File file = new File(fileImg);// tạo file
							try {
								fileItem.write(file);// lưu file
								System.out.println("UPLOAD THÀNH CÔNG...!");
								System.out.println("Đường dẫn lưu file là: " + dirUrl);
								anh = nameimg;
							} catch (Exception e) {
								e.printStackTrace();
								RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
								rd.forward(request, response);
							}
						}
					} else// Neu la control
					{
						 System.out.println(anh);
						 if (fileItem.getFieldName().equals("MaHoSo"))
								mahs = Integer.parseInt(fileItem.getString(request.getCharacterEncoding()));

					}
				}
			
			HoSoBo hsbo = new HoSoBo();	
			if(hsbo.suaAnhHoSoById(anh, mahs)==true) {
				request.setAttribute("messageAnh", "Sửa thành công!");
				ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
				request.setAttribute("tinhthanh", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen(), 3).getTenChiTietTuDien());
				request.setAttribute("tinhthanh2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getTinhThanhPho2(), 2).getTenChiTietTuDien());
				request.setAttribute("quanhuyen2", cttdbo.getChiTietTuDienByMaCT(hsbo.getHoSoById(mahs).getQuanHuyen2(), 3).getTenChiTietTuDien());
				request.setAttribute("hs", hsbo.getHoSoById(mahs));
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/chitietnhansu.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("message", "Sửa không thành công!");
				request.setAttribute("nhansu", hsbo.getHoSoById(mahs));
			    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/suaanhnhansu.jsp"); 
			    rd.forward(request, response);
			}
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
