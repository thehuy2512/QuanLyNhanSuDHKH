package com.quanlynhansu.model.bo;

import java.util.ArrayList;

import com.quanlynhansu.model.bean.PhongKhoaBean;
import com.quanlynhansu.model.dao.PhongKhoaDao;

public class PhongKhoaBo {
	PhongKhoaDao pkdao = new PhongKhoaDao();
	public ArrayList<PhongKhoaBean> getPhongKhoa(){
		return pkdao.getPhongKhoa();
	}
	public PhongKhoaBean getPhongKhoaById(int MaPB){
		return pkdao.getPhongKhoaById(MaPB);
	}
	public boolean insertPhongKhoa(int MaPhongKhoa,String TenPhongKhoa,String DienThoai,String Fax,String Website,String Email,String DiaChi){
		return pkdao.insertPhongKhoa(MaPhongKhoa, TenPhongKhoa, DienThoai, Fax, Website, Email, DiaChi);
	}
	public boolean updatePhongKhoa(int MaPhongKhoa,String TenPhongKhoa,String DienThoai,String Fax,String Website,String Email,String DiaChi){
		return pkdao.updatePhongKhoa(MaPhongKhoa, TenPhongKhoa, DienThoai, Fax, Website, Email, DiaChi);
	}
	public boolean deletePhongKhoaById(int MaPhongKhoa){
		return pkdao.deletePhongKhoaById(MaPhongKhoa);
	}
}

