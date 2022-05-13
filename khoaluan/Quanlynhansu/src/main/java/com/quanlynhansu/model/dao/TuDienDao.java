package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.quanlynhansu.model.bean.TuDienBean;

public class TuDienDao {
	public ArrayList<TuDienBean> getTuDienByMaLoai(int maloai) {
		try {
			ArrayList<TuDienBean> ds= new ArrayList<TuDienBean>();
			String sql = "SELECT * FROM TuDien where MaLoaiTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, maloai);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ds.add(new TuDienBean(rs.getInt(1), rs.getString(2), rs.getInt(3)));				
			}
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public TuDienBean getTuDienByMaTuDien(int matudien) {
		try {
			TuDienBean ds= null;
			String sql = "SELECT * FROM TuDien where MaTuDien=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setInt(1, matudien);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				ds= new TuDienBean(rs.getInt(1), rs.getString(2), rs.getInt(3));				
			}
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
