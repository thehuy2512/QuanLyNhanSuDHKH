package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.quanlynhansu.model.bean.HoSoBean;



public class HoSoDao {
	public ArrayList<HoSoBean> getHoSo(){
		try {
			ArrayList<HoSoBean> dshs = new ArrayList<HoSoBean>();
			String sql = "SELECT * FROM HoSo";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				dshs.add(new HoSoBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),new java.util.Date(rs.getDate(5).getTime()),
										rs.getInt(6), rs.getInt(7),rs.getString(8), rs.getInt(9),rs.getInt(10), 
										rs.getString(11), new java.util.Date(rs.getDate(12).getTime()),
										rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
										rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21),
										new java.util.Date(rs.getDate(22).getTime()),new java.util.Date(rs.getDate(23).getTime())));
			}
			return dshs;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * public ArrayList<HoSoBean> getHoSoByKey(String key){ try {
	 * ArrayList<HoSoBean> dshs = new ArrayList<HoSoBean>(); String sql =
	 * "SELECT * FROM HoSo WHERE HoTen like '%?%' or PhongBan like '%?%'"; DungChung
	 * dc = new DungChung(); dc.KetNoi(); PreparedStatement st =
	 * dc.cn.prepareStatement(sql); st.setString(1, key); st.setString(2, key);
	 * ResultSet rs = st.executeQuery(); while(rs.next()) { dshs.add(new
	 * HoSoBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),new
	 * java.util.Date(rs.getDate(5).getTime()), rs.getString(6), rs.getString(7),
	 * rs.getString(8), new java.util.Date(rs.getDate(9).getTime()),
	 * rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
	 * rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
	 * rs.getString(18))); } return dshs;
	 * 
	 * } catch (Exception e) { // TODO: handle exception e.printStackTrace(); return
	 * null; } }
	 */
	public HoSoBean getHoSoById(int MaHoSo){
		try {
			HoSoBean hs = null;
			String sql = "SELECT * FROM HoSo where MaHoSo=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaHoSo);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				hs=new HoSoBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),new java.util.Date(rs.getDate(5).getTime()),
										rs.getInt(6), rs.getInt(7),rs.getString(8),rs.getInt(9),rs.getInt(10),
										rs.getString(11), new java.util.Date(rs.getDate(12).getTime()),
										rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
										rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21),
										new java.util.Date(rs.getDate(22).getTime()),new java.util.Date(rs.getDate(23).getTime())
								);
			}
			return hs;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public int getTotalHoSo(){
		try {
			
			String sql = "SELECT COUNT(*) FROM HoSo";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				return rs.getInt(1);
			}
			
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
	public ArrayList<HoSoBean> getHoSoByPage(int sotrang){
		try {
			ArrayList<HoSoBean> dshs = new ArrayList<HoSoBean>();
			String sql = "SELECT * FROM HoSo ORDER BY MaHoSo asc OFFSET ? ROWS FETCH NEXT 10 ROWS ONLY;";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, (sotrang-1)*10);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				dshs.add(new HoSoBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),new java.util.Date(rs.getDate(5).getTime()),
										rs.getInt(6), rs.getInt(7),rs.getString(8),rs.getInt(9),rs.getInt(10), 
										rs.getString(11), new java.util.Date(rs.getDate(12).getTime()),
										rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
										rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21),
										new java.util.Date(rs.getDate(22).getTime()),new java.util.Date(rs.getDate(23).getTime()))
						);
			}
			return dshs;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public boolean themHoSoBy(int MaHoSo,String HoTen,String DonViQuanLy,String GioiTinh,Date NgaySinh,int QuanHuyen,int TinhThanhPho,String DiaChi,int QuanHuyen2,int TinhThanhPho2,String CCCD,Date NgayCap,String DienThoai,String DiDong,String Email,String ChucDanh,String HocVi,String NgachCongChuc,String ChucVuHienTai,String PhongBan,String Image){
		try {
			
			String sql = "INSERT INTO HoSo(MaHoSo,HoTen,DonViQuanLy,GioiTinh,NgaySinh,QuanHuyen,TinhThanhPho,DiaChi,QuanHuyen2,TinhThanhPho2,CCCD,NgayCap,DienThoai,DiDong,Email,ChucDanh,HocVi,NgachCongChuc,ChucVuHienTai,PhongBan,Image) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaHoSo);
			st.setString(2,HoTen);
			st.setString(3,DonViQuanLy);
			st.setString(4,GioiTinh);
			st.setDate(5,new java.sql.Date(NgaySinh.getTime()));
			st.setInt(6,QuanHuyen);
			st.setInt(7,TinhThanhPho);
			st.setString(8,DiaChi);
			st.setInt(9,QuanHuyen2);
			st.setInt(10,TinhThanhPho2);
			
			st.setString(11,CCCD);
			st.setDate(12,new java.sql.Date(NgayCap.getTime()));
			st.setString(13,DienThoai);
			st.setString(14,DiDong);
			st.setString(15,Email);
			st.setString(16,ChucDanh);
			st.setString(17,HocVi);
			st.setString(18,NgachCongChuc);
			st.setString(19,ChucVuHienTai);
			st.setString(20,PhongBan);
			st.setString(21,Image);
			
						
			return st.executeUpdate()>0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean suaHoSoById(int MaHoSo,String HoTen,String DonViQuanLy,String GioiTinh,Date NgaySinh,int QuanHuyen,int TinhThanhPho,String DiaChi,int QuanHuyen2,int TinhThanhPho2,String CCCD,Date NgayCap,String DienThoai,String DiDong,String Email,String ChucDanh,String HocVi,String NgachCongChuc,String ChucVuHienTai,String PhongBan){
		try {
			
			String sql = "update HoSo set HoTen=?,DonViQuanLy=?,GioiTinh=?,NgaySinh=?,QuanHuyen=?,TinhThanhPho=?,DiaChi=?,QuanHuyen2=?,TinhThanhPho2=?,CCCD=?,NgayCap=?,DienThoai=?,DiDong=?,Email=?,ChucDanh=?,HocVi=?,NgachCongChuc=?,ChucVuHienTai=?,PhongBan=?,NgayChinhSua=getdate() where MaHoSo=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			
			st.setString(1,HoTen);
			st.setString(2,DonViQuanLy);
			st.setString(3,GioiTinh);
			st.setDate(4,new java.sql.Date(NgaySinh.getTime()));
			st.setInt(5,QuanHuyen);
			st.setInt(6,TinhThanhPho);
			st.setString(7,DiaChi);
			st.setInt(8,QuanHuyen2);
			st.setInt(9,TinhThanhPho2);
			
			st.setString(10,CCCD);
			st.setDate(11,new java.sql.Date(NgayCap.getTime()));
			st.setString(12,DienThoai);
			st.setString(13,DiDong);
			st.setString(14,Email);
			st.setString(15,ChucDanh);
			st.setString(16,HocVi);
			st.setString(17,NgachCongChuc);
			st.setString(18,ChucVuHienTai);
			st.setString(19,PhongBan);
			
			
			st.setInt(20, MaHoSo);			
			return st.executeUpdate()>0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean xoaHoSoById(int MaHoSo){
		try {
			
			String sql = "DELETE FROM HoSo WHERE MaHoSo=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaHoSo);
						
			return st.executeUpdate()>0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean suaAnhHoSoById(String anh,int MaHoSo){
		try {
			
			String sql = "update HoSo set Image=? where MaHoSo=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setString(1, anh);
			st.setInt(2, MaHoSo);
						
			return st.executeUpdate()>0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
