package com.quanlynhansu.model.bean;

public class LoaiTuDienBean {
	private int MaLoaiTuDien;
	private String TenLoaiTuDien;
	public LoaiTuDienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiTuDienBean(int maLoaiTuDien, String tenLoaiTuDien) {
		super();
		MaLoaiTuDien = maLoaiTuDien;
		TenLoaiTuDien = tenLoaiTuDien;
	}
	public int getMaLoaiTuDien() {
		return MaLoaiTuDien;
	}
	public void setMaLoaiTuDien(int maLoaiTuDien) {
		MaLoaiTuDien = maLoaiTuDien;
	}
	public String getTenLoaiTuDien() {
		return TenLoaiTuDien;
	}
	public void setTenLoaiTuDien(String tenLoaiTuDien) {
		TenLoaiTuDien = tenLoaiTuDien;
	}
	
}
