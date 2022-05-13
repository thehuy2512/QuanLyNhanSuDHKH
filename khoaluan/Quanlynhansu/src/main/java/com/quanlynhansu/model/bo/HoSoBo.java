package com.quanlynhansu.model.bo;

import java.util.ArrayList;
import java.util.Date;

import com.quanlynhansu.model.bean.HoSoBean;
import com.quanlynhansu.model.dao.HoSoDao;

public class HoSoBo {
	HoSoDao hsdao = new HoSoDao();
	public ArrayList<HoSoBean> getHoSo(){
		return hsdao.getHoSo();
	}
	public ArrayList<HoSoBean> getHoSoByKey(String key){
		ArrayList<HoSoBean> dsbd = getHoSo();
		ArrayList<HoSoBean> ds = new ArrayList<HoSoBean>();
		
		for(HoSoBean hs:dsbd) {
			if(hs.getHoTen().trim().toLowerCase().contains(key.trim().toLowerCase()) || hs.getPhongBan().trim().toLowerCase().contains(key.trim().toLowerCase())) {
				ds.add(hs);
			}			
		}
		return ds;
		//return hsdao.getHoSoByKey(key);
	}
	public HoSoBean getHoSoById(int MaHoSo){
		return hsdao.getHoSoById(MaHoSo);
	}
	public int getTotalHoSo(){
		return hsdao.getTotalHoSo();
	}
	public ArrayList<HoSoBean> getHoSoByPage(int sotrang){
		return hsdao.getHoSoByPage(sotrang);
	}
	public boolean themHoSoBy(int MaHoSo,String HoTen,String DonViQuanLy,String GioiTinh,Date NgaySinh,int QuanHuyen,int TinhThanhPho,String DiaChi,int QuanHuyen2,int TinhThanhPho2,String CCCD,Date NgayCap,String DienThoai,String DiDong,String Email,String ChucDanh,String HocVi,String NgachCongChuc,String ChucVuHienTai,String PhongBan,String Image){
		return hsdao.themHoSoBy(MaHoSo, HoTen, DonViQuanLy, GioiTinh, NgaySinh, QuanHuyen, TinhThanhPho, DiaChi, QuanHuyen2, TinhThanhPho2, CCCD, NgayCap, DienThoai, DiDong, Email, ChucDanh, HocVi, NgachCongChuc, ChucVuHienTai, PhongBan, Image);
	}
	public boolean suaHoSoById(int MaHoSo,String HoTen,String DonViQuanLy,String GioiTinh,Date NgaySinh,int QuanHuyen,int TinhThanhPho,String DiaChi,int QuanHuyen2,int TinhThanhPho2,String CCCD,Date NgayCap,String DienThoai,String DiDong,String Email,String ChucDanh,String HocVi,String NgachCongChuc,String ChucVuHienTai,String PhongBan){
		return hsdao.suaHoSoById(MaHoSo, HoTen, DonViQuanLy, GioiTinh, NgaySinh, QuanHuyen, TinhThanhPho, DiaChi, QuanHuyen2, TinhThanhPho2, CCCD, NgayCap, DienThoai, DiDong, Email, ChucDanh, HocVi, NgachCongChuc, ChucVuHienTai, PhongBan);
	}
	public boolean xoaHoSoById(int MaHoSo){
		return hsdao.xoaHoSoById(MaHoSo);
	}
	public boolean suaAnhHoSoById(String anh,int MaHoSo){
		return hsdao.suaAnhHoSoById(anh, MaHoSo);
	}
}
