package com.quanlynhansu.model.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HoSoBean {
	private int MaHoSo;
	private String HoTen;
	private String DonViQuanLy;
	private String GioiTinh;
	private Date NgaySinh;
	//private String QueQuan;
	//private String NoiOHienTai;
	private int QuanHuyen;
	private int TinhThanhPho;
	private String DiaChi;
	private int QuanHuyen2;
	private int TinhThanhPho2;
	private String CCCD;
	private Date NgayCap;
	private String DienThoai;
	private String DiDong;
	private String Email;
	private String ChucDanh;
	private String HocVi;
	private String NgachCongChuc;
	private String ChucVuHienTai;
	private String PhongBan;
	private String Image;
	private Date NgayTao;
	private Date NgayChinhSua;
	
	public HoSoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HoSoBean(int maHoSo, String hoTen, String donViQuanLy, String gioiTinh, Date ngaySinh, int quanHuyen,
			int tinhThanhPho, String diaChi, int quanHuyen2, int tinhThanhPho2, String cCCD, Date ngayCap,
			String dienThoai, String diDong, String email, String chucDanh, String hocVi, String ngachCongChuc,
			String chucVuHienTai, String phongBan, String image, Date ngayTao, Date ngayChinhSua) {
		super();
		MaHoSo = maHoSo;
		HoTen = hoTen;
		DonViQuanLy = donViQuanLy;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
		QuanHuyen = quanHuyen;
		TinhThanhPho = tinhThanhPho;
		DiaChi = diaChi;
		QuanHuyen2 = quanHuyen2;
		TinhThanhPho2 = tinhThanhPho2;
		CCCD = cCCD;
		NgayCap = ngayCap;
		DienThoai = dienThoai;
		DiDong = diDong;
		Email = email;
		ChucDanh = chucDanh;
		HocVi = hocVi;
		NgachCongChuc = ngachCongChuc;
		ChucVuHienTai = chucVuHienTai;
		PhongBan = phongBan;
		Image = image;
		NgayTao = ngayTao;
		NgayChinhSua = ngayChinhSua;
	}


	public int getMaHoSo() {
		return MaHoSo;
	}
	public void setMaHoSo(int maHoSo) {
		MaHoSo = maHoSo;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getDonViQuanLy() {
		return DonViQuanLy;
	}
	public void setDonViQuanLy(String donViQuanLy) {
		DonViQuanLy = donViQuanLy;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	/*
	 * public Date getNgaySinh() { return NgaySinh; }
	 */
	public String getNgaySinh() { 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(NgaySinh);
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
//	public String getQueQuan() {
//		return QueQuan;
//	}
//	public void setQueQuan(String queQuan) {
//		QueQuan = queQuan;
//	}
//	public String getNoiOHienTai() {
//		return NoiOHienTai;
//	}
//	public void setNoiOHienTai(String noiOHienTai) {
//		NoiOHienTai = noiOHienTai;
//	}

	
	
	public String getCCCD() {
		return CCCD;
	}

	public int getQuanHuyen() {
		return QuanHuyen;
	}

	public void setQuanHuyen(int quanHuyen) {
		QuanHuyen = quanHuyen;
	}

	public int getTinhThanhPho() {
		return TinhThanhPho;
	}

	public void setTinhThanhPho(int tinhThanhPho) {
		TinhThanhPho = tinhThanhPho;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getQuanHuyen2() {
		return QuanHuyen2;
	}
	public void setQuanHuyen2(int quanHuyen2) {
		QuanHuyen2 = quanHuyen2;
	}

	public int getTinhThanhPho2() {
		return TinhThanhPho2;
	}

	public void setTinhThanhPho2(int tinhThanhPho2) {
		TinhThanhPho2 = tinhThanhPho2;
	}

	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}

	/*
	 * public Date getNgayCap() { return NgayCap; }
	 */
	public String getNgayCap() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(NgayCap);
	}
	public void setNgayCap(Date ngayCap) {
		NgayCap = ngayCap;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	public String getDiDong() {
		return DiDong;
	}
	public void setDiDong(String diDong) {
		DiDong = diDong;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getChucDanh() {
		return ChucDanh;
	}
	public void setChucDanh(String chucDanh) {
		ChucDanh = chucDanh;
	}
	public String getHocVi() {
		return HocVi;
	}
	public void setHocVi(String hocVi) {
		HocVi = hocVi;
	}
	public String getNgachCongChuc() {
		return NgachCongChuc;
	}
	public void setNgachCongChuc(String ngachCongChuc) {
		NgachCongChuc = ngachCongChuc;
	}
	public String getChucVuHienTai() {
		return ChucVuHienTai;
	}
	public void setChucVuHienTai(String chucVuHienTai) {
		ChucVuHienTai = chucVuHienTai;
	}
	public String getPhongBan() {
		return PhongBan;
	}
	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}


	public String getNgayTao() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(NgayTao);
	}


	public void setNgayTao(Date ngayTao) {
		NgayTao = ngayTao;
	}


	public String getNgayChinhSua() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(NgayChinhSua);
	}


	public void setNgayChinhSua(Date ngayChinhSua) {
		NgayChinhSua = ngayChinhSua;
	}
	
}
