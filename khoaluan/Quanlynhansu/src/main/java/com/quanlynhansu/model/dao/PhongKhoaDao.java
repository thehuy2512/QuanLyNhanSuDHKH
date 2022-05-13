package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.quanlynhansu.model.bean.PhongKhoaBean;

public class PhongKhoaDao {
	public ArrayList<PhongKhoaBean> getPhongKhoa(){
		try {
			ArrayList<PhongKhoaBean> dspb = new ArrayList<PhongKhoaBean>();
			String sql = "SELECT * FROM PhongKhoa";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				dspb.add(new PhongKhoaBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			return dspb;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public PhongKhoaBean getPhongKhoaById(int MaPB){
		try {
			PhongKhoaBean pb = null;
			String sql = "SELECT * FROM PhongKhoa WHERE MaPhongKhoa=?;";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaPB);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				pb =new PhongKhoaBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			return pb;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public boolean insertPhongKhoa(int MaPhongKhoa,String TenPhongKhoa,String DienThoai,String Fax,String Website,String Email,String DiaChi){
		try {
			String sql = "insert into PhongKhoa(MaPhongKhoa,TenPhongKhoa,DienThoai,Fax,Website,Email,DiaChi) values (?,?,?,?,?,?,?)";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaPhongKhoa);
			st.setString(2, TenPhongKhoa);
			st.setString(3, DienThoai);
			st.setString(4, Fax);
			st.setString(5, Website);
			st.setString(6, Email);
			st.setString(7, DiaChi);
			
			return st.executeUpdate()>0;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean updatePhongKhoa(int MaPhongKhoa,String TenPhongKhoa,String DienThoai,String Fax,String Website,String Email,String DiaChi){
		try {
			String sql = "update PhongKhoa set TenPhongKhoa=?,DienThoai=?,Fax=?,Website=?,Email=?,DiaChi=? where MaPhongKhoa=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			
			st.setString(1, TenPhongKhoa);
			st.setString(2, DienThoai);
			st.setString(3, Fax);
			st.setString(4, Website);
			st.setString(5, Email);
			st.setString(6, DiaChi);
			st.setInt(7, MaPhongKhoa);
			return st.executeUpdate()>0;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean deletePhongKhoaById(int MaPhongKhoa){
		try {
			String sql = "delete from PhongKhoa where MaPhongKhoa=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);

			st.setInt(1, MaPhongKhoa);
			return st.executeUpdate()>0;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
