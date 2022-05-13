package com.quanlynhansu.model.bean;

public class PhongKhoaBean {
	private int MaPhongKhoa;
	private String TenPhongKhoa;
	private String DienThoai;
	private String Fax;
	private String Website;
	private String Email;
	private String DiaChi;
	public PhongKhoaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongKhoaBean(int maPhongKhoa, String tenPhongKhoa, String dienThoai, String fax, String website,
			String email, String diaChi) {
		super();
		this.MaPhongKhoa = maPhongKhoa;
		this.TenPhongKhoa = tenPhongKhoa;
		this.DienThoai = dienThoai;
		this.Fax = fax;
		this.Website = website;
		this.Email = email;
		this.DiaChi = diaChi;
	}
	public int getMaPhongKhoa() {
		return MaPhongKhoa;
	}
	public void setMaPhongKhoa(int maPhongKhoa) {
		this.MaPhongKhoa = maPhongKhoa;
	}
	public String getTenPhongKhoa() {
		return TenPhongKhoa;
	}
	public void setTenPhongKhoa(String tenPhongKhoa) {
		this.TenPhongKhoa = tenPhongKhoa;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.DienThoai = dienThoai;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		this.Fax = fax;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		this.Website = website;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	
}
