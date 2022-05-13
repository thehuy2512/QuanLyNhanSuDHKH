package com.quanlynhansu.model.bo;

import java.util.ArrayList;

import com.quanlynhansu.model.bean.ChiTietTuDienBean;
import com.quanlynhansu.model.dao.ChiTietTuDienDao;

public class ChiTietTuDienBo {
	ChiTietTuDienDao ctdao = new ChiTietTuDienDao();
	public ArrayList<ChiTietTuDienBean> getChiTietTuDienByTen(int matudien){
		return ctdao.getChiTietTuDienByTen(matudien);				
	}
	public ArrayList<ChiTietTuDienBean> getChiTietTuDienQuanHuyen(int matudien,int maparent){
		return ctdao.getChiTietTuDienQuanHuyen(matudien, maparent);
	}
	public ChiTietTuDienBean getChiTietTuDienByMaCT(int MaChiTietTuDien,int MaTuDien) {
		return ctdao.getChiTietTuDienByMaCT(MaChiTietTuDien, MaTuDien);
	}
	public boolean themChiTietTuDien(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien) {
		return ctdao.themChiTietTuDien(MaChiTietTuDien, MaTuDien, TenChiTietTuDien);
	}
	public boolean themChiTietTuDienQuanHuyen(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien,int MaParent) {
		return ctdao.themChiTietTuDienQuanHuyen(MaChiTietTuDien, MaTuDien, TenChiTietTuDien, MaParent);
	}
	public boolean suaChiTietTuDien(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien) {
		return ctdao.suaChiTietTuDien(MaChiTietTuDien, MaTuDien, TenChiTietTuDien);
	}
	public boolean xoaChiTietTuDien(int MaChiTietTuDien,int MaTuDien) {
		return ctdao.xoaChiTietTuDien(MaChiTietTuDien, MaTuDien);
	}
	
}
