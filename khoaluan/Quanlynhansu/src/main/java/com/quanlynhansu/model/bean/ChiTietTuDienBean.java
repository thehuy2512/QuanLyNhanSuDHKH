package com.quanlynhansu.model.bean;

public class ChiTietTuDienBean {
	private int MaChiTietTuDien;
	private int MaTuDien;
	private String TenChiTietTuDien;
	private int MaParent;
	public ChiTietTuDienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietTuDienBean(int maChiTietTuDien, int maTuDien, String tenChiTietTuDien, int maParent) {
		super();
		MaChiTietTuDien = maChiTietTuDien;
		MaTuDien = maTuDien;
		TenChiTietTuDien = tenChiTietTuDien;
		MaParent = maParent;
	}
	public int getMaChiTietTuDien() {
		return MaChiTietTuDien;
	}
	public void setMaChiTietTuDien(int maChiTietTuDien) {
		MaChiTietTuDien = maChiTietTuDien;
	}
	public int getMaTuDien() {
		return MaTuDien;
	}
	public void setMaTuDien(int maTuDien) {
		MaTuDien = maTuDien;
	}
	public String getTenChiTietTuDien() {
		return TenChiTietTuDien;
	}
	public void setTenChiTietTuDien(String tenChiTietTuDien) {
		TenChiTietTuDien = tenChiTietTuDien;
	}
	public int getMaParent() {
		return MaParent;
	}
	public void setMaParent(int maParent) {
		MaParent = maParent;
	}
	
	
}
