package com.quanlynhansu.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.quanlynhansu.model.bean.ChiTietTuDienBean;
import com.quanlynhansu.model.bo.ChiTietTuDienBo;

/**
 * Servlet implementation class themquanhuyenController
 */
@WebServlet("/themquanhuyenController")
public class themquanhuyenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   req.setCharacterEncoding("utf-8");
	   resp.setCharacterEncoding("utf-8");
	   try (PrintWriter out = resp.getWriter()) {
		   
		   	
           ChiTietTuDienBo cttdbo = new ChiTietTuDienBo();
           
           String op = req.getParameter("operation");
           
           if (op.equals("tinhthanh")) {
        	   int id = Integer.parseInt(req.getParameter("id"));
               ArrayList<ChiTietTuDienBean> clist = cttdbo.getChiTietTuDienQuanHuyen(3, id);
               Gson json = new Gson();
               String countryList = json.toJson(clist);
               resp.setContentType("text/html");
              
               resp.getWriter().write(countryList);
           }
           if (op.equals("tinhthanh2")) {
        	   int id = Integer.parseInt(req.getParameter("id"));
               ArrayList<ChiTietTuDienBean> clist = cttdbo.getChiTietTuDienQuanHuyen(3, id);
               Gson json = new Gson();
               String countryList = json.toJson(clist);
               resp.setContentType("text/html");
              
               resp.getWriter().write(countryList);
           }
           
       }
	   catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
		   RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/error.jsp");
		   rd.forward(req, resp);
	   }
   }

}
