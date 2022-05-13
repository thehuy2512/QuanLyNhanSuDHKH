package com.quanlynhansu.model.bean;

public class TuDienBean {
	private int MaTuDien;
	private String TenTuDien;
	private int MaLoaiTuDien;
	public TuDienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TuDienBean(int maTuDien, String tenTuDien, int maLoaiTuDien) {
		super();
		MaTuDien = maTuDien;
		TenTuDien = tenTuDien;
		MaLoaiTuDien = maLoaiTuDien;
	}
	public int getMaTuDien() {
		return MaTuDien;
	}
	public void setMaTuDien(int maTuDien) {
		MaTuDien = maTuDien;
	}
	public String getTenTuDien() {
		return TenTuDien;
	}
	public void setTenTuDien(String tenTuDien) {
		TenTuDien = tenTuDien;
	}
	public int getMaLoaiTuDien() {
		return MaLoaiTuDien;
	}
	public void setMaLoaiTuDien(int maLoaiTuDien) {
		MaLoaiTuDien = maLoaiTuDien;
	}
	
}
