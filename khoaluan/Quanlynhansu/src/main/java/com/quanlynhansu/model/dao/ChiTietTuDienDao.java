package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.quanlynhansu.model.bean.ChiTietTuDienBean;
public class ChiTietTuDienDao {
	public ArrayList<ChiTietTuDienBean> getChiTietTuDienByTen(int matudien){
		try {
			ArrayList<ChiTietTuDienBean> ds= new ArrayList<ChiTietTuDienBean>();
			String sql = "SELECT * FROM ChiTietTuDien where MaTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, matudien);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ds.add(new ChiTietTuDienBean(rs.getInt(1), rs.getInt(2), rs.getNString(3),rs.getInt(4)));	
			}
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<ChiTietTuDienBean> getChiTietTuDienQuanHuyen(int matudien,int maparent){
		try {
			ArrayList<ChiTietTuDienBean> ds= new ArrayList<ChiTietTuDienBean>();
			String sql = "SELECT * FROM ChiTietTuDien where MaTuDien=? and MaParent=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, matudien);
			st.setInt(2, maparent);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ds.add(new ChiTietTuDienBean(rs.getInt(1), rs.getInt(2), rs.getNString(3),rs.getInt(4)));	
			}
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public ChiTietTuDienBean getChiTietTuDienByMaCT(int MaChiTietTuDien,int MaTuDien) {
		try {
			ChiTietTuDienBean cttd= null;
			String sql = "SELECT * FROM ChiTietTuDien where MaChiTietTuDien=? and MaTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaChiTietTuDien);
			st.setInt(2, MaTuDien);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				cttd = new ChiTietTuDienBean(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getInt(4));				
			}
			return cttd;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public boolean themChiTietTuDien(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien) {
		try {
			String sql = "insert into ChiTietTuDien(MaChiTietTuDien,MaTuDien,TenChiTietTuDien) values(?,?,?);";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaChiTietTuDien);
			st.setInt(2, MaTuDien);
			st.setString(3, TenChiTietTuDien);			
			return st.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean themChiTietTuDienQuanHuyen(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien,int MaParent) {
		try {
			String sql = "insert into ChiTietTuDien(MaChiTietTuDien,MaTuDien,TenChiTietTuDien,MaParent) values(?,?,?,?);";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaChiTietTuDien);
			st.setInt(2, MaTuDien);
			st.setString(3, TenChiTietTuDien);
			st.setInt(4, MaParent);
			return st.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean suaChiTietTuDien(int MaChiTietTuDien,int MaTuDien,String TenChiTietTuDien) {
		try {
			String sql = "update ChiTietTuDien set TenChiTietTuDien=? where MaChiTietTuDien=? and MaTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setString(1, TenChiTietTuDien);	
			st.setInt(2, MaChiTietTuDien);
			st.setInt(3, MaTuDien);
					
			return st.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public boolean xoaChiTietTuDien(int MaChiTietTuDien,int MaTuDien) {
		try {
			String sql = "delete from ChiTietTuDien where MaChiTietTuDien=? and MaTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, MaChiTietTuDien);
			st.setInt(2, MaTuDien);
					
			return st.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
